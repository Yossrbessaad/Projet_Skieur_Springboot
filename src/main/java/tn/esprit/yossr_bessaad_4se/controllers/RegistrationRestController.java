package tn.esprit.yossr_bessaad_4se.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.yossr_bessaad_4se.Services.RegistrationServiceImpl;
import tn.esprit.yossr_bessaad_4se.entities.Registration;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
@AllArgsConstructor
public class RegistrationRestController {

    private  RegistrationServiceImpl registrationService;

    @PostMapping
    public Registration addRegistration(@RequestBody Registration registration) {
        return registrationService.addRegistration(registration);
    }

    @GetMapping("/{id}")
    public Registration retrieveRegistration(@PathVariable Long id) {
        return registrationService.retrieveRegistration(id);
    }

    @GetMapping
    public List<Registration> retrieveAllRegistrations() {
        return registrationService.retrieveAllRegistrations();
    }

    @DeleteMapping("/{id}")
    public void deleteRegistration(@PathVariable Long id) {
        registrationService.deleteRegistration(id);
    }

    @PutMapping
    public void updateRegistration(@RequestBody Registration registration) {
        registrationService.updateRegistration(registration);
    }
    @PostMapping("/assign-skier/{numSkier}")
    public Registration addAndAssignToSkier(@RequestBody Registration registration,@PathVariable Long numSkier) {
        return registrationService.addAndAssignToSkier(registration, numSkier);
    }
}
