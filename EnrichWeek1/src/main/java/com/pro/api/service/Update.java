package com.pro.api.service;

public interface Update<S, T> {

  T execute(S request);
}
