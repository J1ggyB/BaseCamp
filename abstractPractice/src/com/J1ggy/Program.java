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
 Cat.Bird Tweety = Felix.new Bird();
 Tweety.makeNoise();
 Tweety.move();
 Tweety.sleep();
	}
}
