/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13;

/**
 *
 * @author rominalodolo
 */
public class Shoes extends Clothing {

    private int UKsize;
    private String shoeTrims;

    public Shoes(int UKsize, String shoeTrims, String item, String description, int SKU, String materials, double price, double salePrice, char size) {
        super(item, description, SKU, materials, price, salePrice, size);
        this.UKsize = UKsize;
        this.shoeTrims = shoeTrims;
    }

    public int getUKsize() {
        return UKsize;
    }

    public void setUKsize(int UKsize) {
        this.UKsize = UKsize;
    }

    public String getShoeTrims() {
        return shoeTrims;
    }

    public void setShoeTrims(String shoeTrims) {
        this.shoeTrims = shoeTrims;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Uk Shoe Size: " + getUKsize());
        System.out.println("Shoe Trims: " + getShoeTrims());
    }
}
