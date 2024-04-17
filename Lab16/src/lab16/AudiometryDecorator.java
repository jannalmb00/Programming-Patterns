/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab16;

/**
 *
 * @author jannalomibao
 */
public class AudiometryDecorator extends InpatientServiceDecorator{
    
    public AudiometryDecorator(InpatientService decoratedService) {
        super(decoratedService);
    }
    @Override
    public String getDescription() {
        // Append "Blood Test" to the existing description
        return super.getDescription() + ", Audiometry";
    }

    @Override
    public double getCost() {
        // Add the cost of blood test to the existing cost
        return super.getCost() + 20; // Assuming blood test costs $50
    }
    
}
