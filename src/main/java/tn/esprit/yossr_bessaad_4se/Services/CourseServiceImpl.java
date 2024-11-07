package tn.esprit.yossr_bessaad_4se.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.yossr_bessaad_4se.entities.Course;
import tn.esprit.yossr_bessaad_4se.repositories.ICourseRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CourseServiceImpl implements ICourseServices {
    private ICourseRepository iCourseRepository;

    @Override
    public Course addCourse(Course course) {
        return iCourseRepository.save(course);
    }

    @Override
    public Course retrieveCourse(Long numCourse) {
        Optional<Course> course = iCourseRepository.findById(numCourse);
        return course.orElse(null);
    }

    @Override
    public List<Course> retrieveAllCourses() {
        return (List<Course>) iCourseRepository.findAll();
    }

    @Override
    public void deleteCourse(Long numCourse) {
        iCourseRepository.deleteById(numCourse);
    }

    @Override
    public void updateCourse(Course course) {
        iCourseRepository.save(course);
    }
}