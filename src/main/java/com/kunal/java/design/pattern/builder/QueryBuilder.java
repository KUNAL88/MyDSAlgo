package com.kunal.java.design.pattern.builder;

public class QueryBuilder {

    private Query query=null;
    public QueryBuilder(){
        query=new Query();
    }

    public QueryBuilder select(String colName){
            query.setSelectColName(colName);
            return this;
    }

    public QueryBuilder fromTable(String tableName){
            query.setTableName(tableName);
            return this;
    }

    public QueryBuilder where(String colName){
            query.setWhereColName(colName);
            return this;
    }

    public QueryBuilder groupBy(String colName){
            query.setGroupByColName(colName);
            return this;
    }

    public Query build(){
        return query;
    }

}
