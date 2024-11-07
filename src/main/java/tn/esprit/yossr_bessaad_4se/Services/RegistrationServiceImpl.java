package tn.esprit.yossr_bessaad_4se.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.yossr_bessaad_4se.entities.Registration;
import tn.esprit.yossr_bessaad_4se.repositories.IRegistrationRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class RegistrationServiceImpl implements IRegistrationServices {
    private  IRegistrationRepository registrationRepository;

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
}
