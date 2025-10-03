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
    public void checkIn(){

    }

    public void checkOut(){

    }

    public class Library {
        public static void main(String[] args) {
            //Array of 20 different fantasy books generated from ChatGPT
            Book[] books = new Book[20];

            books[0] = new Book(1, "9780261103573", "The Fellowship of the Ring");
            books[1] = new Book(2, "9780261102361", "The Two Towers");
            books[2] = new Book(3, "9780261102378", "The Return of the King");
            books[3] = new Book(4, "9780553573404", "A Game of Thrones");
            books[4] = new Book(5, "9780553579901", "A Clash of Kings");
            books[5] = new Book(6, "9780553573428", "A Storm of Swords");
            books[6] = new Book(7, "9780765326355", "The Way of Kings");
            books[7] = new Book(8, "9780765326362", "Words of Radiance");
            books[8] = new Book(9, "9780765326379", "Oathbringer");
            books[9] = new Book(10, "9780316068055", "The Name of the Wind");
            books[10] = new Book(11, "9780756404741", "The Wise Man's Fear");
            books[11] = new Book(12, "9780062024022", "Throne of Glass");
            books[12] = new Book(13, "9781619634480", "Crown of Midnight");
            books[13] = new Book(14, "9780060598242", "Eragon");
            books[14] = new Book(15, "9780375826696", "Eldest");
            books[15] = new Book(16, "9780375840401", "Brisingr");
            books[16] = new Book(17, "9780375856112", "Inheritance");
            books[17] = new Book(18, "9780553381689", "The Lies of Locke Lamora");
            books[18] = new Book(19, "9780553588484", "Mistborn: The Final Empire");
            books[19] = new Book(20, "9780765350381", "The Blade Itself");

        }
    }
}

