package classes;

import java.lang.*;
import interfaces.*;

public class Courier implements ParcelActivities, EmployeeOperations, CustomerOperations
{
	private String name;
	private String branchName;
	private Parcel Parcels[] = new Parcel [1000];
	private Customer customers[] = new Customer [500];
	private Employee employees[] = new Employee [100];
	
	public Courier(){}
	public Courier(String name, String branchName)
	{
		this.name = name;
		this.branchName = branchName;
	}
	
	public void setName(String name){this.name = name;}
	public void setBranchName(String branchName){this.branchName = branchName;}
	
	public String getName(){return name;}
	public String getBranchName(){return branchName;}

	public boolean insertParcel(Parcel a)
	{
		for(int i=0; i<Parcels.length; i++)
		{
			if(Parcels[i] == null)
			{
				Parcels[i] = a;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeParcel(Parcel a)
	{
		for(int i=0; i<Parcels.length; i++)
		{
			if(Parcels[i] == a)
			{
				Parcels[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Parcel searchParcel(String ParcelNumber)
	{
		for(int i=0; i<Parcels.length; i++)
		{
			if(Parcels[i] != null)
			{
				if(Parcels[i].getParcelNumber().equals(ParcelNumber))
				{
					return Parcels[i];
				}
			}
		}
		return null;
	}
	
	public void showAllParcels()
	{
		for(int i=0; i<Parcels.length; i++)
		{
			if(Parcels[i] != null)
			{
				Parcels[i].showDetails();
			}
		}
	}
	
	
	public boolean insertCustomer(Customer c)
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == null)
			{
				customers[i] = c;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeCustomer(Customer c)
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == c)
			{
				customers[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Customer searchCustomer(int nid)
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				if(customers[i].getid() == nid)
				{
					return customers[i];
				}
			}
		}
		return null;
	}
	
	public void showAllCustomers()
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				customers[i].showDetails();
			}
		}
	}
	
	public boolean insertEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Employee searchEmployee(String empId)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					return employees[i];
				}
			}
		}
		return null;
	}
	
	public void showAllEmployees()
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				employees[i].showDetails();
			}
		}
	}
	
	public void showDetails()
	{
		System.out.println("Courier Name: " + name);
		System.out.println("Courier Branch: " + branchName);
		System.out.println("//////////////////////////////////");
		System.out.println("### List of Parcels ###");
		this.showAllParcels();
		System.out.println("//////////////////////////////////");
		System.out.println();
		System.out.println("### List of Employees ###");
		this.showAllEmployees();
		System.out.println("//////////////////////////////////");
		
	}	
}