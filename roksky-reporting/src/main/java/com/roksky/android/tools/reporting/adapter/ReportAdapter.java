package com.roksky.android.tools.reporting.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.roksky.android.tools.reporting.R;
import com.roksky.android.tools.reporting.model.Report;
import java.util.List;


public class ReportAdapter extends RecyclerView.Adapter<ReportAdapter.ReportAdapterViewHolder>{
    private LiveData<List<Report>> reportList;

    public ReportAdapter(LiveData<List<Report>> reportList) {
        this.reportList = reportList;
    }

    @NonNull
    @Override
    public ReportAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.report_details, parent, false);
        return new ReportAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReportAdapterViewHolder holder, int position) {
        com.roksky.android.tools.reporting.model.Report  report = reportList.getValue().get(position);
         holder.tvTitle.setText(report.getName());
         holder.tvTotal.setText(report.getCount());
         holder.tvTotal.setText(R.string.app_name);
    }

    @Override
    public int getItemCount() {
        return reportList.getValue().size();
    }

    public class ReportAdapterViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        TextView tvTotal;
        TextView tvViewContent;

        public ReportAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.title);
            tvTotal = itemView.findViewById(R.id.total);
            tvViewContent = itemView.findViewById(R.id.viewContent);

        }
    }
}
