package com.wipro.eb.service;

import com.wipro.eb.entity.Commercial;
import com.wipro.eb.entity.Domestic;
import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;

public class ConnectionService {
	public boolean validate(int currentReading, int previousReading, String type) throws InvalidReadingException, InvalidConnectionException 
	{
		int n=0;
		if(currentReading<previousReading || currentReading<0 || previousReading<0)
		{
			n+=1;
			throw new InvalidReadingException();
		}
		else
		{
			
		}
		if(type.equals("Domestic") || type.equals("Commercial"))
		{
			
		}
		else
		{
			n+=1;
			throw new InvalidConnectionException();
		}
		if(n!=0)
		{
			return false;
		}
		return true;
		
	}
	public float calculateBillAmt(int currentReading, int previousReading, String type)  
	{
		float bill = 0;
		try {
			validate(currentReading, previousReading, type);
			if(type.equals("Domestic"))
			{
				float[] Slabs= {2.3f,4.2f,5.5f};
				Domestic d=new Domestic(currentReading, previousReading,Slabs);
				bill=d.computeBill();
			}
			if(type.equals("Commercial"))
			{
				float[] Slabs= {5.2f,6.8f,8.3f};
				Commercial c=new Commercial(currentReading, previousReading,Slabs);
				bill=c.computeBill();
			}
		} 
		catch (InvalidReadingException e) {
			e.toString();
			return -1;
		}
        catch (InvalidConnectionException e) {
			
        	e.toString();
        	return -2;
		}
		return bill;
		
	}
	public String generateBill(int currentReading, int previousReading, String type) 
	{
		float r=calculateBillAmt(currentReading, previousReading, type);
		if(r==-1)
		{
			return "Incorrect Reading";
		}
		else if(r==-2)
		{
			return "Invalid ConnectionType";
		}
		else
		{
			return "Amount to be paid: "+r;
		}
		
		
	}
}
