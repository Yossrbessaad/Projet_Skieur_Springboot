package tn.esprit.yossr_bessaad_4se.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.yossr_bessaad_4se.entities.Instructor;
import tn.esprit.yossr_bessaad_4se.repositories.IInstructorRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class InstructorServiceImpl implements IInstructorServices {
    private IInstructorRepository instructorRepository;

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
}
