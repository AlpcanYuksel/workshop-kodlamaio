package io.kodlama.dto.role;

import lombok.Data;

import java.util.UUID;

@Data
public class GetAllRolesResponse {

    private UUID id;

    private String name;
}
