package com.learning.spy;

class UserService {

    public String getUserName(Long id) {
        return findFromDatabase(id);
    }

    public String findFromDatabase(Long id) {
        // expensive database operation
        return "Gathsara";
    }
}