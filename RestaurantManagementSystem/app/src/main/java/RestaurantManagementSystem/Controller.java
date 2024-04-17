package RestaurantManagementSystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jannalomibao
 */
public class Controller {
    private ManagementSystem management;
    private MainForm mainForm;
   // private Controller controllerObject = new Controller();

    public Controller() {
    }

    public Controller( MainForm mainForm) {
        this.mainForm = mainForm;
        this.management = mainForm.managementSystem;
        
        
    }

    public ManagementSystem getManagement() {
        return management;
    }

    public MainForm getMainForm() {
        return mainForm;
    }

//    public Controller getControllerObject() {
//        return controllerObject;
//    }

    public void setManagement(ManagementSystem management) {
        this.management = management;
    }

    public void setMainForm(MainForm mainForm) {
        this.mainForm = mainForm;
    }

//    public void setControllerObject(Controller controllerObject) {
//        this.controllerObject = controllerObject;
//    }
    
    public void showForm(){
        mainForm.show();
    }

    
    
}
