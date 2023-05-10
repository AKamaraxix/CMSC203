public class Customer
{
	private String customerName;
	private int customerAge;
	
	
	public Customer(String cN, int cA) 
	{
		customerName = cN;
		customerAge = cA;
	}
	public Customer(Customer cc) 
	{
		customerName = cc.getName();
		
		customerAge = cc.getAge();
	}
	
	
	public String toString() 
	{
		return customerName +", " +customerAge +"y/o";
	}
	
	
	public String getName() 
	{
		return customerName;
	}
	public int getAge() 
	{
		return customerAge;
	}
	
	/** Mutators */
	public void setName(String cN) 
	{
		customerName = cN;
	}
	public void setAge(int cA) 
	{
		customerAge = cA;
	}
}


