package com.blog.samples.boot.rest.data;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.blog.samples.boot.rest.repository.CustomerRepository;

@Component
@Slf4j
public class DataLoader implements CommandLineRunner{
	private static final Logger log=LoggerFactory.getLogger(DataLoader.class); 

	@Autowired
	private DataBuilder dataBuilder;
	
	@Autowired
	private CustomerRepository customerRepository;

	
	@Override
	public void run(String... arg0) throws Exception {
		
		log.debug("Loading test data...");
		dataBuilder.createCustomers().forEach(customer -> customerRepository.save(customer));
		log.debug("Test data loaded...");	
	}
}