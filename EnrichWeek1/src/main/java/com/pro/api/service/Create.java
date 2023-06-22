package com.pro.api.service;

public interface Create<S, T> {

  T execute(S request);
}
