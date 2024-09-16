package io.kodlama.dataAccess;

import io.kodlama.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProgressRepository extends JpaRepository<Course, UUID> {
}
