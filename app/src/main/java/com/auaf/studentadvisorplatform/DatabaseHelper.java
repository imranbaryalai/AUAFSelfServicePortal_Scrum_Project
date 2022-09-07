package com.auaf.studentadvisorplatform;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.auaf.studentadvisorplatform.courses.CoursesRowModal;
import com.auaf.studentadvisorplatform.courses.fragements.singleview.CoursesSingleViewModal;
import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String ID_COL = "ID";
    private static final String PASS_COL = "Password";
    private static final String ROLE_COL = "Role";
    private static final String TABLE_NAME = "users";
    public static final String dbName = "auafStudentAdvisingApp.db";
    private static final String emailAddress_COL = "emailAddress";

    public DatabaseHelper(Context context) {
        super(context, dbName, null, 1);
    }

    public void onCreate(SQLiteDatabase myDB) {
        myDB.execSQL("CREATE TABLE users (ID INT(9) UNIQUE PRIMARY KEY, emailAddress TEXT, Password TEXT, Role TEXT)");
        myDB.execSQL("INSERT INTO users values (000041575, 'imran.baryalai@auaf.edu.af', 'admin', 'Student')");
        myDB.execSQL("INSERT INTO users values (000041576,'subhan.sadat@auaf.edu.af', 'admin', 'Student')");
        myDB.execSQL("INSERT INTO users values (000041577, 'sami.naji@auaf.edu.af', 'admin', 'Professor')");
        myDB.execSQL("INSERT INTO users values (000000001, 'admin@auaf.edu.af', 'admin', 'Admin')");
        myDB.execSQL("INSERT INTO users values (00000002, 'itcs@auaf.edu.af', 'admin', 'Admin')");
        myDB.execSQL("INSERT INTO users values (00000003, 'admin', 'admin', 'Admin')");
        myDB.execSQL("CREATE TABLE courses (courseID INTEGER PRIMARY KEY UNIQUE, courseDept TEXT(4), courseName TEXT(50), coursePreReq TEXT, courseDesc TEXT, courseCredits INTEGER(1))");
        myDB.execSQL("INSERT INTO courses values (099, 'ITC', 'Introduction to Computers', 'ENG 099, ENG 110, or ENG 105', 'This short course will provide students a foundation for ITC 109 and will provide a survey of computing and information technologies and methods to conduct research, analyze information, and to communicate that information to global audiences, utilizing internet-based research tools and other software. Furthermore, this course will introduce students to basic concepts in computer science, information literacy and communication and teach students to apply those concepts to any field of study.','0');");
        myDB.execSQL("INSERT INTO courses values (110,'ITC','Introduction to Information Technology','ITC 109 or ITC 101 or ITC 099','This course is continuation of the course ITC 099: Introduction to Computers. First part of this course covers Networking technology, Internet and World Wide Web, and Network & Internet security. Second part covers e-Commerce technology, and Information systems and systems development. Third part is primarily focus on Databases and Database Management Systems (DBMS). The last part focuses on Web page design and HTML coding.','3');");
        myDB.execSQL("INSERT INTO courses values (210, 'ITC', 'System Integration & Hardware Architecture', 'MTH 120', 'System integration and Hardware architecture is a technological course which is intended to make students familiar with different types of designs as sequential logic circuits, combinational logic circuits, trouble shooting of various digital systems, study of various digital systems. After reading this course students would have complete understanding about the low level architecture of any digital system of diverse areas like computer systems, telephony, data processing system, radar, navigation, military systems, medical instruments, process controls etc.', '3')");
        myDB.execSQL("INSERT INTO courses values (215, 'ITC', 'Introduction to Computers', 'MTH 120 and ITC 110', 'This course focuses on fundamentals of logic formulation with their implementation in Java programming language, a new and very simple language that allows the students to construct objects directly. It aims to develop the students logical, critical, and problem solving skills on programming basics and on the modern content of object-oriented programming (OOP) through exercises and hands-on activities. This course serves as a foundation for students in the IT & Computer Science program.', '3');");
    }

    public void onUpgrade(SQLiteDatabase myDB, int oldVersion, int newVersion) {
        myDB.execSQL("DROP TABLE IF EXISTS users");
        myDB.execSQL("DROP TABLE IF EXISTS courses");
        onCreate(myDB);
    }

    public Boolean checkUserPass(String username, String password) {
        Cursor cursor = getWritableDatabase().rawQuery("SELECT * FROM users WHERE emailAddress = ? AND Password = ?", new String[]{username, password});
        try {
            if (cursor.getCount() > 0) {
                cursor.close();
                return true;
            } else {
                cursor.close();
                return false;
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public ArrayList<CoursesRowModal> CoursesRowData2Array(String Dept) {
        ArrayList<CoursesRowModal> coursesList = new ArrayList<>();
        Cursor cursor = getReadableDatabase().rawQuery("SELECT courseID, courseName, coursePreReq From courses WHERE courseDept = ?", new String[]{Dept});
        int courseIDIndex = cursor.getColumnIndex("courseID");
        int courseNameIndex = cursor.getColumnIndex("courseName");
        int coursePreReqIndex = cursor.getColumnIndex("coursePreReq");
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Integer courseID = cursor.getInt(courseIDIndex);
            String courseName = cursor.getString(courseNameIndex);
            String coursePreReq = cursor.getString(coursePreReqIndex);
            coursesList.add(new CoursesRowModal(courseID, courseName, coursePreReq));
            System.out.println(courseID + ", " + courseName + ", " + coursePreReq);
            cursor.moveToNext();
        }
        return coursesList;
    }

    public ArrayList<CoursesSingleViewModal> CoursesRowData2ArrayFull(String Dept) {
        ArrayList<CoursesSingleViewModal> coursesSingleViewList = new ArrayList<>();
        SQLiteDatabase myDB = getReadableDatabase();
        Cursor cursor = myDB.rawQuery("SELECT * From courses WHERE courseDept = ?", new String[]{Dept});
        int courseIDIndex = cursor.getColumnIndex("courseID");
        int courseDeptIndex = cursor.getColumnIndex("courseDept");
        int courseNameIndex = cursor.getColumnIndex("courseName");
        int coursePreReqIndex = cursor.getColumnIndex("coursePreReq");
        int coursesDescIndex = cursor.getColumnIndex("courseDesc");
        int courseCreditsIndex = cursor.getColumnIndex("courseCredits");

        cursor.moveToFirst();

        while (!cursor.isAfterLast()){
            Integer courseID = cursor.getInt(courseIDIndex);
            String courseDept = cursor.getString(courseDeptIndex);
            String courseName = cursor.getString(courseNameIndex);
            String coursePreReq = cursor.getString(coursePreReqIndex);
            String courseDesc = cursor.getString(coursesDescIndex);
            Integer courseCredits = cursor.getInt(courseCreditsIndex);

            CoursesSingleViewModal coursesSingleViewModal = new CoursesSingleViewModal(courseID, courseDept, courseName, coursePreReq, courseDesc, courseCredits);
            coursesSingleViewList.add(coursesSingleViewModal);

            System.out.println(courseID + ", " + courseDept + ", " + courseName + ", " + coursePreReq + ", " + courseDesc + ", " + courseCredits);
            cursor.moveToNext();
        }
        return coursesSingleViewList;
    }

    public void registerUser(int userID, String userEmail, String userPass) {
        SQLiteDatabase myDB = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ID_COL, userID);
        values.put(emailAddress_COL, userEmail);
        values.put(PASS_COL, userPass);
        values.put(ROLE_COL, "Student");
        myDB.insert(TABLE_NAME, null, values);
        myDB.close();
    }
}
