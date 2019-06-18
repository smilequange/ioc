package com.peach.ioc.student.service.impl;

import com.peach.ioc.student.mapper.StudentMapper;
import com.peach.ioc.student.model.Student;
import com.peach.ioc.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper ;
    @Override
    public Student getStudent(String name) {
        return studentMapper.getStudentByName(name);
    }
}
