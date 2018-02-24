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
import java.util.*;

class PlayerRunner {

    public static void main(String[] args) {
        Player player = new Player("scom.au");
        player.start();
        
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int commandCode = scanner.nextInt();
                
                switch (commandCode) {
                    case 1:
                        player.suspend();
                        System.out.println("Suspended");
                        break;
                        
                    case 2:
                        player.resume();
                        System.out.println("Resumed");
                        break;
                        
                    case 3:
                        player.stop();
                        System.out.println("Stopped");
                        break;
                        
                    default:
                        System.out.println("Unknown command");
                }
            } catch (Exception ex) {
                System.err.println(ex);
            }
        }
    }
}
