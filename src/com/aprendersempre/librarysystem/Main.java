package com.aprendersempre.librarysystem;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("My Book", "Me");
        System.out.println(myBook);

        myBook.setAvailability(true);
        System.out.println(myBook);

        myBook.setAvailability(false);
        System.out.println(myBook);



        Library library = new Library();
        System.out.println(library.getBooksList());

        library.addNewBook("Book 01", "Nícolas Felipe");
        System.out.println(library.getBooksList());

        library.addNewBook("Book 02", "Vinicius Louzada");
        System.out.println(library.getBooksList());

        library.addNewBook(myBook);
        System.out.println(library.getBooksList());

        library.changeBookAvailability("Book 01", false);
        System.out.println(library.getBooksList());
    }
}