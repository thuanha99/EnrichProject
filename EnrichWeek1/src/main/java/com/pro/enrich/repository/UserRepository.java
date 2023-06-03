package com.pro.enrich.repository;

import com.pro.enrich.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
  Long createUser(User user);
  List<User> findAll();
}
