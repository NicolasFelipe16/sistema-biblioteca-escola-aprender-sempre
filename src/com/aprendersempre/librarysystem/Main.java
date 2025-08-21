package com.aprendersempre.librarysystem;

import com.aprendersempre.librarysystem.internal.Book;
import com.aprendersempre.librarysystem.internal.LoanService;
import com.aprendersempre.librarysystem.internal.Student;
import com.aprendersempre.librarysystem.internal.Teacher;
import com.aprendersempre.librarysystem.internal.User;

public class Main {
    public static void main(String[] args) {
        Book book0 = new Book("B-00", "Wagner");
        Book book1 = new Book("B-01", "Nícolas");
        Book book2 = new Book("B-02", "Matheus");
        Book book3 = new Book("B-03", "Priscila");
        Book book4 = new Book("B-04", "Camila");
        Book book5 = new Book("B-05", "Vinícius");
        Book book6 = new Book("B-06", "Ronaldo");
        Book book7 = new Book("B-07", "Julia");
        Book book8 = new Book("B-08", "Carla");
        Book book9 = new Book("B-09", "Marcos");

        LoanService loanService = new LoanService();

        // Professor > Limite 5 empréstimos simultâneos
        User vinicius = new Teacher("Vinícius Louzada");

        // Tentativa de 6 empréstimos simultâneos
        loanService.createLoan(book0, vinicius);
        // Tentativa de empréstimo de livro indisponível
        loanService.createLoan(book0, vinicius);
        loanService.createLoan(book1, vinicius);
        loanService.createLoan(book2, vinicius);
        loanService.createLoan(book3, vinicius);
        loanService.createLoan(book4, vinicius);
        loanService.createLoan(book5, vinicius);

        // Livros emprestados (5)
        vinicius.showFormatedBorrowedBooksList();

        // Estudante > Limite 3 empréstimos simultâneos
        User nicolas = new Student("Nícolas Felipe");

        // Tentativa de 4 empréstimos simultâneos
        loanService.createLoan(book6, nicolas);
        // Tentativa de empréstimo de livro indisponível
        loanService.createLoan(book6, nicolas);
        loanService.createLoan(book7, nicolas);
        loanService.createLoan(book8, nicolas);
        loanService.createLoan(book9, nicolas);

        // Livros emprestados (3)
        nicolas.showFormatedBorrowedBooksList();
    }
}