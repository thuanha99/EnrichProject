package com.pro.api.domain.user.delete;

import com.pro.api.service.Delete;
import com.pro.core.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDeleteService implements Delete<Long, UserDeleteResponse> {

  private final UserRepository userRepository;

  @Override
  public UserDeleteResponse deleteById(Long request) {
    return UserDeleteResponse.of(userRepository.delete(request));
  }
}
