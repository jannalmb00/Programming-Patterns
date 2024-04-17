/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab15;

/**
 *
 * @author jannalomibao
 */
public class AcademicBookFactory extends BookFactory {
    @Override
    public BookAbstract createBook(int id, String title, String author, String category,boolean avail) {
        return new AcademicBook(id, title, author, category,avail);
    }
    
}
