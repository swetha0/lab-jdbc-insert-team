package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import model.City;
import utility.ConnectionManager;

public class CityDAO{
	public City getCityByName(String name) throws Exception {
		ConnectionManager cm=new ConnectionManager();
		Connection con=cm.getConnection();
		
		String sql="SELECT MYTEAM.NAME,MYTEAM.COACH,MYCITY.CITYNAME FROM MYTEAM,MYCITY";
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(sql);
		
		System.out.println("Team Details are :");
		
		while(rs.next()) {
			System.out.println(rs.getString("name")+" "+rs.getString("coach")+" "+rs.getString("cityname"));
		}
		rs.close();
		stmt.close();
		con.close();
		return null;
		
	}
}