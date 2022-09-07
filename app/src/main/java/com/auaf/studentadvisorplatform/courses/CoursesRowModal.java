package com.auaf.studentadvisorplatform.courses;

public class CoursesRowModal {
    Integer courseID;
    String courseName;
    String coursePrerequisites;

    public CoursesRowModal(Integer courseID2, String courseName2, String coursePrerequisites2) {
        this.courseID = courseID2;
        this.courseName = courseName2;
        this.coursePrerequisites = coursePrerequisites2;
    }

    public Integer getCourseID() {
        return this.courseID;
    }

    public void setCourseID(Integer courseID2) {
        this.courseID = courseID2;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName2) {
        this.courseName = courseName2;
    }

    public String getCoursePrerequisites() {
        return this.coursePrerequisites;
    }

    public void setCoursePrerequisites(String coursePrerequisites2) {
        this.coursePrerequisites = coursePrerequisites2;
    }
}
