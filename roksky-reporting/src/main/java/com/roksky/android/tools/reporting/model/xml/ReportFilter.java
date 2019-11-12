package com.roksky.android.tools.reporting.model.xml;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

@Element(name = "report-filter")
public final class ReportFilter {

    @Attribute
    public String id;

    @Element(name = "query", required = false)
    public String query;

    @Element(name = "id-column", required = false)
    public String idColumn;

    @Element(name = "name-column", required = false)
    public String nameColumn;
}
