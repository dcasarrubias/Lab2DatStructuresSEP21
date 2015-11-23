
public class Car {
	private int brake;  // instance variable 
	private int door;  // instance variable
	private int seat;  // instance variable
	private String color; // instance variable
	
	
	private int checkGasTank;  // variable that will check for gas
	
	public Car(){  // default constructors 
		brake = 2;
		door = 4;
		seat = 4;
		color = "Red";
	}
	
	public Car(int b, int d, int s, String c){ // constructor
		brake = b;
		door = d;
		seat = s;
		color = c;
	}
	public int getBrake() {  //getters and setters
		return brake;
	}
	public void setBrake(int brake) {  // getters and setters
		this.brake = brake; 
	}
	public int getDoor() {  // getters and setters
		return door;
	}
	public void setDoor(int door) {  // getters and setters
		this.door = door;
	}
	public int getSeat() {  // getters and setters
		return seat;
	}
	public void setSeat(int seat) {  // getters and setters
		this.seat = seat;
	}
	public String getColor() {  // getters and setters
		return color;
	}
	public void setColor(String color) {  //getters and setters
		this.color = color;
	}
	
	public String toString(){  // method to print out all values 
		return "brakes: " + brake + " " + " \ndoors: " +door + " " + " \nseats: " +seat + " " + "\ncolor: " + color;
	}
	
	public boolean checkGasTank(int checkGasTank){  // checks if car gas tank is full 
		if(checkGasTank <= 12){
			System.out.println("Gas tank is not full yet");
			return false;
		}
		else System.out.println("Gas tank is full");
			return true;
	}
	
	public boolean transmission(int transmissionType){  // checks the type of transmission
		if(transmissionType==1){
			System.out.println("Stick shift");
			return true;
		}else
			System.out.println("Automatic transmission");
		return false;
	}
	
	
	
	
}
