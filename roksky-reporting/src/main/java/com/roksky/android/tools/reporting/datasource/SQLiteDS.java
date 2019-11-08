package com.roksky.android.tools.reporting.datasource;

import com.roksky.android.tools.reporting.model.Query;
import com.roksky.android.tools.reporting.model.QueryParameter;
import com.roksky.android.tools.reporting.model.QueryResult;

import java.util.List;

public class SQLiteDS implements DataSource {

    @Override
    public QueryResult executeQuery(Query query, List<QueryParameter> parameters) {
        return null;
    }

}
