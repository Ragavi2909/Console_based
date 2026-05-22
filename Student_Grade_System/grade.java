import java.util.Scanner;
public class Grade{  //classname should be in caps
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the student: ");
        String name = sc.nextLine();

        System.out.print("Enter the marks gained by the student: ");
        int marks = sc.nextInt();

        if(marks> 100  || marks<0){
            System.out.print("Invalid marks");
            return; //further checking is avoided
        }

        if(marks>80 && marks<=100){
            System.out.print("Grade A");
        }

        else if(marks>45 && marks<=80 ){
            System.out.print("Grade B");
        }

        else if(marks>25 && marks<=45){
            System.out.print("Grade C");
        }


        else{
            System.out.print("Failed the exam");
        }

        sc.close();
    }
}