package com.roksky.android.tools.reporting.model.xml;

import org.simpleframework.xml.Element;

@Element(name = "report-column")
public final class ReportColumn {

    @Element(name = "query-column", required = false)
    public String queryColumn;

    @Element(name = "title", required = false)
    public String name;

}
