package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class test {
    @Test
    public void testUserFacade() {
        UserFacade userFacade = new UserFacade();
        assertTrue(userFacade.validateAndAuthenticateUser("johndoe", "password"));
    }
}
