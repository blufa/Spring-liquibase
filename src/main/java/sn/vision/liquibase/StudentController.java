package sn.vision.liquibase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentRepo studentRepository;

    @PostMapping("student")
    public String createStudent(@RequestParam String name) {
        return studentRepository.save(new Student(name, "dakar")).getName()+ " Ajouté avec succès";
       // String nameToReturn = studentRepository.findByName(name).getName();

    }

    @GetMapping("student")
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }
}
