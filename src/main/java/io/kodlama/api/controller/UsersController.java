package io.kodlama.api.controller;

import io.kodlama.business.UserService;
import io.kodlama.dto.user.CreateEnrollStudentRequest;
import io.kodlama.dto.user.CreateUserRequest;
import io.kodlama.dto.user.GetEnrolledCoursesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/user")
public class UsersController {

    @Autowired
    private UserService userService;


    @PostMapping("/createUser")
    public void create(@RequestBody CreateUserRequest request){
        userService.create(request);
    }

    @PostMapping("/enrollCourse")
    public void enrollCourse(@RequestBody CreateEnrollStudentRequest request){
        userService.enrollCourse(request);
    }

    @GetMapping("/getEnrolledCourse")
    public List<GetEnrolledCoursesResponse> getEnrolledCourses(@RequestParam UUID studentId){
        return userService.getEnrolledCourses(studentId);
    }
}
