public class Property {

            private String pName;

            private String theCity;

            private double rent;

            private String theOwner;

            private Plot plot;

           

            public Property() {

                        pName = "";

                        theCity = "";

                        rent = 0;

                        theOwner = "";

                        plot = new Plot();

            }

           

            public Property(Property property) {

                        pName = property.getPropertyName();

                        theCity = property.getCity();

                        rent = property.getRentAmount();

                        theOwner = property.getOwner();

                        plot = property.getPlot();

            }

           

            public Property(String name, String city, double rentalAmount, String owner)
            {

                        pName = name;

                        theCity = city;

                        rent = rentalAmount;

                        theOwner = owner;

            }

           

            public Property(String name, String city, double rentalAmount, String owner, int x, int y, int width, int depth) 
            {

                        pName = name;

                        theCity = city;

                        rent = rentalAmount;

                        theOwner = owner;

                        plot = new Plot(x, y, width, depth);

            }

           

            public String toString()
            {

                        String messageString;

                        messageString = "Property Name: " + pName + "\nLocated in " + theCity + "\nBelonging to " + theOwner + "\nRent Amount: " + rent ;

                        return messageString;

            }

           

            public void setPropertyName(String name)
            {

                        pName = name;

            }

           

            public String getPropertyName()
            {

                        return pName;

            }

           

            public void setCity(String city) 
            {

                        theCity = city;

            }

           

            public String getCity() 
            {

                        return theCity;

            }

           

            public void setRentAmount(double rentAmount)
            {

                        rent = rentAmount;

            }

           

            public double getRentAmount()
            {

                        return rent;

            }

           

            public void setOwner(String owner) 
            {

                        theOwner = owner;

            }

           

            public String getOwner() {

                        return theOwner;

            }

           

            public void setPlot(int x, int y, int width, int depth) 
            {

                        plot = new Plot(x, y, width, depth);

            }

           

            public Plot getPlot() 
            {

                        return plot;

            }

}