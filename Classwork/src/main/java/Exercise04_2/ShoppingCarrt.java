/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise04_2;

/**
 *
 * @author rominalodolo
 */
public class ShoppingCarrt {

    public static void main(String[] args) {

        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        double price = 41;
        double tax = 15;
        String message;
        String totalMessage;

        message = custName + " wants to purchase 1 Shirt " + itemDesc;
        
//      Calculate total by multiplying price * quantity * tax.
        totalMessage = "Total cost with tax is " + (price * 1 * tax);
        
        System.out.println(message);
        System.out.println(totalMessage);
        
    }
}
