package com.example.structuraldesignpatterns.facadepattern;

import java.sql.Connection;

/**
 * 门面模式
 * 我们所要调用的方法必须通过门对象
 * 门对象提供的方法中指定需要调用的数据库,以及生成报表的类型,以及报表的名称
 */
public class FacadePatternTest {
    public static void main(String[] args) {
        String tableName="Employee";
        //普通的方式生成mysqlHtml报表 和 oraclePDF报表
        Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, con);
        Connection con1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, con1);

        //使用门面模式生成mysqlHtml报表 和 oraclePDF报表
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }

}
