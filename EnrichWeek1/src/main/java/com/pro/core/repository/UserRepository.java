package com.pro.core.repository;

import com.pro.core.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {

  Long create(User user);

  Long update(User user);

  User find(long id);

  Long delete(long id);

  List<User> findAll();
}
