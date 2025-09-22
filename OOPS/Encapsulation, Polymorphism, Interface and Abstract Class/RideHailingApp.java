import java.util.*;
abstract class VehicleRide{
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    VehicleRide(String vehicleId,String driverName,double ratePerKm){
        this.vehicleId=vehicleId;
        this.driverName=driverName;
        this.ratePerKm=ratePerKm;
    }
    public String getVehicleId(){return vehicleId;}
    public String getDriverName(){return driverName;}
    public double getRatePerKm(){return ratePerKm;}
    public String getVehicleDetails(){return "ID:"+vehicleId+" Driver:"+driverName+" RatePerKm:"+ratePerKm;}
    public abstract double calculateFare(double distance);
}
interface GPS{
    String getCurrentLocation();
    void updateLocation(String loc);
}
class CarRide extends VehicleRide implements GPS{
    private String location="Unknown";
    CarRide(String id,String driver,double rate){super(id,driver,rate);}
    public double calculateFare(double distance){return getRatePerKm()*distance;}
    public String getCurrentLocation(){return location;}
    public void updateLocation(String loc){location=loc;}
}
class BikeRide extends VehicleRide implements GPS{
    private String location="Unknown";
    BikeRide(String id,String driver,double rate){super(id,driver,rate);}
    public double calculateFare(double distance){return getRatePerKm()*distance*0.7;}
    public String getCurrentLocation(){return location;}
    public void updateLocation(String loc){location=loc;}
}
class AutoRide extends VehicleRide implements GPS{
    private String location="Unknown";
    AutoRide(String id,String driver,double rate){super(id,driver,rate);}
    public double calculateFare(double distance){return getRatePerKm()*distance*0.8;}
    public String getCurrentLocation(){return location;}
    public void updateLocation(String loc){location=loc;}
}
public class RideHailingApp{
    public static void main(String[] args){
        List<VehicleRide> rides=new ArrayList<>();
        CarRide c=new CarRide("V001","Gopi",15);
        BikeRide b=new BikeRide("V002","Hira",8);
        AutoRide a=new AutoRide("V003","Irfan",10);
        rides.add(c);rides.add(b);rides.add(a);
        for(VehicleRide r:rides){
            r.updateLocation("StartPoint");
            System.out.println(r.getVehicleDetails()+" Fare for 10km: "+r.calculateFare(10)+" Location:"+((GPS)r).getCurrentLocation());
        }
    }
}