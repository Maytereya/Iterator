package org.Iterator.lesson;

import java.util.List;

public interface iUserView<T extends User> {
    public void sendOnConsole(List<T> list);
}
