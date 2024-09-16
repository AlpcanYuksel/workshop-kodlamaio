package io.kodlama.dto.user;

import lombok.Data;

import java.util.UUID;

@Data
public class CreateUserRequest {
    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private UUID roleId;
}
