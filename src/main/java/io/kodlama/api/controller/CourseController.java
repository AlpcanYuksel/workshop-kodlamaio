package io.kodlama.api.controller;

import io.kodlama.business.CourseService;
import io.kodlama.dto.course.CreateCourseRequest;
import io.kodlama.dto.course.GetAllCourseResponse;
import io.kodlama.dto.course.UpdateCourseRequest;
import io.kodlama.entities.Course;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/create")
    public Course create(@RequestBody CreateCourseRequest request){
        return courseService.create(request);
    }
    @PutMapping("/update")
    public Course create(@RequestBody UpdateCourseRequest request){
        return courseService.update(request);
    }

    @GetMapping("/getAll")
    public List<GetAllCourseResponse> getAll() {
        return courseService.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam UUID id){
        courseService.delete(id);
    }

}
