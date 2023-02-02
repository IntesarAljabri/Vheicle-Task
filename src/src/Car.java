package src;

public class Car extends Vehicle{
	int noOfDoor;
	 
	
	
	
	
	public int getnoOfDoor(){
    	return noOfDoor;
    	
    }
    
    public void setnoOfDoor(int noOfDoor) {
    	this.noOfDoor=noOfDoor;
    	
    }
	
	void openTrunk() {
		
		System.out.println("Trunk Open");
	}
	
	
	

}
