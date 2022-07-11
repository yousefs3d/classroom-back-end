package com.automation.classroom.service.mapper;

import com.automation.classroom.domain.Classroom;
import com.automation.classroom.service.dto.ClassroomDTO;
import com.automation.classroom.service.vm.ClassroomVM;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClassroomMapper {

    ClassroomMapper INSTANCE = Mappers.getMapper( ClassroomMapper.class );

    List<ClassroomDTO> classroomsToClassroomDTOs(List<Classroom> classrooms);

    Classroom classroomVMToClassroom (ClassroomVM classroomVM);

    ClassroomDTO classroomToClassroomDTO(Classroom classroom);

}
