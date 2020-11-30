package com.inditex.rest.webservices.restfulwebservices.pricemanagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;



@RestController
public class PriceController {

    @PersistenceContext
    private EntityManager entityManager;
    
	@Autowired
	private PriceRepository priceRepository;
	
	@Autowired
	private IPriceService priceService;
	
	
	@GetMapping("/price")
	public Map<String, String> price(Model model, @RequestParam("datetime") String dateTime, @RequestParam("productid") int productId, @RequestParam("brandid") int brandId) {
		
		var prices = (List<Object[]>) priceService.getPrice(dateTime, productId, brandId);
		

	    HashMap<String, String> map = new HashMap<String, String>();
	    
	    for (Object[] priceItem: prices) {
	    		map.put("productId",	 	priceItem[0].toString());
				map.put("brandId", 			priceItem[1].toString());	
				map.put("priceList", 		priceItem[2].toString());
				map.put("startDate", 		priceItem[3].toString());
				map.put("endDate", 			priceItem[4].toString());
				map.put("price", 			priceItem[5].toString());

	    }	
				
		
		return map;

	}
}
