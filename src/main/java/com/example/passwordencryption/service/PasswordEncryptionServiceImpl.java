package com.example.passwordencryption.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordEncryptionServiceImpl implements PasswordEncryptionService{

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public String encrypt (String pwd) {
        return bCryptPasswordEncoder.encode(pwd);
    }

    @Override
    public boolean match (String pwd,String encoded) {
        return bCryptPasswordEncoder.matches(pwd,encoded);
    }
}
