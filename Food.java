//Bo Ruei Lin
//10-23-2024 Period 5
//Food.java
//This class works with three other classes/subclasses to print out food components
//such as pizza including subclasses like Pizza, using inheritance
//and other subclasses, for the code to work

public class Food //creates the main class Food
{
    protected String str; //declares the field variable str
    public Food() //constructor created
    {
        str = new String(""); //initializes str
    }

    public Food(String prepMethod, String ingredient, String name) //overload the constructor with three parameters 
    {
        str = "At the sale: " + name + " " + prepMethod + " with " + ingredient; //set str as variables added together
    }

    public void printForSale() //method to print out str
    {
        System.out.println(str); //prints out str
    }
}
