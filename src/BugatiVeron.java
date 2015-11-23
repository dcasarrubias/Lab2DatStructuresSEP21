
public class BugatiVeron {
	private int speed;
	private int cost;
	
	private int maxVelocity;
	
	
	
	public BugatiVeron(){//default constructor 
		super();
		speed = 200;
		cost = 1700000;
		
	}
	
	public BugatiVeron(int s, int c){//constructor that sets variables and parameter equal to instance variables. 
		super();
		speed = s;
		cost = c;
	}
	public int getSpeed(){ //getters and setters
		return speed;
	}
	
	public int getCost(){ //getters and setters
		return cost;
	}
	
	public String toString(){//print out the results 
		return super.toString() + " " + speed + "m/h " +  "$" + cost;
	}
	
	public boolean maxVelocity(int value){  // method informs checks if car has reached maximum velocity 
		if(value == 254){
			System.out.println("Car has reached maximum velocity");
			return true;
		}
		else System.out.println("Car has not reached maximum velocity"); 
			return false;
	
	}	
	public boolean horsePower(int power){ // method informs the user if car has reached max horsePower 
		if(power <= 1200){
			System.out.println("Car has not reached maximum horse power");
			return false;
		}
		else 
			System.out.println("Car has reached maximum horse power");
		return true;
	}
}

	
