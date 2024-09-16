package io.kodlama.business;

import io.kodlama.core.utilities.config.mappers.ModelMapperService;
import io.kodlama.dataAccess.CourseRepository;
import io.kodlama.dto.course.CreateCourseRequest;
import io.kodlama.dto.course.GetAllCourseResponse;
import io.kodlama.dto.course.UpdateCourseRequest;
import io.kodlama.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ModelMapperService modelMapper;

    public Course create(CreateCourseRequest request){
        Course course = modelMapper.forRequest().map(request,Course.class);
        return courseRepository.save(course);
    }

    public List<GetAllCourseResponse> getAll() {
        List<Course> courses = courseRepository.findAll();
        List<GetAllCourseResponse> response = courses.stream().map(course -> modelMapper.forResponse().map(course, GetAllCourseResponse.class)).toList();
        return response;
    }

    public Course update (UpdateCourseRequest request){
        Course course = modelMapper.forRequest().map(request,Course.class);
        return courseRepository.save(course);
    }

    public void delete(UUID id){
        courseRepository.deleteById(id);

    }


}
