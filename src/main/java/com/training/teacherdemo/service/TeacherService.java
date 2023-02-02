package com.training.teacherdemo.service;
import com.training.teacherdemo.model.Teacher;

import java.util.List;
public interface TeacherService {
    //get
    public List<Teacher> getAll();
    //post
    public Teacher addTeacher (Teacher teacher);
    //put
    public Teacher updateTeacher (Teacher teacher);
    // delete
    public String deleteTeacher(long id);

    String deleteTeacher(Long id);
}
