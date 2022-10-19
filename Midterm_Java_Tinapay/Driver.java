import java.util.*;
public class Driver {
 
 
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		   ArrayList <Inventory>ingredients = new ArrayList<Inventory>(); 
		   String name;
		   String measurement;
		   int units;
		   int menuChoice=menu();
		   int i;
		   int addOn;
 
		   while(menuChoice!=5)
		   {
			if(menuChoice==1)
			{
				System.out.println("What type of ingredient would you like to add?");
				name=keyboard.nextLine();
				System.out.println("What is "+name+" measured in?");
				measurement=keyboard.nextLine();
				System.out.println("");
				System.out.println("How many  "+measurement+" of  "+name+" do you have?");
				units=keyboard.nextInt();
				keyboard.nextLine();
				System.out.println("");
				Inventory foodItem = new Inventory(name, measurement, units);
				ingredients.add(foodItem);
 
 
			}
 
			else if(menuChoice==2)
			{
				for(i=0; i<ingredients.size(); i++)
				{
					System.out.println(i +") "+ingredients.get(i).toString());
				}
				System.out.println("What would you like to add to?");
				int x = keyboard.nextInt();
				addOn=ingredients.get(x).getUnits();
				System.out.println("How many "+ingredients.get(x).getMeasurment()+" would you like to stock?");
				addOn+=keyboard.nextInt();
			    ingredients.get(x).setUnits(addOn);
 
 
			}
			else if (menuChoice==3)
			{
				for(i=0; i<ingredients.size(); i++)
				{
					System.out.println(i +") "+ingredients.get(i).toString());
				}
				System.out.println("Which item would you like to use?");
				int x = keyboard.nextInt();
				addOn=ingredients.get(x).getUnits();
				System.out.println("How many "+ingredients.get(x).getMeasurment()+" would you like to use?");
				addOn-=keyboard.nextInt();
			    ingredients.get(x).setUnits(addOn);
 
			}
			else if (menuChoice==4)
			{
			for(i=0; i<ingredients.size(); i++)
				System.out.println(ingredients.get(i).toString());
			}
			menuChoice=menu();
		   }
 
 
	}
	public static int menu()
    {
		Scanner keyboard = new Scanner(System.in);
		int menuChoice;
 
 
		System.out.println("Please select an option");
		System.out.println("1)Add inventory");
		System.out.println("2)Stock inventory");
		System.out.println("3)Use ingredients");
		System.out.println("4)Display ingredients");
		System.out.println("5)Exit program");
		menuChoice = keyboard.nextInt();
 
		while(menuChoice < 1 || menuChoice > 5)
		{
			System.out.println("Invalid please try again");
			menuChoice = keyboard.nextInt();
		}
		return menuChoice;
 
 
 
 
 
 
	}
 
}