public class leap_year {
    public static void main(String[] args) {
        int i;
        System.out.println("the leap years between 1990 to 2023 are ");
        for (i = 1990; i <=2023; i++) {
            if (i%4==0) {
               System.out.println(i);
            }
        }
    }
}
