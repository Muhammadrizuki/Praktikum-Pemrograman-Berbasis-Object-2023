class Cuboid{
    double height;
    double width;
    double length;
    
    double getVolume(){ 
        return height*length*width;

    }
    
}
public class No4 {
    public static void main(String []args){
        Cuboid cuboid=new Cuboid();
        cuboid.height=50;
        cuboid.width=30;
        cuboid.length=3;
        System.out.printf("Volume = %.2f",cuboid.getVolume());
    }
}
