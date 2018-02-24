/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author user
 */
public class Product {
    String name;
    String vendorCode;
    int count;
    int price;
    
    Product(String name, String vendorCode, int count, int price) {
        this.name = name;
        this.vendorCode = vendorCode;
        this.count = count;
        this.price = price;
    }
}
