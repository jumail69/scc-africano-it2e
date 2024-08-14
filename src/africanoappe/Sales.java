
package africanoappe;

import java.util.Scanner;


public class Sales {
    
   public void getSales(){
       
     Scanner input =new Scanner(System.in);
        
       
        
        System.out.print("Enter Customer Name: ");
        String Customer= input.nextLine();
        
        System.out.print("Enter Product name Name: ");
         String product= input.nextLine();
        
        System.out.print("Enter Quantity: ");
        int Quant = input.nextInt();
        System.out.print("Enter Price: ");
        int Price = input.nextInt();
        System.out.print("Enter Cash: ");
        int Cash = input.nextInt();
        
        System.out.println("---------------------");   
        System.out.println("RECEIPT");
        System.out.println("----------------------");
     
        System.out.println("Name:"+Customer);
        System.out.println("Item:"+Product);
        System.out.println("Quantity:"+Quant);
        System.out.println("--------------------");
        System.out.println("Total due:"+(Quant*Price));
        System.out.println("Cash"+(Cash));
        System.out.println("----------------------");
        System.out.println("Change:"+(Cash-(Quant*Price)));
        System.out.println("-------------------------");
       
       
       
       
       
       
   } 
    
    
    
    
    
}
