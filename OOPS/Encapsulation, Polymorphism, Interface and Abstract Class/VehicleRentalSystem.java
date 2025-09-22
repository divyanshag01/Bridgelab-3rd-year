import java.util.*;
abstract class Vehicle{
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    Vehicle(String vehicleNumber,String type,double rentalRate){
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
    }
    public String getVehicleNumber(){return vehicleNumber;}
    public String getType(){return type;}
    public double getRentalRate(){return rentalRate;}
    public void setRentalRate(double r){this.rentalRate=r;}
    public abstract double calculateRentalCost(int days);
}
interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable{
    private String policyNumber;
    Car(String vehicleNumber,double rate,String policyNumber){
        super(vehicleNumber,"Car",rate);
        this.policyNumber=policyNumber;
    }
    public double calculateRentalCost(int days){return getRentalRate()*days;}
    public double calculateInsurance(){return 500;}
    public String getInsuranceDetails(){return "Policy:"+policyNumber;}
}
class Bike extends Vehicle implements Insurable{
    private String policyNumber;
    Bike(String vehicleNumber,double rate,String policyNumber){
        super(vehicleNumber,"Bike",rate);
        this.policyNumber=policyNumber;
    }
    public double calculateRentalCost(int days){return getRentalRate()*days*0.6;}
    public double calculateInsurance(){return 150;}
    public String getInsuranceDetails(){return "Policy:"+policyNumber;}
}
class Truck extends Vehicle implements Insurable{
    private String policyNumber;
    Truck(String vehicleNumber,double rate,String policyNumber){
        super(vehicleNumber,"Truck",rate);
        this.policyNumber=policyNumber;
    }
    public double calculateRentalCost(int days){return getRentalRate()*days*1.5;}
    public double calculateInsurance(){return 1200;}
    public String getInsuranceDetails(){return "Policy:"+policyNumber;}
}
public class VehicleRentalSystem{
    public static void main(String[] args){
        List<Vehicle> list=new ArrayList<>();
        list.add(new Car("KA01AB1234",2000,"C-POL-001"));
        list.add(new Bike("KA01XY9876",500,"B-POL-002"));
        list.add(new Truck("KA01TR5555",5000,"T-POL-003"));
        for(Vehicle v:list){
            System.out.println(v.getType()+" "+v.getVehicleNumber()+" Rental for 3 days: "+v.calculateRentalCost(3));
            if(v instanceof Insurable){
                Insurable ins=(Insurable)v;
                System.out.println("Insurance: "+ins.getInsuranceDetails()+" Cost: "+ins.calculateInsurance());
            }
        }
    }
}