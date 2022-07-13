package com.automation.classroom.service;


import com.automation.classroom.domain.Student;
import com.automation.classroom.domain.StudentClassroom;
import com.automation.classroom.exception.BusinessException;
import com.automation.classroom.repository.StudentRepository;
import com.automation.classroom.service.dto.StudentDTO;
import com.automation.classroom.service.mapper.StudentMapper;
import com.automation.classroom.service.vm.StudentVM;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Transactional
@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    private final StudentClassroomService studentClassroomService;
    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper,
                          StudentClassroomService studentClassroomService) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
        this.studentClassroomService = studentClassroomService;
    }

    private Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public List<StudentDTO> getAllStudents(){
        List<Student> students = studentRepository.findAll();
        return studentMapper.studentToStudentDTO(students);
    }


    public StudentDTO getStudentById(Long id){
        Student student = studentRepository.findById(id).orElseThrow(
                () -> new BusinessException("ID "+ id + "Not Found"));
        return studentMapper.studentToStudentDTO(student);
    }

    public Long addNewStudent(StudentVM studentVM){
        Student student = studentMapper.studentVMToStudent(studentVM);
        studentClassroomService.addNewStudentToClassroom(student,studentVM.getClassroomIds());
        saveStudent(student);
        return student.getId();
    }

    public Student updateStudent(StudentVM studentVM){
        studentRepository.findById(studentVM.getId()).orElseThrow(
                () -> new BusinessException("ID " + studentVM.getId() + "Not Found"));
        return saveStudent(studentMapper.studentVMToStudent(studentVM));
    }

    public void deleteStudent(Long id){
        studentRepository.deleteClassById(id);
    }

}
