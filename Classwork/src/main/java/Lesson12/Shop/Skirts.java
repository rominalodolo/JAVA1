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
public class Skirts extends Clothing {

    private String style;
    private int waistSize;

    public Skirts(String style, int waistSize, String item, String description, int SKU, String materials, double price, double salePrice, char size) {
        super(item, description, SKU, materials, price, salePrice, size);
        this.style = style;
        this.waistSize = waistSize;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getWaistSize() {
        return waistSize;
    }

    public void setWaistSize(int waistSize) {
        this.waistSize = waistSize;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Style: " + getStyle());
        System.out.println("Waist Size: " + getWaistSize());
    }
}
