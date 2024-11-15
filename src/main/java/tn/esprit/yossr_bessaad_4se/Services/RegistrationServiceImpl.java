package tn.esprit.yossr_bessaad_4se.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.yossr_bessaad_4se.entities.Course;
import tn.esprit.yossr_bessaad_4se.entities.Registration;
import tn.esprit.yossr_bessaad_4se.entities.Skier;
import tn.esprit.yossr_bessaad_4se.repositories.ICourseRepository;
import tn.esprit.yossr_bessaad_4se.repositories.IRegistrationRepository;
import tn.esprit.yossr_bessaad_4se.repositories.ISkierRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class RegistrationServiceImpl implements IRegistrationServices {
    private  IRegistrationRepository registrationRepository;
    private final ISkierRepository skierRepository;
    private final ICourseRepository courseRepository ;

    @Override
    public Registration addRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        Optional<Registration> registration = registrationRepository.findById(numRegistration);
        return registration.orElse(null);
    }

    @Override
    public List<Registration> retrieveAllRegistrations() {
        return (List<Registration>) registrationRepository.findAll();
    }

    @Override
    public void deleteRegistration(Long numRegistration) {
        registrationRepository.deleteById(numRegistration);
    }

    @Override
    public void updateRegistration(Registration registration) {
        registrationRepository.save(registration);
    }

    @Override
    public Registration addAndAssignToSkier(Registration reg, Long numSkier) {
        Skier skier = skierRepository.findById(numSkier).orElse( null) ;
        reg.setSkier(skier);

        // Save and return the registration with the skier assigned
        return registrationRepository.save(reg);

    }

    @Override
    public Registration assignToCourse(Long numReg, Long numCourse) {
        Registration registration=registrationRepository.findById(numReg).orElse(null);
        Course course=courseRepository.findById(numCourse).orElse(null);
        registration.setCourse(course);
        return registrationRepository.save(registration);
    }
}
