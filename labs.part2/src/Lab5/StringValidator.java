/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author user
 */
public class StringValidator {
    
    public static String validate(String string) {
        String result = string;
        
        result = validateZhiShi(result);
        result = validateChaSha(result);
        result = validateChuShu(result);
        
        return result;
    }
    
    private static String validateZhiShi(String string) {
        String result = string;
        
        result = result.replaceAll("жы", "жи");
        result = result.replaceAll("шы", "ши");
        
        return result;
    }
    
    private static String validateChaSha(String string) {
        String result = string;
        
        result = result.replaceAll("чя", "ча");
        result = result.replaceAll("щя", "ща");
        
        return result;
    }
    
    private static String validateChuShu(String string) {
        String result = string;
        
        result = result.replaceAll("чю", "чу");
        result = result.replaceAll("щю", "щу");
        
        return result;
    }
}
