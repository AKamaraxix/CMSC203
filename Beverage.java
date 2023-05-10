	abstract class Beverage 
		{
		    private SIZE sizeOfBeverage;
			private String nameOfBeverage;
			private TYPE typeOfBeverage;
			private final double SP = 1.0;
			private final double BP = 2.0;
			


			public Beverage(String name, TYPE type, SIZE size) 
			{
				nameOfBeverage = name;
				typeOfBeverage = type;
				sizeOfBeverage = size;
			}

			public abstract double calcPrice();
				public String toString() 
				{
					return nameOfBeverage +", " +sizeOfBeverage;
				}

				public boolean equals(Beverage bev)
				{
					if (nameOfBeverage.equals(bev.getBevName()) &&  sizeOfBeverage==bev.getSize() &&typeOfBeverage==bev.getType()) 
						{
						
							return true;
						}
					else 
						{
							return false;
						}
				}


				public String getBevName() 
				{
					return nameOfBeverage;
				}
				public TYPE getType() 
				{
					return typeOfBeverage;
				}
				public SIZE getSize()
				{
					return sizeOfBeverage;
				}
				public double getBasePrice() 
				{
					return BP;
				}
				public double getSizePrice() 
				{
					return SP;
				}


				public void setName(String nString) 
				{
					nameOfBeverage = nString;
				}
				public void setType(TYPE tType) 
				{
					typeOfBeverage = tType;
				}
				public void setSize(SIZE sSize) 
				{
					sizeOfBeverage = sSize;
				}
}