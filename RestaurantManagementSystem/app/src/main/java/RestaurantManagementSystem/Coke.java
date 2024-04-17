/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantManagementSystem;

/**
 *
 * @author jannalomibao
 */
public class Coke implements Product{

    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "Coke";
    }
    
}
