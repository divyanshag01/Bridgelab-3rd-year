class Device{
    String deviceId;String status;
    Device(String d,String s){deviceId=d;status=s;}
    void displayStatus(){System.out.println(deviceId+" "+status);}
}
class Thermostat extends Device{
    int temperatureSetting;
    Thermostat(String d,String s,int t){super(d,s);temperatureSetting=t;}
    void displayStatus(){System.out.println(deviceId+" "+status+" Temp:"+temperatureSetting);}
}
public class SmartHome{
    public static void main(String[] args){
        Thermostat t=new Thermostat("T100","On",22);
        t.displayStatus();
    }
}