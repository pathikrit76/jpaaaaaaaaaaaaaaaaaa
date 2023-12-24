package com.example.detabaseinteraction.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "student_tbl")
@Data
public class Student {
    @Id
    @GeneratedValue(generator = "seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "seq", sequenceName = "seqgenerator", initialValue = 1, allocationSize = 1)
    private Long Id;
    private String Name;
    private String Course;

}
