package net.crisjac.todo.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderImpl {
    // Used for help in creating new users
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // Get a password for _password_
        System.out.println(passwordEncoder.encode("password"));

        // Get a password for _admin_
        System.out.println(passwordEncoder.encode("admin"));
    }
}
