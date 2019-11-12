package com.roksky.android.tools.sample;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.roksky.android.tools.reporting.ReportingLibrary;
import com.roksky.android.tools.reporting.model.xml.DashBoard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    DashBoard dashBoard = ReportingLibrary.getInstance()
                            .withContext(getApplicationContext())
                            .withFilePath("reporting/reports.xml")
                            .getDashBoard();
                    //FileReaderUtil.getDashBoard("reporting/reports.xml", getApplication());
                    System.out.print(dashBoard.name);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
