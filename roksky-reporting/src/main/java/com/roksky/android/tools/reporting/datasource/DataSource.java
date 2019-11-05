package com.roksky.android.tools.reporting.datasource;

import com.roksky.android.tools.reporting.model.Query;
import com.roksky.android.tools.reporting.model.QueryParameter;
import com.roksky.android.tools.reporting.model.QueryResult;

import java.util.List;

public interface DataSource {

    QueryResult executeQuery(Query query, List<QueryParameter> parameters);

}
