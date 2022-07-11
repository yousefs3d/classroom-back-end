package com.automation.classroom.rest;


import com.automation.classroom.service.ClassroomService;
import com.automation.classroom.service.StudentService;
import com.automation.classroom.service.vm.ClassroomVM;
import com.automation.classroom.service.vm.StudentVM;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/school/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllClasses(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getClassroom(@PathVariable Long id){
        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addNewClass(@RequestBody StudentVM studentVM){
        return new ResponseEntity<>(studentService.addNewStudent(studentVM), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateClassroom(@RequestBody StudentVM studentVM){
        return new ResponseEntity<>(studentService.updateStudent(studentVM), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteClassroom(@PathVariable Long id){
        studentService.deleteStudent(id);
        return new ResponseEntity<> (HttpStatus.OK);
    }
}
