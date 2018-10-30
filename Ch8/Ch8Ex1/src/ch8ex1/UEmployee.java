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
public class UEmployee {
    private int salary;
    private String name;
    
    public String getName() {
        return this.name;
    }
    public int getSalary() {
        return this.salary;
    }
    
    public UEmployee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }
}
