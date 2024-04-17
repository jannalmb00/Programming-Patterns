/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantManagementSystem;

/**
 *
 * @author jannalomibao
 */
public class ChickenPotatoSauce implements Product{

    @Override
    public double getCost() {
        return 23;
    }

    @Override
    public String getDescription() {
        return "Chicken and Potato with Dijon Cream sauce";
    }
    
}
