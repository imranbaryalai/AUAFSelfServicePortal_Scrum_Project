package com.auaf.studentadvisorplatform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.auaf.studentadvisorplatform.courses.CoursesActivity;

public class DashboardActivity extends AppCompatActivity {
    CardView chatCard;
    CardView coursesCard;
    CardView galleryCard;
    CardView logoutCard;
    CardView socialMediaCard;
    CardView staffCard;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.dashboard_activity);
        this.coursesCard = (CardView) findViewById(R.id.coursesCard);
        this.chatCard = (CardView) findViewById(R.id.chatCard);
        this.staffCard = (CardView) findViewById(R.id.staffCard);
        this.galleryCard = (CardView) findViewById(R.id.galleryCard);
        this.socialMediaCard = (CardView) findViewById(R.id.socialMediaCard);
        this.logoutCard = (CardView) findViewById(R.id.logoutCard);
        this.coursesCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DashboardActivity.this.startActivity(new Intent(DashboardActivity.this, CoursesActivity.class));
            }
        });
        this.chatCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });
        this.staffCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });
        this.galleryCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });
        this.socialMediaCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });
        this.logoutCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DashboardActivity.this.finish();
            }
        });
    }
}
