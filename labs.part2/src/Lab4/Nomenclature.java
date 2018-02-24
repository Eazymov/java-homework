/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */
public class Nomenclature {
    public List<Product> productsList = new ArrayList<>();
    
    public void loadFromFile(String path) throws IOException {
        this.productsList = this.getProductListFromFile(path);
    }
    
    private List<Product> getProductListFromFile(String path) throws IOException {
        List<Product> products = new ArrayList<>();
        
        try {
            FileReader fileReader = new FileReader(path);
            Scanner scanner = new Scanner(fileReader);
            String curStr;
            String[] strParts;
            
            while (scanner.hasNextLine()) {
                curStr = scanner.nextLine();
                strParts = curStr.split("\t");
                
                String name = strParts[0];
                String vendorCode = strParts[1];
                int count = Integer.parseInt(strParts[2]);
                int price = Integer.parseInt(strParts[3]);
                
                Product newProduct = new Product(name, vendorCode, count, price);
                products.add(newProduct);
            }
        
            return products;
        } catch (IOException ex) {
            throw new IOException(ex);
        }
    }
    
    public Product getProductByName(String name) throws Exception {
        for (Product product: productsList) {
            if (product.name.equals(name)) return product;
        }
        
        throw new Exception("Product not found");
    }
    
    public void sortFile(String path) throws IOException {
        List<Product> products = this.getProductListFromFile(path);

        try (PrintWriter fileWriter = new PrintWriter(path + ".sorted.txt", "UTF-8")) {
            Collections.sort(
                products,
                (left, right) -> left.name.compareTo(right.name)
            );

            for (Product product: products) {
                String nextLine = 
                    product.name + "\t" +
                    product.vendorCode + "\t" +
                    product.count + "\t" +
                    product.price;
                fileWriter.println(nextLine);
            }

            fileWriter.close();
        }
    }
}
