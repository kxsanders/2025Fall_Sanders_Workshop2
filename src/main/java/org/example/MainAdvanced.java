package org.example;

import java.util.Scanner;

//If you're feeling more advanced we can use methods to break up
//our code so everything isn't crammed into main

public class MainAdvanced {
    // moving Book array directly into MainAdvanced instead of its own class
    static Book[] books = new Book[20];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Array of 20 different fantasy books generated from ChatGPT

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


        while (true) {
            System.out.println("Library Home");
            System.out.println("1) Show Available Books");
            System.out.println("2) Show Checked Out Books");
            System.out.println("3) Check In a Book");
            System.out.println("4) Exit");
            String userInput = scanner.nextLine().trim();

            switch (userInput) {
                case "1":
                    displayAllBooks();
                    break;
                case "2":
                    displayBooksByStatus(true);
                    break;
                case "3":
                    checkInBook(scanner);
                    break;
                case "4":
                    System.out.println("Thank you and come again.");
                    System.exit(0);
                default:
                    System.out.println("Please type 1, 2, 3, or 4");
                    break;

            }
        }
    }


        //main is static so these methods must also be static
        //the book class methods will NOT be static


    public static void displayAllBooks() {

            // b is variable. for each Book b in Books = Book b : books
            for (Book b : MainAdvanced.books) {
                System.out.println("ID: " + b.getId());
                System.out.println("ISBN: " + b.getIsbn());
                System.out.println("Title: " + b.getTitle());
                System.out.println("Checked out: " + b.isCheckedOut());
                System.out.println("Checked in: " + b.getCheckedOutTo());
                System.out.println(); //blank to space lines between each book

            }
        }

        // Show books by status
        // Also, print who it's checked out to
        public static void displayBooksByStatus ( boolean isCheckedOut){

            for (Book b : books) {
                if(b.isCheckedOut() == isCheckedOut) {
                    System.out.println("ID: " + b.getId());
                    System.out.println("ISBN: " + b.getIsbn());
                    System.out.println("Title: " + b.getTitle());
                    System.out.println("Checked out to: " + b.getCheckedOutTo());
                    System.out.println(); //blank to space lines

                    if (isCheckedOut) {
                        System.out.println("Checked out to: " + b.getCheckedOutTo());
                    }
                    System.out.println();//blank to space lines
                }

            }

        }

    //Yes, pass the scanner from the main method into this method

         public static void checkInBook (Scanner scanner) {
             //Use it to ask the person for their name
             System.out.println("What is your name?");
             String name = scanner.nextLine();

             System.out.println("Hello " + name + "! Enter the ID of the book you want to check in.");
             String input = scanner.nextLine();

             //use the book's check in method
             for(Book b : books) {
                 //check if book matches the id that the user types
                 //if book is checked out, call checkIn() to check it in.
                 //if the book isn't checked out, display message that it is not checked out
             }

         }




}


