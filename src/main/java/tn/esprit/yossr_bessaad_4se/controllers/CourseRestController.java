package tn.esprit.yossr_bessaad_4se.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.yossr_bessaad_4se.Services.CourseServiceImpl;
import tn.esprit.yossr_bessaad_4se.entities.Course;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseRestController {

    private  CourseServiceImpl courseService;

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @GetMapping("/{id}")
    public Course retrieveCourse(@PathVariable Long id) {
        return courseService.retrieveCourse(id);
    }

    @GetMapping
    public List<Course> retrieveAllCourses() {
        return courseService.retrieveAllCourses();
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }

    @PutMapping
    public void updateCourse(@RequestBody Course course) {
        courseService.updateCourse(course);
    }
}