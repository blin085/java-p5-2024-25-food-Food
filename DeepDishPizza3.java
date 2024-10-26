//Bo Ruei Lin
//10-23-2024 Period 5
//DeepDishPizza3.java
//This class works with three other classes/subclasses to print out food components
//such as pizza including the super-superclass which is Food, using inheritance
//and other superclasses. This is different from the original class because 
//it is version 3 with parameters of price and number of items.

public class DeepDishPizza3 extends Pizza3 //subclass of Pizza3 class created
{
	public DeepDishPizza3(String ingredientIn, int centsln, int numbersln) //takes in ingredientIn, centsln, and numbersln
	{
		super(ingredientIn, "deep dish pizza", centsln, numbersln); //calls supermethod stores ingredientln, "deep dish pizza", centsln, and numbersln
	}
} 
