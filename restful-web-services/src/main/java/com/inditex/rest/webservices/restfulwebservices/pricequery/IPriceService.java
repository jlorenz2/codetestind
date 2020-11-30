package com.inditex.rest.webservices.restfulwebservices.pricequery;

import java.util.List;

public interface IPriceService {
	List<Object[]> getPrice(String dateTime, int productId, int brandId);
}
