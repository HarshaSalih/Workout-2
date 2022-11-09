import java.util.Scanner;
public class Employee
{
    String name;
    int empID;
    String result;
    float ass1,ass2,ass3,total,percentage;
    void calculateTotal(float ass1,float ass2,float ass3)
    {
        total=ass1+ass2+ass3;
        System.out.println("Total : "+total);
    }
    void calculatePercentage(float total)
    {
        percentage=(total/300)*100;
        System.out.println("Percentage : "+percentage);
    }

    public static void main(String[] args)
    {
        Employee e=new Employee();
        System.out.println("Enter three assessment values");
        Scanner sc=new Scanner(System.in);
        e.ass1=sc.nextFloat();
        e.ass2=sc.nextFloat();
        e.ass3=sc.nextFloat();
        if (e.ass1 > 75 && e.ass2 > 75 && e.ass3 > 75)
        {
            System.out.println("Promoted");
        }
        else
        {
            System.out.println("Demoted");
        }
        e.calculateTotal(e.ass1,e.ass2,e.ass3);
        e.calculatePercentage(e.total);

    }
}

