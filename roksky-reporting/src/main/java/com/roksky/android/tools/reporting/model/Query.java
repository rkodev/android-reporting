package com.roksky.android.tools.reporting.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

@Element
public final class Query {

    @Attribute(required = false)
    public String id;

    @Element(required = false)
    public String statement;

    @ElementList(name = "parameters", required = false)
    public List<QueryParameter> queryParameters;
}
