package com.revature.services;

import com.revature.models.UserDTO;
import com.revature.models.Users;
import com.revature.repos.LoginDAO;
import com.revature.service.LoginService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;


public class LoginServiceTest {

    private LoginService loginTest = new LoginService();

    @Mock
    private LoginDAO mockedDAO;
    private UserDTO testUser = new UserDTO();

    @BeforeEach
    public void setUp() {
        mockedDAO = Mockito.mock(LoginDAO.class);
        testUser.username = "agent";
        testUser.password = "password";
        Mockito.when(mockedDAO.login("agent")).thenReturn(new Users());
    }

    @Test
    public void testLoginSuccess() {

        //assertTrue(loginTest.login(testUser));
    }

    @Test
    public void testLoginFailUsername() {
        //assertFalse(loginTest.login(testUser));
    }

    @Test
    public void testLoginFailPassword() {
        //assertFalse(testInstance.login("agent", "word"));
    }

    @Test
    public void testLoginFailBoth() {
        //assertFalse(testInstance.login("notAgent", "word"));
    }
}


