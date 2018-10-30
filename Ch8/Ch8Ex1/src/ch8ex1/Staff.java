/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8ex1;

/**
 *
 * @author student
 */
public class Staff extends UEmployee {
    private String jobTitle;
    public String getJobTitle() {
        return this.jobTitle;
    }
    public Staff(int salary, String name, String jobTitle) {
        super(salary, name);
        this.jobTitle = jobTitle;
    }
}
