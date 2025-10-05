package org.example;

//Here is an outline of what should go in your book class
//There should NOT be any code that deals with menus
//There should NOT be any code that takes in user input
//All this class cares about is book data
//and what to do when the book is checked in or out, that's it
public class  Book {

    //properties
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //constructor

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false; //This is false because all books will start checked in.
        this.checkedOutTo = "";
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    //check in and check out methods
    public void checkIn() {
        if(isCheckedOut){
            isCheckedOut = false;
            checkedOutTo = "";
            System.out.println(title + " checked in.");

        } else {
            System.out.println(title + " is already checked in.");
        }
    }

    // ! reverses the boolean value. so if it's true, ! makes it false
    // String name(variable) is only local to the checkOut method
    public void checkOut(String name) {
        if(!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;

        }else {
            System.out.println(title + " is already checked out to " + checkedOutTo + ".");
        }


    }

 }


