package io.kodlama.dto.course;

import io.kodlama.entities.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.UUID;

@Data
public class GetAllCourseResponse {
    private UUID id;

    private String name;

    private String imageUrl;

    private String description;

    private double price;

    private UUID instructorId;
}
