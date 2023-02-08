package billing;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Billing   
{  
    public static void main(String args[])   
        {  
        Product p = new Product();

            String id = null;  
            String productName = null; 
            int i=0;
            int quantity = 0;  
            int qty=0;
            double price = 0.0;  
            double totalPrice = 0.0;  
            double overAllPrice = 0.0;  
            double cgst, sgst, subtotal=0.0, discount=0.0;  
            char choice = '\0';  
            System.out.println("\t\t\t\t|-------------------Invoice-----------------|");  
            System.out.println(" \t\t\t\t|\t "+"     "+"Mamba Super Market            |");  
            System.out.println(" \t\t\t\t|\t\t1010 Narhe Pune             |");  
            System.out.println(" \t\t\t\t|\t\t"  +"  " +"Zeal Chowk                |");  
            System.out.println("\t\t\t\t|-------------------------------------------|");  
            System.out.println(" GSTIN: 03EPGPP78564965"+"\t\t\t\t\t\t\tContact: (+91) 7709377084");  
            
            
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");    
            Date date = new Date();    
            
            
            Calendar calendar = Calendar.getInstance();  
            String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }; 
            
            
         
            System.out.println("Date: "+formatter.format(date)+"  "+days[calendar.get(Calendar.DAY_OF_WEEK) - 1]+"\t\t\t\t\t\t (+91) 9673058628");  
           
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            Scanner scan = new Scanner(System.in);  
            System.out.print("Enter Customer Name: ");  
            String customername=scan.nextLine();  
           
            List<Product> product = new ArrayList<Product>();  
            do   
                {  
                     p = new Product();
                    System.out.println(" ");
                    System.out.println("List Of the Products:");
                    System.out.println(" ");
                    p.setProduct();
                    p.displayProducts();
                
                    System.out.println(" ");
                    System.out.println("Enter the product details ");  
                    System.out.println("--------------------------");  

                    System.out.println("Choose a Product: ");

                    i=scan.nextInt();

                    System.out.print("Quantity: ");  
                    quantity = scan.nextInt();  
                   
 
                    switch (i) {
					case 1:
						id="101";
						productName="Biscuit";
						price=40;
						qty = 50;
						totalPrice = price * quantity;  
						break;
						
					case 2:
						id="102";
						productName="Noodles";
						price=35;
						qty = 50;
						totalPrice = price * quantity;  
						break;
						
					case 3:
						id="103";
						productName="Soap";
						price=10;
						qty = 50;
						totalPrice = price * quantity;  
						break;
						
					case 4:
						id="104";
						productName="Wafers";
						price=20;
						qty = 50;
						totalPrice = price * quantity;  
						break;
						
					case 5:
						id="105";
						productName="Brush";
						price=15;
						qty = 50;
						totalPrice = price * quantity;  
						break;
						
					case 6:
						id="106";
						productName="ToothPaste";
						price=80;
						qty = 50;
						totalPrice = price * quantity;  
						break;
						
					case 7:
						id="107";
						productName="Hair Oil";
						price=110;
						qty = 50;
						totalPrice = price * quantity;  
						break;
					
					case 8:
						id="108";
						productName="Towel";
						price=250;
						qty = 50;
						totalPrice = price * quantity;  
						break;
						
					case 9:
						id="109";
						productName="Chocolate";
						price=25;
						qty = 50;
						totalPrice = price * quantity;  
						break;
						
					case 10:
						id="110";
						productName="Cold Drink";
						price=55;
						qty = 50;
						totalPrice = price * quantity;  
						break;
						
					case 11:
						id="111";
						productName="Spoon";
						price=40;
						qty = 50;
						totalPrice = price * quantity;  
						break;
						
					case 12:
						id="112";
						productName="Bread";
						price=32;
						qty = 50;
						totalPrice = price * quantity;  
						break;
						
					case 13:
						id="113";
						productName="Shampoo";
						price=76;
						qty = 50;
						totalPrice = price * quantity;  
						break;
						
					case 14:
						id="114";
						productName="Perfume";
						price=210;
						qty = 50;
						totalPrice = price * quantity;  
						break;
						
					case 15:
						id="115";
						productName="Spices";
						price=30;
						qty = 50;
						totalPrice = price * quantity;  
						break;

						
					default:
						break;
						
					}
                   Product pod = new Product();
                   pod.calculatequantity(i, quantity);
                    

                    
                    overAllPrice = overAllPrice + totalPrice;  
                   
                    product.add( new Product(id, productName, quantity, price, totalPrice, qty) );  
                    
                    System.out.print("Want to add more items? (y or n): ");  
                   
                    choice = scan.next().charAt(0);  
                      
                    scan.nextLine();  
                }   
            while (choice == 'y' || choice == 'Y');  
             
            Product.displayFormat();  
            for (Product po : product)   
            {  
                po.display();  
            }  
             
            System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " +overAllPrice);  
            
            discount = overAllPrice*2/100;  
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t    Discount (Rs.) " +discount);  
             
            subtotal = overAllPrice-discount;   
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal "+subtotal);  
            
            sgst=overAllPrice*8/100;  
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SGST (%) "+sgst);  
            cgst=overAllPrice*8/100;  
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t          CGST (%) "+cgst);  
            
            System.out.format("%2s","\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " +(subtotal+cgst+sgst));  
            System.out.println("");
            System.out.println("--------------------------------------------------Thank You for Shopping!!---------------------------------------------------------");  
            System.out.println("\t\t\t\t                     Visit Again");  
             
            System.out.println("");
            
            do{
            	 System.out.print("If you Want to See Remaining Quantity (y/n)");
                 choice = scan.next().charAt(0);  
                 
                 scan.nextLine(); 
            	switch(choice){
            	case 'y': Product pod = new Product();
            
            	p.displayProducts();
            	break;
            	default: System.out.println("Invalid choice");
            	}
            }
            while (choice == 'y' || choice == 'Y'); 
            choice = scan.next().charAt(0);  
            
            scan.nextLine();  
            
            scan.close();  
        }     
 
}





