class Vehicle{
    int maxSpeed;String fuelType;
    Vehicle(int s,String f){maxSpeed=s;fuelType=f;}
    void displayInfo(){System.out.println("Speed:"+maxSpeed+" Fuel:"+fuelType);}
}
class Car extends Vehicle{
    int seatCapacity;
    Car(int s,String f,int c){super(s,f);this.seatCapacity=c;}
    void displayInfo(){System.out.println("Car "+maxSpeed+" "+fuelType+" Seats:"+seatCapacity);}
}
class Truck extends Vehicle{
    int loadCapacity;
    Truck(int s,String f,int l){super(s,f);this.loadCapacity=l;}
    void displayInfo(){System.out.println("Truck "+maxSpeed+" "+fuelType+" Load:"+loadCapacity);}
}
class Motorcycle extends Vehicle{
    boolean hasGear;
    Motorcycle(int s,String f,boolean g){super(s,f);this.hasGear=g;}
    void displayInfo(){System.out.println("Motorcycle "+maxSpeed+" "+fuelType+" Gear:"+hasGear);}
}
public class VehicleTransport{
    public static void main(String[] args){
        Vehicle[] v={new Car(180,"Petrol",5),new Truck(120,"Diesel",10000),new Motorcycle(150,"Petrol",true)};
        for(Vehicle x:v)x.displayInfo();
    }
}