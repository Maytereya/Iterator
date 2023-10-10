package org.Iterator.lesson;

public interface iUserController<T extends User> {
    public void create(String firstName,
                    String secondName,
                    String patronymic,
                    String dateOfBirth);
}
