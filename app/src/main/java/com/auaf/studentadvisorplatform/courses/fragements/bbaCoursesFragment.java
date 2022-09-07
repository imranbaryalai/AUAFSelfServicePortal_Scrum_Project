package com.auaf.studentadvisorplatform.courses.fragements;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.auaf.studentadvisorplatform.DatabaseHelper;
import com.auaf.studentadvisorplatform.R;
import com.auaf.studentadvisorplatform.courses.CoursesAdapter;
import com.auaf.studentadvisorplatform.courses.CoursesRowModal;
import com.auaf.studentadvisorplatform.courses.fragements.singleview.CourseSingleView;
import com.auaf.studentadvisorplatform.courses.fragements.singleview.CoursesSingleViewModal;
import java.util.ArrayList;

public class bbaCoursesFragment extends Fragment implements CoursesAdapter.RecyclerViewClickListener {
    DatabaseHelper DB;
    String Dept = "BBA";
    ArrayList<CoursesRowModal> coursesDataArray;
    ArrayList<CoursesSingleViewModal> coursesSingleViewLists;
    private RecyclerView recyclerView;
    View view;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.view = inflater.inflate(R.layout.bba_courses_fragment, container, false);
        this.coursesDataArray = new DatabaseHelper(getContext()).CoursesRowData2Array(this.Dept);
        RecyclerView recyclerView2 = (RecyclerView) this.view.findViewById(R.id.recyclerView);
        this.recyclerView = recyclerView2;
        recyclerView2.setHasFixedSize(true);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.recyclerView.setAdapter(new CoursesAdapter(this.coursesDataArray, this));
        return this.view;
    }

    public void onClick(int position) {
        Integer courseID = this.coursesSingleViewLists.get(position).getCourseID();
        String courseDept = this.coursesSingleViewLists.get(position).getCourseDept();
        String courseName = this.coursesSingleViewLists.get(position).getCourseName();
        String courseDesc = this.coursesSingleViewLists.get(position).getCoursesDesc();
        String coursePreReq = this.coursesSingleViewLists.get(position).getCoursePrerequisites();
        Integer courseCredits = this.coursesSingleViewLists.get(position).getCourseCredits();
        Intent intent = new Intent(getContext(), CourseSingleView.class);
        intent.putExtra("Position", position);
        intent.putExtra("Dept", this.Dept);
        intent.putExtra("courseID", courseID);
        intent.putExtra("courseDept", courseDept);
        intent.putExtra("courseName", courseName);
        intent.putExtra("courseDesc", courseDesc);
        intent.putExtra("coursePreReq", coursePreReq);
        intent.putExtra("courseCredits", courseCredits);
        startActivity(intent);
    }
}
