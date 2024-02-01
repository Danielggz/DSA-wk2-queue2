/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ticketqueueapp;

/**
 * @author Daniel García
 * 1 feb 2024
 */
public class Ticket {
    private String name;

    public Ticket(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return """
               Ticket:
               name:""" + name;
    }
    
    
}
