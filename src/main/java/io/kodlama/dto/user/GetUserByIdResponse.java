package io.kodlama.dto.user;

import lombok.Data;

import java.util.UUID;

@Data
public class GetUserByIdResponse {

    private String firstName;
    private String lastName;
    private String email;
}
