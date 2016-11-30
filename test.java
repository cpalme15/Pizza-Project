/*
 * Programmed By: Collin Palmer, Zachariah Pelletier.
 * Machine Problem 5: Pizza order
 * COSC 111- Khaled Mansour
 * 11-24-16
 * Purpose: To take an order of pizza with the number of toppings and size, and find
 * the total cost.
 */
import java.util.*;
public class Test {

	public static void main(String[] args) {
		int numPizzas = 0;
		Scanner k = new Scanner(System.in);

		System.out.println("How many pizzas would you like (must be between 1 and 3)?");
		numPizzas = k.nextInt();

		Pizza[] order = new Pizza[numPizzas];
		PizzaOrder order1 = new PizzaOrder();
		order1.setNumPizzas(numPizzas);
		for(int i = 0; i<order.length; i++)
			order[i] = new Pizza();



		


			switch(numPizzas){
			case 1:
				order1.setPizza1(order[0]);
				order[0].setSize('S');
				order[0].setCheese(2);
				order[0].setBeef(3);
				order[0].setPepperoni(2);
				order[0].calcCost();
				System.out.println("Pizza 1 is :\n" + order[0]);
				break;
			case 2:
				order1.setPizza1(order[0]);
				order[0].setSize('S');
				order[0].setCheese(2);
				order[0].setBeef(3);
				order[0].setPepperoni(2);
				order[0].calcCost();
				System.out.println("Pizza 1 is :\n" + order[0]);

				order1.setpizza2(order[1]);
				order[1].setSize('M');
				order[1].setCheese(2);
				order[1].setBeef(3);
				order[1].setPepperoni(2);
				order[1].calcCost();
				System.out.println("Pizza 2 is:\n" + order[1]);
				break;
			case 3:
				order1.setPizza1(order[0]);
				order[0].setSize('S');
				order[0].setCheese(2);
				order[0].setBeef(3);
				order[0].setPepperoni(2);
				order[0].calcCost();
				System.out.println("Pizza 1 is :\n" + order[0]);

				order1.setpizza2(order[1]);
				order[1].setSize('M');
				order[1].setCheese(2);
				order[1].setBeef(3);
				order[1].setPepperoni(2);
				order[1].calcCost();
				System.out.println("Pizza 2 is:\n" + order[1]);

				order1.setpizza3(order[2]);
				order[2].setSize('L');
				order[2].setCheese(2);
				order[2].setBeef(3);
				order[2].setPepperoni(3);
				order[2].calcCost();
				System.out.println("Pizza 3 is:\n" + order[2]);
				break;
			}
		order1.calcTotal(); 
	}
}
