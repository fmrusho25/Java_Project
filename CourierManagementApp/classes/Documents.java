package classes;

import java.lang.*;

public class Documents extends Parcel
{
	private double Size;
	
	public Documents(){}
	public Documents(String ParcelNumber, Customer customer, double Charge, double Size)
	{
		super(ParcelNumber, customer, Charge);
		this.Size = Size;
	}
	
	public void setSize(double Size){this.Size = Size;}
	public double getSize(){return Size;}
	
	public void showDetails()
	{
		System.out.println("**** Parcel Information ****");
		this.getCustomer().showDetails();
		System.out.println("Parcel Number: " + this.getParcelNumber());
		System.out.println("Parcel Charge: " + this.getCharge());
		System.out.println("Parcel size (inc): " + Size);
		System.out.println();
	}
}