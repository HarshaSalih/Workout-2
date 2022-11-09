import java.util.Scanner;
class Tile
{
    float edgeLength;
}
class Floor {
    float length;
    float width;
    int totalNumberOfTiles;
    void totalTiles(Tile t)
    {
        float floorArea = length * width;
        float tileArea = t.edgeLength * t.edgeLength;
        totalNumberOfTiles = (int)(floorArea / tileArea);
    }
}
public class TilesNumber
{
    public static void main(String[] args)
    {
        System.out.println("Enter edgeLength,length,width");
        Scanner sc=new Scanner(System.in);
        Tile t = new Tile();
        t.edgeLength=sc.nextFloat();
        Floor f=new Floor();
        f.length=sc.nextFloat();
        f.width=sc.nextFloat();
        f.totalTiles(t);
        System.out.println("Total number of tiles required : "+f.totalNumberOfTiles);
    }
}
