package com.auaf.studentadvisorplatform.courses;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.auaf.studentadvisorplatform.R;

import java.util.ArrayList;

public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.CoursesViewHolder> {

    ArrayList<CoursesModal> coursesList;

    public CoursesAdapter(ArrayList<CoursesModal> coursesList) {
        this.coursesList = coursesList;
    }

    @NonNull
    @Override
    public CoursesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.courses_row_activity, parent, false);
        return new CoursesViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull CoursesViewHolder holder, int position) {
        holder.courseIDTextView.setText(Integer.toString(coursesList.get(position).getCourseID()));
        holder.courseNameTextView.setText(coursesList.get(position).getCourseName());
        holder.coursePreReqTextView.setText(coursesList.get(position).getCoursePrerequisites());

    }

    @Override
    public int getItemCount() {
        return coursesList.size();
    }

    class CoursesViewHolder extends RecyclerView.ViewHolder {

        TextView courseIDTextView;
        TextView courseNameTextView;
        TextView coursePreReqTextView;

        public CoursesViewHolder(@NonNull View itemView) {
            super(itemView);
            courseIDTextView = itemView.findViewById(R.id.courseIDTV);
            courseNameTextView = itemView.findViewById(R.id.courseNameTV);
            coursePreReqTextView = itemView.findViewById(R.id.coursePrerequisitesTV);

        }
    }
}
