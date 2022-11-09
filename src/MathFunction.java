import java.util.Scanner;
class MathFunction
{
    int inum1,inum2,inum4;
    float fnum1,fnum2,fnum3;
    void multiply(int inum1,int inum2)
    {
        System.out.println("Result : "+inum1 * inum2);
    }
    void multiply(float fnum1,float fnum2)
    {
        System.out.println("Result : "+fnum1 * fnum2);
    }
    void multiply(float fnum3,int inum4)
    {
        System.out.println("Result : "+fnum3 * inum4);
    }
    public static void main(String[] args) {
        MathFunction m = new MathFunction();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integer values");
        m.inum1=sc.nextInt();
        m.inum2=sc.nextInt();
        m.multiply(m.inum1,m.inum2);
        System.out.println("Enter two float values");
        m.fnum1=sc.nextFloat();
        m.fnum2=sc.nextFloat();
        m.multiply(m.fnum1,m.fnum2);
        System.out.println("Enter one float and one integer values");
        m.fnum3=sc.nextFloat();
        m.inum4=sc.nextInt();
        m.multiply(m.fnum3,m.inum4);
    }
}

