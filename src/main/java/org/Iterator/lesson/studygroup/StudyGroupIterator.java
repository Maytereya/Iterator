package org.Iterator.lesson.studygroup;

import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<StudyGroup> {
    private int counter;
    private List<StudyGroup> studyGroupList;

    public StudyGroupIterator(List<StudyGroup> studyGroupList) {
        this.counter = 0;
        this.studyGroupList = studyGroupList;
    }

    public void zeroCounter() {
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studyGroupList.size();
    }

    @Override
    public StudyGroup next() {
        if (!hasNext())
            return null;
        return studyGroupList.get(counter++);
    }

    @Override
    public void remove() {
        studyGroupList.remove(counter);
    }
}
