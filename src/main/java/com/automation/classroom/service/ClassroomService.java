package com.automation.classroom.service;

import com.automation.classroom.domain.Classroom;
import com.automation.classroom.repository.ClassroomRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ClassroomService {

    private ClassroomRepository classroomRepository;

    private void saveClassroom(Classroom classroom){
        classroomRepository.save(classroom);
    }

    public List<Classroom> getAllClassrooms(){
        return classroomRepository.findAll();
    }
}
