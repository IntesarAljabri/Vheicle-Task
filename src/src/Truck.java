package src;

public class Truck extends Vehicle{
	

	int numberOfAxels;
	int capacityInTons;
	int weight;
	
	
	public int getnumberOfAxels(){
    	return numberOfAxels;
    }
    
    public void setnumberOfAxels( int numberOfAxels) {
    	this.numberOfAxels=numberOfAxels;
    }
    
    
    public int getcapacityInTons(){
    	return capacityInTons;
    	
    }
    
    public void setcapacityInTons(int capacityInTons) {
    	this.capacityInTons=capacityInTons;
    	
    }
	
	
	
	void load(int weight) {
		System.out.println("loaded "+ weight + "KG");
		
		
		
		
		
	}
	

}
