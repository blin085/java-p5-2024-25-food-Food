//Bo Ruei Lin
//10-23-2024 Period 5
//FoodTester3.java
//This class works with three other classes/subclasses to print out food components
//such as pizza including the super-superclass which is Food, using inheritance
//and other subclasses. FoodTester calls the other subclasses and superclass.
//This is different from the original class because it is version 3 with parameters of price and number of items.

public class FoodTester3 //create the class for FoodTester3
{
	public FoodTester3() //constructor
	{
		//nothing in constructor
	}
	public static void main(String[] args) //main method of FoodTester
	{
		FoodTester3 call = new FoodTester3(); //instance of printing method
		call.print(); //calls print 3 lines method
		
		Food3 food1 = new Food3 ("baked", "bananas", "muffins", 50, 12); //instance of Food3 constructor
		food1.printForSale(); //calls printForSale
		
		Food3 food2 = new Food3 ("fried", "yams", "fritters", 100, 3); //second instance to overload Food3 constructor
		food2.printForSale(); //calls printForSale
		
		Pizza3 pizza = new Pizza3 ("anchovies", 250, 8); //instance of Pizza3 and sends in parameters
		pizza.printForSale(); //calls printForSale 
		
		DeepDishPizza3 deepDish = new DeepDishPizza3("mushrooms", 200, 10); //instance of DeepDishPizza
		deepDish.printForSale(); //calls printForSale
		
		call.print(); //calls print 3 lines method
	}
	public void print() //method to print 3 lines
	{
		System.out.print("\n\n\n"); //prints three lines
	}
}
