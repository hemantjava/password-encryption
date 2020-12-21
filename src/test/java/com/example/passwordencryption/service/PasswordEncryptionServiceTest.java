package com.example.passwordencryption.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class PasswordEncryptionServiceTest {

    @Autowired
    private PasswordEncryptionService passwordEncryptionService;
    private String pwd = "Hemant";



    @Test
    void match ( ) {
       String encoded = passwordEncryptionService.encrypt(pwd);
        final boolean match = passwordEncryptionService.match(pwd, encoded);
        assertTrue(match);
    }
}