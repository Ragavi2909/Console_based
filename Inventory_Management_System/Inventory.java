import java.util.ArrayList;
import java.util.Scanner;
class Product{
    int id;
    String name;
    int quantity;
    double price;

    Product(int id, String name, int quantity, double price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void display(){
        System.out.println("Product Id: "+id);
        System.out.println("Product Name: "+name);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price: "+price);
    }

}
public class Inventory{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;

        ArrayList<Product> list = new ArrayList<>();

        do { 
            

            System.out.println("Inventory Management Menu");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Purchase Product");
            System.out.println("7. Restock Product");
            System.out.println("8. Exit");

            System.out.print("Enter the choice: ");
            choice = sc.nextInt();
            sc.nextLine(); //improvement


            switch (choice){
                case 1:
                    System.out.print("Product Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    Product pd = new Product(id, name, quantity, price);
                    list.add(pd);
                    System.out.println("Product Added successfully");
                    break;

                case 2:
                    if(list.isEmpty()){
                        System.out.println("No products to display");
                    }
                    else{
                        for(int i=0;i<list.size();i++){
                            Product p = list.get(i);
                            p.display();
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the product id: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;
                    for(int i=0;i<list.size();i++){
                        Product p = list.get(i);
                        if(p.id == searchId){
                            p.display();
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Product not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter the product id to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    boolean updated = false;
                    for(int i=0;i<list.size();i++){
                        Product p = list.get(i);
                        if(p.id == updateId){
                            System.out.print("Enter the updated product name: ");
                            String updatedName = sc.nextLine();

                            System.out.print("Enter the updated quantity: ");
                            int updatedQuantity = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter the updated price: ");
                            double updatedPrice = sc.nextDouble();
                            sc.nextLine();

                            //improvement
                            p.name = updatedName;
                            p.quantity = updatedQuantity;
                            p.price = updatedPrice;
                            System.out.println("Product updated successfully...");

                            updated = true;
                            break;
                        }
                    }

                    if(!updated){
                        System.out.println("product not found");
                    }
                    break;

                case 5:
                    System.out.print("Enter the product id to be deleted: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();
                    boolean deleted = false;
                    for(int i=0;i<list.size();i++){
                        Product p = list.get(i);
                        if(p.id == deleteId){
                            list.remove(i);
                            System.out.println("Product deleted successfully...");
                            deleted = true;
                            break;
                        }
                    }

                    if(!deleted){
                        System.out.println("product Not found");
                    }
                    break;


                case 6: //purchase
                    System.out.print("Enter the product id to be purchased: ");
                    int purchaseId = sc.nextInt();
                     boolean purchased = false; //improvement

                    for(int i=0;i<list.size();i++){
                        Product p = list.get(i);
                       
                        if(p.id == purchaseId ){
                            System.out.print("Enter the quantity to buy: ");
                            int purQuant = sc.nextInt();
                            sc.nextLine();

                            if(purQuant < 0){
                                System.out.println("Not a valid quantity");
                            }
                            else if(purQuant <= p.quantity){
                                p.quantity -= purQuant;
                                System.out.println("Purchased the product");
                                System.out.println("Updated quantity: "+p.quantity);
                            }
                            else{
                                System.out.println("Insufficient Stock");
                            }

                            purchased = true;
                            break;
                        }
                    }

                    if(!purchased){
                        System.out.println("Product not found");
                    }
                    break;

                case 7: //restock
                    System.out.print("Enter the product id to be restocked: ");
                    int restockId = sc.nextInt();
                    boolean restocked = false;

                    for(int i=0;i<list.size();i++){
                        Product p = list.get(i);
                        if(p.id == restockId ){
                            System.out.print("Enter the quantity to restock: ");
                            int restockQuant = sc.nextInt();
                            sc.nextLine();
                            if(restockQuant > 0){
                                p.quantity += restockQuant;
                                System.out.println("Restocked the product");
                                System.out.println("restocked quantity: "+p.quantity);
                            }
                            else{
                                System.out.println("Invalid quantity");
                            }
                            restocked = true;
                            break;
                        }
                    }

                    if(!restocked){
                        System.out.println("product not found");
                    }
                    break;


                case 8:
                    System.out.println("Exit the application");
                    break;

                default:
                    System.out.println("Invalid choice");

            }

        } while (choice!=8);
        sc.close();
    }
}