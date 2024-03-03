package com.qa.main.jslabs.lab10;


public class Program {

	public static void main(String[] args) {

		Map map = new Map(500, 400);

		Submarine sub = new Submarine(10, 40, map, 0);
		Plane plane = new Plane(100, 20, map, 500);

		sub.move("east", 50);
		plane.move("west", 40);

		System.out.printf("Sub: x=%d y=%d\n", sub.getX(),sub.getY());
		System.out.printf("Plane: x=%d y=%d\n", plane.getX(),plane.getY());
		
		sub.dive(300);
		System.out.println("Depth: " + sub.getDepth());
		sub.surface();
		System.out.println("Depth: " + sub.getDepth());

		plane.climb(100);
		System.out.println("Height: " + plane.getHeight());
		plane.land();
		System.out.println("Height: " + plane.getHeight());

	}
}
