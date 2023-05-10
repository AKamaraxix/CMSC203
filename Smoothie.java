class Smoothie extends Beverage{
private int fruits;
private boolean protein;
private final double COST_OF_FRUITS = .5;
private final double COST_OF_PROTEIN = 1.5;


public Smoothie(String F, SIZE S, int COT, boolean COP) 
{
	super(F, TYPE.SMOOTHIE, S);
	fruits = COT;
	protein = COP;
}


public String toString() 
{
	String newString = getBevName() +", " +getSize() +" " +fruits +" Fruits";

	if (protein) 
	{
		newString += " Protein powder";
	}

		newString += ", $" +calcPrice();

		return newString;
}
			public boolean equals(Smoothie smoothieargument) 
		{
				if (super.equals(smoothieargument) && fruits==smoothieargument.getNumOfFruits() 
				&& protein==smoothieargument.getAddProtien()) 
				{
					return true;
				}
					else {
							return false;
						 }
		}
public double calcPrice() 
{
	double thePrice;
	thePrice= super.getBasePrice();

		if (super.getSize() == SIZE.MEDIUM) 
			{
				thePrice += super.getSizePrice();
			}
		else if (super.getSize() == SIZE.LARGE) 
		{
			thePrice += 2 * super.getSizePrice();
		}

			thePrice += fruits * COST_OF_FRUITS;
			if (protein) 
			{
				thePrice += COST_OF_PROTEIN;
			}

return thePrice;
}

public int getNumOfFruits() 
	{
		return fruits;

	}
public boolean getAddProtien() 
	{
		return protein;

	}
public double getFruitCost()
	{
		return COST_OF_FRUITS;
	
	}
public double getProteinCost() 
	{
	return COST_OF_PROTEIN;
	}


public void setNumOfFruits(int nof) 
	{
		fruits = nof;
	}
public void setProteinPowder(boolean ap)
	{
		protein = ap;
	}

}


