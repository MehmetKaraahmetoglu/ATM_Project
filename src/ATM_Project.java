import java.util.Scanner;

public class ATM_Project {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int balance = 50;


        while (true) {
            System.out.println("");
            System.out.println("Welcome to Mehmet Bank !");
            System.out.println("1 - Balance inquiry");
            System.out.println("2 - Deposit money into my account");
            System.out.println("3 - Withdraw money");
            System.out.println("4 - Exit");
            System.out.println("Please make your choice...");

            int chosen = scanner.nextInt();

            switch (chosen) {
                case 1:
                    System.out.println("You have in your account " + balance + "$");
                    break;
                case 2:
                    System.out.println("Enter the amount you wish to deposit into your account.");
                    int depositedMoney = scanner.nextInt();
                    System.out.println("You have in your account: " + (balance + depositedMoney) + "$");
                    System.out.println("");
                    balance += depositedMoney;
                    break;
                case 3:
                    System.out.println("Please enter the amount of money you want to withdraw: ");

                    int moneyToWithdraw = 0;
                    moneyToWithdraw = scanner.nextInt();

                    while (moneyToWithdraw > balance) {
                        System.out.println("Insufficient balance! Please try again.");
                        moneyToWithdraw = scanner.nextInt();


                    }

                    System.out.println("You have in your account: " + (balance - moneyToWithdraw) + "$");
                    balance = balance - moneyToWithdraw;


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

