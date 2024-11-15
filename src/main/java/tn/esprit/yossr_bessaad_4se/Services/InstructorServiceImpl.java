package tn.esprit.yossr_bessaad_4se.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.yossr_bessaad_4se.entities.Course;
import tn.esprit.yossr_bessaad_4se.entities.Instructor;
import tn.esprit.yossr_bessaad_4se.repositories.ICourseRepository;
import tn.esprit.yossr_bessaad_4se.repositories.IInstructorRepository;

import java.util.*;

@AllArgsConstructor
@Service
public class InstructorServiceImpl implements IInstructorServices {
    private final IInstructorRepository instructorRepository;
    private final ICourseRepository courseRepository;

    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        Optional<Instructor> instructor = instructorRepository.findById(numInstructor);
        return instructor.orElse(null);
    }

    @Override
    public List<Instructor> retrieveAllInstructors() {
        return (List<Instructor>) instructorRepository.findAll();
    }

    @Override
    public void deleteInstructor(Long numInstructor) {
        instructorRepository.deleteById(numInstructor);
    }

    @Override
    public void updateInstructor(Instructor instructor) {
        instructorRepository.save(instructor);
    }

    @Override
    public Instructor addAndAssignToCourses(Instructor instructor, Set<Long> numCourses) {
        List<Course> courseList = (List<Course>) courseRepository.findAllById(numCourses);
        Set<Course> courses = new HashSet<>();
        for (Course course : courseList) {
            courses.add(course);
        }
        instructor.setCourses(new ArrayList<>(courses));
        return instructorRepository.save(instructor);
    }
}

