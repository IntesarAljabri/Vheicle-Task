package src;

public class ElctriceVehicle extends Vehicle{
	
	int batteryCapacity;
	int chargeLevel;
	
	
	
	//******setter and getter*************
	public int getchargeLevel(){
    	return chargeLevel;
    	
    }
    
    public void setchargeLevel(int chargeLevel) {
    	this.chargeLevel=chargeLevel;
    	
    }
	
    
    public int getbatteryCapacity(){
    	return batteryCapacity;
    	
    }
    
    public void setbatteryCapacity(int batteryCapacity) {
    	this.batteryCapacity=batteryCapacity;
    	
    }
    
    
    
    
    
	void charge() {
		System.out.println("Charge level is   :" + chargeLevel  );
		
	}
	

}
