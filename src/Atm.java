/*
   Author: Camila Arbaiza

   Problem 10.7

    Use the Account class created in Programming Exercise
    9.7 to simulate an ATM machine. Create ten accounts in an array with id
    0, 1, . . . , 9, and initial balance $100. The system prompts the user to enter an
    id. If the id is entered incorrectly, ask the user to enter a correct id. Once an id
    is accepted, the main menu is displayed as shown in the sample run. You can
    enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for
    depositing money, and 4 for exiting the main menu. Once you exit, the system
    will prompt for an id again. Thus, once the system starts, it will not stop


 */


import java.util.Scanner;

public class Atm {

    public static void main (String [] args){


        Account [] accounts = new Account[10];  //array of Account objects
        int choice;         // number from the main menu
        double amountW;     // amount to withdraw
        double amountD;     // amount to deposit

        /* initialize accounts in the array with with id
        *  0, 1, . . . , 9, and initial balance $100
        */
        for(int i = 0; i < accounts.length; i++){

            //calling constructor
            accounts[i] = new Account(i,100);
        }


        Scanner input = new Scanner (System.in);

        System.out.print("Enter an id: ");
        int userId = input.nextInt();

        //validation of id
        while ((userId < 0)||(userId > 9)){
            System.out.print("Enter a valid id (0-9): ");
            userId = input.nextInt();
        }

        while((userId >=0) && (userId <= 9)){

            System.out.println("Main menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            System.out.print("Enter a choice: ");
            choice = input.nextInt();

            if(choice == 1){

                System.out.println("The balance is " + accounts[userId].getBalance());
            }
            else if(choice == 2){

                System.out.print("Enter an amount to withdraw: ");
                amountW = input.nextDouble();

                accounts[userId].withdraw(amountW);

            }
            else if(choice == 3){

                System.out.print("Enter an amount to deposit: ");
                amountD = input.nextDouble();

                accounts[userId].deposit(amountD);

            }
            else if(choice == 4){

                System.out.print("Enter an id");
                userId = input.nextInt();

                //validation of id
                while ((userId < 0)||(userId > 9)){
                    System.out.print("Enter a valid id (0-9): ");
                    userId = input.nextInt();
                }
            }

            }
    }//end main
}//end Atm class
