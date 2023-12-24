package com.example.detabaseinteraction.Repositry;

import com.example.detabaseinteraction.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {


}
