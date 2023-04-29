
package cafe;


public class Coffee {
 
    private int numOfPrudect;
    private String name;
    private double price;
  
    
   /**
    *empty constructor
    */
    public Coffee() {
       
    }
  /**
   * constructor
  * @param name the name of the drink/coffee
  * @param numOfPrudect the drink/coffee code number used to select between them
  * @param price  drink price 
  */
    public Coffee(String name,int numOfPrudect,double price) {
        this.name = name;
        this.price = price;
        this.numOfPrudect = numOfPrudect;
        
    }
 /**
  * getter method
  * @return  the code number for  the drink/coffee
  */
    public int getNumOfPrudect() {
        return numOfPrudect;
    }
/**
 * getter method 
 * @return  name of the drink/coffee
 */
    public String getName() {
        return name;
    }
   /**
    * getter method 
    * @return drink price 
    */
    public double getPrice() {
        return price;
    }
   /**
    * setter method
    * @param numOfPrudect The drink/coffee code number 
    */
    
    public void setNumOfPrudect(int numOfPrudect) {
        this.numOfPrudect = numOfPrudect;
    }
    /** 
    * setter method
    * @param name the name of the drink/coffee
    */
    public void setName(String name) {
        this.name = name;
    }
    /**
    * setter method
    * @param price drink price 
    */
    public void setPrice(double price) {
        this.price = price;
    }


    
  /**
  * Override to String Method 
  * @return print all data for the drink/coffee
  */
    @Override 
    public String toString() {

        return "Product name: "+name+"    number: "+numOfPrudect+"     price: "+price+"";
    }
}
