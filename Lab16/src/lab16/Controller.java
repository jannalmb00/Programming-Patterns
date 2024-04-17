/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab16;

/**
 *
 * @author jannalomibao
 */
public class Controller {
    PatientsRecord records;
    private MainForm mainFormView;
    private static Controller controllerObject;

    private Controller() {
    }

    private Controller(PatientsRecord records, MainForm mainFormView) {
        this.records = records;
        this.mainFormView = mainFormView;
    }
    public static Controller getInstance(){
        if(controllerObject == null){
            controllerObject = new Controller();
        }
        return controllerObject;
    }
    public static Controller getInstance(PatientsRecord records, MainForm mainFormView){
        if(controllerObject  == null){
            controllerObject = new Controller(records, mainFormView);
        }
        return controllerObject;
    }

    public PatientsRecord getRecords() {
        return records;
    }

    public void setRecords(PatientsRecord records) {
        this.records = records;
    }
    public void showForm(){
        mainFormView.show();
    }
  
    
}
