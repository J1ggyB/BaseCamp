package com.collections_utility_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> flavours = new ArrayList<>();
        String banana = "Not banana we don't do banana";
        String whisky = "Whisky";
        String  beer = "Heineken";
        String bacon = "Bacon";
        String butter = "Butter";
        flavours.add(butter);
        flavours.add(bacon);
        flavours.add(beer);
        flavours.add(whisky);
        System.out.println(banana);
        System.out.println(flavours);
        System.out.println("flavours.sort(); Will not work use the Collections Utility Class");
		Collections.sort(flavours);
        System.out.println(flavours);
		Collections.reverse(flavours);
        System.out.println(flavours);
        
        System.out.println("----------------------------------------------------------------------------");
        
        		ArrayList<String> names = new ArrayList<String>(Arrays.asList(new String []{"Dave","Mike","Linda", "Joe"}));
        		ArrayList<String> devs = new ArrayList<String>(Arrays.asList(new String[]{"Mike","Joe"}));
        		names.removeAll(devs);
        		System.out.println(names);
        		
                System.out.println("----------------------------------------------------------------------------");
                
                ArrayList<Double> numbers = new ArrayList<>( Arrays.asList(new Double[]{1.2, 4.8, 8.9, 3.7, 1.5}));
                System.out.println(numbers);
                double  max;
                System.out.println(max = Collections.max(numbers));
                double  min;
                System.out.println(max = Collections.max(numbers));                
                System.out.println(max = Collections.min(numbers));
             	Collections.swap(numbers, 2, 4);
             	System.out.println(numbers);
	}

}
