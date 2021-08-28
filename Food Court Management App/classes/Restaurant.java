package classes;
import java.lang.*;
import interfaces.*;

public class Restaurant implements FoodItemOperations
{
	private String rid;
	private String name;
	private FoodItem foodItems[] = new FoodItem[10];
	
	public void setRid(String rid){this.rid = rid;}
	public void setName(String name){this.name = name;}
	
	
	public String getRid(){return rid;} 
	public String getName(){return name;}
	
	
	 public void insertFoodItem(FoodItem f){
    int flag = 0;
		for(int i=0; i<foodItems.length; i++){

			if(foodItems[i] == null){
				foodItems[i] = f;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Food  Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}

  }

  public void removeFoodItem(FoodItem f){
    int flag = 0;
		for(int i=0; i<foodItems.length; i++){
			if(foodItems[i] == f){
				foodItems[i] = null;
				flag = 1;
				break;
      }
    }
    if(flag == 1){
      System.out.println("Food  has been Removed");
    }
		else{
      System.out.println("Can Not Remove");
    }
  }

  public FoodItem getFoodItem(String fid){
		FoodItem f = null;
		for(int i=0; i<foodItems.length; i++){
			if(foodItems[i] != null){
				if(foodItems[i].getFid().equals(fid) ){
					f = foodItems[i];
					break;
				}
			}
		}
		return f;
	}

  public void showAllFoodItems(){
    for(FoodItem f : foodItems){
			if(f != null){
				f.showInfo();
			}
		}
  }

}
