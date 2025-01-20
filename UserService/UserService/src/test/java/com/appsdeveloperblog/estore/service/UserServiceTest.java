package com.appsdeveloperblog.estore.service;

import com.appsdeveloperblog.estore.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserServiceTest {

    @Test
    void testCreateUser_whenUserDetailsProvided_returnsUserObject(){
        // Arrange
        IUserService userService = new UserServiceImpl();
        String firstName = "John";
        String lastName = "Doe";
        String email = "jd@test.com";
        String password = "123123";
        String repeatPassword = "123123";


        // Act
        User user = userService.createUser(firstName, lastName, email, password, repeatPassword);

        // Assert
        assertNotNull(user, "The createUser() should not have returned null");
    }

    @Test
    void testCreateUser_whenUserCreated_returnedUserObjectContainsSameFirstName(){
        // Arrange
        IUserService userService = new UserServiceImpl();
        String firstName = "John";
        String lastName = "Doe";
        String email = "jd@test.com";
        String password = "123123";
        String repeatPassword = "123123";

        // Act
        User user = userService.createUser(firstName, lastName, email, password, repeatPassword);

        // Assert
        assertEquals(firstName, user.getFirstName());
    }
}
