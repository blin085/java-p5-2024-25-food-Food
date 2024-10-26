//Bo Ruei Lin
//10-23-2024 Period 5
//Pizza3.java
//This class works with three other classes/subclasses to print out food components
//such as pizza including the superclass which is Food, using inheritance
//and other subclasses. This is different from the 
//original class because it is version 3 with parameters of price and number of items.

public class Pizza3 extends Food3 //creates a subclass of Food3
{
	public Pizza3(String ingredientIn, int centsln, int numbersln) //constructor of Pizza3 class takes in three parameters
	{
		super("baked", ingredientIn, "pizza", centsln, numbersln); //sends back five parameters to overload the constructor
	}
	public Pizza3(String ingredientIn, String nameIn, int centsln, int numbersln) //overloaded constructor taking in ingredientIn, nameIn, centsln, and numbersln
	{
		super("baked", ingredientIn, nameIn, centsln, numbersln); //sends in parameters
	}
}
	
