package com.pro.api.domain.user.update;

import com.pro.api.service.Update;
import com.pro.core.entity.User;
import com.pro.core.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserUpdateService implements Update<UserUpdateRequest, UserUpdateResponse> {

  private final UserRepository userRepository;

  @Override
  public UserUpdateResponse execute(UserUpdateRequest request) {
    User user =
        request
            .toUserBuilder()
            .id(request.getId())
            .update_by("ThuanHC1")
            .build();
    userRepository.update(user);
    return UserUpdateResponse.of(user);
  }
}
