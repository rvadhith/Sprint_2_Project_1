package order;

import java.util.Scanner;

public class NonVegPizza extends Pizza {
	
	@Override
	public void baseToppingChoice() {
		System.out.println("Enter the choice of toppings");
		System.out.println("\n");
		System.out.println("1. Chicken Sausage");
		System.out.println("2. BBQ Chicken");
		System.out.println("3. Salami Chicken");
		
		Scanner obj = new Scanner(System.in);
		int choice = obj.nextInt(); 
		
		switch(choice) {
		case 1:
			System.out.println("You have chosen Chicken Sausage");
			cost = cost + 70;
			System.out.println(cost);
			break;
		case 2:
			System.out.println("You have chosen BBQ Chicken");
			cost = cost + 80;
			System.out.println(cost);
			break;
		case 3:
			System.out.println("You have chosen Salami Chicken");
			cost = cost + 90;
			System.out.println(cost);
			break;
		}
	}
}
