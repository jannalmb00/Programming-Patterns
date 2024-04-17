/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab15;

/**
 *
 * @author jannalomibao
 */
public abstract class BookAbstract {
    int id;
    String title;
    String author;
    String category;
    boolean status;

    public BookAbstract(int id, String title, String author,String category, boolean status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.status= status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }
 
    public String getCategory() {
        return category;
    }

    public boolean isStatus() {
        return status;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    public String printBook(){
        return   getId() + ", " + getTitle() + ", " +getAuthor() ;
    }
}
