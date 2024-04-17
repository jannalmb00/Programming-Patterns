/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jannalomibao
 */
public class ManagementSystem {
    HashMap<Long,ArrayList<Product>> orders;

    public ManagementSystem() {
        orders = new HashMap<>();
    }
    
    public void addOrder(long number, Product product){
        if(isValidPhoneNumber(number)){
            ArrayList<Product> order = orders.getOrDefault(number, new ArrayList<>());
            order.add(product);
            orders.put(number, order);
        }
        
    }
    public boolean isValidPhoneNumber(long number){
        String numberString = Long.toString(number);
        if(numberString.length() != 10){
            return false;
        }
        return true;
    }

    public  ArrayList<Product> getOrders(long number) {
        return orders.get(number);
    }
    

}
