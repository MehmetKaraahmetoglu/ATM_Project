import java.util.Scanner;

public class ATM_Project {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bakiye = 50;


        while (true) {
            System.out.println("");
            System.out.println("Welcome to Mehmet Bank !");
            System.out.println("1 - Balance inquiry");
            System.out.println("2 - Deposit money into my account");
            System.out.println("3 - Withdraw money");
            System.out.println("4 - Exit");
            System.out.println("Please make your choice...");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("You have in your account " + bakiye + "$");
                    break;
                case 2:
                    System.out.println("Enter the amount you wish to deposit into your account.");
                    int yatirilanPara = scanner.nextInt();
                    System.out.println("You have in your account: " + (bakiye + yatirilanPara) + "$");
                    System.out.println("");
                    bakiye += yatirilanPara;
                    break;
                case 3:
                    System.out.println("Please enter the amount of money you want to withdraw: ");

                    int istenenPara = 0;
                    istenenPara = scanner.nextInt();

                    while (istenenPara > bakiye) {
                        System.out.println("Insufficient balance! Please try again.");
                        istenenPara = scanner.nextInt();


                    }

                    System.out.println("You have in your account: " + (bakiye - istenenPara) + "$");
                    bakiye = bakiye - istenenPara;


                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Checking out, please don't forget to get your card!");
                    System.out.println("");
                    System.exit(0);
                default:
                    System.out.println("You made an incorrect keystroke, please try again.");
                    System.out.println("");
                    break;
            }
        }

    }

}

