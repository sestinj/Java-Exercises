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
        runNN();
    }
    private static void saveNN() {
        int[] s = {10, 20, 15, 5};
        NN nn = new NN(s);
        nn.saveToFile("savedNN.dat");
    }
    private static void runNN() {
        NN nn = NN.getFromFile("savedNN.dat");
        double[] input = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        System.out.println(Arrays.toString(nn.feedforward(input)));
    }
    private static void trainNN() {
        for (int i = 0;i<20;i++) {
            NN nn = NN.getFromFile("savedNN.dat");
            double[] input = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
            double[] output = nn.feedforward(input);
            double[] expected = {2.0, 4.0, 6.0, 8.0, 10.0, 12.0, 14.0, 16.0, 18.0, 20.0};
            nn.backprop(output, expected);
        }
    }
    static void p(String txt) {
        System.out.print(txt);
    }
    static void pl(String txt) {
        System.out.println(txt);
    }
    
    
    
}
