import java.util.Scanner;
class operations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ;
        System.out.print("Enter the number 1: ");
        int n1 = sc.nextInt()

        System.out.print("Enter the number 2: ");
        int n2 = sc.nextInt();

        System.out.print("Enter the operation: ");
        char operation = sc.next().charAt(0); //sc.next -> reads one word , .charAt(0) -> takes first character

        int res = 0; //initialize it

        switch(operation){
            case '+':
                res = n1+n2;
                break;
            case '-':
                res = n1-n2;
                break;
            case '*':
                res = n1*n2;
                break;
            case '/':
                // res = n1/n2;
                // break;
                if(n2 != 0){
                    res = n1/n2;
                    break;
                }
                else{
                    System.out.print("Not to divide by zero");
                    break;
                }
            case '%':
                res = n1%n2;
                break;
            default:
                System.out.print("Invalid operation");
                return;
        }

        System.out.print("The result is: " + res);
        sc.close();
    }
}