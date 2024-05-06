package com.J1ggy;


import java.util.Random;

public class Vehicle {
	public int id, x, y, w, h, lane, correctLane, motion =1;
	public int speed;
	private VEHICLE_TYPE vehicleType; 
	//------------------------------------------------
	public VEHICLE_TYPE getVehicleType() {
		return this.vehicleType;
	}
	//------------------------------------------------

	public Vehicle(int id, int x, int y, int w, int h, int speed, VEHICLE_TYPE vehicleType) {
		this.id = id;
		this.x = x;
		this.w = w;
		this.h = h;
		this.speed = speed;
		this.vehicleType = vehicleType;
		this.lane = new Random().nextInt(3)+1;
		switch(lane) {// sets y positions of vehicles
		case 1:
			this.y = 20;
			break;
		case 2:
			this.y = 130;
			break;
		case 3:
			this.y = 240;
			break;
		}
	}
	//-------------------------------------------------
	public void move() {
		x += speed;//move
			if(x>1800) {
				x = -200;
				}
	}
	//Break-------------------------------------------
	public void hitBreak() {
		if(speed>0) {
			speed-=10;
		}
	}
    //Accelerate----------------------------------------
	public void Accelerate() {
		if(speed<100) {
			speed+=10;
		}
	}
	//Change Lane Left---------------------------------------
	public void changeLaneR() {
		if((y+110)<300) {
			y = y + 110;
			lane = lane+ 1;
		}
	}

//Change Lane Right---------------------------------------
	public void changeLaneL() {
		if ((y-110) > 0) {
			y=y-110;
			lane = lane -1;
		}
}
//Get Front position vehicle	
	public int vehicleFrontPos(Vehicle v) {
		int front = x + w;
		return front;
	}
//Get lane of his vehicle
	public int getLane() {
		return this.lane;
	}
// What lane should vehicle be in
	public int getCorrectLane() {
		return this.correctLane;
	}
//Get x
	public int getX() {
		return x;
	}
//Get width
	public int getWidth() {
		return w;
	}
//Get speed
	public int getSpeed() {
		return speed;
		}
//Check for collision	
	public boolean checkCollision(Vehicle v, int x, int y, int w, int h) {
		for (int i = 0 ; i < 5; i++) {
			Vehicle me = this;
			if(v.lane == me.lane) { // If we "Are" in the same lane
				if(me.equals(v)==false) {  //If not the same vehicle
					if( v.getX()+v.getWidth()>me.getX()&& v.getX()< me.getX()+me.getWidth() ) {
						// If vehX front is greater than my back && vehX back is less than my front 
						//      -------------- ------------
						//      xB         - xF           -
						//      -          -  -           -
						//      -          mB -           mF
						//      -------------- ------------
						
						return true;
					}
				}
			}
		}
		return false;
	}
}



