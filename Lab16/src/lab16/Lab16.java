/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab16;

import java.util.ArrayList;

/**
 *
 * @author jannalomibao
 */
public class Lab16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //patient
        Patient p1 = new Patient("Rian", "Ramos", 100);
        Patient p2 = new Patient("Lovie", "Poe", 101);
        Patient p3 = new Patient("Gerald", "Diaz", 102);
        Patient p4 = new Patient("Princess", "Mae", 103);
        Patient p5 = new Patient("Kian", "James", 104);
        Patient p6 = new Patient("Ray", "Mond", 105);
        
        ArrayList<Integer> listPatientID = new ArrayList<>();
        listPatientID.add(p1.idPatient);
        listPatientID.add(p2.idPatient);
        listPatientID.add(p3.idPatient);
        listPatientID.add(p4.idPatient);
        listPatientID.add(p5.idPatient);
        listPatientID.add(p6.idPatient);
        
        ArrayList<Patient> listPatient = new ArrayList<>();
        listPatient.add(p1);
        listPatient.add(p2);
        listPatient.add(p3);
        listPatient.add(p4);
        listPatient.add(p5);
        listPatient.add(p6);

        
        //doctors
        DoctorFactory familyDoctorFactory = new FamilyDoctorFactory();
        DoctorAbstract familyDoctor = familyDoctorFactory.createDoctor(1, "Dr. James", new Person("James", "Key"));
        
        DoctorFactory allergistDoctorFactory = new AllergistDoctorFactory();
        DoctorAbstract allergistDoctor = allergistDoctorFactory.createDoctor(2, "Dr. Johnson", new Person("Kaye", "Abad"));
        
        DoctorFactory neuroDoctorFactory = new NeurologistDoctorFactory();
        DoctorAbstract neuroDoctor = neuroDoctorFactory.createDoctor(3, "Dr. Kim", new Person("Kim", "Jones"));
        
        //records
        PatientsRecord records = new PatientsRecord(listPatientID, listPatient);
        System.out.println(listPatient);
        //patient1
        records.addDoctorofPatient(p1.getIdPatient(), neuroDoctor);
        records.addDoctorofPatient(p1.getIdPatient(), allergistDoctor);
        
        //patient 2
        records.addDoctorofPatient(p2.getIdPatient(), neuroDoctor);
        records.addDoctorofPatient(p2.getIdPatient(), familyDoctor);
        
        //patient 3
        records.addDoctorofPatient(p3.getIdPatient(), neuroDoctor);
        records.addDoctorofPatient(p3.getIdPatient(), familyDoctor);
        records.addDoctorofPatient(p3.getIdPatient(), allergistDoctor);
        
        //patient 4
        records.addDoctorofPatient(p4.getIdPatient(), neuroDoctor);
        records.addDoctorofPatient(p4.getIdPatient(), allergistDoctor);
    
//        System.out.println(records.listPatient);
//        System.out.println(records.listPatientID);
//        System.out.println(records.listofDoctorofPatient);
//        
        
        //main form
        MainForm myFrame = new MainForm();
        Controller controller = Controller.getInstance(records,myFrame);
        controller.showForm();
       
    }
    
}
