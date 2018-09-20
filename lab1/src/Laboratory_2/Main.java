package Laboratory_2;

public class Main {
    public static void main (String[] args)
    {
        Box Box_1= new Box();
        Box Box_2= new Box(3);
        Box Box_3= new Box(4,6,8);
        System.out.println("Area_Surface_1="+ Box_1.Area());
        System.out.println("Area_Surface_2=" + Box_2.Area());
        System.out.println("Area_Surface_3=" + Box_3.Area() );
        System.out.println("Volume_1=" +Box_1.Volume());
        System.out.println("Volume_2=" +Box_2.Volume());
        System.out.println("Volume_3=" +Box_3.Volume());


    }
}
