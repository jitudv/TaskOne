package com.urskart.service;

import org.springframework.stereotype.Service;

@Service
public interface LoginService 
{
  public boolean  login(String uid ,String upass);
}
