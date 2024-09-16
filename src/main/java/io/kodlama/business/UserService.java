package io.kodlama.business;

import io.kodlama.core.utilities.config.mappers.ModelMapperService;
import io.kodlama.dataAccess.CourseRepository;
import io.kodlama.dataAccess.UserRepository;
import io.kodlama.dto.user.CreateEnrollStudentRequest;
import io.kodlama.dto.user.CreateUserRequest;
import io.kodlama.dto.user.GetEnrolledCoursesResponse;
import io.kodlama.entities.Course;
import io.kodlama.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ModelMapperService modelMapper;

    public void create(CreateUserRequest request){
        User user = modelMapper.forRequest().map(request,User.class);
        userRepository.save(user);
    }

    public void enrollCourse(CreateEnrollStudentRequest request) {

        Optional<User> optionalUser = userRepository.findById(request.getStudentId());
        Optional<Course> optionalCourse = courseRepository.findById(request.getCourseId());

        if (optionalUser.isPresent() && optionalCourse.isPresent()) {
            User student = optionalUser.get();
            Course course = optionalCourse.get();

            student.getEnrolledCourses().add(course);

            course.getStudents().add(student);

            userRepository.save(student);
            courseRepository.save(course);
        } else {
            throw new IllegalArgumentException("Öğrenci veya kurs bulunamadı.");
        }
    }

    public List<GetEnrolledCoursesResponse> getEnrolledCourses(UUID studentId){
        Optional<User> optionalUser = userRepository.findById(studentId);
        if (optionalUser.isPresent()) {
            User student = optionalUser.get();

            List<GetEnrolledCoursesResponse> response = student.getEnrolledCourses().stream()
                    .map(course -> modelMapper.forResponse().map(course, GetEnrolledCoursesResponse.class)).toList();

            return response;
        } else {
            throw new IllegalArgumentException("Kullanıcı bulunamadı.");
        }

    }


}

