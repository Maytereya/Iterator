package org.Iterator.lesson.teacher;

import org.Iterator.lesson.student.Student;
import org.Iterator.lesson.UserService;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private List<Teacher> teachers;
    private Long countMaxID;
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    public TeacherService() {
        //this.students = students;
        this.teachers = new ArrayList<Teacher>();
        this.countMaxID = 0L;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        //Long countMaxId = 0L;
        for (Teacher teacher : teachers
        ) {
            if (teacher.getTeacherID() > countMaxID) {
                countMaxID = teacher.getTeacherID();
            }
        }
        countMaxID++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxID);
        teachers.add(teacher);
    }


}

