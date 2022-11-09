import java.util.Scanner;
public class Swapping
{
    int temp;
    int fNum,sNum;
    void swap(int fNum,int sNum)
    {
        temp=fNum;
        fNum=sNum;
        sNum=temp;
        System.out.println("After swapping by call by value First number = "+fNum+ " Second number = "+sNum);
    }
    void swap(Swapping s)
    {
        temp=s.fNum;
        s.fNum=s.sNum;
        s.sNum=temp;
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers for swapping ");
        Scanner sc=new Scanner(System.in);
        Swapping s=new Swapping();
        s.fNum=sc.nextInt();
        s.sNum=sc.nextInt();
        s.swap(s.fNum,s.sNum);
        s.swap(s);
        System.out.println("After swapping by call by reference First number = "+s.fNum+ " Second number = "+s.sNum);
    }
}

