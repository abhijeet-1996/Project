package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Customer;
import com.example.demo.Repository.CustomerRepo;

@Service
public class CustomerService {

	
	@Autowired
	private CustomerRepo repo;
	
	public List<Customer> getCustomers() {
		return repo.findAll();
	}

	public Optional<Customer> getCustomer(int id) {
		return repo.findById(id);
	}

	public Customer addCustomer(Customer customer) {
		return repo.save(customer);
	}

	public void deleteCustomer(int id) {
		Customer p = repo.getOne(id);
		repo.delete(p);
	}

	public Customer updateCustomer(Customer customer) {
		repo.save(customer);
		return customer;
	}

}
