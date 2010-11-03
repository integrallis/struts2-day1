package com.integrallis.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.integrallis.services.BookService;
import java.util.Date;
import com.integrallis.domain.Book;
import com.integrallis.domain.Author;
import com.opensymphony.xwork2.ModelDriven;
import com.integrallis.RequestURIAware;
import com.integrallis.annotation.Timer;

@Timer
public class BookAddAction extends ActionSupport implements ModelDriven<Book>, RequestURIAware {
  
  private BookService service = new BookService();
  private Book book = new Book();
  private String requestUri;
  
  public String execute() {
    System.out.println("-BookAddAction-");
    System.out.println(requestUri);    
    System.out.println(book);

    service.addBook(book);

    return SUCCESS;
  }
  
  public Book getModel() {
    return book;
  }
        
  public void validate() {
//    addFieldError("title", "yo this is an error");
  }
  
  public void setRequestURI(String s) {
    requestUri = s;
  }
}