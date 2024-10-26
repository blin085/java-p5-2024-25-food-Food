//Bo Ruei Lin
//10-23-2024 Period 5
//Pizza.java
//This class works with three other classes/subclasses to print out food components
//such as pizza including the superclass which is Food, using inheritance
//and other subclasses

public class Pizza extends Food //creates a subclass of Food
{
	public Pizza(String ingredientIn) //constructor of Pizza class takes in one variable which is the ingredient
	{
		super("baked", ingredientIn, "pizza"); //sends back three parameters to overload the constructor which is "baked", the ingredient, and "pizza"
	}
	public Pizza(String ingredientIn, String nameIn) //overloaded constructor with two parameters
	{
		super("baked", ingredientIn, nameIn); //sends back three paramters
	} 
}
	
