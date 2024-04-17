/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab16;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author jannalomibao
 */
public class PatientsRecord {
    ArrayList<Integer> listPatientID = new ArrayList<>();
    ArrayList<Patient> listPatient = new ArrayList<>();
    HashMap<Integer,ArrayList<DoctorAbstract>> listofDoctorofPatient ;

    public PatientsRecord( ArrayList<Integer> listPatientID,ArrayList<Patient> listPatient) {
        this.listPatientID = listPatientID;
        this.listPatient = listPatient;
        listofDoctorofPatient = new HashMap<>();
    }
    

    public ArrayList<Integer> getListPatientID() {
        return listPatientID;
    }

    public HashMap<Integer, ArrayList<DoctorAbstract>> getListofDoctorofPatient() {
        return listofDoctorofPatient;
    }

    public void setListPatientID(ArrayList<Integer> listPatientID) {
        this.listPatientID = listPatientID;
    }

    public void setListofDoctorofPatient(HashMap<Integer, ArrayList<DoctorAbstract>> listofDoctorofPatient) {
        this.listofDoctorofPatient = listofDoctorofPatient;
    }
    public void addDoctorofPatient(int idPatient, DoctorAbstract doctor ){
        if(listPatientID.contains(idPatient)){
            listofDoctorofPatient.put(idPatient, listofDoctorofPatient.getOrDefault(idPatient, new ArrayList<>()));
            listofDoctorofPatient.get(idPatient).add(doctor);
            listPatient.add(getPatient(idPatient));
        }else{
            System.out.println("Patient not recognized");
        }
    }
    public void removeDoctorOfPatient(int idPatient, DoctorAbstract doctor ){
        if (listPatient.contains(idPatient)) {
            List<DoctorAbstract> doctors = listofDoctorofPatient.get(idPatient);
            if (doctors != null) {
                doctors.remove(doctor);
                System.out.println("Doctor removed successfully.");
            } else {
                System.out.println("No doctors found for this patient.");
            }
        } else {
            System.out.println("Patient not recognized");
        }
        
    }
    public void notifyDoctor(int patientID){
        Patient patient = getPatient(patientID);
        ArrayList<DoctorAbstract> doctors = listofDoctorofPatient.getOrDefault(patientID, new ArrayList<>());
        
        for(DoctorAbstract doctor : doctors){
            doctor.update(patientID);
        }
        
        
    }
    public Patient getPatient(int id){
        for (Patient patient : listPatient) {
            if (patient.getIdPatient() == id) {
                return patient;
            }
        }
        return null; // Return null if patient not found
    

    }

    
    
}
