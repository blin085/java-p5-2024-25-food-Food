//Bo Ruei Lin
//10-23-2024 Period 5
//Food3.java
//This class works with three other classes/subclasses to print out food components
//such as pizza including subclasses like Pizza, using inheritance
//and other subclasses, for the code to work. This is different from the 
//original class because it is version 3 with parameters of price and number of items.

public class Food3 //creates the main class Food3
{
    protected String str; //declares the field variable str
    public Food3() //constructor
    {
        str = new String(""); //initializes str
    }

    public Food3(String prepMethod, String ingredient, String name, int cents, int number) //overloaded constructor with five parameters
    {
        final int CALCULATE = 100;
        str = String.format("At the sale: %s %s with %s will be sold for %d cents each. With %d %s(s), $%.2f can be made.", name, prepMethod, ingredient, cents, number, name, (double)(number)*cents/CALCULATE); //set str and concatenates them together using String.format
    }

    public void printForSale()//method to print out str
    {
        System.out.println(str); //prints out str
    }
}
