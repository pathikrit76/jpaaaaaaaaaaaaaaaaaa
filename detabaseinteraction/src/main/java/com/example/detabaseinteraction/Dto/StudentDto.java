package com.example.detabaseinteraction.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class StudentDto {
    @Override
    public String toString() {
        return "StudentDto{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Course='" + Course + '\'' +
                '}';
    }

    private Long Id;
    private String Name;
    private String Course;

}
