package com.automation.classroom.rest;


import com.automation.classroom.service.ClassroomService;
import com.automation.classroom.service.vm.ClassroomVM;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/school/class")
public class ClassroomController {

    private final ClassroomService classroomService;

    public ClassroomController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllClasses(){
        return ResponseEntity.ok(classroomService.getAllClassrooms());
    }

    @PostMapping("/add")
    public ResponseEntity<?> addNewClass(@RequestBody ClassroomVM classroomVM){
        return new ResponseEntity<> (classroomService.addNewClass(classroomVM), HttpStatus.CREATED);
    }
}
