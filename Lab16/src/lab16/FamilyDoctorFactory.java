/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab16;

/**
 *
 * @author jannalomibao
 */
public class FamilyDoctorFactory extends DoctorFactory{

    @Override
    public DoctorAbstract createDoctor(int id, String name, Person person) {
        return new FamilyDoctor(id, name, person);
    }
    
}
