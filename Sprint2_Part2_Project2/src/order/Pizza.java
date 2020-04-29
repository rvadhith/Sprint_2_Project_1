package order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pizza {
	public int cost;
	
	public void crustChoice() {
		System.out.println("Enter the choice of crust");
		System.out.println("\n");
		System.out.println("1. Cheese Burst");
		System.out.println("2. Classic Hand Tossed");
		System.out.println("3. Wheat Thin Crust");
		
		Scanner obj = new Scanner(System.in);
		int choice = obj.nextInt(); 

		
		switch(choice) {
		case 1:
			System.out.println("You have chosen cheese burst crust");
			cost = cost + 100;
			System.out.println("Cost so far: " + cost);
			break;
		case 2:
			System.out.println("You have chosen classic hand tossed crust");
			cost = cost + 125;
			System.out.println("Cost so far: " + cost);
			break;
		case 3:
			System.out.println("You have chosen wheat thin crust");
			cost = cost + 150;
			System.out.println("Cost so far: " + cost);
			break;
		}
	}
	
	public void cheeseChoice() {
		System.out.println("Enter the choice of cheese");
		System.out.println("\n");
		System.out.println("1. Single cheese");
		System.out.println("2. Extra cheese");
		System.out.println("3. No cheese");
		
		Scanner obj = new Scanner(System.in);
		int choice = obj.nextInt(); 

		
		switch(choice) {
		case 1:
			System.out.println("You have chosen single layer of cheese");
			cost = cost + 25;
			System.out.println("Cost so far: " + cost);
			break;
		case 2:
			System.out.println("You have chosen extra cheese");
			cost = cost + 40;
			System.out.println("Cost so far: " + cost);
			break;
		case 3:
			System.out.println("You have chosen no cheese");
			cost = cost + 0;
			System.out.println("Cost so far: " + cost);
			break;
		}
	}
	
	public void baseToppingChoice() {
		System.out.println("Enter the choice of toppings");
		System.out.println("\n");
		System.out.println("1. Paneer");
		System.out.println("2. Capsicum");
		System.out.println("3. Corn");
		
		Scanner obj = new Scanner(System.in);
		int choice = obj.nextInt(); 
		
		switch(choice) {
		case 1:
			System.out.println("You have chosen paneer");
			cost = cost + 50;
			System.out.println("Cost so far: " + cost);
			break;
		case 2:
			System.out.println("You have chosen capsicum");
			cost = cost + 30;
			System.out.println("Cost so far: " + cost);
			break;
		case 3:
			System.out.println("You have chosen corn");
			cost = cost + 40;
			System.out.println("Cost so far: " + cost);
			break;
		}
	}
	
	public void additionalToppingChoice() throws Exception {
		System.out.println("Would you want additional toppings");
		System.out.println("\n");
		System.out.println("1. Yes");
		System.out.println("2. No");
		
		Scanner obj = new Scanner(System.in);
		int choice = obj.nextInt(); 
		//obj.close();
		
		switch(choice) {
		case 1:
			System.out.println("Following are the available toppings");
			System.out.println("1. Tomato");
			System.out.println("2. Onion");
			System.out.println("3. Capsicum");
			int[] additionalToppingsCost = {10, 15, 20};
			BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of toppings you would like to have: ");
			int numberOfToppings = sc.nextInt();
			int[] intArray = new int[numberOfToppings];
			System.out.println("Enter your choice of toppings: ");
			for(int i = 0; i < intArray.length; i++) {
				intArray[i] = Integer.parseInt(inp.readLine());
			}
			System.out.println("The choices you have made are: ");
			for(int i = 0; i < intArray.length; i++) {
				cost = cost + additionalToppingsCost[intArray[i] - 1];
			}
			System.out.println("Cost so far: " + cost);
			break;
		case 2:
			System.out.println("You have not chosen any additional toppings");
			cost = cost + 0;
			System.out.println("Cost so far: " + cost);
			break;
		}
	}
	
	public void quantityOfPizza() {
		System.out.println("How many of these Pizza would you require: ");
		Scanner obj = new Scanner(System.in);
		int choice = obj.nextInt();
		cost = cost * choice;
		if(choice == 1) {
			System.out.println("You have opted for " + choice + " pizza");
		}
		else {
			System.out.println("You have opted for " + choice + " pizzas");
		}
		System.out.println("The total cost of your order is: " + cost);
	}
}

