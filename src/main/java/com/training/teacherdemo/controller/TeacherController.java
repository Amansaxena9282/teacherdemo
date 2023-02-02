package com.training.teacherdemo.controller;
import com.training.teacherdemo.model.Teacher;
import com.training.teacherdemo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @GetMapping("/getAllTeacher")
    public List<Teacher> getAll(){
        return teacherService.getAll();
    }
    @PostMapping("/saveTeacher")
    public Teacher saveTeacher(@RequestBody Teacher teacher){
        return teacherService.addTeacher(teacher);
    }
    @DeleteMapping("/deleteTeacher/{id}")
    public String getDelete(@PathVariable long id){
        return teacherService.deleteTeacher(id);

    }
    @PutMapping("/updateTeacher")
    public Teacher updateTeacher(@RequestBody Teacher teacher){
        return teacherService.updateTeacher(teacher);
    }
}
