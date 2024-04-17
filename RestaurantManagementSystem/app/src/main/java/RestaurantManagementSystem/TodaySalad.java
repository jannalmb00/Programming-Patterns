/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantManagementSystem;

/**
 *
 * @author jannalomibao
 */
public class TodaySalad implements Product{

    @Override
    public double getCost() {
        return 15.45;
    }

    @Override
    public String getDescription() {
        return "Today's Salad";
    }
    
}
