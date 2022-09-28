
public class Main {
	
	public static void main(String[] args){
		Vehicle elena=new Vehicle();
		elena.brand="Citroen";
		elena.color="gray";
		elena.model="C3";
		elena.horsePower= 85 ;
		elena.wipersOn=false;
		
		elena.printVehicle();
		elena.startWipers();
		elena.startWipers();
		//
		
		Vehicle kosta=new Vehicle();
		kosta.brand="Toyota";
		kosta.color="black";
		kosta.model="Auris";
		kosta.horsePower=110;
		kosta.wipersOn=true;
		
		kosta.printVehicle();
		kosta.startWipers();
		kosta.startWipers();
		
	}
	
}