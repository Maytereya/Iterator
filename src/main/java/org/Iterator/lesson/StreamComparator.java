package org.Iterator.lesson;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        int resultOfComparing = 0;
//        if (o1.getStudentList().size() == o2.getStudentList().size()) {
//            resultOfComparing = 0;
//        }
        if (o1.getStudentList().size() > o2.getStudentList().size()) {
            resultOfComparing = 1;
        }
        if (o1.getStudentList().size() < o2.getStudentList().size()) {
            resultOfComparing = -1;
        }

        return resultOfComparing;
    }
}
