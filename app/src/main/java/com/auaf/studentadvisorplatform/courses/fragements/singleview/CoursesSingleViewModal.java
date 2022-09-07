package com.auaf.studentadvisorplatform.courses.fragements.singleview;

public class CoursesSingleViewModal {
    Integer courseCredits;
    String courseDept;
    Integer courseID;
    String courseName;
    String coursePrerequisites;
    String coursesDesc;

    public CoursesSingleViewModal(Integer courseID, String courseDept, String courseName, String coursePrerequisites, String coursesDesc, Integer courseCredits) {
        this.courseID = courseID;
        this.courseDept = courseDept;
        this.courseName = courseName;
        this.coursePrerequisites = coursePrerequisites;
        this.coursesDesc = coursesDesc;
        this.courseCredits = courseCredits;
    }

    public Integer getCourseID() {
        return this.courseID;
    }

    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }

    public String getCourseDept() {
        return this.courseDept;
    }

    public void setCourseDept(String courseDept) {
        this.courseDept = courseDept;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePrerequisites() {
        return this.coursePrerequisites;
    }

    public void setCoursePrerequisites(String coursePrerequisites) {
        this.coursePrerequisites = coursePrerequisites;
    }

    public String getCoursesDesc() {
        return this.coursesDesc;
    }

    public void setCoursesDesc(String coursesDesc) {
        this.coursesDesc = coursesDesc;
    }

    public Integer getCourseCredits() {
        return this.courseCredits;
    }

    public void setCourseCredits(Integer courseCredits) {
        this.courseCredits = courseCredits;
    }
}
