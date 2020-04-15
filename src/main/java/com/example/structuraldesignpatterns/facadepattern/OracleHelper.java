package com.example.structuraldesignpatterns.facadepattern;

import java.sql.Connection;

public class OracleHelper {

    public static Connection getOracleDBConnection(){
        //创建oracle数据库的数据连接对象
        return null;
    }
    public void generateOraclePDFReport(String tableName, Connection con){
        //根据数据库表的名字生成PDF报表
        System.out.println("orace 生成PDF报表");
    }
    public void generateOracleHTMLReport(String tableName, Connection con){
        //根据数据库的名字生成
        System.out.println("orace 生成html报表");
    }

}
