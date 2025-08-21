package com.aprendersempre.librarysystem;

import com.aprendersempre.librarysystem.internal.Book;
import com.aprendersempre.librarysystem.internal.LoanService;
import com.aprendersempre.librarysystem.internal.Student;
import com.aprendersempre.librarysystem.internal.Teacher;
import com.aprendersempre.librarysystem.internal.User;

public class Main {
    public static void main(String[] args) {
        Book livro_01 = new Book("Livro 01", "Autor 01");
        Book livro_02 = new Book("Livro 02", "Autor 02");
        User vinicius = new Teacher("Vinícius Louzada");
        User nicolas = new Teacher("Nícolas Felipe");

        LoanService loanService = new LoanService();

        System.out.println("\n==============================");
        System.out.println("1. Antes do empréstimo:\n");
        System.out.println("Lista de livros emprestados: " + vinicius.getBorrowedBooksList());
        System.out.println("Disponibilidade do livro: " + livro_01.isAvailable());
        loanService.showFormatedLoansList();

        System.out.println("\n==============================");
        loanService.createLoan(livro_01, vinicius);
        System.out.println("2. Empréstimo feito:\n");
        System.out.println("Lista de livros emprestados: " + vinicius.getBorrowedBooksList());
        System.out.println("Disponibilidade do livro: " + livro_01.isAvailable());
        loanService.showFormatedLoansList();

        System.out.println("\n==============================");
        System.out.println("3. Empréstimo finalizado\n");
        loanService.finishLoan(livro_01, vinicius);
        System.out.println("Lista de livros emprestados: " + vinicius.getBorrowedBooksList());
        System.out.println("Disponibilidade do livro: " + livro_01.isAvailable());
        loanService.showFormatedLoansList();
    }
}