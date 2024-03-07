package com.javaListCollections;

import java.util.ArrayList;
import java.util.List;

public class Example4 
{

	public static void main(String[] args) 
	{
		
		List<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer(220, "Ganesh", "Vizag"));
		customers.add(new Customer(119, "Kiran", "Thirupathi"));
		customers.add(new Customer(789, "Ganesh", "Mumbai"));
		customers.add(new Customer(112, "Jayesh", "Hyderbad"));
		customers.add(new Customer(490, "Aruna", "Vizag"));
		
		for(Customer customer: customers)
		{
			System.out.println(customer.toString());
		}

		System.out.println("--------------------------");
		
		for(Customer customer: customers)
		{
			System.out.println(customer.getCustomerId()+" - "+customer.getCustomerName());
		}
	}

}
