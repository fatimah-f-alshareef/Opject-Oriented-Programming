
package cafe;
import java.util.*;
public class main {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        
        
       ArrayList<Employees> employees=new ArrayList<Employees>();
       ArrayList <Bill_in_cafe> inCafe=new ArrayList <Bill_in_cafe>(); 
       ArrayList <Bill_takeOut> takeOut=new ArrayList <Bill_takeOut>();
       ArrayList<Customers> customers = new ArrayList<Customers>(100);
      
       
       employees.add(new Employees(1234567,"Donia","Donia@gmail.com","055555555",3000));
       employees.add(new Employees(7654321,"reem","reem@gmail.com","055555588",3500));
       
      
        
        
        /**
        * log in to the system by user id
        */
        boolean flag=false; 
        for(;flag==false;){   
             try{ 
                 
        System.out.print("Enter your ID: "); int userID=in.nextInt();
       
           for(int i=0;i<employees.size();i++){
            
               if((employees.get(i)).compare(userID)){   
             
                  System.out.println("Hello "+employees.get(i).getName());flag=true;
                    
               }   

            }
           if(!flag){
                System.out.println("ID not found"); 
            }
             }
              catch(InputMismatchException ex){
                   System.err.println("Sory,you have entered a wrong data type "); 
                   in.nextLine();
                  }
          catch(Exception e){
                  System.err.println("Sory,try again");
                  }  
        }
       
        //----------------------------------------------------------------------------
          Menu.fillAll();
          
          
       int num1=1;
 do{  
    try{ 
               //print the Services
               System.out.println("-------------------\n**Services**\n1-New order\n2-Make a change in the menu"
                       +"\n3-Add a new employee\n4-Communicate with an employee\n5-get bill\n6-customer information"
                       + "\n7-Log Out\n0-End\n-------------------\nEnter the service number");
               
              int num=in.nextInt();
              
        // New order_____________________________________________________________________________     
       if(num==1){
           
            Menu obm = new Menu();
            System.out.println(obm);
            ArrayList orderList = new ArrayList();
                
                
            int nu=1;
                for(;nu==1;){
                    for (int n = 0; n < 100; n++) {
                        System.out.println("what do you want? Please enter the triple number for whatever you want");
                        int numMenu = in.nextInt();
                  
                   for(int h=0;h<Menu.AllArr.size();h++){
                       
                       if(((Coffee)(Menu.AllArr.get(h))).getNumOfPrudect()==numMenu){
                         orderList.add(Menu.AllArr.get(h));
                       }
                       
                   }
                    System.out.println("If you want something else, choose 1; if not, choose 2");
                     nu = in.nextInt();
                    if (nu == 1) {
                        break;
                     }
                    else {
                        
                        ArrayList<Customers> inner = new ArrayList<Customers>();
                        for (int i = 0; i < 100; i++) {
                             customers.add(i, new Customers(null, null, 0));
                        }
                        System.out.println("Enter the number of customer: ");
                        int numcustomer = in.nextInt();
                        if (numcustomer < 100) {
                            System.out.println("the name of customer is: ");
                            String name = in.next();
                            System.out.println("the number phone of customer is: ");
                            String phone = in.next();
                            System.out.println("the id number of customer is: ");
                            int id = in.nextInt();
                            Customers obj = new Customers(name, phone, id);
                            customers.set(numcustomer, obj);
                      
                            System.out.println("Do you want to order in the cafe or outside,choose: 1 inside the cafe, 2 outside");
                            int nuum1=in.nextInt();
                            if (nuum1==1) {
                            
                               inCafe.add(new Bill_in_cafe(obj,(orderList)));
                               int index=inCafe.size()-1;
                               System.out.print(inCafe.get(index)); 
                           }
                           else{
                              takeOut.add(new Bill_takeOut(obj,(orderList)));
                              int index=takeOut.size()-1;
                              System.out.print(takeOut.get(index)); 
                           
                          }     
                       }
                   }
                   break;   
                }
                
            }
       }
       //Make a change in the menu_____________________________________________________
       else if(num==2){
            System.out.println("************************\nMenu:");
            Menu obm = new Menu();
            System.out.println(obm);
                
            System.out.print("1-Aظگdd product\n2-Delete product\nService number:"); 
            int change=in.nextInt();
           
             if(change==1){
                   System.out.print("****************\nEnter Name: ");String name=in.next();
                   System.out.print("\nEnter product number: ");int code=in.nextInt();
                   System.out.print("\nEnter Price: ");double price=in.nextDouble();
                   boolean flag1=false;
                   System.out.print("****************\n1-Add Hot drink\n2-Add Cold drink \n3-Add Dessert\nService number: ");
                   int n1=in.nextInt();
                
                    for(int j=0;j<Menu.AllArr.size();j++){
                        if(((Coffee)(Menu.AllArr.get(j))).getNumOfPrudect()==code){
                           flag1=(!flag1);System.out.println("**************************invalid product number*****************************");break;
                        }
                    }
                    if(n1==1){
                       if(!flag1){
                           Menu.addMainToMenu(new Dessert(name,code,price));
                           System.out.println("************************\nNew Hot drinks list"); 
                         
                           for(int i=0;i<Menu.drinkHotArr.size();i++){
                              System.out.print(Menu.drinkHotArr.get(i)+"\n");
                            }  
                       }
                   }
                 if(n1==2){
                   if(!flag1){
                       Menu.addColdDrink(new Coffee(name,code,price));  
                        System.out.println("************************\nNew cold drinks list");
                       
                        for(int i=0;i<Menu.drinkColdArr.size();i++){
                           System.out.print(Menu.drinkColdArr.get(i)+"\n");
                        }
                    }
                 }
                 if(n1==3){
                      if(!flag1){
                       Menu.addMainToMenu(new Dessert(name,code,price)); 
                       System.out.println("************************\nNew Desserts list");
                       
                       for(int i=0;i<Menu.mainArr.size();i++){
                           System.out.print(Menu.mainArr.get(i)+"\n");
                       }
                     }
                 }
               
             }
             else if(change==2){
                 System.out.print("Enter product number you want to delet: ");int code=in.nextInt();
               for(int i=0;i<Menu.drinkHotArr.size();i++){
                  if(((Coffee)(Menu.drinkHotArr.get(i))).getNumOfPrudect()==code){
                      Menu.drinkHotArr.remove(i);
                     
                  }
               }
               
               for(int i=0;i<Menu.drinkColdArr.size();i++){
                   if(((Coffee)(Menu.drinkColdArr.get(i))).getNumOfPrudect()==code){
                      Menu.drinkColdArr.remove(i); 
                  }
               }
               for(int i=0;i<Menu.mainArr.size();i++){
                  if(((Dessert)(Menu.mainArr.get(i))).getNumOfPrudect()==code){
                      Menu.mainArr .remove(i);
                     
                  } 
               }  
               for(int i=0;i<Menu.AllArr.size();i++){
                  if(((Coffee)(Menu.AllArr.get(i))).getNumOfPrudect()==code){
                      Menu.AllArr.remove(i);
                  }
               }
                 
                System.out.println(obm);
            }
        }
       
       
       //add a new employee________________________________________________________
       else if(num==3){
           
            System.out.print("Enter ID: ");int id=in.nextInt();
            boolean f=false;
               for(int i=0;i<employees.size();i++){
                          if((employees.get(i)).compare(id)){ 
                              f=true;
                          } 
                       }  
          if(!f){
            System.out.print("\nEnter name: ");String name=in.next();
            System.out.print("\nEnter Email: ");String email=in.next();
            System.out.print("\nEnter phone: ");String phone=in.next();
            System.out.print("\nEnter salary: ");double salary=in.nextDouble();
            employees.add(new Employees(id,name,email,phone,salary));
           }
          else
             System.out.println("***********************Unavailable ID, try again************************");
       }
       
       
       
       //Communicate with an employee___________________________________________
       else if(num==4){
            for (int i = 0 ; i< employees.size(); i++){
                System.out.println (i+1 + "- " + employees.get(i).getName());
            }
            System.out.print("Enter employee number: ");
            int nom=in.nextInt();
            System.out.println("Phone: "+ employees.get(nom - 1 ).getphone() + "\nEmail: "+ employees.get(nom - 1).getEmail());
       }
       
       
       
       //get bill_______________________________________________________________
       else if(num==5){
            ArrayList<Bill> billArr = new ArrayList<>();
                      
            for(int i=0;i<inCafe.size();i++){
                 billArr.add(inCafe.get(i));
            }
            for(int i=0;i<takeOut.size();i++){
                billArr.add(takeOut.get(i));
            }
            System.out.println("Enter "
            + "\n1-if you want to print bill by Number of Bill"
            + "\n2-print all Bill in the System ");
            int n;
            boolean flagex=false;
            do{
            n=in.nextInt();
            if(n==1){
                System.out.println("Enter Number of bill");
                int billNum=in.nextInt();
                for(Bill e:billArr)
                    if(e.getNumOfBill()==billNum){
                        flagex=true;
                        System.out.println(e);}
                    }
                    else if(n==2) {
                        System.out.println(billArr.get(billArr.size()-1));
                        flagex=true;
                    }
                        
            }while(n!=1&&n!=2&&n!=3);
               if (!flagex)
                   System.out.println("Sorry, This number of Bill not exists");
                            
       }
       
       //customer information___________________________________________________
       else if(num==6){ 
            System.out.println("all customer information");
            for(int i=0;i<customers.size();i++){
                System.out.println(customers.get(i));
            }
            System.out.println("");          
       }
            
       
        //log out______________________________________________________
       else if(num==7){
            boolean flag0=false;
            for(;flag0==false;){
                System.out.print("Enter your ID: "); int userI=in.nextInt();
       
                for(int i=0;i<employees.size();i++){
            
                    if((employees.get(i)).compare(userI)){   
                        System.out.println("Hello "+employees.get(i).getName());flag0=true; 
                    }    
                }
                if(!flag0){
                   System.out.println("ID not found");
                }  
            }
       }
       
       
       //End program___________________________________________________
       else if(num==0){
                 num1=0; 
       }
       
       //if the user enters a number out of the list___________________________
        else if(num>=8){
           System.out.println("*************Unavailable number, *******************\n*************try again*******************");
           continue;  
        }
    }
        catch(InputMismatchException ex){
            System.err.println("Sory,you have entered a wrong data type "); 
            in.nextLine();
            }
        catch(Exception e){
            System.err.println("Sory,try again");
            } 
           
    }while(num1!=0); 
          
         
    } 
 
 }
       
