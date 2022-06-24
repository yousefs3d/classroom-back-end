package com.automation.classroom.repository;

import com.automation.classroom.domain.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long>  {
     List<Classroom> findAll();
}
