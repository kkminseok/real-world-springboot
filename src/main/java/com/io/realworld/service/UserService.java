package com.io.realworld.service;

import com.io.realworld.DTO.UserSignupRequest;
import com.io.realworld.repository.User;

public interface UserService {
    public User signup(UserSignupRequest userSignupRequest);
}
