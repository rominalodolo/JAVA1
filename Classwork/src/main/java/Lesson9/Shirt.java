/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9;

/**
 *
 * @author rominalodolo
 */
public class Shirt {

    private int shirtID;
    private String description;
    private char colorCode;
    private double price;

    public Shirt(int shirtID, String description, char colorCode, double price) {
        this.shirtID = shirtID;
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
    }

    public int getShirtID() {
        return shirtID;
    }

    public void setShirtID(int shirtID) {
        this.shirtID = shirtID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        if (colorCode == 'B') {
            this.colorCode = colorCode;
        } else if (colorCode == 'G') {
            this.colorCode = colorCode;
        } else if (colorCode == 'R') {
            this.colorCode = colorCode;
        } else if (colorCode == 'Y') {
            this.colorCode = colorCode;
        } else {
            this.colorCode = 'U';
        }
    }

    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String print(){
        return "Shirt ID: " + shirtID + "\n" + 
                "Description: " + description + "\n" + 
                "Colour Code: " + colorCode + "\n" + 
                "Price: " + price + "\n" + 
    }
}
