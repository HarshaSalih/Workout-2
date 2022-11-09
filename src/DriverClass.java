class Faculty
{
    int facultyId;
    float salary;
}
class FullTimeFaculty extends Faculty
{
    float basic;
    float allowance;
    void method(int facultyId,float basic,float allowance)
    {
        this.facultyId=facultyId;
        this.salary=basic+allowance;
    }
    void display()
    {
        System.out.println("Faculty id : "+facultyId);
        System.out.println("Salary : "+salary);
    }
}
class PartTimeFaculty extends Faculty
{
    float hour;
    float rate;
    void method(int facultyId,float hour,float rate)
    {
        this.facultyId=facultyId;
        this.salary=hour*rate;
    }
    void display()
    {
        System.out.println("Faculty id : "+facultyId);
        System.out.println("Salary : "+salary);
    }
}
public class DriverClass {
    public static void main(String[] args) {
        FullTimeFaculty ft1=new FullTimeFaculty();
        FullTimeFaculty ft2=new FullTimeFaculty();
        PartTimeFaculty pt1=new PartTimeFaculty();
        PartTimeFaculty pt2=new PartTimeFaculty();
        ft1.method(101,15000,7000);
        ft2.method(102,20000,9000);
        ft1.display();
        ft2.display();
        pt1.method(103,40,800);
        pt2.method(104,35, 700);
        pt1.display();
        pt2.display();
    }
}
