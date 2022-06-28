package edu.miu.rest.dtos;

import edu.miu.rest.entity.Course;
import lombok.Data;

@Data
public class CourseDto {

    private int id;
    private String name;
    private String code;

    public CourseDto toDto(Course course) {
        CourseDto dto = new CourseDto();
        dto.setId(course.getId());
        dto.setName(course.getName());
        dto.setCode(course.getCode());
        return dto;
    }

    public Course toEntity() {
        Course course = new Course();
        course.setId(this.id);
        course.setName(this.getName());
        course.setCode(this.getCode());
        return course;
    }

}
