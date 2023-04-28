package org.example;

public class UserFacade {
    private ValidationSubsystem validationSubsystem;
    private AuthenticationSubsystem authenticationSubsystem;

    public UserFacade() {
        validationSubsystem = new ValidationSubsystem();
        authenticationSubsystem = new AuthenticationSubsystem();
    }

    public boolean validateAndAuthenticateUser(String username, String password) {
        if (!validationSubsystem.validateUser(username, password)) {
            return false;
        }
        if (!authenticationSubsystem.authenticateUser(username, password)) {
            return false;
        }
        return true;
    }
}

