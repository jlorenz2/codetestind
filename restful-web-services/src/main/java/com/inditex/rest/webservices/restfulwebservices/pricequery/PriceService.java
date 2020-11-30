package com.inditex.rest.webservices.restfulwebservices.pricequery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceService implements IPriceService {

    
	@Autowired
	private PriceRepository priceRepository;

	
	@Override
	public List<Object[]> getPrice(String dateTime, int productId, int brandId) {
		
		var prices = (List<Object[]>) priceRepository.getPrice(dateTime, productId, brandId);


		return prices;
	}
	

}
