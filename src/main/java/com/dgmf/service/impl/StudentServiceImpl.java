package com.dgmf.service.impl;

import com.dgmf.entity.Student;
import com.dgmf.repository.StudentRepository;
import com.dgmf.service.StudentService;
import com.dgmf.web.dto.StudentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public StudentDTO getStudentById(Long studentId) {
        Student student = studentRepository.findById(studentId).get();

        StudentDTO studentDTO = StudentDTO.builder()
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .email(student.getEmail())
                .password(student.getPassword())
                .build();

        return studentDTO;
    }

    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = Student.builder()
                .firstName(studentDTO.getFirstName())
                .lastName(studentDTO.getLastName())
                .email(studentDTO.getEmail())
                .password(studentDTO.getPassword())
                .build();

        studentRepository.save(student);

        return studentDTO;
    }
}
