class Course{
    String courseName;int duration;
    Course(String n,int d){courseName=n;duration=d;}
}
class OnlineCourse extends Course{
    String platform;boolean isRecorded;
    OnlineCourse(String n,int d,String p,boolean r){super(n,d);platform=p;isRecorded=r;}
}
class PaidOnlineCourse extends OnlineCourse{
    double fee;double discount;
    PaidOnlineCourse(String n,int d,String p,boolean r,double f,double dis){super(n,d,p,r);fee=f;discount=dis;}
}
public class CourseHierarchy{
    public static void main(String[] args){
        PaidOnlineCourse c=new PaidOnlineCourse("Java",30,"Udemy",true,100,10);
        System.out.println(c.courseName+" "+c.platform+" "+c.fee);
    }
}