package org.Iterator.lesson.teacher;

import org.Iterator.lesson.student.Student;
import org.Iterator.lesson.student.StudentService;
import org.Iterator.lesson.student.StudentView;
import org.Iterator.lesson.iUserController;

public class TeacherController implements iUserController<Teacher> {
    private TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
         teacherService.create(firstName, secondName, patronymic, dateOfBirth);
         teacherView.sendOnConsole(teacherService.getAll());
    }
}
