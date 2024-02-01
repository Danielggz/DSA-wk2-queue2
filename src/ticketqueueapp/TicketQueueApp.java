/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ticketqueueapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel García
 */
public class TicketQueueApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyQueue queue = new MyQueue();
        //Introduce three Ticket objects
        for(int i=0; i<3; i++){
            String name = JOptionPane.showInputDialog("Please introduce a name for the ticket");  
            Ticket t = new Ticket(name);
            queue.enqueue(t);
        }
        //Introduce two TicketHolder objects
        for(int i=0; i<2; i++){
            String name = JOptionPane.showInputDialog("Please introduce a ticket holder name");  
            int phone = Integer.parseInt(JOptionPane.showInputDialog("Please introduce a phone number"));
            int ticket_n = Integer.parseInt(JOptionPane.showInputDialog("Please introduce a ticket number"));
            Ticket th = new TicketHolder(name, phone, ticket_n);
            queue.enqueue(th);
        }
        //get front element of Stack
        System.out.println("Front element: " + queue.frontElement());
        System.out.println("Size of queue: " + queue.size());
        
        //remove one element
        Ticket delT = (Ticket) queue.dequeue();
        System.out.println("\nTicket from '" + delT.getName() + "' was successfully removed!");
        
        //Show all elements
        queue.displayQueue();
        
        //Search by name
        String nameSearch = JOptionPane.showInputDialog("Please introduce a ticket name to search");
        Ticket foundT = queue.search(nameSearch);
        if(foundT != null){
            System.out.println("\nThe ticket found is:\n" + foundT.toString());
        }else{
            System.out.println("\nThere is no tickets associated to that name");
        }
    }
    
}
