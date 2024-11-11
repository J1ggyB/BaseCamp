package com.J1ggy;

public class RacingCar extends Car{


	//--Fields--------------------------------
	private String driver;
	private int turboFactor;
	//--Constructor--------------------------
	public RacingCar(String model, int speed, String driver, int turboFactor) {
		super(model, speed);
		this.driver = driver;
		this.turboFactor = turboFactor;
	}
	//--Methods------------------------------
	public void Accelerate(int secs) { //POLYMORPHISM - METHOD OVERRIDING
		super.Accelerate(secs);
		speed *= turboFactor;
	}
	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
	
	public int getTurboFactor() {
		return turboFactor;
	}
	
	public String getDriver() {
		return driver;
	}
	
}//End Class
