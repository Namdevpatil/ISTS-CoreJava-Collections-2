package com.javaListCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example6 
{

	public static void main(String[] args) 
	{
		
		List<Customer> customers = new LinkedList<Customer>();
		
		customers.add(new Customer(220, "Ganesh", "Vizag"));
		customers.add(new Customer(119, "Kiran", "Thirupathi"));
		customers.add(new Customer(789, "Ganesh", "Mumbai"));
		customers.add(new Customer(112, "Jayesh", "Hyderbad"));
		customers.add(new Customer(490, "Aruna", "Vizag"));
		
		
		Iterator<Customer> iterator = customers.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("------------------------------");

		
		
	}

}
