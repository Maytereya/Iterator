package org.Iterator.lesson;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private final List<StudyGroup> studyGroupList;

    public Stream(List<StudyGroup> studyGroupList) {
        this.studyGroupList = studyGroupList;
    }

    public List<StudyGroup> getStudentList() {
        return studyGroupList;
    }

    public void setStudentList(List<Student> studentList) {
    }


    @Override
    public String toString() {
        return "StudentGroup{" +
                "studyGroupList=" + studyGroupList +
                '}';
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return new StudyGroupIterator(this.studyGroupList);
    }

}
