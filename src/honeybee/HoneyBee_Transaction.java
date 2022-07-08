package honeybee;
import java.util.Scanner;

/**
 *
 * @author Sarvess S/O Veeriyah
 */
public class HoneyBee_Transaction extends HoneyBee_Sales{

   

public HoneyBee_Transaction(int quantity, int choice) {
        super(quantity, choice);
    }
    public static void main(String[] args) {
         
        double BASIC_PRICE = 8.00;
        double HONEYCOMB= 7.00;
        double BLACK_PEARL= 2.50;
        double total;
        int quantity;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to HoneyBee Frozen Yogurt");
         System.out.println("\nFrozen Ice-Cream Menu ");
        System.out.println("Choice 0: Basic Ice-Cream");
        System.out.println("Choice 1: Ice-Cream with Honeycomb");
        System.out.println("Choice 2: Ice-Cream with Black Pearl");

        System.out.println("\nWhat you would like to have ?");
        System.out.println("Choice:");
       
        int choice = input.nextInt();
        //Switch case
        switch(choice){
            
            case 1:
                System.out.println("Choice 1: Ice-Cream with Honeycomb RM:7.00/per piece");
                System.out.println("Quantity:");
                quantity =input.nextInt();
                total= (quantity * HONEYCOMB) + BASIC_PRICE;
                System.out.println("Total: RM" +total);
                break;
               
                
            case 2:
                System.out.println("Choice 2: Ice-Cream with Black Pearl RM:2.50/per piece");
                System.out.println("Quantity:");
                quantity =input.nextInt();
                total= (quantity * BLACK_PEARL) + BASIC_PRICE;
                System.out.println("Total: RM" +total);
                break;
                
             default:
                 System.out.println("Basic Ice-cream RM:8.00/per Ice-Cream ");
                 System.out.println("Quantity:");
                 quantity =input.nextInt();
                 total= quantity * BASIC_PRICE;
                 System.out.println("Total: RM" +total);

                break;
            
        }
        
    }

    
}
