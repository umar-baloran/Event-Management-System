/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author MARV
 */
public class connection {
    
    public static Connection con;
    public static Statement stat;
    
    public connection()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"+"databaseName=event_db;integratedSecurity=true;");
            stat=con.createStatement();
            System.out.println("connected");
        }
        
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
}