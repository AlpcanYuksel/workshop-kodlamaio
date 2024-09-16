package io.kodlama.dto.user;

import io.kodlama.entities.Role;
import lombok.Data;

import java.util.UUID;

@Data
public class GetAllUserResponse {

    private UUID id;

    private String firstName;

    private String lastName;

    private String email;


}
