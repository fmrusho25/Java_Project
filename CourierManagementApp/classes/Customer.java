package classes;
import java.lang.*;

public class Customer
{
	private int id;
	private String Sname;
	private String SphnNumber;
	private String Location;
	private String Rname;
	private String RphnNumber;
	
	public void setid(int id){this.id = id;}
	public void setSName(String Sname){this.Sname = Sname;}
	public void setSPhnNumber(String SphnNumber){this.SphnNumber = SphnNumber;}
	public void setLocation(String Location){this.Location = Location;}
	public void setRName(String Rname){this.Rname = Rname;}
	public void setRPhnNumber(String RphnNumber){this.RphnNumber = RphnNumber;}
	
	public int getid(){return id;}
	public String getSName(){return Sname;}
	public String getSPhnNumber(){return SphnNumber;}
	public String getRName(){return Rname;}
	public String getLocation(){return Location;}
	public String getRPhnNumber(){return RphnNumber;}
	
	public void showDetails()
	{
		System.out.println("Operation ID        : " + id);
		System.out.println("Sender Name         : " + Sname);
		System.out.println("Reciver Name        : " + Rname);
		System.out.println("Reciver Address     : " + Location);
		System.out.println("Sender Phone Number : " + SphnNumber);
		System.out.println("Reciver Phone Number: " + RphnNumber);
		System.out.println();
	}
}