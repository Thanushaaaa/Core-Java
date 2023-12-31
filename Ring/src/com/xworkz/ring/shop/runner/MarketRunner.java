package com.xworkz.ring.shop.runner;

import com.xworkz.ring.shop.repository.*;
import com.xworkz.ring.shop.dto.MarketDTO;
import com.xworkz.ring.shop.repository.MarketRepositoryImpl;

public class MarketRunner {
	public static void main(String[] args) {

		MarketDTO marketDTO = new MarketDTO("Marathalli", 90, "Veggies", "Prakash", 10);
		System.out.println(marketDTO);

		MarketDTO marketDTO2 = new MarketDTO("BTM", 100, "Fruits", "Amar", 11);
		System.out.println(marketDTO2);

		MarketDTO marketDTO3 = new MarketDTO("Hebbal", 150, "Groceries", "Akshay", 15);
		System.out.println(marketDTO3);

		MarketDTO marketDTO4 = new MarketDTO("Banasankari", 100, "Bags", "Ravi", 14);
		System.out.println(marketDTO4);

		MarketDTO marketDTO5 = new MarketDTO("Electronic city", 110, "Farm", "Rakesh", 12);
		System.out.println(marketDTO5);

		MarketRepository marketRepository = new MarketRepositoryImpl();
		marketRepository.save(marketDTO);
		marketRepository.save(marketDTO2);
		marketRepository.save(marketDTO3);
		marketRepository.save(marketDTO4);
		marketRepository.save(marketDTO5);

		MarketDTO marketDTO6 = marketRepository.findByLocation("BTM");
		System.out.println(marketDTO6);

		MarketDTO marketDTO7 = marketRepository.findByOwner("Rakesh");
		System.out.println(marketDTO7);

		MarketDTO marketDTO8 = marketRepository.findByDiscount(14);
		System.out.println(marketDTO8);

		MarketDTO[] marketDTO9 = marketRepository.readAll();
		for (int position = 0; position < marketDTO9.length; position++) {
			if (marketDTO9[position] != null) {
				System.out.println(marketDTO9[position]);
			}
		}

	}

}
