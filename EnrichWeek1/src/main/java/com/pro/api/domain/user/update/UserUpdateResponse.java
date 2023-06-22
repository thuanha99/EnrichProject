package com.pro.api.domain.user.update;

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
public class UserUpdateResponse {

  private long id;
  private String fullName;
  private String updatedBy;

  public static UserUpdateResponse of(User user) {
    return UserUpdateResponse.builder()
        .id(user.getId())
        .fullName(user.getFull_name())
        .updatedBy(user.getUpdate_by())
        .build();
  }
}
