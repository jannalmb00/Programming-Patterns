/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

/**
 *
 * @author 2322746
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListNode list1 = new ListNode(7);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);
        list1.next.next.next = new ListNode(2);
        ListNode num = insertionSortList(list1);
        
        print(list1);
        System.out.println(countNode(list1));
        System.out.println(list1 == null);
        System.out.println(prev(list1, list1.next.next.next));
        list1.next = list1.next.next.next.next;
        System.out.println(list1.next);
        
    }
     public static ListNode insertionSortList(ListNode head) {
         ListNode num1 =head;
         ListNode num2 = head.next;
         ListNode key = head.next;
         ListNode copyHead = head;
         
         for(int i = 1; i < countNode(head); i++){
             int j = i - 1;
             
             while( num1.val > num2.val && j >= 0){
                 System.out.println("num 1 : "+num1.val+" num2: "+num2.val+" key: "+key.val);
                 print(copyHead);
                 if(prev(copyHead, num1 ) == null){
                         copyHead = num2;
                     }
                 
                     num1.next = num1.next.next;
                     num2.next = num1;
                     
                     print(copyHead);
                     System.out.println(num1.val);
                     num1 = prev(copyHead,num2);
                     System.out.println(num1);
                     System.out.println(num2.val);
                     
                    
                 
                 
              j--;
                 System.out.println(j);
                 
             key = key.next;
             num2 = key;
                 System.out.println(num2.val);
                 print(copyHead);
             num1 = prev(copyHead,num2);
             System.out.println("num 1 : "+num1.val+" num2: "+num2.val+" key: "+key.val);
             }
              key = key.next;
             num2 = key;
             num1 = prev(copyHead,num2);
            
             
             
             
            
         }
         
         
         
        return null;
    }
     public static void print(ListNode head){
         ListNode current = head;
         while(current != null){
             System.out.print(current.val+ " ");
             current = current.next;
         }
         System.out.println();
     }
     public static int countNode(ListNode head){
         int count = 0;
         ListNode current = head;
         while( current != null){
             count++;
             current = current.next;
         } 
         return count;
     }
     public static ListNode prev(ListNode head, ListNode node){
         if(node == head){
             return null;
         }
         ListNode current = node;
         ListNode prev = null;
         
         while (current != node){
             prev = current ;
             current = current.next;
         }
         return prev;
     }
}
