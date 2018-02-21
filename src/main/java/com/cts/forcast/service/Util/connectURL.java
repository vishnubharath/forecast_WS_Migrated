package com.cts.forcast.service.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class connectURL {  

   public static void main(String[] args) {  

      // Create a variable for the connection string.  
      String connectionUrl = "jdbc:sqlserver://CTSC00961933501:1433;" +  
         "databaseName=RBC_Downstream;user=rbcdev;password=razor888";  

      // Declare the JDBC objects.  
      Connection con = null;  
      Statement stmt = null;  
      ResultSet rs = null;  

      try {  
         // Establish the connection.  
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
         con = DriverManager.getConnection(connectionUrl);  

         // Create and execute an SQL statement that returns some data.  
         //String SQL = "SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE='BASE TABLE'";  
         String SQL = "SELECT * FROM BCK_XREF_ResourceDetails";  
         
         stmt = con.createStatement();  
         rs = stmt.executeQuery(SQL);  
         ResultSetMetaData rsmd = rs.getMetaData();

         System.out.println(rsmd.getColumnName(1));
         
         // Iterate through the data in the result set and display it.  
         while (rs.next()) {  
            //System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) );  
         }  
      }  

      // Handle any errors that may have occurred.  
      catch (Exception e) {  
         e.printStackTrace();  
      }  
      finally {  
         if (rs != null) try { rs.close(); } catch(Exception e) {}  
         if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
         if (con != null) try { con.close(); } catch(Exception e) {}  
      }  
   }  
}  