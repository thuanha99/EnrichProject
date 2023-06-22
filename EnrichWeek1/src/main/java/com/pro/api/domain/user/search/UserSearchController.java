package com.pro.api.domain.user.search;

import com.pro.core.entity.User;
import com.pro.core.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserSearchController {

  private final UserSearchService userSearchService;

  @GetMapping("/user")
  public ResponseEntity<List<UserSearchResponse>> searchAll() {
    return ResponseEntity.ok(userSearchService.findAll());
  }

  @GetMapping("/{userId}")
  public ResponseEntity<UserSearchResponse> searchById(@PathVariable long userId) {
    return ResponseEntity.ok(
        userSearchService.findById(userId));
  }
}
