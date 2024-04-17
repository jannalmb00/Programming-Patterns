/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab15;

/**
 *
 * @author jannalomibao
 */
public class Lab15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //libray 
        LibraryController library = new LibraryController();
        library.addBook(100, "The Alchemist", "Paulo Coelho","Fiction",true);
        library.addBook(101, "Holes", "Louis Sachar","Fiction",true);
        library.addBook(102, "Alone", " Megan E. Freeman", "Fiction",true);
        library.addBook(200, "The uses of Literacy", "Richard Hoggart","Academic",true);
        library.addBook(201, "Algorithms", "Robert Sedgewick","Academic",true);
        library.addBook(300, "Becoming By Michelle Obama","Michelle Obama" ,"Biography",true);
 
        

        MainForm myFrame = new MainForm();
        
        Controller controller = Controller.getInstance(library,myFrame);
   
        controller.showForm();

    }
    
}
