package com.wipro.eb.entity;

public  class Domestic extends Connection{
	public Domestic(  int currentReading,int previousReading,float[] slabs) {
		super( currentReading,previousReading, slabs);
		
	}
	
	public float computeBill() {
		int tread=currentReading-previousReading;
		float cost=0;
		if(tread>=100)
		{
			cost+=(50)*slabs[0]+(50)*slabs[1]+(tread-100)*slabs[2];
		}
		if(tread>50 && tread<100)
		{
			cost+=(50)*slabs[0]+(tread-50)*slabs[1];
		}
		if(tread<=50)
		{
			cost+=(tread)*slabs[0];
		}
		return cost;
	}

	

}