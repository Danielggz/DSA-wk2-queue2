/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ticketqueueapp;

import java.util.ArrayList;

/**
 * @author Daniel García
 * 1 feb 2024
 */
public class MyQueue implements QueueInterface{
    ArrayList<Ticket> queueList;

    public MyQueue() {
        queueList = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return queueList.isEmpty(); //ArrayList method isEmpty
    }

    @Override
    public int size() {
        return queueList.size();
    }

    @Override
    public Object frontElement() {
        if(!queueList.isEmpty()){
            return queueList.get(0);
        }else{
            return null;
        }
    }

    @Override
    public void enqueue(Object element) {
        queueList.add((Ticket)element);
    }

    @Override
    public Object dequeue() {
        if(!queueList.isEmpty()){
            return queueList.remove(0);
        }else{
            return null;
        }
    }
    
    @Override
    public void displayQueue(){
        if(!queueList.isEmpty()){
            for(int i=0; i<size(); i++){
                Ticket t = (Ticket) queueList.get(i);
                System.out.println(t.toString());
            }
        }else{
            System.out.println("Queue is empty at the moment.");;
        }
    }
    
    @Override
    public Ticket search(String name){
        if(!queueList.isEmpty()){
            for(int i=0; i<size(); i++){
                Ticket t = (Ticket) queueList.get(i);
                if(t.getName().equals(name)){
                    return t;
                }
            }
            return null;
        }else{
            System.out.println("Queue is empty at the moment.");
            return null;
        }
    }
}
