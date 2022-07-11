package com.automation.classroom.domain;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

//@Getter
//@Setter
@Entity(name = "class")
public class Classroom implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String room;
    private Integer capacity;
    private String building;

    public Classroom() {
    }

    public Classroom(Long id, String room, Integer capacity, String building) {
        this.id = id;
        this.room = room;
        this.capacity = capacity;
        this.building = building;
    }

    public Long getId() {
        return id;
    }

    public String getRoom() {
        return room;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public String getBuilding() {
        return building;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
