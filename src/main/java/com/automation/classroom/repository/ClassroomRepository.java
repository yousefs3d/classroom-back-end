package com.automation.classroom.repository;

import com.automation.classroom.domain.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;


@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long>  {

    void deleteClassById(Long id);
}
