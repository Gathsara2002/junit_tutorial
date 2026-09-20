package com.learning.mockito;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserServiceTest {

    @Test
    void shouldGetUserName() {

        UserRepository userRepository = mock(UserRepository.class);

        when(userRepository.findUserName(10L)).thenReturn("Gathsara");

        UserService service = new UserService(userRepository);

        // Act
        String result = service.getUserName(10L);

        // Assert
        assertEquals("Gathsara", result);

    }
}