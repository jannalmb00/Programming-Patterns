/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantManagementSystem;

/**
 *
 * @author jannalomibao
 */
public abstract class AppetizerDecorator extends Appetizer{
    Appetizer appetizerDecorated;

    public AppetizerDecorator(Appetizer appetizerDecorated) {
        this.appetizerDecorated = appetizerDecorated;
    }

    @Override
    public  double getCost(){
        return appetizerDecorated.getCost();
    }
    
    @Override
    public String getDescription() {
        return appetizerDecorated.getDescription();
    }

    
    
}
