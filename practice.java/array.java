import java.util.Scanner;
class student{
    long Regno;
    String Name;
    String Dept;
    long Shift;
    student(long Id, String N, String Br, long sh){
        Regno= Id;
        Name=N;
        Dept=Br;
        Shift=sh;
    }
    void display(){
        System.out.println(Regno+"\t"+Name+"\t"+Dept+"\t"+Shift+"\t");

    }
}
public class array {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the Number of students: ");
            int n=s.nextInt();
            student[] Su=new student[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the detail of the student no:"+(i+1));
                System.out.println("Registration no.: ");
                long No= s.nextLong();
                System.out.println("Name: ");
                String Nm=s.next();
                System.out.println("Department: ");
                String Br=s.next();
                System.out.println("Shift: ");
                long sh=s.nextLong();
                Su[i]=new student(No,Nm,Br,sh);

            }
            System.out.println("\nRegno"+"\tName"+"\tDept"+"\tShift");
            for (int i = 0; i < n; i++) {
                Su[i].display();
            }
        }
    }
}
