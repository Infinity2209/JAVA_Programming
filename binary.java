import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        try (Scanner SC = new Scanner(System.in)) {
            int binary;
            System.out.println("enter your binary number ");
            binary=SC.nextInt();
            int b,i=0;
            double decimal=0;
            while (binary>0) {
                b=binary%10;
                decimal=decimal+(b*(Math.pow(2, i)));
                binary=binary/10;
                i++;
            }
            System.out.println("your decimal number is "+decimal);
        }
    }
}
