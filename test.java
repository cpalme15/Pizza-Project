
public class Test {

	public static void main(String[] args) {
		PizzaOrder order1=new PizzaOrder();
		
	Pizza p1=new Pizza();
	p1.setSize('S');
	p1.setCheese(2);
	p1.setBeef(3);
	p1.setPepperoni(2);
	p1.calcCost();
	System.out.println("Pizza 1 is :\n"+p1);
	
	Pizza p2=new Pizza();
	p2.setSize('M');
	p2.setCheese(2);
	p2.setBeef(3);
	p2.setPepperoni(2);
	p2.calcCost();
	System.out.println("Pizza 2 is:\n"+p2);
     
	
	Pizza p3=new Pizza();
	p3.setSize('L');
	p3.setCheese(2);
	p3.setBeef(3);
	p3.setPepperoni(2);
	p3.calcCost();
	System.out.println("Pizza 3 is:\n"+p3);
	
	System.out.println();
	}

}
