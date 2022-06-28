package edu.miu.rest.service.impl;

import edu.miu.rest.dtos.CourseDto;
import edu.miu.rest.entity.Course;
import edu.miu.rest.repo.CourseRepo;
import edu.miu.rest.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;

    @Override
    public List<CourseDto> finAll() {

        List<Course> courses = courseRepo.findAll();
        List<CourseDto> result = new ArrayList<CourseDto>();

        courses.stream()
                .forEach(c -> {
                    result.add(new CourseDto().toDto(c));
                });
        return result;
    }

    public void create(CourseDto dto) {
        var entity : Course = dto.toEntity();
    }
}
