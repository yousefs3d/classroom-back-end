package com.automation.classroom.service.mapper;

import com.automation.classroom.domain.Classroom;
import com.automation.classroom.service.dto.ClassroomDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ClassroomMapper {

    public ClassroomDTO classroomToClassroomDTO(Classroom classroom);
}
