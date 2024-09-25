package com.J1ggy;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas { //Canvas is a subclass of Java Component interface
	//A component is an object having a graphical representation that can be displayed on the screen
	// create an array of 3 balls 
	// call this array balls
	Ball[] balls = new Ball[3];// Create an Array to hold three ball instances
	Ball ball1 = new Ball(0,0,70,200);//Create three instances of Ball class
	Ball ball2 = new Ball(400,300,90,90);	
	Ball ball3 = new Ball(50,700,50,50);

	public static void main(String[] args) {//Execute the program
	      Game myGame = new Game();//Create an instance of the Game class
		}
	Game() {  //Constructor for Game
balls[0] = ball1;//Assign the three instances of ball into the balls Array
balls[1] = ball2;
balls[2] = ball3;
JFrame frame = new JFrame();//Create a frame object (a Window)
this.setSize(800, 800);//Set the size of the Canvas or Game
frame.add(this); //Add the frame to the Game
frame.pack();//The pack() method is defined as a Window class in Java and it sizes the frame
frame.setVisible(true);//make the frame Visible
Ball.setWorld(800,800);//The Balls in the game can exist in a larger world than the frame? 		
Timer t = new Timer();//Creates a Timer instance - facilitates Threads for scheduling tasks
TimerTask tt = new TimerTask() {//A task that can be scheduled for one-time or repeated execution
@Override
public void run() {
draw();
}
};

t.schedule(tt, 0, 10);// Syntax: public void schedule(TimerTask task, first execution, repeat schedule)in milliseconds 

		
frame.addWindowListener(new WindowAdapter() {// Listenes for Window tasks ie:close
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
	for (Ball eachBall : balls){
	eachBall.move();
	}
	
this.repaint(); //update the the Window
}

public void paint(Graphics g) {//Facilitates graphics properties like fill & stroke
Graphics2D g2d = (Graphics2D) g;//Offers more options than Graphics class
g2d.setPaint(Color.DARK_GRAY);//Set properties for Rectangle
g2d.fillRect(0, 0, Ball.worldW, Ball.worldH);

// move and draw each ball in balls array
// Tip: use an enhanced for loop to pick 
//	  each ball in the balls array.
for (Ball b : balls){//Set properties for each Ball
g2d.setPaint(Color.ORANGE);
g2d.fillOval(b.x, b.y , b.w, b.h);
}
}
}