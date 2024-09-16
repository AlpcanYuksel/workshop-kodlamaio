package io.kodlama.dto.course;

import io.kodlama.entities.Category;
import io.kodlama.entities.Progress;
import io.kodlama.entities.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class CreateCourseRequest {

    private String name;

    private String imageUrl;

    private String description;

    private double price;

    private UUID instructorId;

    private UUID categoryId;

}
