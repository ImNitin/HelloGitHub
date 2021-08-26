package com.jbk.myapp.entity;

public class Country {

	private int idCountry;
	private String nameCountry;
	private double gdpCountry;
	private int populationCountry;
	private String capitalCountry;


	public Country(int idCountry, String nameCountry, double gdpCountry, int populationCountry, String capitalCountry) {
		super();
		this.idCountry = idCountry;
		this.nameCountry = nameCountry;
		this.gdpCountry = gdpCountry;
		this.populationCountry = populationCountry;
		this.capitalCountry = capitalCountry;
	}


	public int getIdCountry() {
		return idCountry;
	}


	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}


	public String getNameCountry() {
		return nameCountry;
	}


	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}


	public double getGdpCountry() {
		return gdpCountry;
	}


	public void setGdpCountry(double gdpCountry) {
		this.gdpCountry = gdpCountry;
	}


	public int getPopulationCountry() {
		return populationCountry;
	}


	public void setPopulationCountry(int populationCountry) {
		this.populationCountry = populationCountry;
	}


	public String getCapitalCountry() {
		return capitalCountry;
	}


	public void setCapitalCountry(String capitalCountry) {
		this.capitalCountry = capitalCountry;
	}


	@Override
	public String toString() {
		return "Country [idCountry=" + idCountry + ", nameCountry=" + nameCountry + ", gdpCountry=" + gdpCountry
				+ ", populationCountry=" + populationCountry + ", capitalCountry=" + capitalCountry + "]";
	}

}
