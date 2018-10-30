/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6ex1;

/**
 *
 * @author student
 */
public class HouseBuilder {
    private void p(String str) {
        System.out.println(str);
    }
    public void addRoof() {
        this.p("     /\\");
        this.p("    /  \\");
        this.p("   /    \\");
        this.p("  /      \\");
        this.p(" /        \\");
        this.p("/__________\\");
    }
    public void addBase() {
        this.p("|          |");
        this.p("|          |");
        this.p("|          |");
        this.p("|__________|");
    }
    public void addWalk() {
        this.p("     **       ");
        this.p("     **************");
    }
}
