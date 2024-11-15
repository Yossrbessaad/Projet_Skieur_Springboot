package tn.esprit.yossr_bessaad_4se.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.yossr_bessaad_4se.Services.IInstructorServices;
import tn.esprit.yossr_bessaad_4se.Services.InstructorServiceImpl;
import tn.esprit.yossr_bessaad_4se.entities.Instructor;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/instructors")
@AllArgsConstructor
public class InstructorRestController {

    private  InstructorServiceImpl instructorService;

    @PostMapping
    public Instructor addInstructor(@RequestBody Instructor instructor) {
        return instructorService.addInstructor(instructor);
    }

    @GetMapping("/{id}")
    public Instructor retrieveInstructor(@PathVariable Long id) {
        return instructorService.retrieveInstructor(id);
    }

    @GetMapping
    public List<Instructor> retrieveAllInstructors() {
        return instructorService.retrieveAllInstructors();
    }

    @DeleteMapping("/{id}")
    public void deleteInstructor(@PathVariable Long id) {
        instructorService.deleteInstructor(id);
    }

    @PutMapping
    public void updateInstructor(@RequestBody Instructor instructor) {
        instructorService.updateInstructor(instructor);
    }
    @PostMapping("/addAndAssignToCourses/{numCourses}")
    public Instructor addAndAssignToCourses(@RequestBody Instructor instructor, @PathVariable Set<Long> numCourses) {
        return instructorService.addAndAssignToCourses(instructor,numCourses);

    }

}