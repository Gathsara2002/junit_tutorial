package com.learning.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService service;

    @Test
    void shouldGetUserName() {

//      UserRepository userRepository = mock(UserRepository.class);

        when(userRepository.findUserName(10L)).thenReturn("Gathsara");

//        UserService service = new UserService(userRepository);

        String result = service.getUserName(10L);

        assertEquals("Gathsara", result);

        //verify user repository method called at least one time for any given long id
        verify(userRepository, atLeastOnce()).findUserName(anyLong());

        //verify no more repository method call during test
        verifyNoMoreInteractions(userRepository);

    }

    @Test
    void shouldCreateUser(){

        service.createUser();

        ArgumentCaptor<User> captor = ArgumentCaptor.forClass(User.class);

        verify(userRepository).save(captor.capture());

        User capturedUser = captor.getValue();

        assertEquals("Gathsara", capturedUser.getName());
        assertEquals(23, capturedUser.getAge());

    }
}