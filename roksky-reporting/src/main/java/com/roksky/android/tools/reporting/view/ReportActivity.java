package com.roksky.android.tools.reporting.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.roksky.android.tools.reporting.R;
import com.roksky.android.tools.reporting.adapter.ReportAdapter;
import com.roksky.android.tools.reporting.model.Report;
import com.roksky.android.tools.reporting.viewmodel.ReportViewModel;

import java.util.List;

public class ReportActivity extends AppCompatActivity {

    LiveData<List<Report>> reports;
    ReportViewModel reportViewModel = new ReportViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);

        RecyclerView recyclerView = findViewById(R.id.reports);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        reports = reportViewModel.getReports();
        ReportAdapter adapter = new ReportAdapter(reports);
        recyclerView.setAdapter(adapter);
    }
}
