/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex14;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Calculator {
    int aNY;
    int aNJ;
    int aC;
    
    int mNY;
    int mNJ;
    int mC;
    
    public void setVars() {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Election results for New York:");
        System.out.print("Awbrey: ");
        aNY = input.nextInt();
        System.out.print("Martinez: ");
        mNY = input.nextInt();
        
        System.out.println("Election results for New Jersey:");
        System.out.print("Awbrey: ");
        aNJ = input.nextInt();
        System.out.print("Martinez: ");
        mNJ = input.nextInt();
        
        System.out.println("Election results for Connecticut:");
        System.out.print("Awbrey: ");
        aC = input.nextInt();
        System.out.print("Martinez: ");
        mC = input.nextInt();
    }
    
    public void createTable() {
        int aTot = aNY+aNJ+aC;
        int mTot = mNY+mNJ+mC;
        int tot = aTot + mTot;
        System.out.format("%-8s %8s %8s", "Candidate", "Votes", "Percentage\n");
        System.out.format("%-8s %8s %8s %1s", "Awbrey", aTot, (double)aTot/(double)tot*100.0, " %\n");
        System.out.format("%-8s %8s %8s %1s", "Martinez", mTot, (double)mTot/(double)tot*100.0, " %\n");
    }
    
}
