package com.example.demo.services;
import com.example.demo.repository.UserRepository;
import com.example.demo.dto.usersDto.CreateUsersDto;
import com.example.demo.entity.User;
import java.time.Instant;
import java.util.UUID;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    // injetando o repositorio de usuario
    private UserRepository userRepository;

    // construtor para injetar o repositorio de usuario
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // metodo para criar um novo usuario
    public UUID createUser(CreateUsersDto createUsersDto) {

        var entity = new User(
                createUsersDto.username(),
                createUsersDto.email(),
                createUsersDto.password(),
                Instant.now(),
                null);

        var userSaved = userRepository.save(entity);

        return userSaved.getUserId();
    }
}