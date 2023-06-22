package com.pro.api.domain.user.create;

import com.pro.api.service.Create;
import com.pro.core.entity.User;
import com.pro.core.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserCreateService implements Create<UserCreateRequest, UserCreateResponse> {

  private final UserRepository userRepository;


  @Override
  public UserCreateResponse execute(UserCreateRequest request) {
    User user = request.toUserBuilder().create_by("ThuanHC1").build();
    userRepository.create(user);
    return UserCreateResponse.of(user);
  }
}
