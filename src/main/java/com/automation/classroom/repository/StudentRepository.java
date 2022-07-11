package com.automation.classroom.repository;

import com.automation.classroom.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteClassById(Long id);
}
