package classes;

import java.lang.*;

public class Product extends Parcel
{
	private float Weight;
	
	public Product(){}
	public Product(String ParcelNumber, Customer customer, double Charge, int Weight)
	{
		super(ParcelNumber, customer, Charge);
		this.Weight = Weight;
	}
	
	public void setWeight(float Weight){this.Weight = Weight;}
	public float getWeight(){return Weight;}
	
	public void showDetails()
	{
		System.out.println("**** Parcel Information ****");
		this.getCustomer().showDetails();
		System.out.println("Parcel Number: " + this.getParcelNumber());
		System.out.println("Parcel Charge: " + this.getCharge());
		System.out.println("Parcel Weight(kg): " + Weight);
		System.out.println();
	}
}