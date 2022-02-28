/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12.Shop;

/**
 *
 * @author rominalodolo
 */
public class Dress extends Clothing {

    private String length;
    private String dressDetails;

    public Dress(String length, String dressDetails, String item, String description, int SKU, String materials, double price, double salePrice, char size) {
        super(item, description, SKU, materials, price, salePrice, size);
        this.length = length;
        this.dressDetails = dressDetails;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getDressDetails() {
        return dressDetails;
    }

    public void setDressDetails(String dressDetails) {
        this.dressDetails = dressDetails;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Length: " + getLength());
        System.out.println("Dress Details: " + getDressDetails());
    }
}
