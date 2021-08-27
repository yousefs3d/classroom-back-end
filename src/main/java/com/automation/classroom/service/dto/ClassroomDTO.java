package com.automation.classroom.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassroomDTO {
    private Long id;
    private String room;
    private Integer capacity;
    private String building;
}
