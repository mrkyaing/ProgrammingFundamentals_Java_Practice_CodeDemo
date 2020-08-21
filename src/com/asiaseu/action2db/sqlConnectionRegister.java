package com.asiaseu.action2db;

import java.sql.Connection;
import java.sql.DriverManager;

public class sqlConnectionRegister {
	   // 1)JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/schooldb";

	   // 2)Database credentials
	   static final String USER = "root";
	   static final String PASS = "root@123";
public Connection	getConnection() {
	System.out.println("\n\n***** MySQL JDBC Connection Testing *****");
	 Connection conn = null;
   try{
	   Class.forName (JDBC_DRIVER).newInstance();     
       conn = DriverManager.getConnection (DB_URL, USER, PASS);
       System.out.println ("\nDatabase Connection Established...");
   }
  catch (Exception ex){
	       System.err.println ("Cannot connect to database server.");
		   ex.printStackTrace();
   }      
  return conn; 
}
public void closeConnection(Connection conn) {
	if (conn != null){
        try{
            System.out.println("\n***** Let terminate the Connection *****");
			   conn.close ();					   
            System.out.println ("\nDatabase connection terminated...");
        }
        catch (Exception ex){
		   System.out.println ("Error in connection termination!");
		   }
    }
}
}
