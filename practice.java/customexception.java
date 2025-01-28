import java.util.Scanner;

class outoffullmarkException extends Exception{
    private int m;
    outoffullmarkException(int a){
        m=a;
    }
    public String tostString(){
        return "outoffullmarkException("+m+")";

    }
}
public class customexception {
    public static void main(String[] args) {
        int x,y;
        try {
            System.out.println("enter your marks");
            try (Scanner s = new Scanner(System.in)) {
                x=s.nextInt();
                y=s.nextInt();
            }
            if (y>100) {
                throw new outoffullmarkException(y);
            }
            else if (x>100) {
                throw new outoffullmarkException(x);
            }
            else {
                System.out.println("Total marks="+(x+y));
            }
        } catch (outoffullmarkException e) {
            System.out.println("enter correct marks");
            
        }

    }
}
