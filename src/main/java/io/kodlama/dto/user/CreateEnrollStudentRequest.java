package io.kodlama.dto.user;

import lombok.Data;

import java.util.UUID;

@Data
public class CreateEnrollStudentRequest {
    private UUID studentId;
    private UUID courseId;
}
