package main;

import models.Book;
import models.User;
import services.LibraryService;
import services.UserService;

public class Main {

  public static void main(String[] args) {
    LibraryService libraryService = new LibraryService();
    UserService userService = new UserService();

    Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
    Book book2 = new Book("1984", "George Orwell", "1234567891");
    libraryService.addBook(book1);
    libraryService.addBook(book2);

    User user1 = new User("Helena", "001");
    User user2 = new User("John", "002");
    userService.addUser(user1);
    userService.addUser(user2);

    System.out.println("Available books: ");
    libraryService.listAvailableBooks();

    libraryService.lendBook("1234567890", user1);
    libraryService.lendBook("1234567891", user2);

    System.out.println("\nAvailable books after lending: ");
    libraryService.listAvailableBooks();

    libraryService.returnBook("1234567890");

    System.out.println("\nAvailable books after returning: ");
    libraryService.listAvailableBooks();
  }
}
