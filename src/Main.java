import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATMOpeartionInterface op = new atmopertionimplementation();
        int atmnumber = 12345;
        int atmpin = 1234;


        Scanner sc = new Scanner(System.in);
        System.out.println("******** WELCOME TO ATM MACHINE ******** ");
        System.out.println("ENTER ATM NUMBER :");


        int atmNumber = sc.nextInt();
        System.out.println("ENTER PIN NUMBER :");
        int pin = sc.nextInt();

        if ((atmnumber == atmNumber) && (atmpin == pin)) {
            System.out.println("validation succesful");

            while (true){

               System.out.println("1.view available balance\n2.withdraw amount\n3.deposit amount\n4.view mini statement\n5.exit");
                System.out.println("enter choice : ");
                int ch = sc.nextInt();

                if (ch==1){
                    op.viewBalance();
                } else if (ch==2) {
                    System.out.println("enter amount to withdraw :");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (ch==3) {
                    System.out.println("enter amount to deposit :");
                    double depositAmont = sc.nextDouble();
                    op.depositAmount(depositAmont);
                } else if (ch==4) {
                    op.viewMiniStatement();
                }


                 else if (ch==5) {
                    System.out.println("collect your ATM card");
                    System.out.println("THANKS USING ATM MACHINE ");

                }

            }
        } else {
            System.out.println("INVALID PIN NUMBER");
            System.out.println("please press correct pin number");
        }

    }
}