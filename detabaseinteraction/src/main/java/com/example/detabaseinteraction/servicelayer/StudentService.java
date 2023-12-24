package com.example.detabaseinteraction.servicelayer;

import com.example.detabaseinteraction.Dto.StudentDto;
import com.example.detabaseinteraction.Repositry.StudentRepository;
import com.example.detabaseinteraction.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentDto addStudent(StudentDto studentDto) {


        Student student = new Student();
        student.setName(studentDto.getName());
        student.setName(studentDto.getCourse());
        Student savedStudent = studentRepository.save(student);

        StudentDto savedStudentDto = new StudentDto();
        savedStudentDto.setName(savedStudent.getName());
        savedStudentDto.setCourse(savedStudent.getCourse());
        savedStudentDto.setId(savedStudent.getId());

        return savedStudentDto;


    }

}
