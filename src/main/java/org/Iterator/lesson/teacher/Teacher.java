package org.Iterator.lesson.teacher;

import org.Iterator.lesson.User;

import java.time.LocalDate;

public class Teacher extends User {
    private Long teacherID;

    public Teacher(String firstName, String secondName, String patronymic, String dateOfBirth, Long teacherID) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherID = teacherID;
    }

    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Учитель {" +
                "имя: " + this.getFirstName() +
                ", фамилия: " + this.getSecondName()+
                ", дата рождения: " + this.getDateOfBirth() +
                ", ID: " + teacherID +
                '}';
    }
}
