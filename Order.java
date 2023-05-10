import java.util.ArrayList;
import java.util.Random;


public class Order implements OrderInterface, Comparable<Order> 

{
	private int orderNumber;
	private int TimeOfOrder;
	private DAY DayOforder;
	private Customer theCustomer;
	private ArrayList<Beverage> beverages;
	
	/** Constructors */
	public Order(int too, DAY doo, Customer tc) 
		
		{
			orderNumber = genOrderNum();
			TimeOfOrder = too;
			DayOforder = doo;
			theCustomer = tc;
			beverages = new ArrayList<>();
		}
	
	
	public int genOrderNum() 
	
	{
		Random r;
		r = new Random();
		int randomNumber;
		    
		    randomNumber= r.nextInt(90_000-10_000)+10_000;
	 
     return randomNumber;
	
	}
	
	public String toString() 
	{
		String newString = "__________________________________"
				   +DayOforder.toString() +", " +TimeOfOrder
				   +"\n" +theCustomer.toString() +" Order Num: " +orderNumber;
		
		for (Beverage theBeverage : beverages) 
		{
			newString += "\n" +theBeverage.toString();
		}
		
		newString += "\n Order Total: " +calcOrderTotal();
		
		return newString;
	}
	
	public boolean isWeekend()
		{
		
		if (DayOforder == DAY.SATURDAY || DayOforder == DAY.SUNDAY) {
			return true;
		}
		return false;
	}
	public Beverage getBeverage(int iNum) 
		{
		
		return beverages.get(iNum);
		
		}
	public int compareTo(Order theOrder) 
	{
		if (orderNumber == theOrder.getOrderNo())
		{
			return 0;
		}
		else if (orderNumber > theOrder.getOrderNo()) 
		{
			return 1;
		}
		else 
		 {
			return -1;
		 }
	}
	public double calcOrderTotal() 
	{
		double totalOrder;
		       totalOrder = 0;
		
		for (Beverage theBeverages : beverages) {
			totalOrder += theBeverages.calcPrice();
		}
		
		return totalOrder;
	}
	public int findNumOfBeveType(TYPE type) 
		{
			int counter ; 
			    counter  = 	0;
		
			for (Beverage theBeverages : beverages) 
			{
			
				if (theBeverages.getType() == type) 
				{
				
					counter++;
			    }
		}
		
		return counter;
		
	   }
	public int getTotalItems()
	{
		return beverages.size();
	}
	
	
	public void addNewBeverage(String n, SIZE s, boolean exShot, boolean exSyrup)
	{
		Coffee theCoffee = new Coffee(n, s, exShot, exSyrup);
		
		beverages.add(theCoffee);
	}
	public void addNewBeverage(String n, SIZE s, int numFruits, boolean proPowder) 
	{
		Smoothie theSmoothie = new Smoothie(n, s, numFruits, proPowder);
		
		beverages.add(theSmoothie);
	}
	public void addNewBeverage(String n, SIZE s) 
	{
		boolean theWD = false;
		if (DayOforder == DAY.SATURDAY || DayOforder == DAY.SUNDAY) 
		{
			theWD = true;
		}
		Alcohol alco = new Alcohol(n, s, theWD);
		beverages.add(alco);
	}
	
	
	public int getOrderNo() 
	{
		return orderNumber;
	}
	public int getOrderTime() 
	{
		return TimeOfOrder;
	}
	public DAY getOrderDay() 
	{
		return DayOforder;
	}
	public Customer getCustomer() 
	{
		return new Customer(theCustomer);
	}
	public ArrayList<Beverage> getBeverages() 
	{
		return beverages;
	}
	
	
	public void setOrderNum(int theONum) 
	{
		orderNumber = theONum;
	}
	public void setOrderTime(int theOT) 
	{
		TimeOfOrder = theOT;
	}
	public void setOrderDay(DAY theOD) 
	{
		DayOforder = theOD;
	}
	public void setCustomer(Customer tc) 
	{
		theCustomer = tc;
	}
}

