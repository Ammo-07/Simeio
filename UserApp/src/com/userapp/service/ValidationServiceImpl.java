package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

import java.util.HashSet;
import java.util.Set;

public class ValidationServiceImpl implements IValidationService {
private Set<String> usernames = new HashSet<>();

@Override
public boolean validateUsername(String username) throws NameExistsException {
if (usernames.contains(username)) {
throw new NameExistsException("Username already exists.");
}

usernames.add(username);
return true;
}

@Override
public boolean validatePassword(String password) throws TooShortException, TooLongException {
if (password.length() < 6) {
throw new TooShortException("Password is too short. It should be at least 6 characters long.");
}

if (password.length() > 15) {
throw new TooLongException("Password is too long. It should not exceed 15 characters.");
}

return true;
}
}