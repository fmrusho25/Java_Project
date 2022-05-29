package classes;

import java.lang.*;
import interfaces.ParcelProcessing;

public abstract class Parcel implements ParcelProcessing
{	
	private String ParcelNumber;
	private double Charge;
	private Customer customer;
	
	public Parcel(){ }
	public Parcel(String ParcelNumber, Customer customer, double Charge)
	{
		this.ParcelNumber = ParcelNumber;
		this.customer = customer;
		this.Charge = Charge;
	}
	
	public void setParcelNumber(String ParcelNumber)
	{ this.ParcelNumber = ParcelNumber; }
	public void setCustomer(Customer customer)
	{	this.customer = customer;}
	public void setCharge(double Charge)
	{	this.Charge = Charge;	}
	
	public String getParcelNumber()
	{	return ParcelNumber;}
	public Customer getCustomer()
	{	return customer;}
	public double getCharge()
	{	return Charge;}
	
	public abstract void showDetails();
	
	public boolean Booking(double Quantity)
	{
		if(Quantity>0)
		{
			Charge = Charge + Quantity;
			return true;
		}
		return false;
	}
	public boolean Receive(double Quantity)
	{
		if(Quantity== Charge)
		{
			return true;
		}
		return false;
	}
}