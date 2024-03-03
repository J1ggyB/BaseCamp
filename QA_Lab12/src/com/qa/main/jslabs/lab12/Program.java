package com.qa.main.jslabs.lab12;

public class Program {

	public static void main(String[] args) {
		
		Duck duck = new Duck("Bill");
		Penguin penguin = new Penguin("Ping");
		
		Animal[] animals = {duck, penguin};
		
		for (Animal animal : animals) {
			if (animal instanceof Consumable) {
				Consumable cAnimal = (Consumable) animal;
				System.out.println(cAnimal.describeTaste());
				System.out.println(cAnimal.isMainCourseDish());
			}
		}
		
		for (Animal animal : animals) {
			if (animal instanceof Insurable) {
				Insurable iAnimal = (Insurable) animal;
				System.out.println(iAnimal.getPremium());
				System.out.println(iAnimal.expires());
			}
		}
	}
}
