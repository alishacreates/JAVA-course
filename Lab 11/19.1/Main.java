// 19.1: Inventory System using Collections and Wrapper Classes
// Develop a Java program for an inventory system that stores product details using Collections
// Framework and Wrapper Classes.
// • Use a Map<Integer, String> to store product ID and product name
// • Use a List to store product prices
// • Demonstrate autoboxing and unboxing while inserting and retrieving values
// • Use wrapper class methods (e.g., Integer.parseInt(), Double.valueOf())
// Perform the following tasks:
// • Add new products to the inventory
// • Calculate total and average price of products
// • Convert user input (String) into appropriate primitive types using wrapper classes
// • Display all products with their details public 
import java.util.*;

public class Main {
    public static void main(String[] args) {
         System.out.println("Name: Alisha, SAP: 590013908, Batch: 1");
        Scanner sc = new Scanner(System.in);

        Map<Integer, String> products = new HashMap<>();

        List<Double> prices = new ArrayList<>();

        System.out.println("Enter number of products:");
        int n = Integer.parseInt(sc.nextLine());  

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Product ID:");
            int id = Integer.parseInt(sc.nextLine());  

            System.out.println("Enter Product Name:");
            String name = sc.nextLine();

            System.out.println("Enter Price:");
            Double price = Double.valueOf(sc.nextLine()); 

            products.put(id, name);
            prices.add(price);
        }

        System.out.println("Product Details:");
        int i = 0;
        for (Integer id : products.keySet()) {
            String name = products.get(id);
            double price = prices.get(i);
            System.out.println(id + " | " + name + " | " + price);
            i++;
        }

        double total = 0;
        for (Double p : prices) {
            total += p;  
        }

        double avg = total / prices.size();

        System.out.println(" the Total Price: " + total);
        System.out.println("Average Price: " + avg);
    }
}
