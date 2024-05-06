package com.J1ggy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Timer; 
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Motorway {
	//private static final long serialVersionUID = 1L;
	public static Motorway window;
	public static VehicleGenerator VG;
	private static int score;
	public Font myFont = new Font("Arial", Font.BOLD, 14);//Custom Font
	private static JFrame frmMotorwayMadness;
	private static Car veh1;
	private static Van veh2;
	private static Lorry veh3;
	private static Motorbike veh4;
	private static Racing_Car veh5;
	public static Timer timer;
	private JLabel lblLaneOne;
	private JLabel lblLaneTwo;
	private JLabel lblLaneThree;
	public static JLabel message;
	public static JLabel colmessage;
	private JButton Acc1;
	private JButton Break1; 
	private JButton Switch1L;
	private JButton Switch1R; 
	private JButton Acc2;
	private JButton Break2; 
	private JButton Switch2L;
	private JButton Switch2R; 
	private JButton Acc3;
	private JButton Break3; 
	private JButton Switch3L;
	private JButton Switch3R; 
	private JButton Acc4;
	private JButton Break4; 
	private JButton Switch4L;
	private JButton Switch4R; 
	private JButton Acc5;
	private JButton Break5; 
	private JButton Switch5L;
	private JButton Switch5R; 
	private static JButton Score;




	public static void main(String[] args) {
		 RegListGenerator regList = new  RegListGenerator();
		 int num = 10;//try 60  ???????  SETS THE NUM OF REG PLATES TO BE CREATED
		 try {
			 regList.createRegNos(num);
			 for(int i = 0 ; i < num ; i++ ) {
				 String str = "No " + i + " " + regList.findRegNo(i);
				 System.out.println(str);
			 }
		 }catch(IndexOutOfBoundsException e) {System.out.println("Duplicate Reg");}
		VG = new VehicleGenerator();
		VG.addVehicles(regList);


			EventQueue.invokeLater(new Runnable() {

					public void run() {
						try {
							window = new Motorway();
							frmMotorwayMadness.setVisible(true);
							frmMotorwayMadness.setSize(new Dimension(1600, 750)); 
							} catch (Exception e) {e.printStackTrace();}
						
					      	timer = new Timer(30,new ActionListener(){
					          public void actionPerformed(ActionEvent e)
					      {
					         Motorway.draw();
					         
					      }
					      }); 
					      timer.start();

				}//End Run
				
			});//End EventQueue


			

}//END OF MAIN

	
	public Motorway() {
		initialize();
	}

   
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmMotorwayMadness = new JFrame();
		frmMotorwayMadness.setResizable(false);
		frmMotorwayMadness.setTitle("Motorway Madness");
		frmMotorwayMadness.setBounds(100, 100, 1600, 800);
		frmMotorwayMadness.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMotorwayMadness.getContentPane().setLayout(null);
		frmMotorwayMadness.addWindowListener(new WindowAdapter() {// Listeners for Window tasks ie:close
			@Override
			public void windowClosing(WindowEvent e) {//Window event
			}
		});
		JPanel lanes = new JPanel();
		lanes.setBounds(0, 0, 1600, 490);
		frmMotorwayMadness.getContentPane().add(lanes);
		lanes.setBackground(Color.DARK_GRAY);
		lanes.setLayout(null);
		lblLaneOne = new JLabel("Lane One");
		lblLaneOne.setBounds(30,78,68,15);
		lblLaneOne.setForeground(Color.WHITE);
		lanes.add(lblLaneOne);
		lblLaneTwo = new JLabel("Lane Two");
		lblLaneTwo.setBounds(30,238,68,15);
		lblLaneTwo.setForeground(Color.WHITE);
		lanes.add(lblLaneTwo);
		lblLaneThree = new JLabel("Lane Three");
		lblLaneThree.setBounds(30,398,80,15);
		lblLaneThree.setForeground(Color.WHITE);
		lanes.add(lblLaneThree);


		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(25);
		panel.setBounds(0, 490, 1600, 450);
		frmMotorwayMadness.getContentPane().add(panel);
		panel.setBackground(Color.BLACK);
		
		JPanel redPanel = new JPanel();
		GridLayout gl_redPanel = new GridLayout (4,1);
		redPanel.setLayout(gl_redPanel);
		JPanel bluePanel = new JPanel();
		bluePanel.setLayout(new GridLayout (4,1));
		JPanel greenPanel = new JPanel();
		greenPanel.setLayout(new GridLayout (4,1));
		JPanel magPanel = new JPanel();
		magPanel.setLayout(new GridLayout (4,1));
		JPanel orangePanel = new JPanel();
		orangePanel.setLayout(new GridLayout (4,1));
		JPanel scorePanel = new JPanel();
		scorePanel.setBackground(Color.DARK_GRAY);
		scorePanel.setLayout(new GridLayout (4,1));
		
		Acc1 = new JButton("Accelerate");
		Acc1.setHorizontalAlignment(SwingConstants.LEFT);
		Acc1.setBounds(420,360,150,50); //Accelerate
		Acc1.setBackground(Color.red);
		Acc1.setForeground(Color.white);
		Acc1.setFont(myFont);
		redPanel.add(Acc1);
		
		Break1 = new JButton("Break");
		Break1.setBackground(Color.red);  // Break
		Break1.setForeground(Color.white);
		Break1.setFont(myFont);
		Break1.setBounds(420,410,150,50);
		redPanel.add(Break1);
		
		Switch1L = new JButton("Switch Left");
		Switch1L.setHorizontalAlignment(SwingConstants.LEFT);
		Switch1L.setBackground(Color.red);  // Switch lane left
		Switch1L.setForeground(Color.white);
		Switch1L.setFont(myFont);
		Switch1L.setBounds(420,460,150,50);
		redPanel.add(Switch1L);
		
		Switch1R = new JButton("Switch Right");
		Switch1R.setHorizontalAlignment(SwingConstants.LEFT);
		Switch1R.setBackground(Color.red);   //Switch lane right
		Switch1R.setForeground(Color.white);
		Switch1R.setFont(myFont);
		redPanel.add(Switch1R);

		Switch1R.setBounds(420,510,150,50);
		Acc2 = new JButton("Accelerate"); //Rinse and repeat for each vehicle
		Acc2.setBounds(580,360,150,50);
		Acc2.setBackground(Color.blue);
		Acc2.setForeground(Color.white);
		Acc2.setFont(myFont);
		bluePanel.add(Acc2);
		
		Break2 = new JButton("Break");
		Break2.setBackground(Color.blue);
		Break2.setForeground(Color.white);
		Break2.setFont(myFont);
		Break2.setBounds(580,410,150,50);
		bluePanel.add(Break2);
		
		Switch2L = new JButton("Switch Left");
		Switch2L.setBackground(Color.blue);
		Switch2L.setForeground(Color.white);
		Switch2L.setFont(myFont);
		Switch2L.setBounds(580,460,150,50);
		bluePanel.add(Switch2L);
		
		Switch2R = new JButton("Switch Right");
		Switch2R.setBackground(Color.blue);
		Switch2R.setForeground(Color.white);
		Switch2R.setFont(myFont);
		Switch2R.setBounds(580,510,150,50);
		bluePanel.add(Switch2R);

		Acc3 = new JButton("Accelerate");
		Acc3.setBounds(740,360,150,50);
		Acc3.setBackground(Color.green);
		Acc3.setForeground(Color.white);
		Acc3.setFont(myFont);
		greenPanel.add(Acc3);
		
		Break3 = new JButton("Break");
		Break3.setBackground(Color.green);
		Break3.setForeground(Color.white);
		Break3.setFont(myFont);
		Break3.setBounds(740,410,150,50);
		greenPanel.add(Break3);
		
		Switch3L = new JButton("Switch Left");
		Switch3L.setBackground(Color.green);
		Switch3L.setForeground(Color.white);
		Switch3L.setBounds(740,460,150,50);	
		greenPanel.add(Switch3L);
		
		Switch3R = new JButton("Switch Right");
		Switch3R.setBackground(Color.green);
		Switch3R.setForeground(Color.white);
		Switch3R.setFont(myFont);
		Switch3R.setBounds(740,510,150,50);
		greenPanel.add(Switch3R);

		Acc4 = new JButton("Accelerate");
		Acc4.setBounds(900,360,150,50);
		Acc4.setBackground(Color.magenta);
		Acc4.setForeground(Color.white);
		Acc4.setFont(myFont);
		magPanel.add(Acc4);
		
		Break4 = new JButton("Break");
		Break4.setBackground(Color.magenta);
		Break4.setForeground(Color.white);
		Break4.setFont(myFont);
		Break4.setBounds(900,410,150,50);
		magPanel.add(Break4);
		
		Switch4L = new JButton("Switch Left");
		Switch4L.setBackground(Color.magenta);
		Switch4L.setForeground(Color.white);
		Switch4L.setFont(myFont);
		Switch4L.setBounds(900,460,150,50);
		magPanel.add(Switch4L);
		
		Switch4R = new JButton("Switch Right");
		Switch4R.setBackground(Color.magenta);
		Switch4R.setForeground(Color.white);
		Switch4R.setFont(myFont);
		Switch4R.setBounds(900,510,150,50);
		magPanel.add(Switch4R);

		Acc5 = new JButton("Accelerate");
		Acc5.setBounds(1060,360,150,50);
		Acc5.setBackground(Color.orange);
		Acc5.setForeground(Color.white);
		Acc5.setFont(myFont);
		orangePanel.add(Acc5);
		
		Break5 = new JButton("Break");
		Break5.setBackground(Color.orange);
		Break5.setForeground(Color.white);
		Break5.setFont(myFont);
		Break5.setBounds(1060,410,150,50);
		orangePanel.add(Break5);
		
		Switch5L = new JButton("Switch Left");
		Switch5L.setBackground(Color.orange);
		Switch5L.setForeground(Color.white);
		Switch5L.setFont(myFont);
		Switch5L.setBounds(1060,460,150,50);
		orangePanel.add(Switch5L);
		
		Switch5R = new JButton("Switch Right");
		Switch5R.setBackground(Color.orange);
		Switch5R.setForeground(Color.white);
		Switch5R.setFont(myFont);
		Switch5R.setBounds(1060,510,150,50);
		orangePanel.add(Switch5R);
		
		panel.add(bluePanel);
		panel.add(magPanel);
		panel.add(orangePanel);
		panel.add(redPanel);
		panel.add(greenPanel);
		
		message = new JLabel("Go Go Go!!!");
		message.setForeground(Color.YELLOW);
		colmessage = new JLabel("Doing Well");
		colmessage.setForeground(Color.YELLOW);
		Score = new JButton("Score:  "); //Add the score button - just used as a label
		Score.setBackground(Color.BLACK);
		Score.setForeground(Color.YELLOW);
		Score.setFont(myFont);
		scorePanel.add(Score);
		scorePanel.add(message);
		scorePanel.add(colmessage);
		panel.add(scorePanel);
		veh1 = (Car) VehicleGenerator.Vehicles.get(0);
		veh2 = (Van) VehicleGenerator.Vehicles.get(1);
		veh3 = (Lorry) VehicleGenerator.Vehicles.get(2);
		veh4 = (Motorbike) VehicleGenerator.Vehicles.get(3);
		veh5 = (Racing_Car) VehicleGenerator.Vehicles.get(4);
		veh1.button = new JButton();
		veh1.button.setBackground(Color.DARK_GRAY);
		veh1.button.setForeground(Color.WHITE);
		veh1.button.setBorder(new LineBorder(Color.DARK_GRAY));
		veh1.button.setText(veh1.licensePlate);		
		veh1.button.setVerticalTextPosition(AbstractButton.TOP);
		veh1.button.setHorizontalTextPosition(AbstractButton.CENTER);
		veh1.button.setBounds(veh1.getX(),veh1.getY(),veh1.getW(),veh1.getH());
		  try {
			    Image img = ImageIO.read(getClass().getResource("car.png"));
			    veh1.button.setIcon(new ImageIcon(img));
			  } catch (IllegalArgumentException e){System.out.println(e);}
			    catch (Exception ex) {System.out.println(ex);}
		veh2.button = new JButton();
		veh2.button.setBackground(Color.DARK_GRAY);
		veh2.button.setForeground(Color.WHITE);
		veh2.button.setBorder(new LineBorder(Color.DARK_GRAY));
		veh2.button.setText(veh2.licensePlate);		
		veh2.button.setVerticalTextPosition(AbstractButton.TOP);
		veh2.button.setHorizontalTextPosition(AbstractButton.CENTER);
		veh2.button.setBackground(Color.DARK_GRAY);
		veh2.button.setBounds(veh2.getX(),veh2.getY(),veh2.getW(),veh2.getH());
			try {
				  Image img = ImageIO.read(getClass().getResource("van.png"));
				  veh2.button.setIcon(new ImageIcon(img));
				} catch (IllegalArgumentException e){System.out.println(e);} 
				  catch (Exception ex) {System.out.println(ex);}
		veh3.button = new JButton();
		veh3.button.setBackground(Color.DARK_GRAY);
		veh3.button.setForeground(Color.WHITE);
		veh3.button.setBorder(new LineBorder(Color.DARK_GRAY));
		veh3.button.setText(veh3.licensePlate);		
		veh3.button.setVerticalTextPosition(AbstractButton.TOP);
		veh3.button.setHorizontalTextPosition(AbstractButton.CENTER);
		veh3.button.setBackground(Color.DARK_GRAY);
		veh3.button.setBounds(veh3.getX(),veh3.getY(),veh3.getW(),veh3.getH());
			  try {
				    Image img = ImageIO.read(getClass().getResource("lorry.png"));
				    veh3.button.setIcon(new ImageIcon(img));
				  } catch (IllegalArgumentException e){System.out.println(e);}
				    catch (Exception ex) {System.out.println(ex);}
		veh4.button = new JButton();
		veh4.button.setBackground(Color.DARK_GRAY);
		veh4.button.setBounds(veh4.getX(),veh4.getY(),veh4.getW(),veh4.getH());
		veh4.button.setBackground(Color.DARK_GRAY);
		veh4.button.setForeground(Color.WHITE);
		veh4.button.setBorder(new LineBorder(Color.DARK_GRAY));
		veh4.button.setText(veh4.licensePlate);		
		veh4.button.setVerticalTextPosition(AbstractButton.TOP);
		veh4.button.setHorizontalTextPosition(AbstractButton.CENTER);
			try {
				Image img = ImageIO.read(getClass().getResource("mc.png"));
				veh4.button.setIcon(new ImageIcon(img));
				} catch (IllegalArgumentException e){System.out.println(e);}
				  catch (Exception ex) {System.out.println(ex);}	 
		veh5.button = new JButton();
		veh5.button.setBackground(Color.DARK_GRAY);
		veh5.button.setForeground(Color.WHITE);
		veh5.button.setBorder(new LineBorder(Color.DARK_GRAY));
		veh5.button.setText(veh5.licensePlate);		
		veh5.button.setVerticalTextPosition(AbstractButton.TOP);
		veh5.button.setHorizontalTextPosition(AbstractButton.CENTER);
		veh5.button.setBackground(Color.DARK_GRAY);
		veh5.button.setBounds(veh5.getX(),veh5.getY(),veh5.getW(),veh5.getH());
				try {
					Image img = ImageIO.read(getClass().getResource("sportscar.png"));
					veh5.button.setIcon(new ImageIcon(img));
					} catch (IllegalArgumentException e){System.out.println(e);}
					  catch (Exception ex) {System.out.println(ex);}			 
        lanes.add(veh1.button);
        lanes.add(veh2.button);
        lanes.add(veh3.button);
        lanes.add(veh4.button);
        lanes.add(veh5.button);
        
        Label label = new Label("");
        label.setBackground(new Color(255, 255, 255));
        label.setBounds(0, 0, 1600, 10);
        lanes.add(label);
        
        Label label_1 = new Label("");
        label_1.setBackground(new Color(255, 255, 255));
        label_1.setBounds(0, 160, 1600, 10);
        lanes.add(label_1);
        
        Label label_2 = new Label("");
        label_2.setBackground(new Color(255, 255, 255));
        label_2.setBounds(0, 480, 1600, 10);
        lanes.add(label_2);
        
        Label label_3 = new Label("");
        label_3.setBackground(new Color(255, 255, 255));
        label_3.setBounds(0, 320, 1600, 10);
        lanes.add(label_3);
        
        Acc1.addActionListener(new ActionListener() {  // Add Action Listeners for each JButton - Accelerate
			  public void actionPerformed(ActionEvent e) { 
			    veh4.Accelerate();
			    frmMotorwayMadness.repaint();
			  } 
			} );
		Break1.addActionListener(new ActionListener() { // Add Action Listeners for each JButton - Break
			  public void actionPerformed(ActionEvent e) { 
			    veh4.hitThebreak();
			    frmMotorwayMadness.repaint();			    
			  } 
			} );
		Switch1L.addActionListener(new ActionListener() { // Add Action Listeners for each JButton - changeLeft
			  public void actionPerformed(ActionEvent e) { 
			    veh4.changeLeft();
			    frmMotorwayMadness.repaint();
			  } 
			} );
		Switch1R.addActionListener(new ActionListener() { // Add Action Listeners for each JButton - changeRight
			  public void actionPerformed(ActionEvent e) { 
			    veh4.changeRight();
			    frmMotorwayMadness.repaint();
			  } 
			} );
		Acc2.addActionListener(new ActionListener() { //Next Vehicle
			  public void actionPerformed(ActionEvent e) { 
			    veh1.Accelerate();
			    frmMotorwayMadness.repaint();
			  } 
			} );
		Break2.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    veh1.hitThebreak();
			    frmMotorwayMadness.repaint();			    
			  } 
			} );
		Switch2L.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    veh1.changeLeft();
			    frmMotorwayMadness.repaint();
			  } 
			} );
		Switch2R.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    veh1.changeRight();
			    frmMotorwayMadness.repaint();
			  } 
			} );
		Acc3.addActionListener(new ActionListener() { // Next Vehicle
			  public void actionPerformed(ActionEvent e) { 
			    veh5.Accelerate();
			    frmMotorwayMadness.repaint();
			  } 
			} );
		Break3.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    veh5.hitThebreak();
			    frmMotorwayMadness.repaint();			    
			  } 
			} );
		Switch3L.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    veh5.changeLeft();
			    frmMotorwayMadness.repaint();
			  } 
			} );
		Switch3R.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    veh5.changeRight();
			    frmMotorwayMadness.repaint();
			  } 
			} );
		Acc4.addActionListener(new ActionListener() {  // Next Vehicle
			  public void actionPerformed(ActionEvent e) { 
			    veh2.Accelerate();
			    frmMotorwayMadness.repaint();
			  } 
			} );
		Break4.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    veh2.hitThebreak();
			    frmMotorwayMadness.repaint();			    
			  } 
			} );
		Switch4L.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    veh2.changeLeft();
			    frmMotorwayMadness.repaint();
			  } 
			} );
		Switch4R.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    veh2.changeRight();
			    frmMotorwayMadness.repaint();
			  } 
			} );
		Acc5.addActionListener(new ActionListener() {  // Next Vehicle
			  public void actionPerformed(ActionEvent e) { 
			    veh3.Accelerate();
			    frmMotorwayMadness.repaint();
			  } 
			} );
		Break5.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    veh3.hitThebreak();
			    frmMotorwayMadness.repaint();			    
			  } 
			} );
		Switch5L.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    veh3.changeLeft();
			    frmMotorwayMadness.repaint();
			  } 
			} );
		Switch5R.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    veh3.changeRight();
			    frmMotorwayMadness.repaint();
			  } 
			} );

		}

public static void draw() { // Repaints the frame
		
		for (Vehicle eachVehicle : VehicleGenerator.Vehicles){ // move each vehicle
			eachVehicle.move();
			message.setText("Jings!!!");
			if(eachVehicle.getSpeed() > 0) { //If all the vehicles are moving
				Motorway.score = Motorway.score + 10;}	// If moving up score
			else { Motorway.score = Motorway.score -100; // If too close or in blind spot reduce score
			message.setText("Lousy Driving");} 
			
			}
		Score.setText("Score: " + Motorway.score); // update the GUI with a score
		int count = 0;  // To add up collisions
		for (Vehicle ChkColV1 : VehicleGenerator.Vehicles){ // check each vehicle for collisions
			boolean col1 = veh1.checkCollision(ChkColV1,  ChkColV1.getX(), ChkColV1.getY(), ChkColV1.getW(), ChkColV1.getH());
			if(col1) {
				veh1.speed = 3; // set the speed to 2 if collision detected could be rear ending someone
			count++; //count the collisions
			}
		}
		for (Vehicle ChkColV2: VehicleGenerator.Vehicles){ // Rinse and repeat for each vehicle
			boolean col2 = veh2.checkCollision(ChkColV2, ChkColV2.getX(), ChkColV2.getY(), ChkColV2.getW(), ChkColV2.getH());
			if(col2) {
				veh2.speed = 3;
				count++;
				}

			}
		for (Vehicle ChkColV3: VehicleGenerator.Vehicles){
			boolean col3 = veh3.checkCollision(ChkColV3, ChkColV3.getX(), ChkColV3.getY(), ChkColV3.getW(), ChkColV3.getH());
			if(col3) {
				veh3.speed = 3;
				count++;
				}

			}
		for (Vehicle ChkColV4: VehicleGenerator.Vehicles){
			boolean col4 = veh4.checkCollision(ChkColV4, ChkColV4.getX(), ChkColV4.getY(), ChkColV4.getW(), ChkColV4.getH());
			if(col4) {
				veh4.speed = 3;
				count++;
				}

			}
		for (Vehicle ChkColV5: VehicleGenerator.Vehicles){
			boolean col5 = veh5.checkCollision(ChkColV5, ChkColV5.getX(), ChkColV5.getY(), ChkColV5.getW(), ChkColV5.getH());
			if(col5) {
				veh5.speed = 3;
				count ++;
				}

			}
		colmessage.setText("Rear Ending!!! for: " + count + " secs now!"); //Count secs for bad driving!
		Motorway.score = Motorway.score -50;//Deduct points each second
		if(count > 4) {timer.stop();colmessage.setText("Well done you have clogged the motorway!!!"); } // stop the timer after 2 collisions ie: The motorway is blocked
		for(Vehicle correctLaneVeh : VehicleGenerator.Vehicles) {
			if(Motorway.score >50000 && correctLaneVeh.getLane() == correctLaneVeh.getCorrectLane()) {timer.stop(); colmessage.setText("Well done you have tamed the Beast!!!");}
		}
		if(Motorway.score < -500) {timer.stop(); colmessage.setText("Wow! - That's some bad driving!!!");}
		frmMotorwayMadness.repaint(); //repaint the frame
		}

}
