/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ticketqueueapp;

/**
 *
 * @author Daniel García
 */
public interface QueueInterface {
    public boolean isEmpty();
    public int size();
    public Object frontElement();
    public void enqueue(Object element);
    public Object dequeue();
    public void displayQueue();
    public Object search(String str);
}
