/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
    System.out.println("Enter x: ");
    double x = input.nextDouble();
    
    System.out.println("Enter y: ");
    double y = input.nextDouble();
    
    System.out.println("Select the operation to be performed");
    System.out.println("1 Plus");
    System.out.println(" 2 Minus");
     System.out.println("3 Times");
    System.out.println("4 Divide");
    int operation = input.nextInt();
    
    
    switch(operation)
    {
        case 1: 
            System.out.println(x + y);
            break;
          
        case 2:
            System.out.println(x - y);
            break;
            
        case 3:
            System.out.println(x * y);
            break;
            
        case 4: 
            System.out.println(x / y);
            
            
    }

      
    
    
    }
}

