import java.lang.*;
import classes.*;
import interfaces.*;
import fileio.*;
import java.util.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FoodCourt fc = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		boolean choice = true;
		
		try{
			
	    	while(choice)
		    {
			System.out.println("Choose from the Following Options: ");
			System.out.println("--------------------------------------");
			System.out.println("1. Employee Management");
			System.out.println("2. Restaurant Management");
			System.out.println("3. Restaurant Food Item Management");
			System.out.println("4. Food Item Quantity Add-Sell");
			System.out.println("5. Exit");
			System.out.println("--------------------------------------\n");
			
			System.out.print("You have choosed: ");
			
			int option = sc.nextInt();
		
			switch(option)
			{
				case 1:
				    try{
				
					System.out.println("********************");
					System.out.println("Employee Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove an Existing Employee");
					System.out.println("3. Show All Employees");
					System.out.println("4. Search An Employee");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input1 = sc.nextInt();
					
					switch(input1)
					{
						case 1:
						     try{
							
								System.out.println("#####################");
							
							System.out.println("Insert New Employee");
							
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							
							System.out.print("Enter Employee Salary: ");
							double salary = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary);
							
							fc.insertEmployee(e1);
							
							System.out.println("#####################");
							break;
							 }
							  
					         catch (InputMismatchException ime7)
		                    {
								ime7.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }
							
							 
							
						case 2:
						    try{
						
						    System.out.println("#####################");
							System.out.println("Remove Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = fc.getEmployee(empId2);
							fc.removeEmployee(e2);
							
							
							
							System.out.println("#####################");
							break;	
							}
							 
					         catch (InputMismatchException ime8)
		                    {
								ime8.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }

						case 3:
						    try{
							System.out.println("#####################");
							System.out.println("Show All Employees");
							
							fc.showAllEmployees();
							System.out.println("#####################");
							break;	
							 }
					         catch (InputMismatchException ime9)
		                    {
								ime9.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }
							

						case 4:
						    try{
						     System.out.println("#####################");
							System.out.println("Search An Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId3 = sc.next();
							
							Employee e3 = fc.getEmployee(empId3);
							
							if(e3 !=null)
							{
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exists");
							}
							System.out.println("#####################");
							break;
                           }
					       catch (InputMismatchException ime10)
		                   {
								ime10.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }							
							
							

						case 5:
						
							
							System.out.println("#####################");
							System.out.println("Go Back");
							System.out.println("#####################");
							break;
							
						default:
							System.out.println("#####################");
							System.out.println("Invaild Choice");
							System.out.println("#####################");
							break;
					}
					System.out.println("********************");
					break;
					}
					 catch (InputMismatchException ime2)
		            {
								ime2.printStackTrace();
								System.out.println("InputMismatchException occured");
				    }
					
				
				case 2:
				     try{
				
					System.out.println("********************");
					System.out.println("Restaurant Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Restaurant");
					System.out.println("2. Remove an Existing Restaurant");
					System.out.println("3. Show All Restaurants");
					System.out.println("4. Search a Restaurant");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input2 = sc.nextInt();
					
					switch(input2)
					{
						case 1:
							try{
							System.out.println("#####################");
							System.out.println("Insert New Restaurant");
							
							System.out.print("Enter Restaurant Rid: ");
							String rid1 = sc.next();
							
							System.out.print("Enter Restaurant Name: ");
							String name1 = sc.next();
			
							Restaurant r1 = new Restaurant();
							r1.setRid(rid1);
							r1.setName(name1);
				
							fc.insertRestaurant(r1);
							
							System.out.println("#####################");
							break;
							 }
					       catch (InputMismatchException ime11)
		                   {
								ime11.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }
							
						

						case 2:
							try {
							System.out.println("#####################");
							System.out.println("Remove An Existing Restaurant");
							
							System.out.print("Enter Restaurant RID: ");
							String rid2 = sc.next();
							
							Restaurant r2 = fc.getRestaurant(rid2);
							fc.removeRestaurant(r2);
							
							
							
							System.out.println("#####################");
							break;	
							 }
					         catch (InputMismatchException ime12)
		                    {
								ime12.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }

						case 3:
							try{
							System.out.println("#####################");
							System.out.println("Show All Restaurants");
							
							fc.showAllRestaurants();
							System.out.println("#####################");
							break;	
							 }
					      catch (InputMismatchException ime13)
		                    {
								ime13.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }
							
						case 4:
							try{
							System.out.println("#####################");
							System.out.println("Search a restaurant :");
							
							System.out.print("Enter Restaurant rid: ");
							String rid3 = sc.next();
							
							Restaurant r3 = fc.getRestaurant(rid3);
							
							if(r3 !=null)
							{
								System.out.println("Restaurant RID: "+r3.getRid());
								System.out.println("Restaurant Name: "+r3.getName());
								r3.showAllFoodItems();
							}
							else
							{
								System.out.println("Restaurant Does Not Exist");
							}
							System.out.println("#####################");
							break;	
							 }
					       catch (InputMismatchException ime14)
		                    {
								ime14.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }

						case 5:
							
							System.out.println("#####################");
							System.out.println("Go Back");
							System.out.println("#####################");
							break;
							
						default:
							System.out.println("#####################");
							System.out.println("Invaild Choice");
							System.out.println("#####################");
							break;
					}
					System.out.println("********************");
					break;
					 }
					  catch (InputMismatchException ime3)
		             {
								ime3.printStackTrace();
								System.out.println("InputMismatchException occured");
				     }
					
				case 3:
				     try{
				
					System.out.println("********************");
					System.out.println("Restaurant Food Item Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Food Item For Restaurant");
					System.out.println("2. Remove An Existing Food Item Of A Restaurant");
					System.out.println("3. Show All Food Items Of A Restaurant");
					System.out.println("4. Search A Food Item of a restaurant ");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input3 = sc.nextInt();
					
					switch(input3)
					{
						case 1:
						    try{
							System.out.println("#####################");
							System.out.println("Insert New Food Item of a Restaurant\n");
							
							System.out.println("Which Type of Food Item Do you Want to Add?");
							System.out.println("1. Main Dish");
							System.out.println("2. Appitizers");
							System.out.println("3. Go Back");
							
							System.out.print("Your Type: ");
							int type = sc.nextInt();
							
							FoodItem f = null;
							
							if(type == 1)
							{
								System.out.print("Enter  FID Of Food: ");
								String fid1 = sc.next();
								System.out.print("Enter  Name Of Food: ");
								String name1= sc.next();
								System.out.print("Enter Available Quantity: ");
								int aq1 = sc.nextInt();
								System.out.print("Enter Price Of The Food: ");
								double price1 = sc.nextDouble();
								System.out.print("Enter  Category Of The Food: ");
								String category1= sc.next();
								
								
								MainDish md = new MainDish();
								
								md.setFid(fid1);
								md.setName(name1);
								md.setAvailableQuantity(aq1);
								md.setPrice(price1);
								md.setCategory(category1);
								
								f = md;
							}
							else if(type == 2)
							{
								System.out.print("Enter  FID Of Food: ");
								String fid2 = sc.next();
								System.out.print("Enter  Name Of Food: ");
								String name2= sc.next();
								System.out.print("Enter Available Quantity: ");
								int aq2= sc.nextInt();
								System.out.print("Enter Price Of The Food: ");
								double price2 = sc.nextDouble();
								System.out.print("Enter  Size Of The Food: ");
								String size2= sc.next();
								
								
								Appitizers ap = new Appitizers();
								
								ap.setFid(fid2);
								ap.setName(name2);
								ap.setAvailableQuantity(aq2);
								ap.setPrice(price2);
								ap.setSize(size2);
								
								f = ap;
							}
							else if(type == 3)
							{
								System.out.println("Going Back....");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							
							if(f != null)
							{
								try{
								System.out.print("Enter Restaurant RID: ");
								String rid1 = sc.next();
								
								fc.getRestaurant(rid1).insertFoodItem(f);
								
								
								}
								catch(NullPointerException npe)
								{npe.printStackTrace();
								System.out.println("RID not found");
								}
							}
							
							System.out.println("#####################");
							break;
							 }
					        catch (InputMismatchException ime15)
		                    {
								ime15.printStackTrace();
								System.out.println("InputMismatchException occured");
				             }
						
							
						case 2:
						
					    	try{
							System.out.println("#####################");
							System.out.println("Remove an Existing Food Item of a Restaurant");
							
							System.out.print("Enter Restaurant RID: ");
							String rid2 = sc.next();
							System.out.print("Enter Food Item FID: ");
							String fid2 = sc.next();
							
							
							
							Restaurant rr = fc.getRestaurant(rid2);
								FoodItem fi= rr.getFoodItem(fid2);

								if (rr == null) {
									System.out.println("Food Item FID Not Found!");
									break;
								}
								rr.removeFoodItem(fi);
							}
							catch (NullPointerException npe){
								npe.printStackTrace();
								System.out.println("NullPointerException occured");
							}

                            System.out.println("#####################");
                            break;
						case 3:
						     try{
							System.out.println("#####################");
							System.out.println("Show All Food Items of a Restaurant");
							System.out.print("Enter Restaurant RID: ");
							String rid3 = sc.next();
							
							fc.getRestaurant(rid3).showAllFoodItems();
							 }
							  
					        catch (InputMismatchException ime16)
		                     {
								ime16.printStackTrace();
								System.out.println("InputMismatchException occured");
				               }
							System.out.println("#####################");
							break;
						case 4:
						    try{
							System.out.println("#####################");
							System.out.println("Search a Food Item of a Restaurant");
							
							System.out.print("Enter Restaurant RID: ");
							String rid4 = sc.next();
							System.out.print("Enter Food Item fid: ");
							String fid4 = sc.next();
							
							
							FoodItem ff = fc.getRestaurant(rid4).getFoodItem(fid4);
							
							
							
							if(ff != null)
							{
								ff.showInfo();
							}
							
							
							 }
					      catch (InputMismatchException ime17)
		                    {
								ime17.printStackTrace();
								System.out.println("InputMismatchException occured");
				             }
							System.out.println("#####################");
							break;
						case 5:
						
							System.out.println("#####################");
							System.out.println("Going Back ....");
							System.out.println("#####################");
							break;
							
						default:

							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
						
					}
					
					System.out.println("********************");
					break;
					 }
					  catch (InputMismatchException ime4)
		              {
								ime4.printStackTrace();
								System.out.println("InputMismatchException occured");
				      }
								
				case 4:
				    try{
				
					System.out.println("********************");
					System.out.println("Food Item  Add or Sell");
					
					
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Add Amount of Food");
					System.out.println("2. Sell Amount of Food");
					System.out.println("3. Show Add/Sell History");
					System.out.println("4. Go Back");
					System.out.println("--------------------------------------\n");
					
					System.out.print("Enter your option: ");
					int input4 = sc.nextInt();
					
					switch(input4)
					{
						case 1:
						
							System.out.println("#####################");
							System.out.println("Add Amount Of Food \n");
							
							System.out.print("Enter Restaurant RID: ");
							String rid1 = sc.next();
							System.out.print("Enter Food Item fid: ");
							String fid1 = sc.next();
							System.out.print("Enter What Amount of Food Will Add: ");
							int amount1 = sc.nextInt();
							
							if(amount1>0)
							{
								try{
								fc.getRestaurant(rid1).getFoodItem(fid1).addQuantity(amount1);
								
	
								frwd.writeInFile("Add Quantity	: "+ amount1+" add with this fid "+ fid1);
							}
							catch(NullPointerException npe)
							{
								npe.printStackTrace();
								if(fc.getRestaurant(rid1)==null)
								{System.out.println(" Rid not found");}
							else
							{System.out.println(" Fid not found");
        						}
							}
							}
							
							System.out.println("#####################");
							break;
							
						case 2:
						
							System.out.println("#####################");
							System.out.println("Sell Food");
							
							System.out.print("Enter Restaurant RID: ");
							String rid2 = sc.next();
							System.out.print("Enter Food Item FID: ");
							String fid2 = sc.next();
							System.out.print("Enter What Amount You Want To Sell: ");
							int amount2 = sc.nextInt();
							
							
							try{
							if(amount2>0 && amount2 <= fc.getRestaurant(rid2).getFoodItem(fid2).getAvailableQuantity())
							{
								fc.getRestaurant(rid2).getFoodItem(fid2).sellQuantity(amount2);
								
								
								
								frwd.writeInFile("Sell Quantity	: "+ amount2+" sell from this fid "+ fid2);
							}
							}
							catch(NullPointerException npe)
							{
								npe.printStackTrace();
								if(fc.getRestaurant(rid2)==null)
								{System.out.println(" Rid not found");}
							else
							{System.out.println(" Fid not found");
        						}
							}
							
							
							System.out.println("#####################");
							break;
							
						
						case 3:
						
						    try{
							System.out.println("#####################");
							System.out.println("Show add sell History");
							frwd.readFromFile();
							
							 }
					     catch (InputMismatchException ime18)
		                    {
								ime18.printStackTrace();
								System.out.println("InputMismatchException occured");
				             }
							System.out.println("#####################");
							break;
							
						case 4:
						
							System.out.println("#####################");
							System.out.println("Going Back..");
							System.out.println("#####################");
							break;
							
						default:
						
							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
					}
					
					System.out.println("********************");
					break;
					}
					 catch (InputMismatchException ime5)
		             {
								ime5.printStackTrace();
								System.out.println("InputMismatchException occured");
			      	 }
								
				case 5:
				     try{
				
					System.out.println("********************");
					System.out.println("Exit");
					choice = false;
					System.out.println("********************");
					break;
					 }
					  catch (InputMismatchException ime6)
		             {
								ime6.printStackTrace();
								System.out.println("InputMismatchException occured");
				     }
				default:
				
					System.out.println("********************");
					System.out.println("Invalid Option");
					System.out.println("********************");
					break;
					
			      }
			
		          }
		
		
	             }
	             catch (InputMismatchException ime1)
		         {
								ime1.printStackTrace();
								System.out.println("InputMismatchException occured");
				 }
				  catch (Exception e)
		         {
								e.printStackTrace();
								System.out.println("Here Exception occured");
				 }
				 
	     
	}
}
