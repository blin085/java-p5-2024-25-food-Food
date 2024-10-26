//Bo Ruei Lin
//10-23-2024 Period 5
//FoodTester.java
//This class works with three other classes/subclasses to print out food components
//such as pizza including the super-superclass which is Food, using inheritance
//and other subclasses. FoodTester calls the other subclasses and superclass.

public class FoodTester //create the class for FoodTester
{
	public FoodTester() //constructor
	{
		//nothing in constructor
	}
	public static void main(String[] args) //main method of FoodTester
	{
		FoodTester call = new FoodTester(); //instance of printing method
		call.print(); //calls print 3 lines method
		
		Food food1 = new Food ("baked", "bananas", "muffins"); //instance of Food constructor
		food1.printForSale(); //calls printForSale
		
		Food food2 = new Food ("fried", "yams", "fritters"); //second instance to overload Food constructor
		food2.printForSale(); //calls printForSale
		
		Pizza pizza = new Pizza ("pepperoni"); //instance of Pizza with parameters
		pizza.printForSale(); //calls printForSale 
		
		DeepDishPizza deepDish = new DeepDishPizza("mushrooms"); //instance of DeepDishPizza
		deepDish.printForSale(); //calls printForSale
		
		call.print(); //calls print 3 lines method
	}
	public void print() //method to print 3 lines
	{
		System.out.print("\n\n\n"); //prints three lines
	}
}
