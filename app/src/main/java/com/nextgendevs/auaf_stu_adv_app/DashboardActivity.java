package com.nextgendevs.auaf_stu_adv_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    CardView coursesCard;
    CardView chatCard;
    CardView staffCard;
    CardView galleryCard;
    CardView socialMediaCard;
    CardView logoutCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);

        coursesCard = findViewById(R.id.coursesCard);
        chatCard = findViewById(R.id.chatCard);
        staffCard = findViewById(R.id.staffCard);
        galleryCard = findViewById(R.id.galleryCard);
        socialMediaCard = findViewById(R.id.socialMediaCard);
        logoutCard = findViewById(R.id.logoutCard);

        // Cards OnClickListeners

        coursesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, CoursesActivity.class);
                startActivity(intent);
            }
        });

        chatCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                Intent intent = new Intent(DashboardActivity.this, CoursesActivity.class);
                startActivity(intent);
                 */
            }
        });

        staffCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                Intent intent = new Intent(DashboardActivity.this, CoursesActivity.class);
                startActivity(intent);
             */
            }
        });

        galleryCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                Intent intent = new Intent(DashboardActivity.this, CoursesActivity.class);
                startActivity(intent);
                */
            }
        });

        socialMediaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                Intent intent = new Intent(DashboardActivity.this, CoursesActivity.class);
                startActivity(intent);
                 */
            }
        });

        logoutCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
    }
}