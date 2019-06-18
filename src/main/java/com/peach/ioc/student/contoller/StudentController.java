package com.peach.ioc.student.contoller;

import com.peach.ioc.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("studentController")
public class StudentController {
//    @Resource(name = "studentService")
    @Autowired
    @Qualifier("studentService")// 解决一对多问题
    private StudentService studentService ;

    /**
     * 获取年龄
     * @param name
     * @return
     */
    public int  getAge(String name){
        return  studentService.getStudent(name).getAge();
    }
}
