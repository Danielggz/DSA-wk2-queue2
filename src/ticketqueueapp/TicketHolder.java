/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ticketqueueapp;

/**
 * @author Daniel García
 * 1 feb 2024
 */
public class TicketHolder extends Ticket{
    private int mobile, ticket_n;

    public TicketHolder(String name, int mobile, int ticket_n) {
        super(name);
        this.mobile = mobile;
        this.ticket_n = ticket_n;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public void setTicket_n(int ticket_n) {
        this.ticket_n = ticket_n;
    }

    public int getMobile() {
        return mobile;
    }

    public int getTicket_n() {
        return ticket_n;
    }

    @Override
    public String toString() {
        return "TicketHolder info:\n" + "Mobile number: " + mobile + "\nTicket number:" + ticket_n;
    }
    
    
    
    
}
