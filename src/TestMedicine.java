class Medicine
{
    String name="abc company";
    String address="xyz building,New Delhi,India,254861";
    void  displayLabel()
    {
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
    }
}
class Tablet extends Medicine
{
    void  displayLabel()
    {
        System.out.println("Store in a cool dry place");
    }
}
class Syrup extends Medicine
{
    void  displayLabel()
    {
        System.out.println("Keep the medicine out of reach of children");
    }
}
class Ointment extends Medicine
{
    void  displayLabel()
    {
        System.out.println("For external use only");
    }
}
public class TestMedicine {
    public static void main(String[] args)
    {
        double j=Math.random()*4;
        int k=(int)j;
        switch (k)
        {
            case 1:
                Medicine m1=new Medicine();
                Tablet t=new Tablet();
                m1.displayLabel();
                t.displayLabel();
                break;
            case 2:
                Medicine m2=new Medicine();
                Syrup s=new Syrup();
                m2.displayLabel();
                s.displayLabel();
                break;
            case 3:
                Medicine m3=new Medicine();
                Ointment o=new Ointment();
                m3.displayLabel();
                o.displayLabel();
                break;
        }

    }
}
