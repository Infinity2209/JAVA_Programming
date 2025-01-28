class shape {
    double L,B;
    shape(double a,double b){
        L=a;
        B=b;
    }
    double area(){
        System.out.println("inside super class area is:"+(L*B));
        return (L*B);
    }
    double perimeter(){
        System.out.println("inside super class perimeter is:"+(2*(L+B)));
        return (2*(L+B));
    }
}
class rectangle extends shape{
    rectangle(double a, double b) {
        super(a, b);
    }
    double area(){
        System.out.println("inside the rectangle class");
        return (L*B);
    }
    double perimeter(){
        return (2*(L+B));
    }
}
class square extends shape{
    square(double a){
        super(a,a);
    }
    double area(){
        System.out.println("inside the square class");
        return (L*L);
    }
    double perimeter(){
        return (4*L);
    }

}
class tringle extends shape{
    double s3;
    tringle(double a,double b,double c){
        super(a,b);
        s3=c;
    }
    double area(){
        System.out.println("inside the tringle class");
        return ((0.5)*L*B);
    }
    double perimeter(){
        return (L+B+s3);
    }
}
public class overriding {
    public static void main(String[] args) {
      rectangle r1=new rectangle(10,30);
      tringle t1=new tringle(2,3,5);
      square sq=new square(50);
    //   shape ref1=sq;
    //   shape ref2=r1;
    //   shape ref3=t1;
      System.out.println("the area of the square is:"+sq.area()); 
      System.out.println("the perimeter of the square is:"+sq.perimeter()); 
      System.out.println("the area of the rectangle is:"+r1.area()); 
      System.out.println("the perimeter of the rectangle is:"+r1.perimeter());
      System.out.println("the area of the triangle is:"+t1.area());
      System.out.println("the perimeter of the triangle is:"+t1.perimeter());
    }
}
