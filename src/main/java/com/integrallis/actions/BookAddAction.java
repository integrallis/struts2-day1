package com.integrallis.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.integrallis.services.BookService;
import java.util.Date;
import com.integrallis.domain.Book;
import com.integrallis.domain.Author;
import com.opensymphony.xwork2.ModelDriven;

public class BookAddAction extends ActionSupport implements ModelDriven<Book>{
  
  private BookService service = new BookService();
  private Book book = new Book();

  public String execute() {
    System.out.println("-BookAddAction-");
    System.out.println(book);

    service.addBook(book);

    return SUCCESS;
  }
  
  public Book getModel() {
    return book;
  }
        
  public void validate() {
    addFieldError("title", "yo this is an error");
  }
}