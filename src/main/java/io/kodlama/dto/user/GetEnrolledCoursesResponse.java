package io.kodlama.dto.user;

import io.kodlama.dto.course.GetAllCourseResponse;
import lombok.Data;

import java.util.List;

@Data
public class GetEnrolledCoursesResponse {
    private List<GetAllCourseResponse> enrolledCourses;
}
