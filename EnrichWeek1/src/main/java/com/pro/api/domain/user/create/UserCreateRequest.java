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
public class UserCreateRequest {

  private String fullName;
  private String email;
  private String phoneNumber;
  private String address;

  public User.UserBuilder toUserBuilder() {
    return User.builder()
        .full_name(this.fullName)
        .email(this.email)
        .phone_number(this.phoneNumber)
        .address(this.address);
  }
}
