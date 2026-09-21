package com.learning.mockito;

class UserRepository {

    public String findUserName(Long id) {
        return "Real User";
    }

    public void  save(User user){}
}