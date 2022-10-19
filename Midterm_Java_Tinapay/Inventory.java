{
	int units;
	String name;
	String measurment;
	public Inventory(String nameIn,String measurmentIn, int unitsIn)
	{
		name=nameIn;
		measurment=measurmentIn;
		units=unitsIn;
 
	}
 
 
	public int getUnits() {
		return units;
	}
 
 
	public void setUnits(int units) {
		this.units = units;
	}
 
 
	public String getName() {
		return name;
	}
 
 
	public void setName(String name) {
		this.name = name;
	}
 
 
	public String getMeasurment() {
		return measurment;
	}
 
 
	public void setMeasurment(String measurment) {
		this.measurment = measurment;
	}
 
 
	public String toString()
	{
	String foodInfo="you have "+units+" "+measurment+" of "+name;
	return foodInfo;
	}
}