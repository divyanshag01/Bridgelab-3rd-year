class Person{
    String name;int age;
    Person(String n,int a){name=n;age=a;}
}
class Teacher extends Person{
    String subject;
    Teacher(String n,int a,String s){super(n,a);subject=s;}
    void displayRole(){System.out.println("Teacher "+subject);}
}
class Student extends Person{
    int grade;
    Student(String n,int a,int g){super(n,a);grade=g;}
    void displayRole(){System.out.println("Student Grade:"+grade);}
}
class Staff extends Person{
    String role;
    Staff(String n,int a,String r){super(n,a);role=r;}
    void displayRole(){System.out.println("Staff "+role);}
}
public class SchoolSystem{
    public static void main(String[] args){
        new Teacher("Alice",30,"Math").displayRole();
        new Student("Bob",15,10).displayRole();
        new Staff("Charlie",40,"Clerk").displayRole();
    }
}