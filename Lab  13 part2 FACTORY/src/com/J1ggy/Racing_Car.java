package com.J1ggy;

import javax.swing.JButton;

public class Racing_Car implements Vehicle{
	public String licensePlate = "";
	public int x = 700; //starting position
	public int y = 45;
	public int w = 100;
	public int h = 100;
	public int lane = 1;
	public int speed = 12;
	public int correctLane =3;
	public VEHICLE_TYPE type = VEHICLE_TYPE.RACING_CAR;
	public JButton button = new JButton();	
	//--Constructor----------------------------------

	public Racing_Car(String licensePlate, int lane ) {
		super();
		button.setBounds(x, y, w, h);
		this.licensePlate = licensePlate;
		this.lane = lane;
		switch (lane) {
		case 1 :
			this.y = 45;
			break;
		case 2 :
			this.y = 205;
			break;
		case 3 :
			this.y = 365;
			break;
		}
	}
	//End Constructor-----
	
	//--Methods---------------------------------------------------
	//--Getters------------
	public String getLic() {
		return licensePlate;
	}
	public int getX() {
		return button.getX();
	}
	public int getY() {
		return button.getY();
	}
	public int getW() {
		return button.getWidth();
	}
	public int getH() {
		return button.getHeight();
	}
	public int getLane() {
		return lane;
	}
	public int getCorrectLane() {
	return correctLane;
	}
	public int getSpeed() {
		return speed;
	}
	public VEHICLE_TYPE getVT() {
		return type;
	}
	//--End-Getters----
	//--Setters-----------
	public void setLic(String lp) {
		this.licensePlate = lp;
	}
	public void setX(int sx) {
		this.x = sx;
	}
	public void setY(int sy) {
		this.y = sy;
	}
	public void setW(int sw) {
		this.w = sw;
	}
	public void setH(int sh) {
		this.h = sh;
	}
	public void setLane(int sl) {
		this.lane = sl;
	}
	public void setSpeed(int ss) {
		this.speed = ss;
	}
	public void setVT(VEHICLE_TYPE vt) {
		this.type = vt;
	}
	//End_Setters
	public void move(){
		x= x + speed;
		this.button.setBounds(x, y, w, h);
		if(x > 1800) {
			x = -200;
			}
	}
	public void Accelerate(){
		if(!(speed == 0)) {
			speed +=1;
		}
	}
	public void hitThebreak() {
		if(speed > 0) {
			speed -= 1;
		}
	}
	public void changeLeft() {
		if ((button.getY()-160) > 0) {
			button.setBounds(button.getX(),button.getY()-160, w, h );
			y = y - 160;
			lane = lane - 1;
		}
}
	public void changeRight(){
		if(button.getY()+160 < 480) {
			button.setBounds(button.getX(),button.getY()+160,w,h);
			y = y + 160;
			lane = lane + 1;
		}
	}

	public boolean checkCollision(Vehicle v, int x, int y, int w, int h) {
		for (int i = 0 ; i < 5; i++) {
			Vehicle me = this;
			Vehicle them = v;
			if(them.getLane() == me.getLane()) { // If we "Are" in the same lane
				if(me.equals(them)==false) {  //If not the same vehicle
					if( them.getX()+them.getW()>me.getX()&& them.getX()< me.getX()+me.getW() ) {
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
