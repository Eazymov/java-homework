/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author user
 */
import java.io.*;
import java.util.*;
import java.text.*;

class SerDate {

    public static void main(String[] args) throws Exception {
        GregorianCalendar d = new GregorianCalendar();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("date.ser"));
        
        oos.writeObject(d);
        oos.flush();
        oos.close();
        
        Thread.sleep(1000);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("date.ser"));
        GregorianCalendar oldDate = (GregorianCalendar) ois.readObject();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        
        ois.close();
        
        GregorianCalendar newDate = new GregorianCalendar();
        
        System.out.println(
            "Old time = "
            + sdf.format(oldDate.getTime()) +
            "\nNew time = " + sdf.format(newDate.getTime())
        );
    }
}
