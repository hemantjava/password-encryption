package com.example.passwordencryption;

import com.example.passwordencryption.service.PasswordEncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PasswordEncryptionApplication implements CommandLineRunner {

	@Autowired
	private PasswordEncryptionService passwordEncryptionService;
	public static void main(String[] args) {
		SpringApplication.run(PasswordEncryptionApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {
		final String encrypt = passwordEncryptionService.encrypt("Hemant");
		System.out.println(encrypt);
		System.out.println(passwordEncryptionService.match("Hemant",encrypt));
	}
}
