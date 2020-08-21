package com.asiaseu.action2db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCExample {
	   //STEP 1: Define JDBC driver
	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/schooldb";
	   // Database credentials(user name && password)
	   static final String USER = "root";
	   static final String PASS = "root@123";   
	   public static void main(String[] args) {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName(JDBC_DRIVER);
	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	      
	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();
	      String sql = "SELECT id, name, description FROM city";
	      ResultSet rs = stmt.executeQuery(sql);
	      //STEP 5: Extract data from result set
	      System.out.println("Extract data from result set");
	      while(rs.next()){
	    	//Retrieve by column name
	    	  long id  = rs.getInt("id");
	    	  String name = rs.getString("name");
	         String desc = rs.getString("description");
	         //Display values
	         System.out.print("City ID: " + id+"\n");
	         System.out.print("Code: " +name+"\n");
	         System.out.print("Description: " +desc+"\n");
	      }
	      //STEP 5: Close all of the open resources 
	      //close the ResultSet object here
	      rs.close();	     	      
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{//finally block used to close resources
	      try{
	    	  //STEP 5: Close all of the open resources 
	         if(stmt!=null)
	            conn.close();
	         if(conn!=null)
		        conn.close();
	      }catch(SQLException se){
	    	  System.out.println(se.getMessage());
	      }//end finally try
	   }//end try
	   System.out.println("Goodbye!");
}
}