
package cafe;

import java.util.*;

/**
 * these class extends from Bill ,will Print the Bill upon request inside the cafe
 */
public class Bill_in_cafe extends Bill {
    
/**
 * constructor Bill_in_cafe without parameter
 */
     public Bill_in_cafe() {
    }

/**
* Bill_in_cafe constructor with passing parameter 
* @param x is object of Customers class
* @param s  is ArrayList of dessert class
*/
    public Bill_in_cafe(Customers x, ArrayList<Coffee> s) {
        super(x, s);

    }

/**
 * sum attribute holds the value of the bill
 * @return sum + sprice
 */
     @Override
    public double sumOfBill() {
        double sum = 0;
        for (int i = 0; i < getDish().size(); i++) {
            sum += getDish().get(i).getPrice();
        }
        return (sum + sprice);
    }
/**
 * @since PrintBill to format and print the bill
 * @param s holds string
 * @param cc 
 */
    public void PrintBill() {
        String s = "**** Bill informatin ****";
        System.out.printf("%60s", getDish());
        System.out.println("");
        s = "Number of Bill: ";
        System.out.printf("%24s" + getDish());
        System.out.printf("%4d", getNumOfBill());
        System.out.println("\n-------------------------------------------------------------------------\n");
        System.out.printf("%50s", getCustem());
        String cc = "";
        for (int i = 0; i < getDish().size(); i++) {
            cc += " " + getDish().get(i) + "\n";

        }
        System.out.println(cc);
    }
/**
 * Override to String method 
 * @param s1 ,s2 ,s3 ,s4 ,s5 ,s6 holds string to format the bill
 * @return sf
 */
    @Override
    public String toString() {

        String s1 = "** Bill informatin **\n";
        String s2 = informaionBill();
        String s3 = "\n-------------------------------------------------------------------------\n";
        String s4 = printAllDish();
        String s5 = "The total price Berfore service price = " + (sumOfBill() - 20)+"\n";
        String s6 = "The total price After service price(+20RS) = " + (sumOfBill());
        String sf = String.format("%-30s%s%-30s%s%-30s%s%s", s1, s2, s3, s4, s3, s5, s6);

        return sf;

    }

  }

