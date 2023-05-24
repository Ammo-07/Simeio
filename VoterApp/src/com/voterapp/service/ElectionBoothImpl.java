package com.voterapp.service;

import com.voterapp.exception.InvalidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements ElectionBooth {
private String[] localities = {"Example Locality"};

@Override
public boolean checkEligibility(int age, String locality, int vid) throws InvalidVoterException {
if (!checkAge(age)) {
throw new UnderAgeException("Invalid age. You must be 18 years or older to vote.");
}

if (!checkLocality(locality)) {
throw new LocalityNotFoundException("Invalid locality. Locality not found in the database.");
}

if (!checkVoterId(vid)) {
throw new NoVoterIDException("Invalid voter ID. Voter ID must be between 1000 and 9999.");
}

return true;
}

private boolean checkAge(int age) {
return age >= 18;
}

private boolean checkLocality(String locality) {
for (String loc : localities) {
if (loc.equals(locality)) {
return true;
}
}
return false;
}

private boolean checkVoterId(int vid) {
return vid >= 1000 && vid <= 9999;
}
}