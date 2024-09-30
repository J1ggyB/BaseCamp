package com.J1ggy;

//import java.io.IOException;


public class Program {

	public static void main(String[] args) {
		
		Employee Dave = new Manager("Dave Smith", "Manager");
		Employee Sarah = new Employee("Sarah MacLean", "HR supervisor");
		SkilledWorker William = new SkilledWorker("William Fraser", "Designer", "Graphic & WebDesign");
		Employee Frank = new Employee("Frank MacIlveny", "Warehouse supervisor");
		Employee Duncan = new Employee("Duncan McDermid", "Orders Clerk");
		Employee Suzie = new Employee("Suzie Smith", "Accountant");
		Employee DaveB = new Employee("Dave Bacon", "Despatch");
		SkilledWorker Douglas = new SkilledWorker("Douglas Bruce", "IT", "Cisco Qualified Networking Engineer");


		
		Employee.employees.add(Dave);
		Employee.employees.add(Sarah);
		Employee.employees.add(William);
		Employee.employees.add(Frank);
		Employee.employees.add(Duncan);
		Employee.employees.add(Suzie);
		Employee.employees.add(DaveB);
		Employee.employees.add(Douglas);
		for (Employee e : Employee.employees ) {
			if(e instanceof SkilledWorker) {
				SkilledWorker sw = (SkilledWorker) e;
				System.out.println(sw.getInfo());
			}else {System.out.println(e.getInfo());}
		}
			
		}//End Main
}//End Class
