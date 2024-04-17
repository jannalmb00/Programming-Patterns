/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab15;

/**
 *
 * @author jannalomibao
 */
public class Controller {
    LibraryController library = new LibraryController();
    private MainForm mainFormView;
    private static Controller controllerObject;
    
    private Controller() {
        
    }
    private Controller(LibraryController library, MainForm mainFormView) {
        this.library = library;
        this.mainFormView = mainFormView;     
    }
    public static Controller getInstance() {
        // create object if it's not already created
        if(controllerObject == null) {
           controllerObject = new Controller();
        }

         // returns the singleton object
         return controllerObject;
    }
    public static Controller getInstance(LibraryController library, MainForm mainFormView) {
        // create object if it's not already created
        if(controllerObject == null) {
           controllerObject = new Controller(library, mainFormView);
        }

         // returns the singleton object
         return controllerObject;
    }

    

    public void setLibrary(LibraryController library) {
        this.library = library;
    }

    public LibraryController getLibrary() {
        return library;
    }
    public void showForm() {
        mainFormView.show();
    }

    
}
