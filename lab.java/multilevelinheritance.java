import java.util.Scanner;
class student{
    String Name;
    int Rollno;
    student(String n,int r){
        Name=n;
        Rollno=r;
    }
}
interface sports{
    float sport_wt=6.0f;
    void putwt();
}
class test extends student{
    test(String n, int r) {
        super(n, r);
    }
    float mark1,mark2;
    void get_mark(float m1,float m2){
        mark1=m1;
        mark2=m2;
    }
}
class result extends test implements sports{
    result(String n, int r) {
        super(n, r);
    }
    public void putwt(){
        System.out.println("Sports weightage is:"+sport_wt);
    }
    void display(){
        float total;
        total=mark1+mark2+sport_wt;
        System.out.println("Name of the student:"+Name);
        System.out.println("Roll no of the student:"+Rollno);
        System.out.println("Total marks of the student:"+total);

    }
}
public class multilevelinheritance {
    public static void main(String[] args) {
        String n;
        int r;
        float m1,m2;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the student name\n");
            n=s.nextLine();
            System.out.println("Enter the student roll no\n");
            r=s.nextInt();
            System.out.println("enter the marks of the student\n");
            m1=s.nextFloat();
            m2=s.nextFloat();
        }
        result s1=new result(n,r);
            s1.get_mark(m1, m2);
            s1.display();
    }
}
