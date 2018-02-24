/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.*;  
/**
 *
 * @author user
 */
public class StackTest { 
  static boolean checkParity(String expression, String open, String close){  
    Stack<String> stack = new Stack<>();  
    StringTokenizer st = new StringTokenizer(expression," \t\n\r+*/-(){}", true);
    
    while (st.hasMoreTokens()) { 
       	String tmp = st.nextToken();

   	if (tmp.equals(open)) stack.push(open);
	if (tmp.equals(close)) {
            if (stack.isEmpty()) return false;
            
            stack.pop();
        }
    }
    
    return stack.isEmpty();  
  } 
  public static void main(String[] args){  
    System.out.println( 
      checkParity("a - (b - (c - a) / (b + c) - 2))", "(", ")"));  
  }  
}
