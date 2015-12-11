package com.han;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by HSQ on 2015/12/11.
 */
public class Test3 {
    Connection conn = null;
    Statement stmt = null;
    public static void main(String[]args) {
        try

        {
            int i = 1;
        /*conn= DriverManager.getConnection(url1,userName,password);
        stmt= conn.createStatement();
        stmt.executeUpdate(update);
        stmt.close();
        conn.close();*/
        } catch (Exception e){

        }

         finally

        {
        /*if(stmt!=null)stmt.close();
        if(conn!=null)conn.close();*/
        }
    }
}
