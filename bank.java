import java.util.Scanner;

class Banking {
    static Scanner SC = new Scanner(System.in);
    String name;
    String Account_type;
    int Account_no;
    static float Balance;
    static int opt;
    static void get_data(String name, String Account_type, int Account_no, float Balance) {
        System.out.println("Name of the user:" + name + "\nAccount Type is:" + Account_type + "\nAccount number is:"+ Account_no + "\nAvaiable Balance:" + Balance);
        System.out.println("enter for withdraw(0) or deposite(1)");
        opt = SC.nextInt();
        float amount;
        System.out.println("enter your amount");
        amount = SC.nextInt();
        if (opt == 1) {
            Balance = withdraw(amount);
            System.out.println("your balance is:" + Balance);
        } else if(opt==0) {
            Balance = deposite(amount);
            System.out.println("your balance is:" + Balance);
        }
    }

    static float deposite(float a) {
        Balance = Balance + a;
        return (Balance);
    }

    static float withdraw(float a) {
        if (a > Balance) {
            System.out.println("your balance is insufficient");
            return (Balance);
        } else {
            Balance = Balance - a;
            return (Balance);
        }
    }
}

class bank {
    public static void main(String args[]) {
        try (Scanner SC = new Scanner(System.in)) {
            int acc;
            float balance;
            String name;
            String acc_type;
            System.out.println("Enter the user name");
            name = SC.nextLine();
            System.out.println("Enter the user Account type");
            acc_type = SC.nextLine();
            System.out.println("Enter the user Account number");
            acc = SC.nextInt();
            System.out.println("Enter the user Balance");
            balance = SC.nextFloat();
            Banking.get_data(name, acc_type, acc, balance);
        }
    }
}