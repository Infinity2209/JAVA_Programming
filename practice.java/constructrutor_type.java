import java.util.Scanner;

class student {
    String name;
    int regno;
    int mark1, mark2, mark3;

    student() {
        name = "Infinity";
        regno = 15424;
        mark1 = 95;
        mark2 = 91;
        mark3 = 96;

    }

    student(String n, int r, int m1, int m2, int m3) {
        name = n;
        regno = r;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;

    }

    student(student s) {
        name = s.name;
        regno = s.regno;
        mark1 = s.mark1;
        mark2 = s.mark2;
        mark3 = s.mark3;

    }

    void display() {
        System.out.println(name + "\t\t" + regno + "\t\t" + mark1 + "\t" + mark2 + "\t" + mark3);

    }
}

public class constructrutor_type {
    public static void main(String[] args) {
        String name;
        int reg, m1, m2, m3;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter Name: ");
            name = s.nextLine();
            System.out.println("Enter Registration Number: ");
            reg = s.nextInt();
            System.out.println("Enter Mark 1: ");
            m1 = s.nextInt();
            System.out.println("Enter Mark 2: ");
            m2 = s.nextInt();
            System.out.println("Enter Mark 3: ");
            m3 = s.nextInt();
            System.out.println("Name\t\tRegno\t\tMark1\tMark2\tMark3");
            student s1=new student();
            student s2=new student(name,reg,m1,m2,m3);
            student s3=new student(s1);
            s1.display();
            s2.display();
            s3.display();

        }
    }

}