/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BrowserHistoryApp;

import javax.swing.JOptionPane;

/**
 * @author Daniel García
 * 1 feb 2024
 */
public class BrowserHistoryApp {
    
    public static void main(String[] args){
        MyStack stack = new MyStack();
    
        //Add two three browser history objects to the stack
        for(int i=0; i<3; i++){
            String url = JOptionPane.showInputDialog("Please introduce url of your website");
            String title = JOptionPane.showInputDialog("Please introduce title of your website");
            
            BrowserHistory bh = new BrowserHistory(url, title);
            stack.push(bh);
        }
        
        //show front element
        System.out.println("The front element of the stack is:\n" + stack.peek());
        
        //remove top element of stack
        BrowserHistory bhDel = (BrowserHistory)stack.pop();
        System.out.println("One element was deleted, the title was: " + bhDel.getPageTitle());
        
        //Display all history elements
        stack.displayStack();
    }
}
