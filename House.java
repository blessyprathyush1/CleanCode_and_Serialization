import java.util.*;

public class House
{
    static 
    {

		Scanner s = new Scanner(System.in);
		
		System.out.format("%s","Different material standards available for building a house are \n1.Standard\n2.Above standard\n3.High standard\n4.High standard and Fully automated");
		System.out.format("%s","Enter required Material Standard:" );
		String material = s.nextLine();
		System.out.format("%s", "Enter the Number of Square Feet" );
		float no_of_square_feet =s.nextFloat();
		Cost_of_Construction obj = new Cost_of_Construction();
		float Cost = obj.ConstructionCost(material,no_of_square_feet);
		System.out.format("%s","Total Cost Of Construction is ");
		System.out.format("%f",Cost);
        System.exit(0);
		
	}
  public static void main(String[] args)
  {
      
  }
}

// Calculating house Construction Cost 
public class Cost_of_Construction
{
	
	float ConstructionCost(String material,float no_of_square_feet)
	{
		
		if(material.equals("Standard"))
		{
			return no_of_square_feet*1200;
		}
		else if(material.equals("Above standard"))
		{
			return no_of_square_feet*1500;
		}
		else if(material.equals("High standard"))
		{
			return no_of_square_feet*1800;
		}
		else if(material.equals("High standard and Fully automated home"))
		{
			return no_of_square_feet*2500;
		}
		else return 0;
    }
}