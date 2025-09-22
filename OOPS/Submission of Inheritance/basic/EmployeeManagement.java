class Employee{
    String name;int id;double salary;
    Employee(String name,int id,double salary){this.name=name;this.id=id;this.salary=salary;}
    void displayDetails(){System.out.println(name+" "+id+" "+salary);}
}
class Manager extends Employee{
    int teamSize;
    Manager(String n,int i,double s,int t){super(n,i,s);this.teamSize=t;}
    void displayDetails(){System.out.println(name+" "+id+" "+salary+" Team:"+teamSize);}
}
class Developer extends Employee{
    String programmingLanguage;
    Developer(String n,int i,double s,String p){super(n,i,s);this.programmingLanguage=p;}
    void displayDetails(){System.out.println(name+" "+id+" "+salary+" Lang:"+programmingLanguage);}
}
class Intern extends Employee{
    int duration;
    Intern(String n,int i,double s,int d){super(n,i,s);this.duration=d;}
    void displayDetails(){System.out.println(name+" "+id+" "+salary+" Duration:"+duration+" months");}
}
public class EmployeeManagement{
    public static void main(String[] args){
        Employee e1=new Manager("Alice",1,90000,5);
        Employee e2=new Developer("Bob",2,70000,"Java");
        Employee e3=new Intern("Charlie",3,30000,6);
        e1.displayDetails();e2.displayDetails();e3.displayDetails();
    }
}