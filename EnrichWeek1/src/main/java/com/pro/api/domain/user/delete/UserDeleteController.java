package com.pro.api.domain.user.delete;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserDeleteController {

  private final UserDeleteService userDeleteService;

  @DeleteMapping("/{userId}")
  public ResponseEntity<UserDeleteResponse> deleteById(@PathVariable long userId) {
    return ResponseEntity.ok(
        userDeleteService.deleteById(userId));
  }
}
