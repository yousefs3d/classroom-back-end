package com.automation.classroom.repository;

import com.automation.classroom.domain.StudentClassroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentClassroomRepository extends JpaRepository<StudentClassroom, Long> {
}
