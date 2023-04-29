
package cafe;


import java.util.*;
/**
 *
 * @author fatim
 */
public class Menu{
    
   /**
    *  array of Object for Dessert
    */
   static Coffee[] main = {new Dessert("Pistachio cruffin", 111, 18),
                            new Dessert("Classic cookies", 112, 9),
                            new Dessert("Chocolate cookies", 113, 7),
                            new Dessert("Almond and berry tart", 114, 25),
                            new Dessert("Tiramisu", 115, 10)};
   
   /**
    *  array of Object for Hot Coffee
    */
   static Coffee[] drinkHot = {new Coffee("Americano", 221, 15),  
                             new Coffee("Espresso", 222, 13),
                             new Coffee("Cappuccino", 223, 9),
                             new Coffee("Cafe Late", 224, 9),
                             new Coffee("Hot Chocolate", 225, 11),            
                             new Coffee("Caramal Macciate", 226, 10),
                             new Coffee("White Chocolate", 227, 11),
                             new Coffee("Hot Tea", 228, 8)};
    /**
    * array of Object for cold Coffee
    */
        static Coffee[] drinkCold = {new Coffee("Cafe Frappe", 331, 13),  
                             new Coffee("Smoothie", 332, 10),
                             new Coffee("Iced Late", 333, 11),
                             new Coffee("Choc Mint", 334, 15),
                             new Coffee("Iced Coffee", 336, 12),
                             new Coffee("Oreo Cappuccino", 338, 16),  
                             new Coffee("Frozen Mocha", 337, 11),
                             new Coffee("Moch", 335, 14)};

    /**
    * arrayList for cold Dessert
    */
    static ArrayList mainArr = new ArrayList();
    /**
    * arrayList for cold drinks
    */
    static ArrayList drinkHotArr = new ArrayList();
    /**
    * arrayList for cold hot drinks
    */
    static ArrayList drinkColdArr = new ArrayList();
    
    /**
    * arrayList for all menu
    */
    public static ArrayList<Dessert> AllArr = new ArrayList<>();
   
   /**
   *empty constructor
   */
   public Menu() {}
    
   /**
     * 
     * method to fill all ArrayList withe object
    */
    public static void fillAll() {
        fill(mainArr, main);
        fill(drinkHotArr, drinkHot);
        fill(drinkColdArr, drinkCold);  
        AllArr.addAll(mainArr);
        AllArr.addAll(drinkHotArr);
        AllArr.addAll(drinkColdArr);
    }
   
    /**
     * method to fill an ArrayList with array of object
     * @param a ArrayList to fill
     * @param b array of object "class Coffee" 
     */
    public static void fill(ArrayList a, Coffee[] b) {
        for (int i = 0; i < b.length; i++) {
            a.add(b[i]);
        }
    }
   /**
    * add to menu method
    * @param b take new Object of class dessert and add it to the ArrayList
    */
    public static void addMainToMenu(Dessert b) {
        mainArr.add(b);
    }

  /**
   * add to menu method
   * @param b take new Object of class Coffee and add it to the ArrayList
   */

    public static void addColdDrink(Coffee b) {
        drinkColdArr.add(b);
    }
 /**
   * add to menu method
   * @param b take new Object of class Coffee and add it to the ArrayList
   */
    public static void addHotDrink(Coffee b) {
        drinkHotArr.add(b);
    }
   
 /**
  * Override toString method 
  * @return all menu information
  */
    @Override
    public String toString() {
        String a = "";
        String b = "";
        String c = "";
    
       
        for (int i = 0; i < mainArr.size(); i++) {
            a = a + mainArr.get(i).toString(); a=a+"\n";
        }

        for (int i = 0; i < drinkHotArr.size(); i++) {
            b = b + drinkHotArr.get(i).toString();b=b+"\n";
            
        }
        for (int i = 0; i < drinkColdArr.size(); i++) {
            c= c+ drinkColdArr.get(i).toString();c=c+"\n";
        }
       
        return "\t****************** MENU ******************\n"
                + "\t****************** Dessert ******************\n" + a
                + "\n" + "\t****************** Hot drinks *********************\n" + b
                + "\n" + "\t****************** Cold drinks **********************\n" + c
                + "\n";
    }
}


    

