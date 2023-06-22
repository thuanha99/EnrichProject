package com.pro.api.service;

import java.util.List;

public interface Search<Long, T> {

  List<T> findAll();

  T findById(Long request);
}
