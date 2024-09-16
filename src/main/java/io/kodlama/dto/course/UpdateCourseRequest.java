package io.kodlama.dto.course;

import lombok.Data;

import java.util.UUID;

@Data
public class UpdateCourseRequest {

    private String name;

    private String imageUrl;

    private String description;

    private double price;

    private UUID instructorId;

    private UUID categoryId;
}
