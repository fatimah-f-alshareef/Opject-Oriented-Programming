
package cafe;

public class  Dessert extends Coffee{
 
   /**
    *empty constructor
    */
    public Dessert() {
    }
    /**
     * constructor
     * @param name name of the Dessert/dish 
     * @param numOfPrudect the Dessert/dish code number used to select between them
     * @param price Dish price 
     */
    public Dessert(String name, int numOfPrudect, double price) {
        super(name, numOfPrudect, price);
    }
    /**
     * Override to String method
     * @return print all data for the Dessert/dish 
     */
    @Override
     public String toString(){
         return"Product name: "+getName()+"    number: "+getNumOfPrudect()+"    price: "+getPrice();
         
     }
 
}
