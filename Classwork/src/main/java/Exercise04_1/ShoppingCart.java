/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise04_1;

/**
 *
 * @author rominalodolo
 */
public class ShoppingCart {

    public static void main(String[] args) {
//        Declare and initialize 2 String variables: custName and itemDesc
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message;

//        Assign the message variable with a concatenation of the custName and itemDesc.  
//     Include a String literal that results in a complete sentence.  
//     (example: "Mary Smith wants to purchase a Shirt")
        message = custName + " wants to purchase a " + itemDesc;

//        Print the message to the System output.
        System.out.println(message);
    }
}
