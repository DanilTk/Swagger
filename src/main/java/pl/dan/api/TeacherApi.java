package pl.dan.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/teachers")
public class TeacherApi {

    @GetMapping
    public String getSchoolName() {
        return "Lyceum";
    }
}
