import java.util.Scanner;
public class Machine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        
        double balance = 1000;
        int operation; //improved

        int PIN = 1234;
        System.out.println("Enter the pin number: ");
        int userPin = sc.nextInt();
        if(PIN != userPin){
            System.out.println("Invalid pin number. Enter the correct number");
        }
        else{

        System.out.println("Proceed");
        do{

            System.out.println("ATM Menu");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter the operation: ");
            operation = sc.nextInt();


            switch (operation){
            case 1:
                System.out.println(balance);
                break;
            
            case 2:
                System.out.print("Enter the deposit amount: ");
                double depositAmount = sc.nextDouble();

                if(depositAmount > 0){
                    balance += depositAmount;
                    System.out.println("Amount deposited successfully");
                    System.out.println("Now the balance is "+balance);
                }
                else{
                    System.out.println("Invalid deposit Amount");
                }
                break;

            case 3:
                System.out.print("Enter the withdrawn amount: ");
                double withdrawAmount = sc.nextDouble();

                if(withdrawAmount <= balance && withdrawAmount>0 ){ //improved area
                    balance -= withdrawAmount;
                    System.out.println("Amount withdrawed successfully");
                    System.out.println("Now the balance is : "+balance);
                }
                else{
                    System.out.println("Insufficient balance or Invalid amount");
                }
                break;

            case 4:
                System.out.print("exiting the process");
                break;

            default:
                System.out.println("Invalid operation");

        }

        }while(operation!=4); //improved area

        }

        

        sc.close();
    }
}