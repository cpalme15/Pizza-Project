public class Pizza {
private char size;
private int cheese;
private int pepperoni;
private int beef;
private double cost;
public  Pizza() {
size=' ';
cheese=0;
pepperoni=0;
beef=0;
cost=0.0;
}
public Pizza(char size, int cheese, int pepperoni, int beef, double cost) {
	this.size = size;
	this.cheese = cheese;
	this.pepperoni = pepperoni;
	this.beef = beef;
	this.cost = cost;
}

public char getSize() {
	return size;
}
public void setSize(char size) {
	this.size = size;
}
public int getCheese() {
	return cheese;
}
public void setCheese(int cheese) {
	this.cheese = cheese;
}
public int getPepperoni() {
	return pepperoni;
}
public void setPepperoni(int pepperoni) {
	this.pepperoni = pepperoni;
}
public int getBeef() {
	return beef;
}
public void setBeef(int beef) {
	this.beef = beef;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public double calcCost()
{
	int sizecost;
	if(size=='S')
		sizecost=10;
	else if(size=='M')
		sizecost=12;
	else 
		sizecost=14;
	
	 cost=((this.cheese*2)+(this.beef*2)+(this.pepperoni)+(sizecost)
		);
	 return cost;
}
@Override
public String toString() {
	return "size=" + size +"\n"+ "cheese=" + cheese +"\n"+ "pepperoni=" + pepperoni +
			"\n"+"beef=" + beef +"\n"+ "cost="+ cost;
}




}