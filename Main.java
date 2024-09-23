/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rossstore;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // menu list
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to Ross Store, how can i help you?\n Please enter Y");
        double totalcost = 0;
        double price = 0;
        int quantity = 0;
        double Subtotal = 0;

        String productname = "";
        String loop = reader.next();
        boolean check = false;
        while (loop.equalsIgnoreCase("Y")) {
            System.out.println("Please select item\n"
                    + "Product--------Price----Code\n"
                    + "Pork sisig      P60        1\n"
                    + "Kaldereta       P50        2\n"
                    + "Pastil          P10        3\n"
                    + "Coke            P15        4\n"
                    + "Ice Cream       P25        5\n");


            System.out.println("Type the code and the quantity you want to purchase"); //code and quantity in one line
            int code = reader.nextInt();


            switch (code) {
                case 1:
                    price = 60;
                    productname = "Pork Sisig";
                    check = true;
                    break;
                case 2:
                    price = 50;
                    productname = "Kaldereta";
                    check = true;
                    break;
                case 3:
                    price = 10;
                    productname = "Pastil";
                    check = true;
                    break;
                case 4:
                    price = 15;
                    productname = "Coke";
                    check = true;
                    break;
                case 5:
                    price = 25;
                    productname = "Ice Cream";
                    check = true;
                    break;

            }

            if (check == true)  {
                System.out.println("You selected " + productname + " * " + price + " = PHP " + "\nEnter quality");
                quantity = reader.nextInt();
                double subtotal = price * quantity;

                totalcost += subtotal;
                System.out.println("Your Subtotal is " + totalcost);
                //Ask if user want order another item
                System.out.println("Do you want to order another item? (yes/no)");
                loop = reader.next(); //update 'loop' for the loop condition
            }

            double discount = 0;
            double totalcost2 = 0;
            if (totalcost>=500) ; {
                discount= totalcost * 0.2;
                totalcost2 = discount;
                totalcost2 = totalcost - discount;
                System.out.println("discount applied: " + discount) ;




            }
           
            

    
             if(loop.equalsIgnoreCase("N")) {
                System.out.println("Total: PHP " + totalcost2);

                //Ask user to enter the payment amount
                double payment = 0.0;
                do {
                    System.out.println("Please enter the amount of money to pay: ");
                    payment = reader.nextDouble();

                    // Check if payment is sufficient
                    if (payment < totalcost2) {
                        System.out.println("Insufficient funds. You need at least exact amount of money ");
                    } else {
                        double change = payment - totalcost2;
                        System.out.println("Payment accepted. Your change is PHP " + change + "\nThank you for shopping with Us!");

                    }
                } while (payment < totalcost);
                check = true;
                System.out.println("---------------------------------------");

            }
        }
    }
}
        
    


