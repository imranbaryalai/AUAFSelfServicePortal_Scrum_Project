package com.auaf.studentadvisorplatform.courses;

public class CoursesModal {

    Integer courseID;
    String courseName, coursePrerequisites;

    public CoursesModal(Integer courseID, String courseName, String coursePrerequisites) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.coursePrerequisites = coursePrerequisites;
    }

    public Integer getCourseID() {
        return courseID;
    }

    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePrerequisites() {
        return coursePrerequisites;
    }

    public void setCoursePrerequisites(String coursePrerequisites) {
        this.coursePrerequisites = coursePrerequisites;
    }
}
