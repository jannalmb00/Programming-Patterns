/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantManagementSystem;

/**
 *
 * @author jannalomibao
 */
public class Barbecue extends AppetizerDecorator {
    
    public Barbecue(Appetizer appetizerDecorated) {
        super(appetizerDecorated);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with barbecue sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
    
}
