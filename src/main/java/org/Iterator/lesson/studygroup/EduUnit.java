package org.Iterator.lesson.studygroup;

import java.util.Objects;

public class EduUnit {

    private String chamber;
    private String releaseDate;

    public EduUnit(String chamber, String releaseDate) {
        this.chamber = chamber;
        this.releaseDate = releaseDate;
    }

    public String getChamber() {
        return chamber;
    }

    public void setChamber(String chamber) {
        this.chamber = chamber;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "EduUnit{" +
                "chamber='" + chamber + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
