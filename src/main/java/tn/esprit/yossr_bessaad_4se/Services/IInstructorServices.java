package tn.esprit.yossr_bessaad_4se.Services;

import tn.esprit.yossr_bessaad_4se.entities.Instructor;

import java.util.List;
import java.util.Set;

public interface IInstructorServices {
    Instructor addInstructor(Instructor instructor);
    Instructor retrieveInstructor(Long numInstructor);
    List<Instructor> retrieveAllInstructors();
    void deleteInstructor(Long numInstructor);
    void updateInstructor(Instructor instructor);
    Instructor addAndAssignToCourses(Instructor instructor, Set<Long> numCourses);
}
