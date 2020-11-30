package com.inditex.rest.webservices.restfulwebservices.pricemanagement;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price, Integer> {

		@Query("select productId, brandId, priceList, startDate, endDate, price from Price p where brandId = :brandid and parsedatetime(:datetime, 'yyyyMMddHHmmss') "
				+ "between startDate and endDate and productId = :productid "
				+ "and priority >= "
				+ "(select max(priority) from Price p where brandId = :brandid and parsedatetime(:datetime, 'yyyyMMddHHmmss') "
				+ "between startDate and endDate and productId = :productid) "
				+ "and rownum <= 1")	
		List<Object[]> getPrice(@Param("datetime") String dateTime, @Param("productid") int productId, @Param("brandid") int brandId);
}
