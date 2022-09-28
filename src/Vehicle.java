
public class Vehicle {
	String brand;
	String model;
	String color;
	int horsePower;
	boolean wipersOn;
	
	void startWipers(){
		if(wipersOn){
			System.out.println("The wipers are already on");
		}
		else {
			wipersOn=true;
			System.out.println("Start the wipers");
			
		}
	}
	
	void printVehicle(){
		System.out.println("This Vehicle is "+brand+" "+model+" "+color+" with "+horsePower+"HP");
		
	}
	
	
	
 
	
}
