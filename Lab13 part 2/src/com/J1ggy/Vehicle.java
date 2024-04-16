package com.J1ggy;


import java.util.Random;

public class Vehicle {
	public int id, x, y, w, h, lane;
	private int dirX;
	public static Lane[] lanes = new Lane[3];
	private VEHICLE_TYPE vehicleType; 
	//------------------------------------------------
	public VEHICLE_TYPE getVehicleType() {
		return this.vehicleType;
	}
	//------------------------------------------------
	public static void setLanes() {
		lanes[0] = new Lane(10);
		lanes[1] = new Lane(120);
		lanes[2] = new Lane(230);
	}
	//-----------------------------------------------
	public Vehicle(int id, int x, int y, int w, int h, int dirX, VEHICLE_TYPE vehicleType) {
		this.id = id;
		this.x = x;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
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
		x += dirX;
		if(x>1800) {
			x = -200;
			lane = new Random().nextInt(3)+1;
			}
	}
	//Break-------------------------------------------
	public void hitBreak() {
		while (dirX > 0) {
			x-=dirX;
		}
	}
    //Accelerate----------------------------------------
	public void Accelerate() {
		while (dirX > 0) {
			x+=dirX+1;
		}
	}
	//ChangeLane---------------------------------------
	public void changeLane() {
		switch(lane) {
		case 1:
			lane += 1;
			break;
		case 2:
			lane += 1;
			break;
		case 3:
			lane -= 1;
			break;
		}
	}
}



