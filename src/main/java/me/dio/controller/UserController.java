package me.dio.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import me.dio.domain.User;
import me.dio.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> findById(@PathVariable Long id) {
    User user = userService.findById(id);
    return ResponseEntity.ok(user);
  }

  @GetMapping("/")
  public ResponseEntity<List<User>> findAll() {
    List<User> users = userService.findAll();
    return ResponseEntity.ok(users);
  }

  @PostMapping
  public ResponseEntity<User> create(@RequestBody User userToCreate) {
    var userCreated = userService.create(userToCreate);
    URI location = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(userCreated.getId())
        .toUri();
    return ResponseEntity.created(location).body(userCreated);
  }



}
