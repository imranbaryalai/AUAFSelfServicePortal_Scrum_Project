package com.auaf.studentadvisorplatform.courses.fragements;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.auaf.studentadvisorplatform.DatabaseHelper;
import com.auaf.studentadvisorplatform.R;
import com.auaf.studentadvisorplatform.courses.CoursesAdapter;
import com.auaf.studentadvisorplatform.courses.CoursesModal;

import java.util.ArrayList;

public class bbaCoursesFragment extends Fragment {

    View view;
    private RecyclerView recyclerView;
    ArrayList<CoursesModal> coursesDataArray;
    String Dept = "ITC";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.bba_courses_fragment, container, false);

        DatabaseHelper DB = new DatabaseHelper(getContext());
        coursesDataArray = DB.CoursesRowData2Array(Dept);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new CoursesAdapter(coursesDataArray));

        return view;
    }

    public bbaCoursesFragment() {
        // Required empty public constructor
    }
}