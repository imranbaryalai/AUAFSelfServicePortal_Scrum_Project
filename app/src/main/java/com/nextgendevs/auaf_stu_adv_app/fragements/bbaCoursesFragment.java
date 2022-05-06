package com.nextgendevs.auaf_stu_adv_app.fragements;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nextgendevs.auaf_stu_adv_app.R;

public class bbaCoursesFragment extends Fragment {

    View view;

    public bbaCoursesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.bba_courses_fragment, container, false);
        return view;
    }
}