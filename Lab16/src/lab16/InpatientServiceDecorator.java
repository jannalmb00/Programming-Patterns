/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab16;

/**
 *
 * @author jannalomibao
 */
public abstract class InpatientServiceDecorator implements InpatientService {
    protected InpatientService decoratedService;

    public InpatientServiceDecorator(InpatientService decoratedService) {
        this.decoratedService = decoratedService;
    }

    @Override
    public String getDescription() {
        return decoratedService.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedService.getCost();
    }
}
