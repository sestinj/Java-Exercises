/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle;
import java.io.*;
import java.lang.Math;
import java.util.*;
/**
 *
 * @author natesesti
 */
public class Oracle {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dictionary d = new Hashtable();
        d.put("One", 1);
        d.put("Two", 2);
        Integer i = (Integer)d.get("One");
        pl(i.intValue() + "");
    }
    static void p(String txt) {
        System.out.print(txt);
    }
    static void pl(String txt) {
        System.out.println(txt);
    }
    
    
    
}
