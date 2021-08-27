package com.automation.classroom.domain;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Classroom {

    @Id
    private Long id;
    private String room;
    private Integer capacity;
    private String building;
}
