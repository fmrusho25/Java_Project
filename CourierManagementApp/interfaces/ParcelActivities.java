package interfaces;
import java.lang.*;
import classes.Parcel;

public interface ParcelActivities
{
	boolean insertParcel(Parcel a);
	boolean removeParcel(Parcel a);
	Parcel searchParcel(String ParcelNumber);
	void showAllParcels();
}