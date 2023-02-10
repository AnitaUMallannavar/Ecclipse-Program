package com.java.association;

public class MallRunner {

	public static void main(String[] args) {
		Area ar = new Area("Bhasham Cercle");
		ar.setPopulation(1234543);
		ar.setStreet("Namm adda");

		City city = new City("Vijayapur", "Vijayapur");
		city.setCapital(false);
		city.setArea(ar);
		

		State st = new State("Karnataka", "Basavaraj Bommai");
		st.setLanguqge("kannada");
		st.setCity(city);
		

		Country country = new Country("India", "Droupadi Murmu");
		country.setDeveloped(false);
		country.setState(st);
		

		Address ad = new Address();
		ad.setCountry(country);
		

		Company company = new Company("WIPRO", "thierry Delaport");
		company.setSince(1984);
		company.setAddress(ad);
		

		Security security = new Security("tech", "mouny");
		security.setTotalStaff(24);
		security.setCompany(company);

		Mall mall = new Mall("U mall", "Good");
		mall.setTotalFloors(7);
		mall.setSecurity(security);
		mall.show();
	}

}
