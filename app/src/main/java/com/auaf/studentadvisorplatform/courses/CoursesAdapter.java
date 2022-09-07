package com.auaf.studentadvisorplatform.courses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.auaf.studentadvisorplatform.R;
import java.util.ArrayList;

public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.CoursesViewHolder> {
    ArrayList<CoursesRowModal> coursesList;
    private RecyclerViewClickListener listener;

    public interface RecyclerViewClickListener {
        void onClick(int i);
    }

    public CoursesAdapter(ArrayList<CoursesRowModal> coursesList2, RecyclerViewClickListener listener2) {
        this.coursesList = coursesList2;
        this.listener = listener2;
    }

    public CoursesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CoursesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.courses_row_activity, parent, false), this.listener);
    }

    public void onBindViewHolder(CoursesViewHolder holder, int position) {
        holder.courseIDTextView.setText(Integer.toString(this.coursesList.get(position).getCourseID().intValue()));
        holder.courseNameTextView.setText(this.coursesList.get(position).getCourseName());
        holder.coursePreReqTextView.setText(this.coursesList.get(position).getCoursePrerequisites());
    }

    public int getItemCount() {
        return this.coursesList.size();
    }

    class CoursesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView courseIDTextView;
        TextView courseNameTextView;
        TextView coursePreReqTextView;
        RecyclerViewClickListener listener;

        public CoursesViewHolder(View itemView, RecyclerViewClickListener listener2) {
            super(itemView);
            this.courseIDTextView = (TextView) itemView.findViewById(R.id.courseIDTV);
            this.courseNameTextView = (TextView) itemView.findViewById(R.id.courseNameTV);
            this.coursePreReqTextView = (TextView) itemView.findViewById(R.id.coursePrerequisitesTV);
            this.listener = listener2;
            itemView.setOnClickListener(this);
        }

        public void onClick(View view) {
            this.listener.onClick(getAdapterPosition());
        }
    }
}
