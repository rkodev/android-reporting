package com.roksky.android.tools.reporting.datasource;

import com.roksky.android.tools.reporting.model.xml.Query;
import com.roksky.android.tools.reporting.model.xml.QueryParameter;
import com.roksky.android.tools.reporting.model.xml.QueryResult;

import java.util.List;

public interface DataSource {

    QueryResult executeQuery(Query query, List<QueryParameter> parameters);

}
