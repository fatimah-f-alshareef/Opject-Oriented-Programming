
package cafe;


public class Customers{
   
    
     
  private String name;
  private String phone; 
  private int id;
 

   /**
   *empty constructor
   */
    public Customers() {
    }
  
  /**
   * constructor 
   * @param name customer name
   * @param phone customer phone number
   * @param id ID for customer
   */
    public Customers(String name, String phone, int id) {
        this.name = name;
        this.phone = phone;
        this.id = id;
      
    }
  
  
/**
 * getter Method for name
 * @return Customer name
 */
    public String getName() {
        return name;
    }
/**
 * getter method 
 * @return Customers phone number for communication
 */
    public String getPhone() {
        return phone;
    }
/**
 * getter method 
 * @return Customers ID
 */
    public int getId() {
        return id;
    }
    
    
/**
 * Change/Initial customer name
 * @param name customer name
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * setter method
 * @param phone number for communication
 */
    public void setPhone(String phone) {
        this.phone = phone;
    }
/**
 * Ability to change/Initial ID
 * @param id customer number
 */
    public void setId(int id) {
        this.id = id;
    }

  

/**
 * used to print all the information for customer
 * @return all information
 */
    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", phone=" + phone + ", id=" + id +  '}';
    }
    
  
}

    

