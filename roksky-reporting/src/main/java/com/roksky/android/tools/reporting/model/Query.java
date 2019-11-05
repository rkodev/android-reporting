package com.roksky.android.tools.reporting.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.util.List;

@Element
public final class Query {

    @Attribute(required = false)
    public String id;

    @Element(required = false)
    public String statement;

    @Element(name = "parameters")
    public List<QueryParameter> queryParameters;
}
