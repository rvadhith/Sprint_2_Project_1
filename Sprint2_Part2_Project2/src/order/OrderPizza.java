package order;

import java.util.Scanner;

public class OrderPizza {
	public void order() throws Exception  {
		
		boolean pizzaOrderIteration = true;
		while(pizzaOrderIteration) {
			System.out.println("Enter the type of Pizza");
			System.out.println("1. Veg Pizza");
			System.out.println("2. Non Veg Pizza");
			
			Scanner obj = new Scanner(System.in);
			int choice = obj.nextInt();
			
			switch(choice) {
				case 1:
					Pizza vegPizza = new Pizza();
					vegPizza.crustChoice();
					vegPizza.cheeseChoice();
					vegPizza.baseToppingChoice();
					vegPizza.additionalToppingChoice();
					vegPizza.quantityOfPizza();
					System.out.println("Would you like to order more pizzas");
					System.out.println("1. Yes");
					System.out.println("2. No");
					
					Scanner obj2 = new Scanner(System.in);
					int choice2 = obj.nextInt();
					
					if(choice2 == 1) {
						pizzaOrderIteration = true;
					}
					else {
						System.out.println("Thanks for using our services. Have a great day!!!");
						pizzaOrderIteration = false;
					}
					break;
				case 2:
					NonVegPizza nonVegPizza = new NonVegPizza();
					nonVegPizza.crustChoice();
					nonVegPizza.cheeseChoice();
					nonVegPizza.baseToppingChoice();
					nonVegPizza.additionalToppingChoice();
					nonVegPizza.quantityOfPizza();
					System.out.println("Would you like to order more pizzas");
					System.out.println("1. Yes");
					System.out.println("2. No");
					
					Scanner obj3 = new Scanner(System.in);
					int choice3 = obj.nextInt();
					
					if(choice3 == 1) {
						pizzaOrderIteration = true;
					}
					else {
						System.out.println("Thanks for using our services. Have a great day!!!");
						pizzaOrderIteration = false;						
					}
					break;
			}
		}		
	}
}