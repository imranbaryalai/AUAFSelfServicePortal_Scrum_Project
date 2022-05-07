package com.nextgendevs.auaf_stu_adv_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String dbName = "auafStudentAdvisingApp.db";

    // Table Users
    private static final String TABLE_NAME = "users";
    private static final String ID_COL = "ID";
    private static final String emailAddress_COL = "emailAddress";
    private static final String PASS_COL = "Password";
    private static final String ROLE_COL = "Role";



    public DatabaseHelper(Context context) {
        super(context, dbName, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase myDB) {
        myDB.execSQL("CREATE TABLE users (ID INT(9) UNIQUE PRIMARY KEY, emailAddress TEXT, Password TEXT, Role TEXT)");
        myDB.execSQL("INSERT INTO users values (000041575, 'imran.baryalai@auaf.edu.af', 'Shafi4749', 'Student')");
        myDB.execSQL("INSERT INTO users values (000041576,'subhan.sadat@auaf.edu.af', '12345six', 'Student')");
        myDB.execSQL("INSERT INTO users values (000041577, 'sami.naji@auaf.edu.af', 'professor', 'Professor')");
        myDB.execSQL("INSERT INTO users values (000000001, 'admin@auaf.edu.af', 'admin', 'Admin')");
        myDB.execSQL("INSERT INTO users values (00000002, 'itcs@auaf.edu.af', 'admin', 'Admin')");

        myDB.execSQL("CREATE TABLE staff (staffID INTEGER PRIMARY KEY autoincrement, staffFullName TEXT(50), staffDepartment TEXT(50), staffPosition TEXT(50))");
        myDB.execSQL("INSERT INTO staff (staffFullName, staffDepartment, staffPosition) values('Dr. Ala Abdulhakim', 'STEM', 'Director and Department Chair')");
        myDB.execSQL("INSERT INTO staff (staffFullName, staffDepartment, staffPosition) values('Dr. Sami Naji', 'STEM', 'Full-Time Professor')");
        myDB.execSQL("INSERT INTO staff (staffFullName, staffDepartment, staffPosition) values('Dr. Ahmad Al-Janad', 'STEM', 'Full-Time Professor')");
        myDB.execSQL("INSERT INTO staff (staffFullName, staffDepartment, staffPosition) values('Prof. Hameeda Hurmat', 'STEM', 'Part-Time and Associate Professor')");
        myDB.execSQL("INSERT INTO staff (staffFullName, staffDepartment, staffPosition) values('Prof. Ayesha Rawan', 'STEM', 'Part-Time and Associate Professor')");
        myDB.execSQL("INSERT INTO staff (staffFullName, staffDepartment, staffPosition) values('Prof. Ali Rahman', 'STEM', 'Part-Time and Associate Professor')");
        myDB.execSQL("INSERT INTO staff (staffFullName, staffDepartment, staffPosition) values('Prof. Rahimullah Shinwari', 'STEM', 'Part-Time and Associate Professor')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase myDB, int oldVersion, int newVersion) {
        myDB.execSQL("DROP TABLE IF EXISTS users");
        myDB.execSQL("DROP TABLE IF EXISTS staff");
        onCreate(myDB);
    }

    public Boolean checkUserPass(String username, String password) {
        SQLiteDatabase myDB = this.getWritableDatabase();
        try (Cursor cursor = myDB.rawQuery("SELECT * FROM users WHERE emailAddress = ? AND Password = ?", new String[]{username, password})) {

            if (cursor.getCount() > 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void registerUser(int userID, String userEmail, String userPass) {
        SQLiteDatabase myDB = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(ID_COL, userID);
        values.put(emailAddress_COL, userEmail);
        values.put(PASS_COL, userPass);
        values.put(ROLE_COL, "Student");

        myDB.insert("users", null, values);

        myDB.close();
    }

}
