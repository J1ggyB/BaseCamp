package com.J1ggy;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Motorway extends Canvas implements ActionListener { 
//Canvas is a subclass of Java Component interface
	//A component is an object having a graphical representation that can be displayed on the screen

	private static final long serialVersionUID = 1L;
	public Font myFont = new Font("Arial", Font.BOLD, 14 );
	public static Vehicle[] vehicles= new Vehicle[5];// Create an Array to hold five shape instances
	Vehicle vehicle1 = new Vehicle(1,0,0,60,10,6,VEHICLE_TYPE.MOTORBIKE);//Create five instances of Vehicles
	Vehicle vehicle2 = new Vehicle(2,100,0,90,70,2,VEHICLE_TYPE.CAR);	
	Vehicle vehicle3 = new Vehicle(3,200,0,90,50,6, VEHICLE_TYPE.RACING_CAR);
	Vehicle vehicle4 = new Vehicle(4,400,0,100,80,5, VEHICLE_TYPE.VAN);
	Vehicle vehicle5 = new Vehicle(5,600,0,170,80,1, VEHICLE_TYPE.LORRY);
	public static void main(String[] args) {//Execute the program
	Motorway myMotorway = new Motorway();//Create an instance of the Game class
	}
	Motorway() {  //Constructor for Motorway
		vehicles[0] = vehicle1;//Add vehicles to the array
		vehicles[1] = vehicle2;
		vehicles[2] = vehicle3;
		vehicles[3] = vehicle4;
		vehicles[4] = vehicle5;

		JButton Acc1 = new JButton("Accelerate");
		Acc1.setBounds(420,360,120,50);
		Acc1.setBackground(Color.red);
		Acc1.setForeground(Color.white);
		Acc1.setFont(myFont);
		Acc1.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle1.Accelerate();
			  } 
			} );
		JButton Break1 = new JButton("Break");
		Break1.setBackground(Color.red);
		Break1.setForeground(Color.white);
		Break1.setBounds(420,410,120,50);
		Break1.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle1.hitBreak();
			  } 
			} );
		JButton Switch1 = new JButton("Switch");
		Switch1.setBackground(Color.red);
		Switch1.setForeground(Color.white);
		Switch1.setBounds(420,460,120,50);
		Switch1.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle1.changeLane();
			  } 
			} );
		JButton Acc2 = new JButton("Accelerate");
		Acc2.setBounds(580,360,120,50);
		Acc2.setBackground(Color.blue);
		Acc2.setForeground(Color.white);
		Acc2.setFont(myFont);
		JButton Break2 = new JButton("Break");
		Break2.setBackground(Color.blue);
		Break2.setForeground(Color.white);
		Break2.setBounds(580,410,120,50);
		JButton Switch2 = new JButton("Switch");
		Switch2.setBackground(Color.blue);
		Switch2.setForeground(Color.white);
		Switch2.setBounds(580,460,120,50);
		JButton Acc3 = new JButton("Accelerate");
		Acc3.setBounds(740,360,120,50);
		Acc3.setBackground(Color.green);
		Acc3.setForeground(Color.white);
		Acc3.setFont(myFont);
		JButton Break3 = new JButton("Break");
		Break3.setBackground(Color.green);
		Break3.setForeground(Color.white);
		Break3.setBounds(740,410,120,50);
		JButton Switch3 = new JButton("Switch");
		Switch3.setBackground(Color.green);
		Switch3.setForeground(Color.white);
		Switch3.setBounds(740,460,120,50);
		JButton Acc4 = new JButton("Accelerate");
		Acc4.setBounds(900,360,120,50);
		Acc4.setBackground(Color.magenta);
		Acc4.setForeground(Color.white);
		Acc4.setFont(myFont);
		JButton Break4 = new JButton("Break");
		Break4.setBackground(Color.magenta);
		Break4.setForeground(Color.white);
		Break4.setBounds(900,410,120,50);
		JButton Switch4 = new JButton("Switch");
		Switch4.setBackground(Color.magenta);
		Switch4.setForeground(Color.white);
		Switch4.setBounds(900,460,120,50);
		JButton Acc5 = new JButton("Accelerate");
		Acc5.setBounds(1060,360,120,50);
		Acc5.setBackground(Color.orange);
		Acc5.setForeground(Color.white);
		Acc5.setFont(myFont);
		JButton Break5 = new JButton("Break");
		Break5.setBackground(Color.orange);
		Break5.setForeground(Color.white);
		Break5.setBounds(1060,410,120,50);
		JButton Switch5 = new JButton("Switch");
		Switch5.setBackground(Color.orange);
		Switch5.setForeground(Color.white);
		Switch5.setBounds(1060,460,120,50);
		JFrame frame = new JFrame();//Create a frame object (a Window)
		frame.setLayout(new BorderLayout(10,5));//NorthSouthEastWestCentre layout xGap 10 yGap 5
		frame.setTitle("Motorway Madness");//Window Title
		frame.setAlwaysOnTop(true);

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(1600, 530);//Set the size of the Canvas or Game
		frame.setResizable(false);
		//JPanel panel = new JPanel();
		//panel.setSize(400,360);
		//panel.setBackground(Color.black);
		//panel.setVisible(true);
		//panel.add(this);
		frame.add(Acc1);
		frame.add(Break1);
		frame.add(Switch1);
		frame.add(Acc2);
		frame.add(Break2);
		frame.add(Switch2);
		frame.add(Acc3);
		frame.add(Break3);
		frame.add(Switch3);
		frame.add(Acc4);
		frame.add(Break4);
		frame.add(Switch4);
		frame.add(Acc5);
		frame.add(Break5);
		frame.add(Switch5);
		frame.add(this); //Add the frame to the Game

		//panel.setLayout(new BorderLayout());
		//panel.setBounds(0, 368, 1600, 400);

		//frame.add(panel);
		frame.pack();//The pack() method is defined as a Window class in Java and it sizes the frame
		frame.setLocationRelativeTo(null);//Centres frame in Window
		frame.setVisible(true);//make the frame Visible

		Vehicle.setLanes();//The Balls in the game can exist in a larger world than the frame? 		
		Timer t = new Timer();//Creates a Timer instance - facilitates Threads for scheduling tasks
		TimerTask tt = new TimerTask() {//A task that can be scheduled for one-time or repeated execution
			@Override
			public void run() {//run the timer
				draw();
			}
		};

		t.schedule(tt, 0, 80);// Syntax: public void schedule(TimerTask task, first execution, repeat schedule)in milliseconds 

		
		frame.addWindowListener(new WindowAdapter() {// Listeners for Window tasks ie:close
			@Override
			public void windowClosing(WindowEvent e) {//Window event
				t.cancel();//Cancel the Timer
				tt.cancel();//Cancel the task 
			}
		});
	}
//-------------------------------------------------call move and repaint
	public void draw() {
		for (Vehicle eachVehicle : vehicles){
			eachVehicle.move();
		}
		this.repaint(); 
	}
//-------------------------------------------------------
	public void dodge() {
		for (Vehicle eachVehicle : vehicles){
			eachVehicle.changeLane();
		}
		this.repaint(); 
	}
//-------------------------
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		for(int i=0;i<3;i++) {
		g2d.setPaint(Color.DARK_GRAY);
		g2d.fillRect(0, Vehicle.lanes[i].posY, Vehicle.lanes[i].laneW, Vehicle.lanes[i].laneH);
		}//draw lanes

		for (Vehicle v: vehicles){//draw cars
			VEHICLE_TYPE tester = v.getVehicleType();
			switch(tester){
				case MOTORBIKE:
					g2d.setPaint(Color.red);
					g2d.fillRect(v.x, v.y , v.w, v.h);
					break;
				case CAR:
					g2d.setPaint(Color.blue);
					g2d.fillRect(v.x, v.y , v.w, v.h);
					break;
				case VAN:
					g2d.setPaint(Color.magenta);
					g2d.fillRect(v.x, v.y , v.w, v.h);
					break;
				case LORRY:
					g2d.setPaint(Color.orange);
					g2d.fillRect(v.x, v.y , v.w, v.h);
					break;
				case RACING_CAR:
					g2d.setPaint(Color.green);
					g2d.fillRect(v.x, v.y , v.w, v.h);
					break;

			}
		String slow = "Slow Lane";
		String mid = "Middle Lane";
		String fast = "Fast Lane";
		Graphics2D textG = (Graphics2D) g;
			textG.setColor(Color.white); 
			textG.drawString(slow, 30, 45);
			textG.drawString(mid, 30, 155); 
			textG.drawString(fast, 30, 265); //draw labels
		}
		Graphics2D gr2D = (Graphics2D) g;
		gr2D.setPaint(Color.black);
		gr2D.fillRect(0, 340, 1600, 190);
	}//end of drawing processes
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.repaint();
		
	}

}