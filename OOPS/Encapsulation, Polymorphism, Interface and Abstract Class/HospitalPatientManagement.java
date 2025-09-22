import java.util.*;
abstract class Patient{
    private String patientId;
    private String name;
    private int age;
    Patient(String patientId,String name,int age){
        this.patientId=patientId;
        this.name=name;
        this.age=age;
    }
    public String getPatientId(){return patientId;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getPatientDetails(){return "ID:"+patientId+" Name:"+name+" Age:"+age;}
    public abstract double calculateBill();
}
interface MedicalRecord{
    void addRecord(String record);
    List<String> viewRecords();
}
class InPatient extends Patient implements MedicalRecord{
    private List<String> records=new ArrayList<>();
    private int days;
    private double dailyRate;
    InPatient(String id,String name,int age,int days,double dailyRate){
        super(id,name,age);
        this.days=days;
        this.dailyRate=dailyRate;
    }
    public double calculateBill(){return days*dailyRate+2000;}
    public void addRecord(String record){records.add(record);}
    public List<String> viewRecords(){return records;}
}
class OutPatient extends Patient implements MedicalRecord{
    private List<String> records=new ArrayList<>();
    private double consultationFee;
    OutPatient(String id,String name,int age,double consultationFee){
        super(id,name,age);
        this.consultationFee=consultationFee;
    }
    public double calculateBill(){return consultationFee+200;}
    public void addRecord(String record){records.add(record);}
    public List<String> viewRecords(){return records;}
}
public class HospitalPatientManagement{
    public static void main(String[] args){
        List<Patient> patients=new ArrayList<>();
        InPatient ip=new InPatient("P001","Eve",45,5,3000);
        OutPatient op=new OutPatient("P002","Frank",30,800);
        ip.addRecord("Surgery done");
        op.addRecord("Consultation: Fever");
        patients.add(ip);patients.add(op);
        for(Patient p:patients){
            System.out.println(p.getPatientDetails()+" Bill:"+p.calculateBill());
            if(p instanceof MedicalRecord){
                MedicalRecord m=(MedicalRecord)p;
                System.out.println("Records: "+m.viewRecords());
            }
        }
    }
}