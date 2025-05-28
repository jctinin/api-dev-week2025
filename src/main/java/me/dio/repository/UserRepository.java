package me.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  // Custom query methods can be defined here if needed
  // For example:
  // List<User> findByLastName(String lastName);

}
