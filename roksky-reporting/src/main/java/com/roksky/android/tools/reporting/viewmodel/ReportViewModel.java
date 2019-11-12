package com.roksky.android.tools.reporting.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.roksky.android.tools.reporting.ReportingLibrary;
import com.roksky.android.tools.reporting.model.Report;
import com.roksky.android.tools.reporting.model.xml.DashBoard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReportViewModel extends ViewModel {

    private List<Report> reportList;

    public LiveData<List<Report>> getReports() {
        if (reportList == null) {
            reportList = new ArrayList<>();

            loadReports();
        }
        MutableLiveData<List<Report>> liveData = new MutableLiveData<>();
        liveData.setValue(reportList);

        return liveData;
    }


    private void loadReports() {
        try {
            DashBoard dashBoard = ReportingLibrary.getInstance().getDashBoard();

            if(dashBoard != null && dashBoard.reports != null){
                for (com.roksky.android.tools.reporting.model.xml.Report r: dashBoard.reports){
                    Report report = new Report();
                    report.setName(r.name);
                    report.setCount(new Random().nextInt());
                    reportList.add(report);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
