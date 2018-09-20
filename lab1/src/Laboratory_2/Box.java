package Laboratory_2;

public class Box {
    private double height, length, width;
    public Box(){
     height=1;
     length=1;
     width=1;
    }
    public Box(double newValue){
        height=newValue;
        length=newValue;
        width=newValue;

    }
    public Box(double height, double length, double width){
        this.height=height;
        this.length=length;
        this.width=width;
    }

    public double Area(){
        return 2*(height*length+height*width+ length*width);
    }
    public double Volume()
    {
        return height*length*width;
    }

}
