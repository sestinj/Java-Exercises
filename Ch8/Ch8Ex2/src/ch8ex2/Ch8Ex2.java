/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8ex2;

/**
 *
 * @author student
 */
public class Ch8Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonalAcct person = new PersonalAcct(200, "A person");
        System.out.println(person.toString());
        person.withdrawal(150);
        System.out.println(person.toString());
        
        BusinessAcct berson = new BusinessAcct(501, "A business");
        System.out.println(berson.toString());
        berson.withdrawal(150);
        System.out.println(berson.toString());
    }
    
}
