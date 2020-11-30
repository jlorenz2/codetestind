package com.inditex.rest.webservices.restfulwebservices.pricemanagement;

import java.util.List;

public interface IPriceService {
	List<Object[]> getPrice(String dateTime, int productId, int brandId);
}
