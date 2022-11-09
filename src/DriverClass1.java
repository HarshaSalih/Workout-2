class OneBHK
{
    float roomArea;
    float hallArea;
    float price;
    OneBHK()
    {

    }
    OneBHK(float roomArea,float hallArea,float price)
    {
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }
    void show()
    {
        System.out.println("Roomarea : "+roomArea);
        System.out.println("Hallarea : "+hallArea);
        System.out.println("Price : "+price);
    }
}
class TwoBHK
{
    float roomArea;
    float hallArea;
    float price;
    float room2Area;
    TwoBHK()
    {

    }
    TwoBHK(float roomArea,float hallArea,float price,float room2Area)
    {
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
        this.room2Area=room2Area;
    }
    void show()
    {
        System.out.println("Roomarea : "+roomArea);
        System.out.println("Hallarea : "+hallArea);
        System.out.println("Price : "+price);
        System.out.println("Room2area : "+room2Area+"\n");
    }
}
public class DriverClass1 {
    public static void main(String[] args) {
        TwoBHK bhk1=new TwoBHK(200,300,10000,220);
        TwoBHK bhk2=new TwoBHK(220,320,12000,240);
        TwoBHK bhk3=new TwoBHK(240,340,14000,260);
        bhk1.show();
        bhk2.show();
        bhk3.show();
        float totalPrice= bhk1.price+ bhk2.price+bhk3.price;
        System.out.println("Total amount : "+totalPrice);
    }
}
