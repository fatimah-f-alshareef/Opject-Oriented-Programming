
package cafe;


public class Employees {
   
    private String name;
    private int ID;
    private String Email;
    private String phone;
    private double salary;
  /**
   *empty constructor
   */
    public Employees() {
    }
/**
   *constructor
     * @param ID To have access to the system
     * @param name Employees name
     * @param phone To contact the employee
     * @param Email To contact the employee
   */
    public Employees(int ID, String name, String phone, String Email, double salary) {
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        this.Email = Email;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

  

    public String getphone() {
        return phone;
    }

    public String getEmail() {
        return Email;
    }

    public double getSalary() {
        return salary;
    }
  /**
   *set employee attribute
   */
    public void setName(String name) {
        this.name = name;
    }
   
    public void setphone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
   /**
   *Override toString method
   */
    @Override
    public String toString() {
        return "name: " + name + ", ID: " + ID + ", Adderss:" +  ", mobile Number: " + phone+ ", Email:" + Email + ", salary:" + salary;
    }
    /**
     * used to verify the user ID
     * @param i ID entered by a user
     * @return if the ID is exist return true
     */
     public boolean compare(int i){

      if(i==this.ID)
          return true;
      else return false;
    }
    
}
