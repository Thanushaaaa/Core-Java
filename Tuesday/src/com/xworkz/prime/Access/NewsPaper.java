package com.xworkz.prime.Access;

public class NewsPaper {
	private String company;
	private double price;
	private String companyOwner;
	private String language;

	public String getCompany() {
		return company;
	}

	public String getLanguage() {
		return language;
	}

	public double getPrice() {
		return price;
	}

	public String getCompanyOwner() {
		return companyOwner;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setCompanyOwner(String companyOwner) {
		this.companyOwner = companyOwner;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setPice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (" News paper " + company + " company owner is " + companyOwner + " price is " + price + " language is "
				+ language);
	}

}
