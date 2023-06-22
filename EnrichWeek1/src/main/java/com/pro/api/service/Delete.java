package com.pro.api.service;

public interface Delete<Long, T> {

  T deleteById(Long request);
}
