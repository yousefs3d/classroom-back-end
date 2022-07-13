package com.automation.classroom.service;


import com.automation.classroom.domain.Classroom;
import com.automation.classroom.domain.Student;
import com.automation.classroom.domain.StudentClassroom;
import com.automation.classroom.exception.BusinessException;
import com.automation.classroom.repository.StudentClassroomRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Transactional
@Service
public class StudentClassroomService {

    private final StudentClassroomRepository studentClassroomRepository;
    private final ClassroomService classroomService;

    public StudentClassroomService(StudentClassroomRepository studentClassroomRepository, ClassroomService classroomService) {
        this.studentClassroomRepository = studentClassroomRepository;
        this.classroomService = classroomService;
    }

    private void saveStudentClassroom(Set<StudentClassroom> studentClassrooms){
        studentClassroomRepository.saveAll(studentClassrooms);
    }

    public void addNewStudentToClassroom(Student student, List<Long>classroomIds){
        List<Classroom> classrooms = classroomService.getAllClassroomsByIds(classroomIds);
        if(!classrooms.isEmpty()){
            Set<StudentClassroom> studentClassrooms = classrooms.stream().map(classroom -> {
                StudentClassroom studentClassroom = new StudentClassroom();
                studentClassroom.setStudent(student);
                studentClassroom.setClassroom(classroom);
                studentClassroom.setActive(true);
                return studentClassroom;
            }).collect(Collectors.toSet());
            saveStudentClassroom(studentClassrooms);
        }else{
            throw new BusinessException("One or more classrooms don't exist");
        }
    }




}
