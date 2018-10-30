/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex16;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Inventory {
    private ArrayList<String> names = new ArrayList<String>();
    private ArrayList<Integer> nums = new ArrayList<Integer>();
    private Scanner input = new Scanner(System.in);
    
    
    public void showMenu() {
        boolean stillGoing = true;
        while (stillGoing) {
            System.out.println("0: Quit\n1: Add Item\n2: Discontinue Item\n3: Get Amount of Item");
            switch(input.nextInt()) {
                case 0:
                    stillGoing = false;
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    discontinue();
                    break;
                case 3:
                    displayStock();
                    break;
            }
        }
    }
    
    public void addItem() {
        System.out.print("Enter the name of the item: ");
        String name;
        name = input.next();
        System.out.println("Enter the amount of the item: ");
        int num = input.nextInt();
        names.add(name);
        nums.add(new Integer(num));
        System.out.println("The new item's stock number is: " + (names.size() + 999));
    }
    public void discontinue() {
        System.out.println("Enter the stock number of the item: ");
        int index = input.nextInt() - 1000;
        if (index < nums.size() && index >= 0) {
            nums.remove(index);
            names.remove(index);
            nums.add(index, new Integer(0));
            names.add(index, "Discontinued");
            System.out.println("The item has been deleted.");
        } else {
            System.out.println("The item does not exist.");
        }
    }
    public void displayStock() {
        System.out.println("Enter the stock number of the item: ");
        int index = input.nextInt() - 1000;
        if (index < nums.size() && index >= 0) {
            System.out.println("The amount of stock is: " + nums.get(index));
        } else {
            System.out.println("The item does not exist.");
        }
    }
}
