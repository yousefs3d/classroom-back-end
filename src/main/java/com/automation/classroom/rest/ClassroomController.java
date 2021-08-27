package com.automation.classroom.rest;


import com.automation.classroom.domain.Classroom;
import com.automation.classroom.service.ClassroomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("api/school/classroom")
@AllArgsConstructor
public class ClassroomController {

    private ClassroomService classroomService;

    @GetMapping()
    public List<Classroom> getAllClasses(){
        return classroomService.getAllClassrooms();
    }
}
