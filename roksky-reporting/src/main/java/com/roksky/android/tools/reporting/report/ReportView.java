package com.roksky.android.tools.reporting.report;

import android.view.View;

import com.roksky.android.tools.reporting.model.Report;

public interface ReportView {

    View toView(Report report);

}
