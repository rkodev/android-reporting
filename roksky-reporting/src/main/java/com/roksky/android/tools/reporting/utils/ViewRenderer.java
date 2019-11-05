package com.roksky.android.tools.reporting.utils;

import android.view.View;

import com.roksky.android.tools.reporting.model.DashBoard;

import java.util.ArrayList;
import java.util.List;

public class ViewRenderer {

    private DashBoard dashBoard;

    public ViewRenderer(DashBoard dashBoard) {
        this.dashBoard = dashBoard;
    }

    public List<View> getDashBoardView(){
        return new ArrayList<>();
    }

}
