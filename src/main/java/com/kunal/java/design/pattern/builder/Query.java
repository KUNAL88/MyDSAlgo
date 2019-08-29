package com.kunal.java.design.pattern.builder;

public class Query {

    private String selectColName;
    private String tableName;
    private String whereColName;
    private String groupByColName;

    public void setSelectColName(String selectColName) {
        this.selectColName = selectColName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setWhereColName(String whereColName) {
        this.whereColName = whereColName;
    }

    public void setGroupByColName(String groupByColName) {
        this.groupByColName = groupByColName;
    }

    public String getSelectColName() {
        return selectColName;
    }

    public String getTableName() {
        return tableName;
    }

    public String getWhereColName() {
        return whereColName;
    }

    public String getGroupByColName() {
        return groupByColName;
    }

    @Override
    public String toString() {
        return "Query{" +
                "selectColName='" + selectColName + '\'' +
                ", tableName='" + tableName + '\'' +
                ", whereColName='" + whereColName + '\'' +
                ", groupByColName='" + groupByColName + '\'' +
                '}';
    }
}
