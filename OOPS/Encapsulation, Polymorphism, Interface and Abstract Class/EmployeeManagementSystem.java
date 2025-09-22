import java.util.*;
abstract class Employee{
    private String employeeId;
    private String name;
    private double baseSalary;
    Employee(String employeeId,String name,double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }
    public String getEmployeeId(){return employeeId;}
    public String getName(){return name;}
    public double getBaseSalary(){return baseSalary;}
    public void setEmployeeId(String id){this.employeeId=id;}
    public void setName(String name){this.name=name;}
    public void setBaseSalary(double s){this.baseSalary=s;}
    public void displayDetails(){
        System.out.println("ID: "+employeeId+" Name: "+name+" BaseSalary: "+baseSalary);
    }
    public abstract double calculateSalary();
}
class FullTimeEmployee extends Employee{
    private double fixedSalary;
    FullTimeEmployee(String id,String name,double baseSalary,double fixedSalary){
        super(id,name,baseSalary);
        this.fixedSalary=fixedSalary;
    }
    public double getFixedSalary(){return fixedSalary;}
    public void setFixedSalary(double s){this.fixedSalary=s;}
    public double calculateSalary(){return getBaseSalary()+fixedSalary;}
}
class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;
    PartTimeEmployee(String id,String name,double baseSalary,int hoursWorked,double hourlyRate){
        super(id,name,baseSalary);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }
    public int getHoursWorked(){return hoursWorked;}
    public void setHoursWorked(int h){this.hoursWorked=h;}
    public double calculateSalary(){return getBaseSalary()+hoursWorked*hourlyRate;}
}
interface Department{
    void assignDepartment(String d);
    String getDepartmentDetails();
}
class DepartmentImpl implements Department{
    private String department;
    public void assignDepartment(String d){this.department=d;}
    public String getDepartmentDetails(){return department==null?"Unassigned":department;}
}
public class EmployeeManagementSystem{
    public static void main(String[] args){
        List<Employee> list=new ArrayList<>();
        FullTimeEmployee f=new FullTimeEmployee("F001","Alice",10000,30000);
        PartTimeEmployee p=new PartTimeEmployee("P001","Bob",2000,80,150);
        list.add(f);list.add(p);
        DepartmentImpl d=new DepartmentImpl();
        d.assignDepartment("Engineering");
        for(Employee e:list){
            e.displayDetails();
            System.out.println("Calculated Salary: "+e.calculateSalary());
            System.out.println("Department: "+d.getDepartmentDetails());
        }
    }
}