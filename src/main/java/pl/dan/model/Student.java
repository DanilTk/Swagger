package pl.dan.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel("Personal data of student")
public class Student {
    private Long id;
    private String name;
    private String surname;
}
