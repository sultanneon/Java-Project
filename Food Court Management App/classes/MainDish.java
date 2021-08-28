package classes;
import java.lang.*;

public class MainDish extends FoodItem
{
	private String category;
	
	public void setCategory(String category)
	{
		this.category=category;
	}
	public String getCategory()
	{
		return category;
	}
	public void showInfo()
	{
		System.out.println("Food ID: "+getFid());
		System.out.println("Food Name: "+getName());
		System.out.println("Available Quantity: "+getAvailableQuantity());
		System.out.println("Food price :"+getPrice());
	    System.out.println("Food category:"+getCategory());
		System.out.println();
	}
}