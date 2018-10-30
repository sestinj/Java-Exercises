/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regional2013test45;
import java.io.*;
import java.lang.Double;
import java.lang.Integer;
/**
 *
 * @author student
 */
public class OrderProcessor {
    /**The OrderProcessor class takes a file as input, then processes it, calculates various things(including tax, shipping, etc...) and writes the output into a new file.*/
    private String inputName;
    private String outputName;
    private FileReader reader;
    private BufferedReader buffer;
    public OrderProcessor(String inputName, String outputName) {
        this.inputName = inputName;
        this.outputName = outputName;
    }
    public OrderProcessor() {
        this.inputName = "Orders.txt";
        this.outputName = "OrdersProcessed.txt";
        this.openFile(inputName);
    }
    private void openFile(String name) {
        //Open input or output file
        File file = new File(name);
        //Check that the file exists
        if (file.exists()) {
            try {
                reader = new FileReader(file);
                buffer = new BufferedReader(reader);
            } catch (IOException e) {
                System.out.println("The file could not be opened.");
                System.err.println("IOException: " + e.getMessage());
            }
            System.out.println("Order processing has begun.");
            this.readAndProcessFile();
        } else {
            //Create readers, using error handling
            System.out.println("The file does not exist.");
        }
    }
    private void closeFile() {
        //Close input or output file
        //Use error handling to make sure files are correctly closed in the right order
        try {
            buffer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Error closing the file.");
            System.err.println("IOExceptin: " + e.getMessage());
        }
        
    }
    private void p(String txt) {
        System.out.println(txt);
    }
    private void readAndProcessFile() {
        //Read and process the input order
        String line;
        boolean isFirstLine = true;
        try { 
            while ((line = buffer.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                } else {
                    //Process file to get data
                    int id =0;
                    int partNum=0;
                    double price=0.0;
                    int quantity=0;
                    String currentString = "";
                    int currentQuantity = 1;
                    for (int i = 0;i<line.length();i++) {
                        String currChar = line.substring(i, i+1);
                        if (currChar.startsWith("|")) {
                            switch (currentQuantity) {
                                case 1:
                                    id = Integer.parseInt(currentString);
                                    break;
                                case 2:
                                    partNum = Integer.parseInt(currentString);
                                    break;
                                case 3:
                                    price = Double.parseDouble(currentString);
                                    break;
                                case 4:
                                    quantity = Integer.parseInt(currentString);
                                    break;
                            }
                            currentQuantity ++;
                            currentString = "";
                        } else {
                            currentString += currChar;
                        }
                    }
                    this.calculateAndWrite(id, partNum, price, quantity);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            System.err.println("IOException: " + e.getMessage());
        }
    }
    private void calculateAndWrite(int id, int partNum, double price, int quantity) {
        //Calculate tax, shipping, write processed data to the output file
        double taxRate = 0.02;
        double shippingRate = 0.05;
        
        double tax = taxRate*quantity*price;
        double shipping = shippingRate*quantity*price;
        
        //Tries to make file, catches possible error
        File newFile;
        FileWriter writer;
        BufferedWriter bufferWrite;
        try {
            //Creates writer
            newFile = new File("OrdersProcessed.txt");
            newFile.createNewFile();
            writer = new FileWriter(newFile);
            bufferWrite = new BufferedWriter(writer);
            
            //Do Actual Writing to new file
            bufferWrite.write("Order Id: " + id);
            bufferWrite.newLine();
            bufferWrite.write("Part num: " + partNum);
            bufferWrite.newLine();
            bufferWrite.write("Price: " + price);
            bufferWrite.newLine();
            bufferWrite.write("Quantity: " + quantity);
            bufferWrite.newLine();
            bufferWrite.write("Tax: " + tax);
            bufferWrite.newLine();
            bufferWrite.write("Shipping: " + shipping);
            bufferWrite.newLine();
            bufferWrite.write("Total: " + (tax+shipping+quantity*price));
            bufferWrite.newLine();
            
            bufferWrite.close();
            writer.close();
            //Indicate that processing is complete
            System.out.println("Finished processing orders.");
        } catch (IOException e) {
            System.out.println("The file could not be created.");
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
