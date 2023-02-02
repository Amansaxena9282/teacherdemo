package com.training.teacherdemo.serviceImpl;

import com.training.teacherdemo.model.Teacher;
import com.training.teacherdemo.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Override
    public List<Teacher> getAll() {
        List<Teacher> getall=new ArrayList<>();
        Teacher t1=new Teacher(23,"kamal",1);
        Teacher t2=new Teacher(24,"sachin",2);
        Teacher t3=new Teacher(25,"monti",3);
        getall.add(t1);
        getall.add(t2);
        getall.add(t3);
        return getall;
    }
    @Override
    public Teacher addTeacher(Teacher teacher) {
        return teacher;
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return teacher;
    }

    @Override
    public String deleteTeacher(long id) {
        return "delete success id:"+id;
    }

    @Override
    public String deleteTeacher(Long id) {
        return null;
    }
}
