
package cafe;


import java.util.ArrayList;
/**
 * Creating Bill abstract class 
 * this class imolements method in other class
 * @author BAYAN
 */
public abstract class Bill implements InterfaceBill, Comparable {


    
   /**
    * No is static initial constatnt increase by one in every new order
    * nuOfBill printing the number of bills in cafe
    */
    static int No=0;
    private int numOfBill;
    /**
     * customer object of Customers class will use a lot in this class
     * des is Arraylistza of dessert class 
     */
    private Customers custem;   
    private ArrayList<Coffee> des;
    /**
     * Bill constructor without parameter to increase niOfBill
     */
    public Bill() {
        No++;
        numOfBill=No;
    }

    /**
     * Bill constructor with passing parameter 
     * @param x is object of Customers class
     * @param s  is ArrayList of dessert class
     */

    public Bill(Customers x, ArrayList<Coffee> s) {
        this.custem = x;
        this.des = s;
        No++;
        numOfBill=No;
    }
    /**
     * implementation for method was in InterfaceBill class 
     * @return String 
     */
    @Override
    public String informaionBill() {
        String s1="Bill Number: "+numOfBill;
        String s2="\n-------------------------------------------------------------------------\n";
        String s3=custem+"";
        String s = String.format("%-30s %-30s %s ", s1,s2,s3 );
        return s;
    }
     /**
     * implementation for method was in InterfaceBill class 
     * @return String 
     */
    @Override
    public String printAllDish() {
        String cc = "";
        for (int i = 0; i < des.size(); i++) {
            cc += String.format("%-40s\n " , des.get(i));
        }
        return cc;
    }
     /**
     * Accessor method to get nuOfBill
     * @return int
     */
        public int getNumOfBill() {
        return numOfBill;
    }
  /**
     * Accessor method to get object of Customers class
     * @return object
     */  
    public Customers getCustem() {
        return custem;
    }
/**
     * Mutator method to update object of Customers class
     * @param custem 
     */
    public void setCustem(Customers custem) {
        this.custem = custem;
    }
/**
     * Accessor method to return ArrayList
     * @return des ArrayList
     */
    public ArrayList<Coffee> getDish() {
        return des;
    }
    /**
     * Mutator method to update ArraList of Dessert class
     * @param des 
     */
    public void setDish(ArrayList<Coffee> des) {
        this.des = des;
    }
        
     /**
     * override method in Object class
     * @return String
     */  

    @Override
    public String toString() {
       
        String forre = "";
        String ss = " ****** Bill informatin ******\n";
        String s = String.format(" %-20S", ss);
        forre += s;
        s = String.format("%s", informaionBill());
        forre += s;
        ss = "\n-------------------------------------------------------------------------\n";
        s = String.format(" %-20S", ss);
        forre += s;
        s = String.format("%s", printAllDish());
        forre += s;
        ss = "-------------------------------------------------------------------------\nThe total price = ";
        s = String.format("%S", ss);
        forre += s;
        s = String.format("%s", sumOfBill());
        forre += s;
        return forre;

    }
  /**
     * override method in Comparable class
     * @return int
     */
    @Override
    public int compareTo(Object t) {
        Bill b = (Bill) t;
        if (this.custem.getId()> b.custem.getId()) {
            return 1;
        } else if (this.custem.getId ()< b.custem.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
