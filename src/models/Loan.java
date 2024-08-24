package models;

import java.time.LocalDate;

public class Loan {

  private Book book;
  private User user;
  private LocalDate loanDate;
  private LocalDate returnDate;

  public Loan(Book book, User user, LocalDate loanDate){
    this.book = book;
    this.user = user;
    this.loanDate = loanDate;
    this.returnDate = loanDate.plusDays(14);
  }

  public Book getBook(){
    return book;
  }

  public User getUser(){
    return user;
  }

  public LocalDate getLoanDate(){
    return loanDate;
  }

  public LocalDate getReturnDate(){
    return returnDate;
  }

  @Override
  public String toString(){
    return "Loan{" +
           "book=" + book + 
           ", user=" + user +
           ", loanDate=" + loanDate +
           ", returnDate=" + returnDate +
            "}";
    }
}