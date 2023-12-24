package com.example.detabaseinteraction.Controller;

import com.example.detabaseinteraction.Dto.StudentDto;
import com.example.detabaseinteraction.servicelayer.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class controller {
    @Autowired
    StudentService service;
            @PostMapping("/post")
            public ResponseEntity<StudentDto> insertdata(@RequestBody StudentDto studentDto)
            {   log.debug("1st debug");
                log.debug("hey",studentDto);
                StudentDto studentsaveddata= service.addStudent(studentDto);
                log.debug("2nd debug");
                log.debug("2nd hey",studentsaveddata);
                return new ResponseEntity<>(studentsaveddata,HttpStatus.CREATED);
            }

}
