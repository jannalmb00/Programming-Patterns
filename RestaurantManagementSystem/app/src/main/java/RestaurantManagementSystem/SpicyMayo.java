/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantManagementSystem;

/**
 *
 * @author jannalomibao
 */
public class SpicyMayo extends AppetizerDecorator {
    
    public SpicyMayo(Appetizer appetizerDecorated) {
        super(appetizerDecorated);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Spicy Mayonaise";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1;
    }
    
    
}
