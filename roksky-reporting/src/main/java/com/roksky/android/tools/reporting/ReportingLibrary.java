package com.roksky.android.tools.reporting;

import android.content.Context;

import com.roksky.android.tools.reporting.model.xml.DashBoard;
import com.roksky.android.tools.reporting.utils.FileReaderUtil;

public class ReportingLibrary {
    private static ReportingLibrary reportingLibrary;
    private String filePath;
    private DashBoard dashBoard;
    private Context context;

    private ReportingLibrary() {
    }

    public static ReportingLibrary getInstance() {
        if (reportingLibrary == null) {
            reportingLibrary = new ReportingLibrary();
        }
        return reportingLibrary;
    }

    public ReportingLibrary withFilePath(String filePath) {
        this.filePath = filePath;
        return reportingLibrary;
    }

    public ReportingLibrary withContext(Context context) {
        this.context = context;
        return reportingLibrary;
    }

    public DashBoard getDashBoard() throws Exception {
        if (dashBoard == null) {
            dashBoard = FileReaderUtil.getDashBoard(filePath, context);
        }
        return dashBoard;
    }
}
