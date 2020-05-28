package controller;

import dao.TeamDAO;
import model.City;
import model.Team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dao.CityDAO;

public class Main{
	public static void main(String[] args) throws Exception {
		Team team=new Team();
		City city=new City();
		TeamDAO teamdao=new TeamDAO();
		CityDAO citydao=new CityDAO();
		
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter team name ");
		String name=bf.readLine();
		System.out.println("Enter coach name ");
		String coach=bf.readLine();
		System.out.println("Enter the city");
		String cityName=bf.readLine();
		System.out.println("Enter the cityId");
		long cityId=Long.parseLong(bf.readLine());
		
		city.setCityName(cityName);
		city.setCityId(cityId);
		team.setName(name);
		team.setCoach(coach);
	    team.setCity(city);	
	    
	    teamdao.createTeam(team);
	    citydao.getCityByName(cityName);
	}
}