package cafe;
import java.util.ArrayList;
/**
 *
 * @author Fatim
 */

public abstract class BillAbs implements InterfaceBill, Comparable {

    /**
    * numOfBill attribute holds a number of bill
    */
     public static int numOfBill;
     /**
      * x is object of Customers class
      */
    Customers x;
     /**
      * s is ArrayList of dessert class
      */
    ArrayList<Coffee> s;

    
    public BillAbs() {
        numOfBill++;
    }

    /**
     *
     * @param a
     * @return
     */
    public abstract double sumAfter(double a);

    /**
     *
    * @param x is object of Customers class
    * @param s is ArrayList of dessert class
     */
    public BillAbs(Customers x, ArrayList<Coffee> s) {
        this.x = x;
        this.s = s;
        numOfBill++;
    }

    /**
     *
     * @param n is ArrayList of dessert class
     * @return a sum of all dishes cost
     */
    public double sumOfBill(ArrayList<Coffee> n) {
        double sum = 0;
        for (int i = 0; i < n.size(); i++) {
            sum += n.get(i).getPrice();
        }
        return sum;
    }

    /**
     * @param a is object of customer class
     * @return numOfBill 
     */
    public String informaionBill(Customers a) {
        return "Bill Number: " + numOfBill + "\n-----------------------------------\n" +a;
      
    }

    /**
     * @param h is ArrayList of dessert class
     * @return string cc=all the Dishes
     */
    public String printAllDish(ArrayList<Coffee> h) {
        String cc = "";
        for (int i = 0; i < h.size(); i++) {
            cc += "" + h.get(i) + "\n";

        }
        return cc;
    }

    /**
     * @return  Bill information
     */
    public String toStrint() {

        return "** Bill information **"
                + informaionBill(this.x) + "---------------------------------------------------\n" + printAllDish(this.s)
                + "---------------------------------------------------\n" + "The total price = " + sumOfBill(this.s);

    }

    /**
     * override method in Comparable class
     * @return int
     */
    @Override
    public int compareTo(Object t) {
        BillAbs a = (BillAbs) t;
       if (this.x.getId() > a.x.getId()) {
           return -1;
        } else if (this.x.getId() > a.x.getId()) {
           return 1;
       } else {
          return 0;
        }
   }
    
}
