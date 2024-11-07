package tn.esprit.yossr_bessaad_4se.Services;

import tn.esprit.yossr_bessaad_4se.entities.Course;

import java.util.List;

public interface ICourseServices {
    Course addCourse(Course course);
    Course retrieveCourse(Long numCourse);
    List<Course> retrieveAllCourses();
    void deleteCourse(Long numCourse);
    void updateCourse(Course course);
}
