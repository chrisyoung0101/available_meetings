package com.gateaux.happen_meeting;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="meetings_list")//name of actual db table or name of class can match name of table.  Our db table is named meeting_list and since the name of our entity class does not match db table name we must use @Table here
public class Meeting {

    @Id
    private String id;

    private String nameEmp;
    private int startTime;
    private int endTime;

    public Meeting() {
    }

    public Meeting(String id, String nameEmp, int startTime, int endTime) {
        this.id = id;
        this.nameEmp = nameEmp;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameEmp() {
        return nameEmp;
    }

    public void setNameEmp(String nameEmp) {
        this.nameEmp = nameEmp;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meeting)) return false;
        Meeting meeting = (Meeting) o;
        return startTime == meeting.startTime &&
                endTime == meeting.endTime &&
                Objects.equals(id, meeting.id) &&
                Objects.equals(nameEmp, meeting.nameEmp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameEmp, startTime, endTime);
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "id='" + id + '\'' +
                ", nameEmp='" + nameEmp + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

}
