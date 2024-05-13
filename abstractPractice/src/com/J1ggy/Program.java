package com.J1ggy;

public class Program {

	public static void main(String[] args) {
 Dog Fido = new Dog();
 Fido.sleep();
 String whatsFidoUpTo = Fido.move();
 Fido.makeNoise();
 System.out.println("What is Fido doing? " + whatsFidoUpTo);

 Cat Felix = new Cat();

 Felix.makeNoise();
 String whatsFelixUpTo  =Felix.move();
 System.out.println("What is Felix doing? " + whatsFelixUpTo);
 Felix.sleep();
 System.out.print("Well maybe not!");
 Cat.Bird Tweety = Felix.new Bird(); // Create an instance of the InnerClass Bird and assign it to Felix
 Tweety.makeNoise(); // Calling methods of the InnerClass
 Tweety.move();// Calling methods of the InnerClass
 Tweety.sleep();// Calling methods of the InnerClass
	}
}
