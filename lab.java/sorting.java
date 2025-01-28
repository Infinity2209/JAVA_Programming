import java.util.Scanner;
public class sorting {
    static void bubblesort(int a[])
    {
        int i,j,temp,n;
        n=a.length;
        System.out.println("sorting elements are");
        for(i=0;i<n;i++)
        {
            // System.out.println(a[i]);
            for(j=0;j<n-1;j++)
            {
              if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    
    }
    public static void main(String args[]) {
        try (Scanner SC = new Scanner(System.in)) {
            int arr[]=new int[6];
            //int n=6;
            System.out.println("enter your array");
            for(int i=0; i<6;i++){
                arr[i]=SC.nextInt();
            }
            bubblesort(arr);
            for(int i=0;i<6;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
