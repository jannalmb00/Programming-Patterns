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
public class Patient extends Person{
    Person person;
    int idPatient;
    ArrayList<InpatientService> history;

    public Patient(String firstName, String lastName, int id) {
        super(firstName, lastName);
        idPatient = id;
        history = new ArrayList<>();
    }

    public Person getPerson() {
        return person;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public ArrayList<InpatientService> getHistory() {
        return history;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public void setHistory(ArrayList<InpatientService> history) {
        this.history = history;
    }
    
    public void addHistory(InpatientService service){
        history.add(service);
    }

    @Override
    public String toString() {
        return super.toString() + ", ID="+ getIdPatient(); 
    }
    
    public String getHistoryAsString() {
        StringBuilder sb = new StringBuilder();
        for (InpatientService service : history) {
            sb.append(service.getDescription()).append("\n");
        }
        return sb.toString();
    }
    
}
