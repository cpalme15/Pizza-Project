
//Programmed By: Collin Palmer, Zachariah Pelletier.
public class PizzaOrder {
	private Pizza pizza1;
	private Pizza pizza2;
	private Pizza pizza3;
	private int numPizzas;
	private static double totalcost;



	public PizzaOrder() 
	{
		totalcost=0.0;
		numPizzas=0;

	}


	public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3, int numPizzas, double totalcost) {
		this.pizza1 = pizza1;
		this.pizza2 = pizza2;
		this.pizza3 = pizza3;
		this.numPizzas = numPizzas;
		PizzaOrder.totalcost = totalcost;
	}


	public void setNumPizzas(int numPizzas)
	{
		if(numPizzas>=1 && numPizzas<=3)
			this.numPizzas=numPizzas;

	}

	public Pizza setPizza1(Pizza p1) {
		return pizza1 = p1;
	}
	public double getPizza1cost()
	{
		return pizza1.getCost();
	}
	public Pizza setpizza2(Pizza p2) {
		return pizza2 =  p2;
	}

	public Pizza setpizza3(Pizza p3) {

		return pizza3 = p3;
	}
	public double calcTotal()
	{
		switch(numPizzas){
		case 1:totalcost=(pizza1.getCost());break;
		case 2:totalcost=(pizza1.getCost()+pizza2.getCost());break;
		case 3:totalcost=(pizza1.getCost()+pizza2.getCost()+pizza3.getCost());break;

		}
		return totalcost;
	}
}
