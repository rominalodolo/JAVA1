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
public class Clothing {
        private String item;
        private String description;
        private int SKU;
        private String materials;
        private double price;
        private double salePrice;
        private char size;

    public Clothing(String item, String description, int SKU, String materials, double price, double salePrice, char size) {
        this.item = item;
        this.description = description;
        this.SKU = SKU;
        this.materials = materials;
        this.price = price;
        this.salePrice = salePrice;
        this.size = size;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSKU() {
        return SKU;
    }

    public void setSKU(int SKU) {
        this.SKU = SKU;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
        
    public void print(){
        System.out.println("Item: " + getItem());
        System.out.println("Description: " + getDescription());
        System.out.println("SKU: " + getSKU());
        System.out.println("Materials: " + getMaterials());
        System.out.println("Price: " + getPrice());
        System.out.println("Sale Price: " + getSalePrice());
        System.out.println("Size: " + getSize());
    }    
}
