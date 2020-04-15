package com.example.structuraldesignpatterns.facadepattern;

import java.sql.Connection;

public class MySqlHelper {
    public static Connection getMySqlDBConnection(){
        //创建数据库连接对象
        return null;
    }
    public void generateMySqlPDFReport(String tableName, Connection con){
        //获取一个表的PDF报表
        System.out.println("生成一个pdf报表");
    }
    public void generateMySqlHTMLReport(String tableName, Connection con){
        //获取一个表的html报表
        System.out.println("生成一个html报表");
    }
}
