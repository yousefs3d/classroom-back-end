package com.automation.classroom.service.mapper;

import com.automation.classroom.domain.Student;
import com.automation.classroom.service.dto.StudentDTO;
import com.automation.classroom.service.vm.StudentVM;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface StudentMapper {


    List<StudentDTO> studentToStudentDTO(List<Student> students);

    Student studentVMToStudent(StudentVM studentVM);

    StudentDTO studentToStudentDTO(Student student);
}
