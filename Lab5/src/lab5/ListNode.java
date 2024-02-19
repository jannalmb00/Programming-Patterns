/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author 2322746
 */
public class ListNode {
    int val;
    ListNode next;
    
    ListNode(){
        
    }
    ListNode(int val){
        this.val = val;
        
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    
}