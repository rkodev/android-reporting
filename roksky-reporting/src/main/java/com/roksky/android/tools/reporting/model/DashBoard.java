package com.roksky.android.tools.reporting.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root
public final class DashBoard {

    @Attribute
    public String name;

    @ElementList(required = false)
    public List<Query> queries;

    @ElementList(name = "report-filters", required = false)
    public List<ReportFilter> reportFilters;

    @ElementList(required = false)
    public List<Report> reports;

}
