/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Eazymov
 */
public class Main {
    public  static void main(String[] args) throws IOException {
        Nomenclature nomenclature = new Nomenclature();
        
        try {
            nomenclature.loadFromFile("nomenclature.txt");
            nomenclature.sortFile("nomenclature.txt");
        } catch (IOException ex) {
            throw new IOException(ex);
        }
        
        try {
            /* Scanner reader = new Scanner(System.in);
            System.out.println("Enter a product name:");
            String userInput = reader.nextLine(); */
            Product product = nomenclature.getProductByName("Сканер");
            
            System.out.println(
                "Product: " + product.name +
                "\nPrice: " + product.price +
                "\nVendor code: " + product.vendorCode
            );
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
