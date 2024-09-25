package com.iheritance;

//Car class extending Vehicle 
class Car extends Vehicle implements SteeringWheel {
 protected int speed;
 protected String direction;
 public Car(String make, String model, int noOfWheels) {
     super(make, model, noOfWheels);
 }
 public Car(String make, String model, int noOfWheels, int speed) {
     super(make, model, noOfWheels);
     this.speed = speed;
 }
	public String turnLeft() {
			this.direction = "West";	
		return direction;
	}
	public String turnRight( ){
		this.direction = "East";	
	return direction;
	}
	public String straightenUp() {
		this.direction = "North";	
	return direction;
	}
	public String reverse() {
		this.direction = "South";	
	return direction;
	}
	public void printdirection() {
		System.out.println("The car is travelling " + direction);
	}
@Override
 public void accelerate() {
     System.out.println("Car is accelerating...");
 }

 public void brake() {
     System.out.println("Car is braking...");
 }

 public void setSpeed(int speed) {
     this.speed = speed;
     System.out.println("Car speed set to " + speed + " mph.");
 }

 // Print characteristics method
 @Override
 public void printCharacteristics() {
     super.printCharacteristics();
     System.out.println("Car specific characteristics...");
     System.out.println("Speed: " + speed + " mph");
 }
}

/*  
 * DEFAULT: (No Access Modifier Specified)
 * When no access modifier is specified for a class, method, or data member 
 * – It is said to be having the default access modifier by default. 
 * The data members, classes, or methods that are not declared using any access modifiers 
 * i.e. having default access modifiers are accessible only within the same package. 
 * -------------------------------------------------------------------------------------------------------------------------------------------------------------
 * PRIVATE:
 * The private access modifier is specified using the keyword private. 
 * The methods or data members declared as private are accessible only within the class in which they are declared  
 * Any other class of the same package will not be able to access these members.
 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------
 * PROTECTED:
 * The protected access modifier is specified using the keyword protected.
*The methods or data members declared as protected are accessible within the same package or subclasses in different packages.
*----------------------------------------------------------------------------------------------------------------------------------------------------------------
*PUBLIC:
*The public access modifier is specified using the keyword public. 
*The public access modifier has the widest scope among all other access modifiers.
*Classes, methods, or data members that are declared as public are accessible from everywhere in the program. 
*There is no restriction on the scope of public data members.
*The public access modifier is specified using the keyword public. 
*The public access modifier has the widest scope among all other access modifiers.
*Classes, methods, or data members that are declared as public are accessible from everywhere in the program.
 *There is no restriction on the scope of public data members.*/
 