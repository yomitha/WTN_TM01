package com.wipro.eb.entity;

public abstract class Connection {
	protected static int previousReading;
	protected static int currentReading;
	 static float[] slabs;
	public static int getPreviousReading() {
		return previousReading;
	}
	public void setPreviousReading(int previousReading) {
		Connection.previousReading = previousReading;
	}
	public static int getCurrentReading() {
		return currentReading;
	}
	public void setCurrentReading(int currentReading) {
		Connection.currentReading = currentReading;
	}
	
	public Connection( int currentReading,int previousReading, float[] slabs) {
		super();
		this.previousReading = previousReading;
		this.currentReading = currentReading;
		this.slabs = slabs;
	}
	
	

}
