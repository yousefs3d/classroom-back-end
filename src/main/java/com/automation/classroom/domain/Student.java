package com.automation.classroom.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Entity(name = "student")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Pattern(regexp = "([a-zA-Z]+[\\s]+[a-zA-Z]+)")
    private String name;
    @Email
    private String email;
    @Pattern(regexp = "[055]+[0-9]{7}")
    private String mobile;

    public Student() {}

    public Student(Long id, String name, String email, String mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
