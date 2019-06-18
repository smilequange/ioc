package com.peach.ioc.student.mapper;

import com.peach.ioc.student.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository
@Component("studentMapper")
public class StudentMapper {
    /**
     * 根据名称获取学生信息
     * @param name
     * @return
     */
    public Student getStudentByName(String name){
        Student student = new Student();
        student.setName(name);
        student.setAge(20);
        return student;
    }

}
