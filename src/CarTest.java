/*
 * David Casarrubias Mena
 * Joshua Cheseman
 * COSC 201
 * September 20, 2015
 * 
 * Program assigns information to specific car and cars in general. Prints out attributes of all cars and a specific car. 
 * Program contains 2 methods that execute certain actions of cars in general and a specific car. 
 */


import java.util.*;
public class CarTest {
	public static void main(String [] args){
		int Trans; //value to be taken in for the transmission method 
		int gas; //value taken in by the gas tank method 
		int Hpower; //value taken in by the max horse power method
		int maxVelocity; //value taken in by the maximum velocity method
		int gasTank; //gas needed to be full
		Scanner input = new Scanner(System.in);
		Car myCar = new Car(2, 4, 4, "Red"); //Creates an object of a car and gives it those types
	
		System.out.println(myCar + "\n");
	
	BugatiVeron bv = new BugatiVeron(250, 1800000); //creates object of Bugati Veron class and it takes in values. 
	System.out.print("cost: "+"$"+bv.getCost() +" "); //outputs cost of the Bugati Veron
	System.out.println("\n"+bv.getSpeed() + " " +"miles/hour\n\n\n"); //outputs the miles per hour.
	
	
	
	
	System.out.println("Checking if BugatiVeron has reached maximum velocity: Please enter velocity: \n"); //determines if the user has reached the car's max velocity 
	maxVelocity = input.nextInt();
	bv.maxVelocity(maxVelocity);//reads maxVelocity into the method so it can determine if user has reached max velocity 
	
	
	System.out.println("What type of transmission is it? 1 for manual and any other value for automatic"); //allows user to determine whether or not car is auto or manual transmission
	Trans=input.nextInt();
	myCar.transmission(Trans); //reads in value user entered to determine if the car is auto or manual transmission
	
	System.out.println("How much gas is in tank?"); //allows user to determine whether or not gas tank is filled
	
	gas=input.nextInt();
	gasTank = 12 - gas;
	myCar.checkGasTank(gas); //reads in value user entered to calculate whether or not the gas tank is filled
	System.out.println( +gasTank + " " + "more tanks to fill car" + "\n");
	
	System.out.println("What is your current horsepower"); //allows user to determine if the user has the car at its max horsepower 
	Hpower=input.nextInt();
	bv.horsePower(Hpower); //reads in value user entered to tell if the user has the car at max horsepower
	
	
}
}