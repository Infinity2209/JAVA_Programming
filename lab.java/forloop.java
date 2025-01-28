import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a[]={1,5,1,4,2};
            for(int i:a){
                System.out.println(a[i]);
            }
        }
    }
}
