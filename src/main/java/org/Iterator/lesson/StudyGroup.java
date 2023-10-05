package org.Iterator.lesson;

public class StudyGroup extends EduUnit implements Comparable<StudyGroup> {
    private Long groupID;

    public StudyGroup(String chamber, String releaseDate, Long groupID) {
        super(chamber, releaseDate);
        this.groupID = groupID;
    }

    public Long getStudentID() {
        return groupID;
    }

    public void setStudentID(Long studentID) {
        this.groupID = studentID;
    }

    @Override
    public int compareTo(StudyGroup o) {
//        if (this.groupID == o.groupID)
//            return 0;
//        else if (this.groupID < o.groupID)
//            return -1;
//        return 1;
        return this.groupID.compareTo(o.groupID);
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "groupID=" + groupID +
                " Факультет: " + super.getChamber() +
                " Выпуск: " + super.getReleaseDate() +
                '}';
    }
}
