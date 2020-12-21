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
    private String encoded;

    @Test
    void encrypt ( ) {
        encoded = passwordEncryptionService.encrypt(pwd);
        System.out.println(encoded);
    }

    @Test
    void match ( ) {
        encoded = passwordEncryptionService.encrypt(pwd);
        final boolean match = passwordEncryptionService.match(pwd, encoded);
        assertTrue(match);
    }
}