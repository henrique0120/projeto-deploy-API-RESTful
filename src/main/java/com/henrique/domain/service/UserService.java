package com.henrique.domain.service;


import com.henrique.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}