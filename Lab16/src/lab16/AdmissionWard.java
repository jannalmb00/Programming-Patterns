/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab16;

/**
 *
 * @author jannalomibao
 */
public class AdmissionWard implements InpatientService{

    @Override
    public String getDescription() {
        return "Admission ward";
    }

    @Override
    public double getCost() {
        return 0;
    }
    
}
