package src;
public class Vehicle extends Engine implements Honkable {

     String model;	
	 String make;
	 int year;
	 int numberOfWheels;
	 int weight;
	 String color;
	 int noOfMails;
	
	
	//*********setter and getter************
	     public String getModel(){
	    	return model;
	    }
	    
	    public void setModel(String model) {
	    	this.model=model;
	    }
	    
	    
	    public String getMake(){
	    	return make;
	    	
	    }
	    
	    public void setMake(String cMake) {
	    	this.make=cMake;
	    	
	    }
		
		
	    
	    public int getYear(){
	    	return year;
	    	
	    }
	    
	    public void setYear(int cYear) {
	    	this.year=cYear;
	    	
	    }
	    public int getnumberOfWheels(){
	    	return numberOfWheels;
	    	
	    }
	    
	    public void setnumberOfWheels(int cnoOfWheel) {
	    	this.numberOfWheels= cnoOfWheel;
	    	
	    }
	    
	    
	    public String getColor(){
	    	return color;
	    	
	    }
	    
	    public void setColor(String cColor) {
	    	this.color=cColor;
	    	
	    }
	    public double getWeight(){
	    	return weight;
	    	
	    }
	    
	    public void setWeight(int cWeight) {
	    	this.weight=cWeight;
	    	
	    }
	    
	    void start() {		 
		   System.out.println("Vehicle Started");
		   
	 }
	
	   void drive(int noOfMails){
		 
		 System.out.println("Elctrice Vehicle driven  : "+ noOfMails +"Mails");
		 
	     }

	   void stop(){
		 
		  System.out.println("Vehicle Stopped");
		 
	   }
	  
	@Override
	public void honk() {
		
		System.out.println("HOnk ! Honk!");
	}
	@Override
	void startEngine() {
		System.out.println("Start Enging");
		
	}
	
 
}
