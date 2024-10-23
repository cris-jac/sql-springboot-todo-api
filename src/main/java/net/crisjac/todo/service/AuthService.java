package net.crisjac.todo.service;

import net.crisjac.todo.dto.LoginDto;
import net.crisjac.todo.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);
    String login(LoginDto loginDto);
}
