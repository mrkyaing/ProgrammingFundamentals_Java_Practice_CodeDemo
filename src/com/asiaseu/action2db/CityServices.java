package com.asiaseu.action2db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CityServices implements CityDAO{
	 Statement stmt = null;
	 Connection con=null;
	 sqlConnectionRegister sqlConnectionRegister=null;
	 public CityServices() {
		 sqlConnectionRegister=new sqlConnectionRegister();
	 }
   
	@Override
	public void Save(City entity) {
		con=sqlConnectionRegister.getConnection();
		String sql = "INSERT INTO City (name, description) VALUES (?, ?)";	 
		PreparedStatement statement;
		try {
			statement = con.prepareStatement(sql);
			statement.setString(1,entity.getName());
			statement.setString(2,entity.getDescription());
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new City was inserted successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<City> getAllCity() {
		List<City> dataList=new ArrayList<City>();
		con=sqlConnectionRegister.getConnection();
		//Execute a query
	      System.out.println("Creating statement...");
	      try {
			stmt = con.createStatement();
			 String sql = "SELECT id, name,description FROM city";
		      ResultSet rs = stmt.executeQuery(sql);
		      //Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		    	  City city=new City();
		    	
		    	  long id  = rs.getInt("id");
		    	  String name = rs.getString("name");
		         String desc = rs.getString("description");
		         city.setId(id);
		         city.setName(name);
		         city.setDescription(desc);
		         dataList.add(city);
		      }
		      rs.close();
		      if(con!=null) {
		    	  sqlConnectionRegister.closeConnection(con);
		      }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	     
		return dataList;
	}

}
