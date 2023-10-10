package org.Iterator.lesson.teacher;

import org.Iterator.lesson.student.Student;
import org.Iterator.lesson.iUserView;

import java.util.List;

public class TeacherView implements iUserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list
             ) {
            System.out.println(teacher);
        }    }
}
