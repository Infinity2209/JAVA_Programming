class box{
    private double width;
    private double height;
    private double depth;
    box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    void volume(){
        System.out.println("the volume of the box is:"+(width*depth*height));
    }
}
class box1 extends box{
    double weight;
    box1(double w,double d,double h,double wt){
        super(w, h, d);
        weight =wt;
        System.out.println("the weight of the box is "+wt);
    }

}
class box2 extends box1{
    double cost;
    box2(double w,double d,double h,double wt,double c){
        super(w, h, d,wt);
        cost=c;
        System.out.println("the cost of the box is "+cost);
    }
}
public class MLTest {
    public static void main(String[] args) {
        System.out.println("for box 1");
        box2 b1=new box2(20,5,10,110, 220);
        b1.volume();
        System.out.println("for box 2");
        box2 b2=new box2(10,11,20,200,550);
        b2.volume();
    }
}
