package pl.dan.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.dan.model.Student;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentApi {
    private final List<Student> students;

    @ApiOperation(value = "Find student by id", notes = "provide information about student by id")
    @GetMapping("/{id}")
    public Student getStudent(@ApiParam(value = "unique id of student", example = "1") @PathVariable long id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .get();
    }

    @GetMapping
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping
    public Long addStudent(@RequestBody Student student) {
        students.add(student);
        return student.getId();
    }
}
