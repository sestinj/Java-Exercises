/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex12;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class GradeBook {
    private int[][] grades;
    
    public void getGrades() {
        grades = new int[12][5];
        Scanner input = new Scanner(System.in);
        for (int i  = 0;i<5;i++) {
            System.out.println("Test #" + (i+1));
            for (int j = 0;j<12;j++) {
                System.out.print("Student #" + (j+1) + " score: ");
                int score = input.nextInt();
                grades[j][i] = score;
            }
        }
    }
    public void showGrades() {
        for (int i  = 0;i<5;i++) {
            System.out.println("Test #" + (i+1));
            for (int j = 0;j<12;j++) {
                int score = grades[j][i];
                System.out.println("Student #" + (j+1) + " score: " + score);
            }
        }
    }
    private double studentAvg(int student) {
        double sum = 0;
        for (int i = 0;i<grades[student].length;i++) {
            sum += grades[student][i];
        }
        sum /= grades[student].length;
        return sum;
    }
    private double testAvg(int test) {
        double sum = 0;
        int length = grades.length;
        for (int i = 0;i<grades.length;i++) {
            sum += grades[i][test];
        }
        sum /= length;
        return sum;
    }
    
}
