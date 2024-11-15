package tn.esprit.yossr_bessaad_4se.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.yossr_bessaad_4se.entities.Course;
import tn.esprit.yossr_bessaad_4se.enums.Support;

import java.util.List;

public interface ICourseRepository extends CrudRepository<Course,Long> {
    List<Course> findBySupport(Support support);

}
