package com.jbk.myapp.main;

import java.sql.ResultSet;
import java.util.Scanner;

import com.jbk.myapp.entity.Country;
import com.jbk.myapp.service.CountryService;

public class MainMethod {

	CountryService countryService=new CountryService();

	public void getAllCountries(){

		ResultSet resultSet=countryService.getAllCountries();
		try {
			while (resultSet.next()) {
				System.out.print(resultSet.getInt("idCountry") + "\t");
				System.out.print(resultSet.getString("nameCountry") + "\t");
				System.out.print(resultSet.getDouble("gdpCountry")+ "\t");
				System.out.print(resultSet.getInt("populationCountry")+ "\t");
				System.out.println(resultSet.getString("capitalCountry"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveCountries(Country country) {
		int result = countryService.saveCountries(country);
		System.out.println(result);
		if (result > 0) {
			System.out.println("Inserted");	
		} else {
			System.out.println("Not inserted");
		}
	}

	public void deleteCountry(int idCountry) {
		int result = countryService.deleteCountry(idCountry);
		if (result > 0) {
			System.out.println(result+ "Deleted");
		} else {
			System.out.println("Not Deleted");
		}
	}

	public void updateCountry(Country country) {
		int res = countryService.updateCountry(country);
		if (res > 0) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}	
	}


	public static void main(String[] args) {
		MainMethod mainMethod=new MainMethod();
		Scanner scanner=new Scanner(System.in);

		char ch = 0;
		int choice=0;
		do {
			System.out.println("1.Get All Countries");
			System.out.println("2.Save");
			System.out.println("3.Update");
			System.out.println("4.Delete");

			choice=scanner.nextInt();

			switch (choice) {
			case 1:mainMethod.getAllCountries();
			break;

			case 2:
				Country country=new Country(6,"Srilanlka",15.00,200000,"kolombo");
				mainMethod.saveCountries(country);
				break;

			case 3:
				Country country1=new Country(2,"UAE",11.5,1000000,"Dubai");
				mainMethod.updateCountry(country1);	
				break;

			case 4:
				System.out.println("Enter id of country");
				int idCountry=scanner.nextInt();
				mainMethod.deleteCountry(idCountry);
				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do You Want To Continue y/n");
			ch=scanner.next().charAt(0);

		} while (ch=='y');

		System.out.println("terminated");
	}
}
