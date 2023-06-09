package com.pro.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private Long id;
  private String full_name;
  private String email;
  private String phone_number;
  private String address;
  private String create_by;
  private String update_by;
}
