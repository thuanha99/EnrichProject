package com.pro.api.domain.user.search;

import com.pro.api.service.Search;
import com.pro.core.entity.User;
import com.pro.core.repository.UserRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserSearchService implements Search<Long, UserSearchResponse> {

  private final UserRepository userRepository;

  @Override
  public List<UserSearchResponse> findAll() {
    List<User> userList = userRepository.findAll();
    return userList.stream().map(UserSearchResponse::of).collect(Collectors.toList());
  }

  @Override
  public UserSearchResponse findById(Long request) {
    User user = userRepository.find(request);
    return UserSearchResponse.of(user);
  }
}
