package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import com.google.common.collect.ImmutableMap; 

public class TowerOfHanoi {

	public void move(int numberOfDiscs, char from, char to, char inter)
	{
		
		// This is the breaking condition. If we don't put this in a recursive method, then we will get StackOverflow error.
		if(numberOfDiscs == 1)
		{
			System.out.println("Moving Disc 1 from " + from + " to "+ to);
		}
		else
		{
			move(numberOfDiscs - 1, from, inter, to);
			System.out.println("Moving Disc "+ numberOfDiscs + " from " + from + " to "+ to);
			move(numberOfDiscs - 1, inter, to , from);
		}
	}
	
	public static void main(String[] args) {
		TowerOfHanoi toh = new TowerOfHanoi();
		
		toh.move(3, 'A', 'C', 'B');
		
		//Map<String, String> a = Collections.EMPTY_MAP;
	/*	Map<String, String> a = new HashMap<String, String>();
		a.put("A", "AA");
		a.put("B", "BB");
		
		for(String s : a.keySet())
		{
			System.out.println("MAP KEY ==>"+ s +"MAP VALUE ==>"+ a.get(s));
		}
	
		ImmutableMap<String, String> immutableMap = ImmutableMap.copyOf(a); 
		a.put("C", "CC");
		immutableMap.put("B", "DD");
        // Print the ImmutableMap 
        System.out.println(immutableMap); */
	}
}
