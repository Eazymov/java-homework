/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "windows-1251");
        System.out.println("Enter a sequence of words:");
        String inputString = scanner.nextLine();
        
        String validatedString = StringValidator.validate(inputString);
        
        System.out.println(validatedString);
    }
}
