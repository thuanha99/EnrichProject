package com.pro.enrich.rest;

import com.pro.enrich.entity.User;
import com.pro.enrich.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {
  private final UserRepository userRepository;

  @GetMapping("/user")
  public List<User> search() {
    return userRepository.findAll();
  }
}
