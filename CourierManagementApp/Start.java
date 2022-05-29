import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.FileReadWriteDemo;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		Courier Courier = new Courier("Phoring", "Uttora");
		
		System.out.println("\n\n");
		System.out.println("\t\t\t====================================");
		System.out.println("\t\t\t           JAVA  PROJECT            ");
		System.out.println("\t\t\t            Group - A06             ");
		System.out.println("\t\t\t                                    ");
		System.out.println("\t\t\t Welcome to Phoring Courier Service ");
		System.out.println("\t\t\t                                    ");
		System.out.println("\t\t\t====================================\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("\n\t\t\t\tChoose Your Valid Option..\n");
		
			System.out.println("\t\t\t\t1. Employee Management");
			System.out.println("\t\t\t\t2. Customer Management");
			System.out.println("\t\t\t\t3. Parcel Management");
			System.out.println("\t\t\t\t4. Parcel Operations");
			System.out.println("\t\t\t\t5. Courier Information");
			System.out.println("\t\t\t\t6. Exit");
			
			System.out.println("\n\t\t\t====================================");
			System.out.print("\t\t\t\t Enter your choice: ");
			int choice = sc.nextInt();
			System.out.println("\t\t\t====================================\n");
			
			switch(choice)
			{
				case 1:
					
					System.out.println("-------------------------------------");
					System.out.println("You have selected Employee Management");
					System.out.println("-------------------------------------");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Employee");
					System.out.println("\t3. Search Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n====================================");
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					System.out.println("====================================\n");
					
					switch(option1)
					{
						case 1:
							
							System.out.println("-------------------------------------");
							System.out.println("  You have selected Insert Employee  ");
							System.out.println("-------------------------------------");
							
							
							System.out.print("Enter Employee id         : ");
							String eid1 = sc.next();
							System.out.print("Enter Employee Name       : ");
							String name1 = sc.next();
							System.out.print("Enter Salary              : ");
							double salary1 = sc.nextDouble();

								
							Employee e1 = new Employee();
							e1.setEmpId(eid1);
							e1.setName(name1);
							e1.setSalary(salary1);

								
							if(Courier.insertEmployee(e1))
							{
								System.out.println("*** Employee Inserted, id : " + e1.getEmpId() + "  ***");
							}
							else
							{
								System.out.println("*** Employee NOT Inserted, id : " + e1.getEmpId() + "  ***");
							}			
							break;
							
						case 2:
							
							System.out.println("-------------------------------------");
							System.out.println("   You have selected Remove Employee ");
							System.out.println("-------------------------------------");
							
							System.out.print("Enter the id to remove a Employee: ");
							String eid2 = sc.next();
							
							Employee e2 = Courier.searchEmployee(eid2);
							
							if(e2 != null)
							{
								System.out.println("*** Employee Found  ****");
								
								if(Courier.removeEmployee(e2))
								{
									System.out.println("*** Employee Removed, id: " + e2.getEmpId() + " ***");
								}
							}
							else
							{
								System.out.println("*** Employee NOT Found and NOT Removed  ****");
							}
							break;
							
						case 3:
							
							System.out.println("-------------------------------------");
							System.out.println("   You have selected Search Employee ");
							System.out.println("-------------------------------------");
							
							System.out.print("Enter the id to search a Employee: ");
							String eid3 = sc.next();
							
							Employee e3 = Courier.searchEmployee(eid3);
							
							if(e3 != null)
							{
								System.out.println("*** Employee Found  ****");
								e3.showDetails();
							}
							else
							{
								System.out.println("*** Employee NOT Found  ****");
							}
							
							
							break;
							
						case 4:
							
							System.out.println("-------------------------------------");
							System.out.println(" You have selected Show All Employees");
							System.out.println("-------------------------------------");
							
							Courier.showAllEmployees();
							
							break;
							
						case 5:
							
							System.out.println("-------------------------------------");
							System.out.println("         Going Back....              ");
							System.out.println("-------------------------------------");
							
							break;
							
						default:
							
							System.out.println("-------------------------------------");
							System.out.println("   Invalid Option... Going Back....  ");
							System.out.println("-------------------------------------");
							
							break;
					}
					
					break;
					
				case 2:
					
					System.out.println("-------------------------------------");
					System.out.println("You have selected Customer Management");
					System.out.println("-------------------------------------");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Insert New Customer");
					System.out.println("\t2. Remove Customer");
					System.out.println("\t3. Search Customer");
					System.out.println("\t4. Show All Customer");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n====================================");
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					System.out.println("====================================\n");
					
					switch(option2)
					{
						case 1:
							
							System.out.println("-------------------------------------");
							System.out.println("  ou have selected Insert Customer   ");
							System.out.println("-------------------------------------");
							
							System.out.print("Enter Customer id         : ");
							int id1 = sc.nextInt();
							System.out.print("Enter Sender Name         : ");
							String Sname1 = sc.next();
							System.out.print("Enter Receiver Name       : ");
							String Rname1 = sc.next();
							System.out.print("Enter Receiver Address    : ");
							String Location = sc.next();
							System.out.print("Enter Sender Phone Number : ");
							String SphnNumber1 = sc.next();
							System.out.print("Enter Reciver Phone Number: ");
							String RphnNumber1 = sc.next();
								
							Customer c1 = new Customer();
							c1.setid(id1);
							c1.setSName(Sname1);
							c1.setRName(Rname1);
							c1.setLocation(Location);
							c1.setSPhnNumber(SphnNumber1);
							c1.setRPhnNumber(RphnNumber1);
								
							if(Courier.insertCustomer(c1))
							{
								System.out.println("*** Customer Inserted, id: " + c1.getid() + "  ***");
							}
							else
							{
								System.out.println("*** Customer NOT Inserted, id: " + c1.getid() + "  ***");
							}								
							
							break;
							
						case 2:
							
							System.out.println("-------------------------------------");
							System.out.println("  You have selected Remove Customer  ");
							System.out.println("-------------------------------------");
							
							System.out.print("Enter the id to remove a customer: ");
							int id2 = sc.nextInt();
							
							Customer c2 = Courier.searchCustomer(id2);
							
							if(c2 != null)
							{
								System.out.println("*** Customer Found  ****");
								
								if(Courier.removeCustomer(c2))
								{
									System.out.println("*** Customer Removed, id: " + c2.getid() + " ***");
								}
							}
							else
							{
								System.out.println("*** Customer NOT Found and NOT Removed  ****");
							}
							
							break;
							
						case 3:
							
							System.out.println("-------------------------------------");
							System.out.println("    You have selected Search Customer");
							System.out.println("-------------------------------------");
							
							System.out.print("Enter the id to search a customer: ");
							int id3 = sc.nextInt();
							
							Customer c3 = Courier.searchCustomer(id3);
							
							if(c3 != null)
							{
								System.out.println("*** Customer Found  ****");
								c3.showDetails();
							}
							else
							{
								System.out.println("*** Customer NOT Found  ****");
							}
							
							break;
							
						case 4:
							
							System.out.println("-------------------------------------");
							System.out.println("You have selected Show All Customers");
							System.out.println("-------------------------------------");
							
							Courier.showAllCustomers();
							
							break;
							
						case 5:
							
							System.out.println("-------------------------------------");
							System.out.println("          Going Back....             ");
							System.out.println("-------------------------------------");
							
							break;
							
						default:
							
							System.out.println("-------------------------------------");
							System.out.println("   Invalid Option... Going Back....  ");
							System.out.println("-------------------------------------");
							
							break;
					}
					
					break;
					
				case 3:
					
					System.out.println("-------------------------------------");
					System.out.println("           Parcel Management         ");
					System.out.println("-------------------------------------");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("\t1. Booking New Parcel");
					System.out.println("\t2. Cancel Booked Parcel");
					System.out.println("\t3. Search Parcel");
					System.out.println("\t4. Show All Parcel");
					System.out.println("\t5. Go Back");
					
					System.out.println("\n====================================");
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					System.out.println("====================================\n");
					
					switch(option3)
					{
						case 1:
							
							System.out.println("-------------------------------------");
							System.out.println("   You have selected Booking Parcel  ");
							System.out.println("-------------------------------------");
							
							System.out.print("Enter id to verify the customer: ");
							int id1 = sc.nextInt();
							
							Customer c1 = Courier.searchCustomer(id1);
							
							if(c1 != null)
							{
								System.out.println("*** Customer Verified  ***");
								
								Parcel a = null;
								
								System.out.println("There are two Types of Parcels...");
								System.out.println("Which one do you want?");
								System.out.println("\t1. Documents type Parcel");
								System.out.println("\t2. Product type Parcel");
								System.out.println("\t3. Go back");
								
								System.out.println("\n====================================");
								System.out.print("Enter your type: ");
								int type = sc.nextInt();
								System.out.println("====================================\n");
								
								
								if(type == 1)
								{
									System.out.print("Enter Parcel Number: ");
									String an = sc.next();
									System.out.print("Enter Charge: ");
									double b = sc.nextDouble();
									System.out.print("Sizee(inc): ");
									double ir = sc.nextDouble();

									Documents sa = new Documents(an, c1, b, ir);
									a = sa;
								}
								else if(type == 2)
								{
									System.out.print("Enter Parcel Number: ");
									String an = sc.next();
									System.out.print("Enter Charge: ");
									double b = sc.nextDouble();
									System.out.print("Weight(kg): ");
									int ty = sc.nextInt();

									Product fa = new Product(an, c1, b, ty);
									a = fa;
								}
								else if(type == 3)
								{
									System.out.println("-------------------------------------");
									System.out.println("            Going Back....           ");
									System.out.println("-------------------------------------");
								}
								else
								{
									System.out.println("-------------------------------------");
									System.out.println("    Invalid Type... Going Back....   ");
									System.out.println("-------------------------------------");
								}
								
								if(a != null)
								{
									if(Courier.insertParcel(a))
									{
										System.out.println("***  Parcel Booked, Parcel Number: " + a.getParcelNumber());
									}
									else
									{
										System.out.println("***  Parcel NOT Booked, Parcel Number: " + a.getParcelNumber());
									}
								}
							}
							else
							{
								System.out.println("*** Invalid Customer, Can NOT Create Parcel  ****");
							}
							
							
							break;
							
						case 2:
							
							System.out.println("--------------------------------------");
							System.out.println("You have selected Cancel Booked Parcel");
							System.out.println("--------------------------------------");
							
							System.out.print("Enter the Parcel Number to Cancel: ");
							String dpid2 = sc.next();
							
							Parcel dp2 = Courier.searchParcel(dpid2);
							
							if(dp2 != null)
							{
								System.out.println("*** Parcel Found  ****");
								
								if(Courier.removeParcel(dp2))
								{
									System.out.println("*** Parcel Cancel, id: " + dp2.getParcelNumber() + " ***");
								}
							}
							else
							{
								System.out.println("*** Parcel NOT Found and CAN NOT Cancel  ****");
							}
							
							break;
							
						case 3:
							
							System.out.println("-------------------------------------");
							System.out.println("   You have selected Search Parcel   ");
							System.out.println("-------------------------------------");
							
							System.out.print("Enter the ID to search a Parcel: ");
							String ParcelNumber33 = sc.next();
							
							Parcel p3 = Courier.searchParcel(ParcelNumber33);
							
							if(p3 != null)
							{
								System.out.println("*** Parcel Found  ****");
								p3.showDetails();
							}
							else
							{
								System.out.println("*** Parcel NOT Found  ****");
							}
							
	
							
							
							break;
							
						case 4:
							
							System.out.println("-------------------------------------");
							System.out.println(" You have selected Show All Parcels  ");
							System.out.println("-------------------------------------");
							
							Courier.showAllParcels();
							
							break;
							
						case 5:
							
							System.out.println("-------------------------------------");
							System.out.println("              Going Back....         ");
							System.out.println("-------------------------------------");
							
							break;
							
						default:
							
							System.out.println("-------------------------------------");
							System.out.println("  Invalid Option... Going Back....   ");
							System.out.println("-------------------------------------");
							
							break;
					}
					
					break;
					
				case 4:
				
					System.out.println("-------------------------------------");
					System.out.println("           Parcel Operation          ");
					System.out.println("-------------------------------------");
				
					System.out.println("What do you want to do?\n");

					System.out.println("\t1. Deliver Parcel");
					System.out.println("\t2. Show Parcel History");
					System.out.println("\t3. Go Back");
					
					System.out.println("\n====================================");
					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();
					System.out.println("====================================\n");
					
					switch(option4)
					{
						case 1:
							
							System.out.println("-------------------------------------");
							System.out.println("  You have selected Delivery Parcel  ");
							System.out.println("-------------------------------------");
							
							System.out.print("Enter Parcel Number for verification: ");
							String an2 = sc.next();
							
							Parcel a2 = Courier.searchParcel(an2);
							
							if(a2 != null)
							{
								System.out.println("*** Parcel Verified  ***");
								System.out.println("Parcel Sender Name  : " + a2.getCustomer().getSName());
								System.out.println("Parcel Receiver Name: " + a2.getCustomer().getRName());
								
								System.out.println("Parcel Charge (For One): " + a2.getCharge());

								System.out.print("Delivery Charge (For one): ");
								double am = sc.nextDouble();
								
								if(a2.Receive(am))
								{
									System.out.println("====  Delivery Sucessfull  ====");
									System.out.println("Status: " + a2.getCharge() + " tk paid.");
									frwd.writeInFile(" Received percel Number " + a2.getParcelNumber());
								}
								else
								{
									System.out.println("===  Delivery Failed  ===");
								}								
							}
							else
							{
								System.out.println("***  Invalid Parcel, Can NOT Deliver  ***");
							}
							
							break;
							
						case 2:
							
							
							System.out.println("-------------------------------------");
							System.out.println("You have selected Parcel History");
							System.out.println("-------------------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 3:
							
							System.out.println("-------------------------------------");
							System.out.println("Going Back....");
							System.out.println("-------------------------------------");
							
							break;
				
						
							
						default:
							
							System.out.println("-------------------------------------");
							System.out.println("Invalid Option... Going Back....");
							System.out.println("-------------------------------------");
							
							break;
					}
						
					break;
					
				case 5:
					
					System.out.println("-------------------------------------");
					System.out.println("You have selected Courier Information");
					System.out.println("-------------------------------------");
					
					Courier.showDetails();
					
					break;
					
				case 6:
					
					System.out.println("-------------------------------------");
					System.out.println("Thank You For Using Our System");
					System.out.println("=====================================");
					
					repeat = false;
					
					break;
					
				default:
					
					System.out.println("-------------------------------------");
					System.out.println("Invalid Choice... Try Again....");
					System.out.println("-------------------------------------");
					
					break;
			}
		}
	}
}