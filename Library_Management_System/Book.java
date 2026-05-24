import java.util.ArrayList;
import java.util.Scanner;

class Library{
    int bookId;
    String bookName;
    String authorName;
    boolean availabilityStatus;

    Library(int bookId, String bookName, String authorName, boolean availabilityStatus ){
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.availabilityStatus = availabilityStatus;
    }

    void displayBookDetails(){
        System.out.println("Book id: "+bookId);
        System.out.println("Book Name: "+bookName);
        System.out.println("Author Name: "+authorName);
        System.out.println("Status: "+availabilityStatus);
    }
}

public class Book{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Library> list = new ArrayList<>();
        int choice;


        do { 
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");

            System.out.print("Enter the choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter the book id: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter the book Name: ");
                    String bookName = sc.nextLine();

                    System.out.print("Enter the author name: ");
                    String authorName = sc.nextLine();

                    // System.out.println("Enter the available stats: ");
                    // boolean availabilityStatus = sc.nextBoolean();
                    boolean availabilityStatus = true;

                    Library lb = new Library(bookId, bookName, authorName, availabilityStatus);
                    list.add(lb);
                    System.out.println("Book added successfully");
                    break;

                
                case 2:
                    if(list.isEmpty()){
                        System.out.println("No books to display");
                    }
                    else{
                        for(int i=0;i<list.size();i++){
                            Library b = list.get(i);
                            b.displayBookDetails();
                            System.out.println();
                            
                        }
                    }
                    break;


                case 3:
                    System.out.print("Enter the book id to be searched: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;
                    for(int i=0;i<list.size();i++){
                        Library b = list.get(i);
                        if(b.bookId == searchId){
                            b.displayBookDetails();
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Book not found");
                    }
                    break;

                case 4: //new concept - object state changes
                    System.out.print("Enter the book id to issue: ");
                    int idOfBook = sc.nextInt();
                    sc.nextLine();

                    boolean issued = false;

                    for(int i=0;i<list.size();i++){
                        Library b = list.get(i);
                        if(b.bookId == idOfBook){
                            if(b.availabilityStatus==true){
                                b.availabilityStatus = false;
                                System.out.println("Book issued successfully");
                            }
                            else{
                                System.out.println("Book already issued");
                            }

                            issued = true;
                            break;
                        }
                    }
                    if(!issued){
                        System.out.println("Book not found");
                    }
                    break;

                case 5: //same like 4 
                    System.out.print("Enter the book id to return: ");
                    idOfBook = sc.nextInt();
                    sc.nextLine();

                    boolean returned = false;

                    for(int i=0;i<list.size();i++){
                        Library b = list.get(i);
                        if(b.bookId == idOfBook){
                            if(b.availabilityStatus==false){
                                b.availabilityStatus = true;
                                System.out.println("Book returned successfully");
                            }
                            else{
                                System.out.println("Book already available");
                            }
                            returned = true;
                            break;
                        }
                    }
                    if(!returned){
                        System.out.println("Book not found");

                    }
                    break;
                    
                case 6:
                    System.out.print("Enter the book id to be deleted: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();

                    boolean deleted = false;
                    for(int i=0;i<list.size();i++){
                        Library b = list.get(i);
                        if(b.bookId == deleteId){
                            list.remove(i);
                            System.out.println("Book deleted successfully");
                            deleted = true;
                            break;
                        }
                    }

                    if(!deleted){
                        System.out.println("Book not found");
                    }
                    break;
                    
                case 7:
                    System.out.println("Exit the application...");
                    break;

                default:
                    System.out.println("Invalid choice");

            }

        } while (choice!=7);
    }
}


