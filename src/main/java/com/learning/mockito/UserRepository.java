package com.learning.mockito;

import java.util.Optional;

class UserRepository {

    public String findUserName(Long id) {
        return "Real User";
    }

    public void  save(User user){}

    public Optional<User> findById(Long id) {
        return null;
    }
}