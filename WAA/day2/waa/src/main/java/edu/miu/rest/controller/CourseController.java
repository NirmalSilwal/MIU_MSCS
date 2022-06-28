package edu.miu.rest.controller;

import edu.miu.rest.dtos.CourseDto;
import edu.miu.rest.service.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    private final CourseServiceImpl courseService;

    @Autowired
    public CourseController(CourseServiceImpl courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public List<CourseDto> findAllProducts() {
        return courseService.finAll();
    }

    @PostMapping("/courses")
    public void addCourse(CourseDto courseDto) {

    }
}
