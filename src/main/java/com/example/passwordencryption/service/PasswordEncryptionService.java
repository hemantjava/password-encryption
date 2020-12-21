package com.example.passwordencryption.service;

public interface PasswordEncryptionService {
    String encrypt (String pwd);

    boolean match (String pwd,String encoded);


}
