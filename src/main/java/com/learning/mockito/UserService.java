package com.learning.mockito;

class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserName(Long id) {
        return userRepository.findUserName(id);
    }

    public void createUser() {

        User user = new User();
        user.setName("Gathsara");
        user.setAge(23);

        userRepository.save(user);
    }

    public void getUser(Long id) {
        userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}