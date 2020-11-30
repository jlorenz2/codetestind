insert into Price 
	( brand_id,
	  start_date,
	  end_date,
	  price_list,
	  product_id,
	  priority,
	  price,
	  curr)
values(
				1, 
		parsedatetime('20200614000000', 'yyyyMMddHHmmss'), 
		parsedatetime('20201231235959', 'yyyyMMddHHmmss'),  
		1, 
		35455, 
		0, 
		35.5, 
		'EUR');
		
insert into Price 
	( brand_id,
	  start_date,
	  end_date,
	  price_list,
	  product_id,
	  priority,
	  price,
	  curr)
values(
				1, 
		parsedatetime('20200614150000', 'yyyyMMddHHmmss'), 
		parsedatetime('20200614183000', 'yyyyMMddHHmmss'),  
		2, 
		35455, 
		1, 
		25.45, 
		'EUR');
		
		
insert into Price 
	( brand_id,
	  start_date,
	  end_date,
	  price_list,
	  product_id,
	  priority,
	  price,
	  curr)
values(
				1, 
		parsedatetime('20200615000000', 'yyyyMMddHHmmss'), 
		parsedatetime('20200615110000', 'yyyyMMddHHmmss'),  
		3, 
		35455, 
		1, 
		30.5, 
		'EUR');
		
				
insert into Price 
	( brand_id,
	  start_date,
	  end_date,
	  price_list,
	  product_id,
	  priority,
	  price,
	  curr)
values(
				1, 
		parsedatetime('20200615160000', 'yyyyMMddHHmmss'), 
		parsedatetime('20201231235959', 'yyyyMMddHHmmss'),  
		4, 
		35455, 
		1, 
		38.95, 
		'EUR');
