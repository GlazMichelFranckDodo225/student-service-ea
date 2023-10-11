package com.dgmf.service;

import com.dgmf.entity.Student;
import com.dgmf.web.dto.StudentDTO;

public interface StudentService {
    StudentDTO getStudentById(Long studentId);
    StudentDTO saveStudent(StudentDTO studentDTO);
}
