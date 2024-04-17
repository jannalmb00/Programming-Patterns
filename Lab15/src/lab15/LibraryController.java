/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author jannalomibao
 */
public class LibraryController {
    private ArrayList <BookAbstract> books = new ArrayList<>();
     private HashMap<String, BookFactory> bookFactories = new HashMap<>();

    public LibraryController() {
        bookFactories.put("Fiction", new FictionBookFactory());
        bookFactories.put("Academic", new AcademicBookFactory());
        bookFactories.put("Biography", new BiographyBookFactory());
    }
     
    
    public ArrayList<BookAbstract> getBooks() {
        return books;
    }

    public HashMap<String, BookFactory> getBookFactories() {
        return bookFactories;
    }
    public void addBook(int id, String title, String author, String category,boolean avail) {
        BookFactory factory = bookFactories.get(category);
        if (factory != null) {
            BookAbstract book = factory.createBook(id, title, author, category,avail);
            books.add(book);
        } else {
            System.out.println("Error: Invalid book category");
        }
    }

    public boolean returnBook(int id) {
        for (BookAbstract book : books) {
            if (book.getId() == id) {
                //boolean status = book.isStatus();
                if (!book.isStatus()) {
                    book.setStatus(true);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false; // Book not found
    }

    public boolean borrowBook(int id) {
        for (BookAbstract book : books) {
            if (book.getId() == id) {
                //boolean status = book.isStatus();
                if (book.isStatus()) {
                    book.setStatus(false);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false; // Book not found
    }

    public boolean isAvailable(int id) {
        for (BookAbstract book : books) {
            if (book.getId() == id) {
                return book.isStatus();
            }
        }
        return false; // Book not found
    }
   public List<BookAbstract> getBooksByCategory(String category) {
        List<BookAbstract> booksByCategory = new ArrayList<>();
        for (BookAbstract book : books) {
            if (book.getCategory().equals(category)) {
                booksByCategory.add(book);
            }
        }
        return booksByCategory;
    }
    
    
}
