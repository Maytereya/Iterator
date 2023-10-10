package org.Iterator.lesson;

import java.time.LocalDate;
import java.util.Objects;

public class User {

    private String firstName;
    private String secondName;
    private String patronymic;
    private String dateOfBirth;

    public User(String firstName, String secondName, String patronymic, String dateOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(firstName, user.firstName) && Objects.equals(secondName, user.secondName) && Objects.equals(patronymic, user.patronymic) && Objects.equals(dateOfBirth, user.dateOfBirth);
    }

    @Override
    public String toString() {
        return "User{" +
                "Имя: '" + firstName + '\'' +
                ", фамилия: '" + secondName + '\'' +
                ", отчество: '" + patronymic + '\'' +
                ", дата рождения: " + dateOfBirth +
                '}';
    }
}
