/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolvingExamReview;

/**
 *
 * @author soblab
 */
public class Product {
    private int barcode;
    private String name;
    private double price;
    
    
    public Product(){
        String name = null;
        int barcode = 0;
        double price = 0.0;
    }
    
    public Product(String name , int barcode , double price){
        this.name = name;
        this.barcode = barcode;
        this.price = price;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
