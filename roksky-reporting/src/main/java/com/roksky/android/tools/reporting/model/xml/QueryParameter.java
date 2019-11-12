package com.roksky.android.tools.reporting.model.xml;

import org.simpleframework.xml.Element;

@Element(name = "query-parameter")
public final class QueryParameter {

    @Element
    public String name;

    @Element
    public String filter;

}
