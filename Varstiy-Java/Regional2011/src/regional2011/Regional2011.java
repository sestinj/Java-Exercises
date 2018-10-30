/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regional2011;

/**
 *
 * @author student
 */
public class Regional2011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Checker checker = new Checker();
        while (true) {
            checker.setID();
            String id = checker.getID();
            if (id.equals("?")) {
                break;
            }
            boolean isValid = checker.checkID();
            if (isValid) {
                System.out.println("Answer: " + id + " is a valid identifier");
            } else {
                System.out.println("Anwer: " + id + " is not a valid identifier");
            }
        }
    }
    
}
