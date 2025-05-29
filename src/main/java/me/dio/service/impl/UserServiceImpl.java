package me.dio.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.domain.User;
import me.dio.repository.UserRepository;
import me.dio.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  // Implement the methods defined in UserService interface
  @Override
  public User findById(Long id) {
    return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
  }

  @Override
  public User create(User userToCreate) {
    if(userRepository.existsById(userToCreate.getId())) {
      throw new IllegalArgumentException("User with this id already exists");
    }
    // Logic to create a new user
    return userRepository.save(userToCreate);
  }

  @Override
  public User update(Long id, User user) {
    // Logic to update an existing user
    return null;
  }

  @Override
  public void delete(Long id) {
    // Logic to delete a user by ID
  }

  @Override
  public List<User> findAll() {
    List<User> users = userRepository.findAll();
    if (users.isEmpty()) {
      throw new NoSuchElementException("No users found");
    }
    return users;
  }

}
