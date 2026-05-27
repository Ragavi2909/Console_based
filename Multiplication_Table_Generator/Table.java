import java.util.Scanner;
public class Table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        

        System.out.print("Enter the limit of the table: ");
        int limit = sc.nextInt();
       
        if(n<=0 || limit<=0){
            System.out.println("Invalid input");
            return;
        }

        System.out.println("Multiplication Table");
        for(int i=1;i<=limit;i++){
            System.out.println(n + " * " + i +" = " + (n*i));
        }
        sc.close();
    }
}