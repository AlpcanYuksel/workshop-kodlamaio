package io.kodlama.dto.course;

import lombok.Data;

import java.util.UUID;

@Data
public class DeleteCourseRequest {
    private UUID id;
}
