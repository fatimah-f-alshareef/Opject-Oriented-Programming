
package cafe;

/**
 * this class for made bill take out
 * @author fatim
 */
import java.util.ArrayList;

public class Bill_takeOut extends Bill {
/**
*empty constructor
 */
 public Bill_takeOut() {
    }
        public Bill_takeOut(Customers x, ArrayList<Coffee> s) {
        super(x, s);
    }
     /**
      * method calculate the sum
      * @return a sum of all dishes cost
      */   
        
    @Override
         public  double sumOfBill() {
        double sum = 0;
        for (int i = 0; i < getDish().size(); i++) {
            sum += getDish().get(i).getPrice();  }
        return (sum);
    }
    /**
     * Override toString Method
     * @return Bill information
     */    
         
    @Override
          public String toString()  {

       String s1="****** Bill information ******\n";
       String s2= informaionBill();
        String s3="\n-----------------------------------------------------------------------\n";
        String s4=printAllDish();
       String s5="The total price = " + sumOfBill();
       String sf=String.format("%-30s%s%-30s%s%-30s%s ", s1,s2,s3,s4,s3,s5);
        
        return sf;
    
}
}

