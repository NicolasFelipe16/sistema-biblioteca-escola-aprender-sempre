package com.aprendersempre.librarysystem;

import com.aprendersempre.librarysystem.books.Book;
import com.aprendersempre.librarysystem.books.Library;
import com.aprendersempre.librarysystem.users.User;
import com.aprendersempre.librarysystem.users.UsersRegistry;

public class Main {
    public static void main(String[] args) {
        // BIBLIOTECA
        Library library = new Library(); // Criação de biblioteca
        library.addNewBook("Book 01", "Gabriel Almeida"); // Adição de livro por parâmetros

        Book book02 = new Book("Book 02", "Juliana Fagundes"); // Criação de livro
        library.addNewBook(book02); // Adição de livro já criado

        library.addNewBook("Book 03", "Tiago Lima");
        System.out.println(library.getBooksList());
        library.showFormatedBooksList(); // Lista de livros formatada


        // REGISTRO DE USUÁRIOS
        UsersRegistry usersRegistry = new UsersRegistry(); // Criação de registro de usuários
        usersRegistry.addNewUser("Diego", true); // Adição de usuário
        usersRegistry.addNewUser("Flávia", false);
        usersRegistry.addNewUser("Geraldo", true);
        System.out.println(usersRegistry.getUsersList());
        usersRegistry.showFormatedUsersList(); // Lista de usuários formatada

        System.out.println(usersRegistry.getUserByID(2).getFullName()); // Consulta de usuário
        System.out.println(usersRegistry.getUserByID(2).getBorrowedBooksList());
        usersRegistry.getUserByID(2).showFormatedBorrowedBooksList(); // Lista de livros emprestados formatada

        for (User user : usersRegistry.getUsersList()) {
            if (user.canLendBooks()) System.out.println(user +  " | " + user.getBorrowedBooksList());
        }
    }
}