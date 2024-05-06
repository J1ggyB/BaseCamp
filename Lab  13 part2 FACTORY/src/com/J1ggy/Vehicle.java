package com.J1ggy;



interface Vehicle {

public String licensePlate = "";
public int x = 0;
public int y = 0;
public int w = 0;
public int h = 0;
public int lane = 0;
public int speed = 0;
public VEHICLE_TYPE type = null;
public void move();
public void Accelerate();
public void hitThebreak();
public void changeLeft();
public void changeRight();
public int getSpeed();
public int getX();
public int getY();
public int getW();
public int getH();
public int getLane();
public VEHICLE_TYPE getVT();
public boolean checkCollision(Vehicle v,int x, int y, int w, int h);
public int getCorrectLane();
}

