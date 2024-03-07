package com.javaListCollections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Example7 
{

	public static void main(String[] args) 
	{

		//List<Customer> customers = new Vector<Customer>();
		Vector<Customer> customers = new Vector<Customer>();
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
		
		System.out.println("-------------------------------------------");
		
		Enumeration<Customer> customer =  customers.elements();
		
		while(customer.hasMoreElements())
		{
			System.out.println(customer.nextElement());
		}

	}

}
