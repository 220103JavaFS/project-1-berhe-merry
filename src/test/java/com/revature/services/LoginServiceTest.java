package com.revature.services;

import com.revature.models.UserDTO;
import com.revature.repos.LoginDAO;
import com.revature.service.LoginService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class LoginServiceTest {

   private LoginService loginTest;

    @Mock
    private LoginDAO mockedDAO;

    private UserDTO testUser = new UserDTO();

    @BeforeEach
    public void setUp(){
        mockedDAO= Mockito.mock(LoginDAO.class);

        testUser.username = "agent";
        testUser.password = "password";
       // Mockito.mock(LoginDAO.class);

        loginTest= new LoginService();
        Mockito.when(mockedDAO.login("agent")).thenReturn(testUser);
    }

    @Test
    public void testLoginSuccess(){
        assertTrue(loginTest.login("agent", "password"));
    }

    @Test
    public void testLoginFailUsername(){
        assertFalse(testInstance.login("notAgent", "password"));
    }

    @Test
    public void testLoginFailPassword(){
        assertFalse(testInstance.login("agent", "word"));
    }

    @Test
    public void testLoginFailBoth(){
        assertFalse(testInstance.login("notAgent", "word"));
    }


