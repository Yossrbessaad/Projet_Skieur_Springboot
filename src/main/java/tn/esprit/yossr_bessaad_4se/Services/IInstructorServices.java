package tn.esprit.yossr_bessaad_4se.Services;

import tn.esprit.yossr_bessaad_4se.entities.Instructor;

import java.util.List;

public interface IInstructorServices {
    Instructor addInstructor(Instructor instructor);
    Instructor retrieveInstructor(Long numInstructor);
    List<Instructor> retrieveAllInstructors();
    void deleteInstructor(Long numInstructor);
    void updateInstructor(Instructor instructor);
}
