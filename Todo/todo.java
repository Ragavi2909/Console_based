import java.util.ArrayList;
import java.util.Scanner;
public class todo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        ArrayList<String> list = new ArrayList<>();

        do { 
            System.out.println("TODO MENU");
            System.out.println("1.Add task");
            System.out.println("2.View tasks");
            System.out.println("3.Mark the task as completed");
            System.out.println("4.Delete the task");
            System.out.println("5.Exit the application");
            System.out.print("Enter the choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            

           
            
            switch (choice){
                case 1:
                    System.out.print("Enter the task: ");
                    String task = sc.nextLine();

                    list.add(task); //new

                    System.out.println("Task added successfully");
                    break;
                
                case 2:
                    System.out.println("Tasks yet to complete:");
                    if(list.isEmpty()){ //new
                        System.out.println("No task");
                    }
                    else{
                        for(int i=0; i<list.size();i++){
                            System.out.println("task "+(i+1)+": "+list.get(i)); //in array it is list[i], for arraylist it is list.get(i)
                        }
                    }
                    break;
                
                case 3: //updated case
                    if(list.isEmpty()){
                        System.out.println("No available task");
                    }
                    else{
                        System.out.println("Tasks:");
                        for(int i=0;i<list.size();i++){
                            System.out.println("Task "+ (i+1)+ ": "+list.get(i));
                        }

                        System.out.print("Enter the task number: ");
                        int completedTask = sc.nextInt();

                        if(completedTask > 0 && completedTask <= list.size()){
                            System.out.println(list.get(completedTask-1)+" is completed");
                        }
                        else{
                            System.out.println("Invalid task number");
                        }

                    }
                    break;
                    

                case 4: //updated case
                    if(list.isEmpty()){
                        System.out.println("Nothing to delete");
                    }
                    else{
                        for(int i=0;i<list.size();i++){
                            System.out.println("task "+(i+1)+". "+list.get(i));
                        }

                        System.out.print("Enter the number of task to be deleted: ");
                        int deletingTaskNumber = sc.nextInt();

                        if(deletingTaskNumber > 0 && deletingTaskNumber<=list.size()){
                            String deletedTask = list.remove(deletingTaskNumber-1);
                            System.out.println(deletedTask + " is deleted");
                        }
                        else{
                            System.out.println("Invalid task number");
                        }

                    }

                    break;
                    

                case 5:
                    System.out.println("Exiting the application...");
                    break;
                
                default:
                    System.out.println("Invalid choice");

            }
        } while (choice!=5);
    }
}