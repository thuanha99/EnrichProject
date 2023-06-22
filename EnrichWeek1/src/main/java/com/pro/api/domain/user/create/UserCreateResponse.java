package com.pro.api.domain.user.create;

import com.pro.core.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateResponse {
  private long id;
  private String fullName;


  public static UserCreateResponse of(User user) {
    return UserCreateResponse.builder()
        .id(user.getId())
        .fullName(user.getFull_name())
        .build();
  }
}
