package org.springapiserver.dao;

import org.springapiserver.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentDao extends JpaRepository<Student, Integer> {
    Page<Student> findAll(Pageable pageable);

    @Query("SELECT s.id FROM Student s ORDER BY s.id DESC LIMIT 1")
    Integer getLastStudentId();
}
