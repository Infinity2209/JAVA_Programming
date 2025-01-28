import java.util.Scanner;

public class roots {
    public static void main(String[] args) {
        try (Scanner SC = new Scanner(System.in)) {
            int a, b, c, D;
            System.out.println("enter your coefficients a,b and c");
            a = SC.nextInt();
            b = SC.nextInt();
            c = SC.nextInt();
            D = (b*b) - (4 * a * c);
            if (D == 0) {
                System.out.println("your roots are equal and root is " + (-b / (2 * a)));
            } 
            else if (D > 0) {
                System.out.println("your roots are real and roots are " + ((-b + Math.sqrt(D)) / (2 * a)+" ")
                        + ((-b - Math.sqrt(D)) / (2 * a)));
            } 
            else {
                System.out.println("your roots are not real or imaginary");
            }
        }
    }
}
