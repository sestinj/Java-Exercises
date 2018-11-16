/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle;
import java.io.*;
/**
 *
 * @author student
 */
public class NN implements Serializable {
    //Hyperparameters
    static double regCo = 0.1;
    
    
    private int inputSize;
    //Number of (total) layers
    private int l;
    //Nodes in each layer (includes input, output, and bias nodes)
    private int[] s;
    //Classes
    private int k;
    //Weights[layer][sender node][target node]
    private double[][][] theta;
    
    //INITIALIZERS
    public NN(double[][][] theta) {
        this.inputSize = theta[0].length;
        this.l = theta.length;
        this.s = new int[theta.length+1];
        for (int i = 0;i<theta.length;i++) {
            s[i] = theta[i].length;
        }
        s[theta.length] = theta[theta.length-1][0].length;
        this.k = s[s.length-1];
        this.theta = theta;
    }
    public NN(int[] s) {
        this.inputSize = s[0];
        this.l = s.length;
        this.s = s;
        this.k = s[s.length-1];
        this.theta = new double[l-1][][];
        for (int i = 0;i<l-1;i++) {
            this.theta[i] = new double[s[i]][];
            for (int j = 0;j<s[i];j++) {
                this.theta[i][j] = new double[s[i+1]];
                for (int k = 0;k<s[i+1];k++) {
                    theta[i][j][k] = Math.random();
                }
            }
        }
    }
    
    //FILE SAVING
    public void saveToFile(String name) {
        File file = new File(name);
        try {
            FileOutputStream out = new FileOutputStream(file);
            ObjectOutputStream write = new ObjectOutputStream(out);
            write.writeObject(this);
            write.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    static NN getFromFile(String name) {
        NN nn;
        File file = new File(name);
        try {
            FileInputStream in = new FileInputStream(file);
            ObjectInputStream read = new ObjectInputStream(in);
            nn = (NN)read.readObject();
            read.close();
            return nn;
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
        int[] array = {1,2,3};
        return new NN(array);
    }
    
    //RUNNING
    private double a(double z) {
        //Activator function
        return 1.0/(1 + Math.exp(-z));
    }
    private void pl(String txt) {
        System.out.println(txt);
    }
    private void p(String txt) {
        System.out.print(txt);
    }
    public double[] feedforward(double[] input) {
        //Make sure input size is correct
        if (input.length != s[0]) {
            System.err.println("Incorrect input size.");
        }
        //Activatd computed values, for each layer not including input
        double[][] a = new double[l-1][];
        //For each jump between layers
        for (int i = 0;i<l-1;i++) {
            //Set new layer's memory
            a[i] = new double[s[i+1]];
            //Calculate value for each node in the new layer
            for (int j = 0;j<s[i+1];j++) {
                double sum = 0;
                //Sum over nodes in previous layer, adding their value times weight
                for (int k = 0;k<s[i];k++) {
                    double weight = theta[i][k][j];
                    if (i==0) {
                        //Input
                        sum += input[k]*weight;
                    } else {
                        //Hidden layers
                        sum += a[i-1][k]*weight;
                    }
                }
                a[i][j] = a(sum);
            }
        }
        return a[a.length-1];
    }
    
    public void backprop(double[] output, double[] expected) {
        double diff = cost(output, expected, false);
        //For each layer, from the last hidden to the first hidden, working backwards
        for (int i = l-2;i>0;i--) {
            for (int k = 0;k<theta[i].length;k++) {
                for (int j = 0;j<theta[i][k].length;j++) {
                    
                }
            }
        }
    }
    
    public double cost(double[] output, double[] expected, boolean useReg) {
        //Diff = output - expected
        double sum = 0;
        for (int i = 0;i<output.length;i++) {
            sum += Math.abs(output[i] - expected[i])*Math.abs(output[i] - expected[i]);
        }
        
        //Regularization
        double reg = 0;
        for (int i = 0;i<theta.length;i++) {
            for (int j = 0;j<theta[i].length;j++) {
                for (int k = 0;k<theta[i][j].length;k++) {
                    reg += theta[i][j][k]*theta[i][j][k];
                }
            }
        }
        reg *= regCo;
        
        if (useReg) {
            return sum+reg;
        } else {
            return sum;
        }
    }
}

