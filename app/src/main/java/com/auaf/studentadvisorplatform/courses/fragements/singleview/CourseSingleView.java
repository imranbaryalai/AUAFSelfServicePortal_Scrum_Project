package com.auaf.studentadvisorplatform.courses.fragements.singleview;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.auaf.studentadvisorplatform.R;

public class CourseSingleView extends AppCompatActivity {
    Integer courseCredits;
    TextView courseCreditsTV;
    String courseDept;
    TextView courseDeptTV;
    String courseDesc;
    TextView courseDescTV;
    Integer courseID;
    TextView courseIDTV;
    String courseName;
    TextView courseNameTV;
    String coursePreReq;
    TextView coursePreReqTV;
    String fragmentName;
    Integer position;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.single_view_courses_activity);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.fragmentName = extras.getString("Dept");
            this.position = Integer.valueOf(extras.getInt("Position"));
            this.courseID = Integer.valueOf(extras.getInt("courseID"));
            this.courseDept = extras.getString("courseDept");
            this.courseName = extras.getString("courseName");
            this.courseDesc = extras.getString("courseDesc");
            this.coursePreReq = extras.getString("coursePreReq");
            this.courseCredits = Integer.valueOf(extras.getInt("courseCredits"));
            System.out.println(this.courseID + ", " + this.courseDept + ", " + this.courseName + ", " + this.coursePreReq + ", " + this.courseDesc + ", " + this.courseCredits);
        }
        this.courseIDTV = (TextView) findViewById(R.id.courseIDTextView);
        this.courseDeptTV = (TextView) findViewById(R.id.courseDeptTextView);
        this.courseNameTV = (TextView) findViewById(R.id.courseNameTextView);
        this.courseDescTV = (TextView) findViewById(R.id.courseDescTextView);
        this.coursePreReqTV = (TextView) findViewById(R.id.coursePreReqTextView);
        this.courseCreditsTV = (TextView) findViewById(R.id.courseCreditTextView);
        this.courseIDTV.setText(Integer.toString(this.courseID.intValue()));
        this.courseDeptTV.setText(this.courseDept);
        this.courseNameTV.setText(this.courseName);
        this.courseDescTV.setText(this.courseDesc);
        this.coursePreReqTV.setText(this.coursePreReq);
        this.courseCreditsTV.setText(Integer.toString(this.courseCredits.intValue()));
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        finish();
        return true;
    }
}
