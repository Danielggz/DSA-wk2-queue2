/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BrowserHistoryApp;

import java.util.ArrayList;

/**
 * @author Daniel García
 * 1 feb 2024
 */
public class MyStack implements StackInterface{
    ArrayList<BrowserHistory> stackList;
    
    public MyStack() {
        stackList = new ArrayList<>();        
    }
   
    @Override
    public boolean isEmpty(){
        return stackList.isEmpty();        
    }
    
    @Override
    public void push(Object newItem){
        stackList.add(0, (BrowserHistory)newItem); //need to downcast our Object to a String
    }
    
    @Override
    public Object pop(){
        if (!(stackList.isEmpty())){
            return stackList.remove(0);
        }else{
            return null;
        }
    }

    @Override
    public Object peek() {
      if (stackList.isEmpty()) {
          System.out.println("Empty stack");
          return null;
      } else {    
          return stackList.get(0);
      }
    }

    @Override
    public int size(){
        return stackList.size();
    }

    @Override
    public void displayStack(){
       if(stackList.isEmpty()){
           System.out.println("Stack is empty at the moment.");
       }else{
           for (int i = 0; i<stackList.size(); i++){
               BrowserHistory bh = (BrowserHistory)stackList.get(i);
               System.out.println(bh.toString());
           }
       }
    }
}
