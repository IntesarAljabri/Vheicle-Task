package src;

public class Main {

	public static void main(String[] args) {
	ElctriceVehicle  newElctric = new ElctriceVehicle();
	Truck  newTruck = new Truck();
	Car  newCar = new Car();
	
	System.out.println("The Elctrice Vehicle  Data : ");
	newElctric.setModel("Toyota");
	newElctric.setMake("Japan");
	newElctric.setColor("Black");
	newElctric.setYear(2020);
	newElctric.setWeight(65);
	newElctric.setnumberOfWheels(4);
	System.out.println("The Model is : " + newElctric.getModel());
	System.out.println("The Make is : " + newElctric.getMake());
	System.out.println("The Color is : " + newElctric.getColor());
	System.out.println("The Year of make is : " + newElctric.getYear());
	System.out.println("The Weight is  : " +  newElctric.getWeight());
	System.out.println("The Number OF Wheels are : " +newElctric.getnumberOfWheels());
	System.out.println("  \n");
	
	
	System.out.println("The Truck Data : ");
	newTruck.setModel("Nissan");
	newTruck.setMake("KOrya");
	newTruck.setColor("White");
	newTruck.setYear(2019);
	newTruck.setWeight(190);
	newTruck.setnumberOfWheels(7);
	newTruck.setnumberOfAxels(8);
	newTruck.setcapacityInTons(89);
	System.out.println("The Model is : " + newTruck.getModel());
	System.out.println("The Make is : " + newTruck.getMake());
	System.out.println("The Color is : " + newTruck.getColor());
	System.out.println("The Year of make is : " + newTruck.getYear());
	System.out.println("The Weight is  : " +  newTruck.getWeight());
	System.out.println("The Number OF Wheels are : " +newTruck.getnumberOfWheels());
	System.out.println("The numberOfAxels is  : " +  newTruck.getnumberOfAxels());
	System.out.println("The Capacity OF Tons is  : " +newTruck.getcapacityInTons());
	System.out.println();
	

	System.out.println("The Car Data : ");
	newCar.setModel("Luxz");
	newCar.setMake("Italy");
	newCar.setColor("blue");
	newCar.setYear(2021);
	newCar.setWeight(70);
	newCar.setnumberOfWheels(7);
	newCar.setnoOfDoor(4);
	System.out.println("The Model is : " + newCar.getModel());
	System.out.println("The Make is : " + newCar.getMake());
	System.out.println("The Color is : " + newCar.getColor());
	System.out.println("The Year of make is : " + newCar.getYear());
	System.out.println("The Weight is  : " +  newCar.getWeight());
	System.out.println("The Number OF Wheels are : " +newCar.getnumberOfWheels());
	System.out.println("The Number OF Doors are : " +newCar.getnoOfDoor());
	}
}
