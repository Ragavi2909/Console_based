import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    int id;
    String name;
    String role;
    double salary;

    Employee(int id, String name, String role, double salary){
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;

    }

        void displayEmployee(){
            System.out.println("ID: "+id);
            System.out.println("Name: "+ name);
            System.out.println("Role: "+role);
            System.out.println("Salary: "+salary);
        }
    }
    public class EmployeeManagement{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        int choice;

        do { 
            System.out.println("Employee Management System");
            System.out.println("1.Add Employee");
            System.out.println("2.View all employees");
            System.out.println("3.Search Employee by ID");
            System.out.println("4.Update Employee Details");
            System.out.println("5.Delete Employee");
            System.out.println("6.Exit");

            System.out.print("Enter the choice: ");;
            choice = sc.nextInt();

            

            switch (choice){
                case 1:
                    System.out.print("Enter id: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Role: ");
                    String role = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(id, name, role, salary);
                    list.add(emp);
                    System.out.println("Employee Added Successfully..");
                    break;


                case 2:
                    if(list.isEmpty()){
                        System.out.println("No employees to diaplay");
                    }else{
                        for(int i=0;i<list.size();i++){
                            Employee e = list.get(i);
                            e.displayEmployee();
                            System.out.println();
                            
                        }
                    }
                    break;
                    

                 case 3:
                    System.out.print("Enter the employee ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;
                    for(int i=0;i<list.size();i++){
                        Employee e = list.get(i);
                        if(e.id == searchId){
                            e.displayEmployee();
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Employee not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter the employee id to be updated: ");
                    int updateId = sc.nextInt();
                    boolean updated = false;

                    for(int i=0;i<list.size();i++){
                        Employee e = list.get(i);
                        if(e.id == updateId){
                            System.out.println("Enter new name: ");
                            e.name = sc.nextLine();

                            System.out.print("Enter new role: ");
                            e.role = sc.nextLine();

                            System.out.print("Enter new Salary: ");
                            e.salary = sc.nextDouble();

                            System.out.println("Employee updated successfully");
                            updated = true;
                            break;

                        }
                    }

                    if(!updated){
                        System.out.println("Employee not found");

                    }
                    break;

                case 5:
                    System.out.print("Enter the employee id to be deleted: ");
                    int deleteId = sc.nextInt();
                    boolean deleted = false;

                    for(int i=0;i<list.size();i++){
                        Employee e = list.get(i);
                        if(e.id == deleteId){
                            list.remove(i);
                            System.out.println("Employee deleted successfully");
                            deleted = true;
                            break;
                        }
                    }

                    if(!deleted){
                        System.out.println("Employee not found");
                    }
                    break;

                case 6:
                    System.out.println("Exiting the application");
                    break;

                default:
                    System.out.println("Invalid choice");
                }
                 
            }while (choice!=6);
        }
    }

