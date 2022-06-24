package com.automation.classroom.service;

import com.automation.classroom.domain.Classroom;
import com.automation.classroom.repository.ClassroomRepository;
import com.automation.classroom.service.dto.ClassroomDTO;
import com.automation.classroom.service.mapper.ClassroomMapper;
import com.automation.classroom.service.vm.ClassroomVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClassroomService {

    private final ClassroomRepository classroomRepository;
    private final ClassroomMapper classroomMapper;

    public ClassroomService(ClassroomRepository classroomRepository, ClassroomMapper classroomMapper) {
        this.classroomRepository = classroomRepository;
        this.classroomMapper = classroomMapper;
    }

    private Classroom saveClassroom(Classroom classroom){
        return classroomRepository.save(classroom);
    }

    public List<ClassroomDTO> getAllClassrooms(){
        List<Classroom> myClassroom = classroomRepository.findAll();
        return myClassroom.stream().map(classroom -> {
            ClassroomDTO classroomDTO = new ClassroomDTO();
            classroomDTO.setId(classroom.getId());
            classroomDTO.setRoom(classroom.getRoom());
            classroomDTO.setBuilding(classroom.getBuilding());
            classroomDTO.setCapacity(classroom.getCapacity());
            return classroomDTO;
        }).collect(Collectors.toList());
    }

    public Classroom addNewClass(ClassroomVM classroomVM){
        return saveClassroom(classroomMapper.classroomVMToClassroom(classroomVM));
    }
}
