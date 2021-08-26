package com.jbk.myapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jbk.myapp.config.DbConnection;
import com.jbk.myapp.entity.Country;

public class CountryService {

	public ResultSet getAllCountries(){

		ResultSet resultset=null;
		Connection connection=DbConnection.getConnection();

		try {
			PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM countries");
			resultset =preparedStatement.executeQuery();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return resultset;
	}

	public int saveCountries(Country country) {
		int result = 0;
		Connection connection = DbConnection.getConnection();

		try {

			// write query
			String sql = "INSERT INTO countries(idCountry,nameCountry,gdpCountry,populationCountry,capitalCountry)" + "VALUES(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			System.out.println("test");
			// pass values
			preparedStatement.setLong(1, country.getIdCountry());
			preparedStatement.setString(2, country.getNameCountry());
			preparedStatement.setDouble(3, country.getGdpCountry());
			preparedStatement.setInt(4, country.getPopulationCountry());
			preparedStatement.setString(5, country.getCapitalCountry());

			// execute Query
			result = preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}


	public int deleteCountry(int idCountry) {
		int result = 0;
		Connection connection = DbConnection.getConnection();

		// make connection
		String sql = "DELETE FROM countries WHERE idCountry=?";
		try {
			// write query
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, idCountry);
			result = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;

	}


	public int updateCountry(Country country) {
		System.out.println(country);

		// make connection
		int result=0;
		Connection connection = DbConnection.getConnection();
		String sql = "update countries SET capitalCountry=? WHERE idCountry=? and nameCountry=? and gdpCountry=? and populationCountry=?" ;

		// prepare query
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, country.getCapitalCountry());
			preparedStatement.setInt(2, country.getIdCountry());
			preparedStatement.setString(3, country.getNameCountry());
			preparedStatement.setDouble(4,country.getGdpCountry());
			preparedStatement.setInt(5, country.getPopulationCountry());

			//execute query
			result=preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

}
