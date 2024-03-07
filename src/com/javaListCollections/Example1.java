package com.javaListCollections;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {


		List list = new ArrayList();
		
		list.add(123);
		list.add(423);
		
		list.add(45623.12);
		list.add(45673.18);
		
		list.add("Hello");
		
		list.add(false);
		
		//System.out.println(list.size());

		for(int i = 0; i < list.size(); i++)//length/length()
		{
			System.out.println(list.get(i));
		}
	}

}
