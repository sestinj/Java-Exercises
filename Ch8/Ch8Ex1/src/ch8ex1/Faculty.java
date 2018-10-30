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
public class Faculty extends UEmployee {
    private String department;
    public String getDepartment() {
        return this.department;
    }
    public Faculty(int salary, String name, String department) {
        super(salary, name);
        this.department = department;
    }
}
