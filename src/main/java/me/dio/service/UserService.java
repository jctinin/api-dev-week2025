package me.dio.service;

import java.util.List;

import me.dio.domain.User;

public interface UserService {
  User findById(Long id);

  User create(User user);

  User update(Long id, User user);

  void delete(Long id);

  List<User> findAll();
}
