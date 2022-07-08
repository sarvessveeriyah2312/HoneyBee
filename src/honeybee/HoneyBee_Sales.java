package honeybee;

/**
 *
 * @author Sarvess S/O Veeriyah
 */

//Public class
public class HoneyBee_Sales {
    private double BASIC_PRICE;
    private double HONEYCOMB;
    private double BLACK_PEARL;
    private int quantity;
    int choice;
    
    //Constructor 
    public HoneyBee_Sales(int quantity, int choice) {
        this.quantity = quantity;
        this.choice = choice;
    }
    
    public void getTotalPrice(double TotalPrice){
        TotalPrice = quantity + BASIC_PRICE;
       
    }
}
