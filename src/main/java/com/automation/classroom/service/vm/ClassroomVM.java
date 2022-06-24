package com.automation.classroom.service.vm;

public class ClassroomVM {
    private Long id;
    private String room;
    private Integer capacity;
    private String building;

    public ClassroomVM() {
    }

    public ClassroomVM(Long id, String room, Integer capacity, String building) {
        this.id = id;
        this.room = room;
        this.capacity = capacity;
        this.building = building;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
