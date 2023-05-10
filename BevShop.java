import java.util.ArrayList;

public class BevShop implements BevShopInterface

{
	private int amountOfAlcoholInOrder;
	
	private int theRecentOrderId;
	
	private ArrayList<Order> TheOrders;
	
	public BevShop() 
	{
		TheOrders = new ArrayList<>();
	}
	
	public String toString() {
		String newString = "Monthly Orders\n";
		
		for (Order theO : TheOrders)
		{
			newString += theO.toString();
		}
		
		 newString += "Total Sale: " +totalMonthlySale();
		
		return newString;
	}
	
	public boolean validTime(int time) 
		{
			if (time >= MIN_TIME && time <= MAX_TIME) 
			{
		
				return true;
			}
				else
				return false;
			}
	public boolean validAge(int age)
	{
		if (age > MIN_AGE_FOR_ALCOHOL) 
		{
			return true;
		}
		else
		return false;
	}
	
	public boolean eligibleForMore() 
		{
		if (amountOfAlcoholInOrder < 3) 
		{
			return true;
		}	
			else
			return false;
	}
	public boolean isMaxFruit(int num) 
		{
			if (num > MAX_FRUIT) 
			{
				return true;
			}
		else
		return false;
	}
	
	public void startNewOrder(int time, DAY day, String customerName, int customerAge) 
		{
			Customer c = new Customer(customerName, customerAge);
			
			Order o = new Order(time, day, c);
			
			TheOrders.add(o);
			
			theRecentOrderId = TheOrders.indexOf(o);
			
			amountOfAlcoholInOrder = 0;
		}
	public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) 
	{
	
		TheOrders.get(theRecentOrderId).addNewBeverage(bevName, size, extraShot, extraSyrup);
	
	}
	
	public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtein)
	{
	
		TheOrders.get(theRecentOrderId).addNewBeverage(bevName, size, numOfFruits, addProtein);
	
	}
	public void processAlcoholOrder(String bevName, SIZE size) 
	
	{
		TheOrders.get(theRecentOrderId).addNewBeverage(bevName, size);
		
		amountOfAlcoholInOrder++;
	}
	
	public int findOrder(int orderNo) 
	{
		for (int index = 0; 
				 index < TheOrders.size();
				 index++) 
			{
				if (TheOrders.get(index).getOrderNo() == orderNo) 
				{
					return index;
				}
		}
		
		return -1;
	}
	public double totalOrderPrice(int orderNo)
	{
		double oSales;
		oSales = 0;
		
		for (Order theO : TheOrders) 
			{
				if (theO.getOrderNo() == orderNo) 
				{
					for (Beverage theB : theO.getBeverages()) 
				{
					oSales += theB.calcPrice();
				}
			}
		}
		
		return oSales;
	}
	public double totalMonthlySale() 
	{
		double saleTotal = 0;
		
		for (Order o : TheOrders) 
		{
			for (Beverage b : o.getBeverages()) 
			{
				saleTotal += b.calcPrice();
			}
		}
		
		return saleTotal;
	}
	public int totalNumOfMonthlyOrders() 
	{
		return TheOrders.size();
	}
	public void sortOrders() {
		
		for (int index = 0; 
				 index < TheOrders.size()-1;  
				 index++) 
		   {
			int minimumOrderNumber = index;
			for (int secondIndex = index+1; 
					 secondIndex < TheOrders.size(); 
					 secondIndex++) 
			{
				if (TheOrders.get(secondIndex).getOrderNo() < TheOrders.get(minimumOrderNumber).getOrderNo()) 
				{
					minimumOrderNumber = secondIndex;
				}
			}
				
			Order temps = TheOrders.get(minimumOrderNumber);
			
			TheOrders.set(minimumOrderNumber, TheOrders.get(index));
			
			TheOrders.set(index, temps);
		}
	}
	public Order getOrderAtIndex(int index) {
		return TheOrders.get(index);
	}
	
	
	public Order getCurrentOrder() 
	{
		return TheOrders.get(theRecentOrderId);
	}
	public int getNumOfAlcoholDrink() 
	{
		return amountOfAlcoholInOrder;
	}
	public int getMaxOrderForAlcohol() 
	{
		return MAX_ORDER_FOR_ALCOHOL;
	}
	public int getMinAgeForAlcohol() 
	{
		return MIN_AGE_FOR_ALCOHOL;
	}
	

}
