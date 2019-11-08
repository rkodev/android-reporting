package com.roksky.android.tools.reporting.model;

import org.simpleframework.xml.Element;

@Element(name = "footer")
public final class ReportFooter {

    @Element(required = false)
    public String name;

    @Element(name = "compute", required = false)
    public String compute;

    @Element(name = "column", required = false)
    public String column;
}
