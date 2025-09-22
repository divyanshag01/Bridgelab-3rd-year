interface Refuelable{void refuel();}
class Vehicle{
    int maxSpeed;String model;
    Vehicle(int s,String m){maxSpeed=s;model=m;}
}
class ElectricVehicle extends Vehicle{
    ElectricVehicle(int s,String m){super(s,m);}
    void charge(){System.out.println("Charging EV");}
}
class PetrolVehicle extends Vehicle implements Refuelable{
    PetrolVehicle(int s,String m){super(s,m);}
    public void refuel(){System.out.println("Refueling petrol vehicle");}
}
public class VehicleManagement{
    public static void main(String[] args){
        new ElectricVehicle(150,"Tesla").charge();
        new PetrolVehicle(180,"Honda").refuel();
    }
}