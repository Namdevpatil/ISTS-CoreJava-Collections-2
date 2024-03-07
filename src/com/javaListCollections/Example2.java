package com.javaListCollections;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) 
	{
		
		List<String> list = new ArrayList<String>();
		
		list.add("Hi");
		list.add("Hello");
		list.add(null);
		
		list.add("Welcome");
		list.add("Good Morning");
		list.add(null);
		
		list.add("Hello");
		
		list.add("How are you....!");
		list.add(null);
		
		
		//System.out.println(list.size());

		for(int i = 0; i < list.size(); i++)//length/length()
		{
			System.out.println(list.get(i));
		}
	}

}
