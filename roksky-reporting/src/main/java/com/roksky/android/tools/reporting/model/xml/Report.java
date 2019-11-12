package com.roksky.android.tools.reporting.model.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

@Element
public final class Report {

    @Element(required = false)
    public String type;

    @Element(name = "query-source", required = false)
    public String querySource;

    @Element(required = false)
    public String name;

    @ElementList(name = "report-header", required = false)
    public List<ReportColumn> reportHeader;

    @ElementList(name = "report-footers", required = false)
    public List<ReportFooter> reportFooters;
}
