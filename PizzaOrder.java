
public class PizzaOrder {
private Pizza pizza1;
private Pizza pizza2 ;
private Pizza pizza3;
private int numPizzas;
private static double totalcost;



public PizzaOrder() {
	totalcost=0.0;
	numPizzas=0;
	
}


public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3, int numPizzas, double totalcost) {
	this.pizza1 = pizza1;
	this.pizza2 = pizza2;
	this.pizza3 = pizza3;
	this.numPizzas = numPizzas;
	this.totalcost = totalcost;
}


public void setNumPizzas(int numPizzas)
{
	if(numPizzas>1 && numPizzas<3)
		this.numPizzas=numPizzas;
	else
		System.out.println("You can only order up to 3 pizzas and you must order at least 1");
	
}

public void setPizza1(Pizza p1) {
	this.pizza1 = p1;
}

public void setpizza2(Pizza p2) {
	this.pizza2 = p2;
}

public void setpizza3(Pizza p3) {
	this.pizza3 = p3;
}
public double calcTotal()
{
	 totalcost=(pizza1.getCost()+pizza2.getCost()+pizza3.getCost());
	 return totalcost;
}
}
