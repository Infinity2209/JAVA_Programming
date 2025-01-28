import java.util.Scanner;

public class fabonachi {
    public static void main(String[] args) {
        try (Scanner SC = new Scanner(System.in)) {
            int n,a=0,b=1,temp;
            System.out.println("enter the number upto which you want the fabonachi series");
            n=SC.nextInt();
            System.out.println("your fabonachi numbers are ");
            System.out.println(a);
            for (int i = 0; i < n; i++) {
                temp=a;
                a=a+b;
                b=temp;
                System.out.println(a);
            }
        }
    }
}
