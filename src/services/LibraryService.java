package services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import models.Book;
import models.Loan;
import models.User;

public class LibraryService {

  private List<Book> books;
  private List<Loan> loans;

  public LibraryService(){
    this.books = new ArrayList<>();
    this.loans = new ArrayList<>();
  }

  public void addBook(Book book){
    books.add(book);
  }

  public void listAvailableBooks(){
    List<Book> availableBooks = new ArrayList<>();
    
    for (Book book : books){
      if(book.isAvailable()){
        availableBooks.add(book);
      }
    }

    if (availableBooks.isEmpty()) {
      System.out.println("There is no available books");
    } else {
      for (Book book : availableBooks){
        System.out.println(book);
      }
    }
  }


  public void lendBook(String isbn, User user){
    for (Book book : books){
      if (book.getIsbn().equals(isbn) && book.isAvailable()){
        Loan loan = new Loan(book, user, LocalDate.now());
        loans.add(loan);
        book.setAvailable(false);
        System.out.println("Book lent successfully");
      }
    }
  }

  public void returnBook(String isbn){
    for (Loan loan : loans){
      if (loan.getBook().getIsbn().equals(isbn)){
        loan.getBook().setAvailable(true);
        loans.remove(loan);
        System.out.println("Book returned successfully");
        return;
      }
    }
    System.out.println("Not found");
  }
}