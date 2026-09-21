package com.learning.spy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Spy
    private UserService service;

    @Test
    void shouldGetUserName() {

        doReturn("Gathsara").when(service).findFromDatabase(anyLong());

        String result = service.getUserName(10L);

        assertEquals("Gathsara", result);

    }

}