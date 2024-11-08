package com.J1ggy;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas { 
//Canvas is a subclass of Java Component interface
	//A component is an object having a graphical representation that can be displayed on the screen
	// create an array of 3 balls 
	// call this array balls
	ArrayList<Shape> shapes = new ArrayList<>();// Create an ArrayList  to hold five shape instances
	Shape shape1 = new Shape(0,0,70,70,SHAPE_TYPE.ROUNDRECTANGLE);//Create five instances of Shape class
	Shape shape2 = new Shape(400,50,70,70,SHAPE_TYPE.THREEDRECTANGLE);	
	Shape shape3 = new Shape(50,700,70,70, SHAPE_TYPE.OVAL);
	Shape shape4 = new Shape(700,600,70,70, SHAPE_TYPE.ARC);
	Shape shape5 = new Shape(350,350,70,70, SHAPE_TYPE.RECTANGLE);
	Shape shape6 = new Shape(150,100,70,70, SHAPE_TYPE.OVAL);
	public static void main(String[] args) {//Execute the program
	      Game myGame = new Game();//Create an instance of the Game class
		}
	Game() {  //Constructor for Game
shapes.add(shape1);//Assign the five instances of Shape into the shapes ArrayList
shapes.add(shape2); 
shapes.add(shape3);
shapes.add(shape4);
shapes.add(shape5);
shapes.add(shape6);
JFrame frame = new JFrame();//Create a frame object (a Window)
this.setSize(800, 800);//Set the size of the Canvas or Game
frame.add(this); //Add the frame to the Game
frame.pack();//The pack() method is defined as a Window class in Java and it sizes the frame
frame.setVisible(true);//make the frame Visible
Shape.setWorld(800,800);//The Balls in the game can exist in a larger world than the frame? 		
Timer t = new Timer();//Creates a Timer instance - facilitates Threads for scheduling tasks
TimerTask tt = new TimerTask() {//A task that can be scheduled for one-time or repeated execution
@Override
public void run() {
draw();
}
};

t.schedule(tt, 0, 20);// Syntax: public void schedule(TimerTask task, first execution, repeat schedule)in milliseconds 

		
frame.addWindowListener(new WindowAdapter() {// Listeners for Window tasks ie:close
@Override
public void windowClosing(WindowEvent e) {
t.cancel();//Cancel the Timer
tt.cancel();//Cancel the task 
}
});
}

public void draw() { //Draws to a Window
// call the move() method of each balls
// Tip: use an enhanced for loop to pick 
//	  each ball in the balls array.
	for (Shape eachShape : shapes){
	eachShape.move();
	}
	
this.repaint(); //update the the Window
}

public void paint(Graphics g) {//Facilitates graphics properties like fill & stroke
Graphics2D g2d = (Graphics2D) g;//Offers more options than Graphics class
g2d.setPaint(Color.DARK_GRAY);//Set properties for Rectangle
g2d.fillRect(0, 0, Shape.worldW, Shape.worldH);
GradientPaint btom = new GradientPaint(0,0,Color.BLUE,800, 800,Color.MAGENTA);
GradientPaint gtoo = new GradientPaint(0,0,Color.GREEN,800, 00,Color.ORANGE);
GradientPaint otor = new GradientPaint(0,0,Color.ORANGE,800, 800,Color.RED);
GradientPaint rtop = new GradientPaint(0,0,Color.RED,800, 800,Color.PINK);
GradientPaint blktolg = new GradientPaint(0,0,Color.BLACK,400, 400,Color.LIGHT_GRAY);

// move and draw each ball in balls array
// Tip: use an enhanced for loop to pick 
//	  each ball in the balls array.
for (Shape s : shapes){//Set properties for each Ball
	SHAPE_TYPE tester = s.getShapeType();
	switch(tester){
		case ROUNDRECTANGLE:
				g2d.setPaint(btom);
				g2d.fillRoundRect(s.x, s.y , s.w, s.h, 20, 20);
				break;
		case THREEDRECTANGLE:
				g2d.setPaint(Color.LIGHT_GRAY);
				g2d.fill3DRect(s.x, s.y , s.w, s.h, true);
				break;
		case RECTANGLE:
				g2d.setPaint(otor);
				g2d.fillRect(s.x, s.y , s.w, s.h);
				break;
		case ARC:
				g2d.setPaint(rtop);
				g2d.fillArc(s.x, s.y , s.w, s.h, 255, 90);
				break;
		case OVAL:
				g2d.setPaint(gtoo);
				g2d.fillOval(s.x, s.y , s.w, s.h);
				break;
		}

	}
}
}