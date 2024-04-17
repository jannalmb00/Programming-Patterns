/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab16;

import java.util.ArrayList;

/**
 *
 * @author jannalomibao
 */
public abstract class DoctorAbstract implements PatientObserver{
    int id;
    String name;
    Person person;

    public DoctorAbstract(int id, String name, Person person) {
        this.id = id;
        this.name = name;
        this.person = person;
    }

    @Override
    public  void update(int patientId){
         System.out.println("Doctor " + id + " notified of new history added to patient " + patientId );

    }
    
    


    
}
