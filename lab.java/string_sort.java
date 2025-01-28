public class string_sort {
    static String name[]={"madrass","bombay","delhi","cuttak"};
    public static void main(String[] args) {
        int size=name.length;
        String temp=null;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((name[i]).compareTo(name[j])<0) {
                    temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(name[i]);
        }
    }
}
