package com.J1ggy;

import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Motorway extends Canvas { 
//Canvas is a subclass of Java Component interface
	//A component is an object having a graphical representation that can be displayed on the screen

	private static final long serialVersionUID = 1L;
	public Font myFont = new Font("Arial", Font.BOLD, 14);//Custom Font
	int score; // records score
	JButton Score; // JButton to display score
	JFrame frame;  //JFrame
	public static Timer t; // Timer variable
	public static TimerTask tt; //Timer task (or schedule)
	public Vehicle[] vehicles= new Vehicle[5];// Create an Array to hold five shape instances
	Vehicle vehicle1 = new Vehicle(1,0,0,60,10,12,VEHICLE_TYPE.MOTORBIKE);//Create five instances of Vehicles
	Vehicle vehicle2 = new Vehicle(2,100,0,90,70,10,VEHICLE_TYPE.CAR);	// sets id, x, y, width, height, speed & type
	Vehicle vehicle3 = new Vehicle(3,200,0,90,50,11, VEHICLE_TYPE.RACING_CAR);
	Vehicle vehicle4 = new Vehicle(4,400,0,100,80,7, VEHICLE_TYPE.VAN);
	Vehicle vehicle5 = new Vehicle(5,600,0,170,80,5, VEHICLE_TYPE.LORRY);
	Lane[] lanes = new Lane[3]; // An array to hold the lanes
	
	public static void main(String[] args) {//Execute the program
	Motorway myMotorway = new Motorway();//Create an instance of the Game class

	
	t = new Timer();//Creates a Timer instance - facilitates Threads for scheduling tasks
	tt = new TimerTask() {//A task that can be scheduled for one-time or repeated execution
		@Override
		public void run() {//run the timer main function is to repeatedly call draw() method
	        for(Vehicle v : myMotorway.vehicles) { //Ierate through vehicles
	        	if(v.getSpeed() > 0) { //If all the vehicles are moving
	        		myMotorway.score = myMotorway.score +10;	// If moving up score
	        	}else {myMotorway.score = myMotorway.score -1;}  //
	        }
			myMotorway.Score.setText("Score: " + myMotorway.score); // update the GUI with a score
			myMotorway.draw(); // call draw

			
		}
	};
	t.schedule(tt, 0, 100);// Syntax: public void schedule(TimerTask task, first execution, repeat schedule)in milliseconds 
	
	myMotorway.frame.addWindowListener(new WindowAdapter() {// Listeners for Window tasks ie:close
		@Override
		public void windowClosing(WindowEvent e) {//Window event
			t.cancel();//Cancel the Timer
			tt.cancel();//Cancel the task 
		}
	});
	}
	Motorway() {  //CONSTRUCTOR for Motorway
		vehicles[0] = vehicle1;//Add vehicles to the array
		vehicles[1] = vehicle2;
		vehicles[2] = vehicle3;
		vehicles[3] = vehicle4;
		vehicles[4] = vehicle5;
		lanes[0] = new Lane(10);//Add 3 Lanes
		lanes[1] = new Lane(120);
		lanes[2] = new Lane(230);
		

		JButton Acc1 = new JButton("Accelerate");  //Add JButtons matching vehicle methods 
		Acc1.setBounds(420,360,150,50); //Accelerate
		Acc1.setBackground(Color.red);
		Acc1.setForeground(Color.white);
		Acc1.setFont(myFont);
		JButton Break1 = new JButton("Break");
		Break1.setBackground(Color.red);  // Break
		Break1.setForeground(Color.white);
		Break1.setFont(myFont);
		Break1.setBounds(420,410,150,50);
		JButton Switch1L = new JButton("Switch Left");
		Switch1L.setBackground(Color.red);  // Switch lane left
		Switch1L.setForeground(Color.white);
		Switch1L.setFont(myFont);
		Switch1L.setBounds(420,460,150,50);
		JButton Switch1R = new JButton("Switch Right");
		Switch1R.setBackground(Color.red);   //Switch lane right
		Switch1R.setForeground(Color.white);
		Switch1R.setFont(myFont);
		Switch1R.setBounds(420,510,150,50);
		JButton Acc2 = new JButton("Accelerate"); //Rinse and repeat for each vehicle
		Acc2.setBounds(580,360,150,50);
		Acc2.setBackground(Color.blue);
		Acc2.setForeground(Color.white);
		Acc2.setFont(myFont);
		JButton Break2 = new JButton("Break");
		Break2.setBackground(Color.blue);
		Break2.setForeground(Color.white);
		Break2.setFont(myFont);
		Break2.setBounds(580,410,150,50);
		JButton Switch2L = new JButton("Switch Left");
		Switch2L.setBackground(Color.blue);
		Switch2L.setForeground(Color.white);
		Switch2L.setFont(myFont);
		Switch2L.setBounds(580,460,150,50);
		JButton Switch2R = new JButton("Switch Right");
		Switch2R.setBackground(Color.blue);
		Switch2R.setForeground(Color.white);
		Switch2R.setFont(myFont);
		Switch2R.setBounds(580,510,150,50);
		JButton Acc3 = new JButton("Accelerate");
		Acc3.setBounds(740,360,150,50);
		Acc3.setBackground(Color.green);
		Acc3.setForeground(Color.white);
		Acc3.setFont(myFont);
		JButton Break3 = new JButton("Break");
		Break3.setBackground(Color.green);
		Break3.setForeground(Color.white);
		Break3.setFont(myFont);
		Break3.setBounds(740,410,150,50);
		JButton Switch3L = new JButton("Switch Left");
		Switch3L.setBackground(Color.green);
		Switch3L.setForeground(Color.white);
		Switch3L.setBounds(740,460,150,50);		
		JButton Switch3R = new JButton("Switch Right");
		Switch3R.setBackground(Color.green);
		Switch3R.setForeground(Color.white);
		Switch3R.setFont(myFont);
		Switch3R.setBounds(740,510,150,50);
		JButton Acc4 = new JButton("Accelerate");
		Acc4.setBounds(900,360,150,50);
		Acc4.setBackground(Color.magenta);
		Acc4.setForeground(Color.white);
		Acc4.setFont(myFont);
		JButton Break4 = new JButton("Break");
		Break4.setBackground(Color.magenta);
		Break4.setForeground(Color.white);
		Break4.setFont(myFont);
		Break4.setBounds(900,410,150,50);
		JButton Switch4L = new JButton("Switch Left");
		Switch4L.setBackground(Color.magenta);
		Switch4L.setForeground(Color.white);
		Switch4L.setFont(myFont);
		Switch4L.setBounds(900,460,150,50);
		JButton Switch4R = new JButton("Switch Right");
		Switch4R.setBackground(Color.magenta);
		Switch4R.setForeground(Color.white);
		Switch4R.setFont(myFont);
		Switch4R.setBounds(900,510,150,50);
		JButton Acc5 = new JButton("Accelerate");
		Acc5.setBounds(1060,360,150,50);
		Acc5.setBackground(Color.orange);
		Acc5.setForeground(Color.white);
		Acc5.setFont(myFont);
		JButton Break5 = new JButton("Break");
		Break5.setBackground(Color.orange);
		Break5.setForeground(Color.white);
		Break5.setFont(myFont);
		Break5.setBounds(1060,410,150,50);
		JButton Switch5L = new JButton("Switch Left");
		Switch5L.setBackground(Color.orange);
		Switch5L.setForeground(Color.white);
		Switch5L.setFont(myFont);
		Switch5L.setBounds(1060,460,150,50);
		JButton Switch5R = new JButton("Switch Right");
		Switch5R.setBackground(Color.orange);
		Switch5R.setForeground(Color.white);
		Switch5R.setFont(myFont);
		Switch5R.setBounds(1060,510,150,50);
		//---------------------------------------------------------------------------------------
		Score = new JButton("Score:  "); //Add the score button - just used as a label
		Score.setBackground(Color.BLACK);
		Score.setForeground(Color.YELLOW);
		Score.setFont(myFont);
		Score.setBounds(30,370,200,100);
		
		frame = new JFrame();//Create a frame object (a Window)
		frame.setLayout(new BorderLayout(10,5));//NorthSouthEastWestCentre layout xGap 10 yGap 5
		frame.setTitle("Motorway Madness");//Window Title
		frame.setAlwaysOnTop(true);
		frame.setBackground(Color.black);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(1600, 610);//Set the size of the Canvas or Game
		frame.setResizable(false);

		frame.add(Score); //Add the buttons to the frame
		frame.add(Acc1);
		frame.add(Break1);
		frame.add(Switch1L);
		frame.add(Switch1R);
		frame.add(Acc2);
		frame.add(Break2);
		frame.add(Switch2L);
		frame.add(Switch2R);
		frame.add(Acc3);
		frame.add(Break3);
		frame.add(Switch3L);
		frame.add(Switch3R);
		frame.add(Acc4);
		frame.add(Break4);
		frame.add(Switch4L);
		frame.add(Switch4R);
		frame.add(Acc5);
		frame.add(Break5);
		frame.add(Switch5L);
		frame.add(Switch5R);
		frame.add(this); //Add the frame to the Game


		//frame.add(panel);
		frame.pack();//The pack() method is defined as a Window class in Java and it sizes the frame to the window
		frame.setLocationRelativeTo(null);//Centres frame in Window
		frame.setVisible(true);//make the frame Visible

		Acc1.addActionListener(new ActionListener() {  // Add Action Listeners for each JButton
			  public void actionPerformed(ActionEvent e) { 
			    vehicle1.Accelerate();
			    frame.repaint();
			  } 
			} );
		Break1.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle1.hitBreak();
			    frame.repaint();			    
			  } 
			} );
		Switch1L.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle1.changeLaneL();
			    frame.repaint();
			  } 
			} );
		Switch1R.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle1.changeLaneR();
			    frame.repaint();
			  } 
			} );
		Acc2.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle2.Accelerate();
			    frame.repaint();
			  } 
			} );
		Break2.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle2.hitBreak();
			    frame.repaint();			    
			  } 
			} );
		Switch2L.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle2.changeLaneL();
			    frame.repaint();
			  } 
			} );
		Switch2R.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle2.changeLaneR();
			    frame.repaint();
			  } 
			} );
		Acc3.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle3.Accelerate();
			    frame.repaint();
			  } 
			} );
		Break3.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle3.hitBreak();
			    frame.repaint();			    
			  } 
			} );
		Switch3L.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle3.changeLaneL();
			    frame.repaint();
			  } 
			} );
		Switch3R.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle3.changeLaneR();
			    frame.repaint();
			  } 
			} );
		Acc4.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle4.Accelerate();
			    frame.repaint();
			  } 
			} );
		Break4.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle4.hitBreak();
			    frame.repaint();			    
			  } 
			} );
		Switch4L.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle4.changeLaneL();
			    frame.repaint();
			  } 
			} );
		Switch4R.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle4.changeLaneR();
			    frame.repaint();
			  } 
			} );
		Acc5.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle5.Accelerate();
			    frame.repaint();
			  } 
			} );
		Break5.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle5.hitBreak();
			    frame.repaint();			    
			  } 
			} );
		Switch5L.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle5.changeLaneL();
			    frame.repaint();
			  } 
			} );
		Switch5R.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    vehicle5.changeLaneR();
			    frame.repaint();
			  } 
			} );


	}

//-------------------------------------------------call move and repaint
	public void draw() { // Repaints the frame
		
		for (Vehicle eachVehicle : vehicles){ // move each vehicle
			eachVehicle.move();
			}
		int count =0;  // To add up collisions
		for (Vehicle ChkColV1 : vehicles){ // check each vehicle for collisions
			boolean col1 = vehicle1.checkCollision(ChkColV1,  ChkColV1 .x, ChkColV1 .y, ChkColV1 .w, ChkColV1 .h);
			if(col1) {
				vehicle1.speed=1; // set the speed to 1 if collision detected could be 0
			count++; //count the collisions
			}
		}
		for (Vehicle ChkColV2: vehicles){ // Rinse and repeat for each vehicle
			boolean col2 = vehicle2.checkCollision(ChkColV2, ChkColV2.x, ChkColV2.y, ChkColV2.w, ChkColV2.h);
			if(col2) {
				vehicle2.speed=1;
				count++;
				}

			}
		for (Vehicle ChkColV3: vehicles){
			boolean col3 = vehicle3.checkCollision(ChkColV3, ChkColV3.x, ChkColV3.y, ChkColV3.w, ChkColV3.h);
			if(col3) {
				vehicle3.speed=1;
				count++;
				}

			}
		for (Vehicle ChkColV4: vehicles){
			boolean col4 = vehicle4.checkCollision(ChkColV4, ChkColV4.x, ChkColV4.y, ChkColV4.w, ChkColV4.h);
			if(col4) {
				vehicle4.speed=1;
				count++;
				}

			}
		for (Vehicle ChkColV5: vehicles){
			boolean col5 = vehicle5.checkCollision(ChkColV5, ChkColV5.x, ChkColV5.y, ChkColV5.w, ChkColV5.h);
			if(col5) {
				vehicle5.speed=1;
				count ++;
				}

			}
		if(count >2) {tt.cancel();} // stop the timer after 2 collisions ie: The motorway is blocked
		
		this.repaint(); //repaint the frame
		}
	
 


	
	public void paint(Graphics g) { //Paint the lanes
		Graphics2D g2d = (Graphics2D) g;
		for(int i=0;i<3;i++) {
		g2d.setPaint(Color.DARK_GRAY);
		g2d.fillRect(0, lanes[i].posY, lanes[i].laneW, lanes[i].laneH);
		}
		//--------------------------------------------------------------
		for (Vehicle v: vehicles){//Paint the cars
			VEHICLE_TYPE tester = v.getVehicleType();
			switch(tester){ //Check the type of vehicle to draw
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

			}//End of switch
		//draw Black panel for the Buttons
		Graphics2D gr2D = (Graphics2D) g;
		gr2D.setPaint(Color.black);
		gr2D.fillRect(0, 340, 1600, 260);
		//	Label the lanes	
		String slow = "Slow Lane";
		String mid = "Middle Lane";
		String fast = "Fast Lane";
		//draw labels
		Graphics2D textG = (Graphics2D) g;
			textG.setColor(Color.white); 
			textG.drawString(slow, 30, 45);
			textG.drawString(mid, 30, 155); 
			textG.drawString(fast, 30, 265);

		}//End Loop

		
	}//end of drawing processes

}// End CONSTRUCTOR