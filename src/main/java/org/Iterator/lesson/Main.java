package org.Iterator.lesson;

import org.Iterator.lesson.teacher.Teacher;
import org.Iterator.lesson.teacher.TeacherView;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        test1();

    }

    public static void test1() {
        Teacher teacher1 = new Teacher("Vlad", "Topl", "Vit", "11.12.83", 1L);
        Teacher teacher2 = new Teacher("Grig", "Send", "Serg", "23.12.89", 2L);
        Teacher teacher3 = new Teacher("Ozer", "Okay", "John", "12.12.81", 3L);

        List<Teacher> teacherList = List.of(new Teacher[]{teacher1, teacher2, teacher3});


        System.out.println("======= TeacherView test =========");
        TeacherView tv = new TeacherView();
        tv.sendOnConsole(teacherList);
    }

}