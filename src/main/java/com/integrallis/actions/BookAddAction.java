package com.integrallis.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.integrallis.services.BookService;
import java.util.Date;
import com.integrallis.domain.Book;
import com.integrallis.domain.Author;

public class BookAddAction extends ActionSupport {
  
  private BookService service = new BookService();
  
  private String title;
  private String firstName;
  private String lastName;
  private Double price;
  private Date publishedOn;
  
  public String execute() {
    System.out.println("-BookAddAction-");

    Author auth = new Author();
    auth.setFirstName(firstName);
    auth.setLastName(lastName);
    Book book = new Book();
    book.setAuthor(auth);
System.out.println("The title " + title);
System.out.println("The firstName " + firstName);    
System.out.println("The lastName " + lastName);    
System.out.println("The price " + price);    
    book.setTitle(title);
    book.setPrice(price);
    book.setPublishedOn(publishedOn);

    service.addBook(book);

    return SUCCESS;
  }
  
  public String getTitle() {return title;}
  public String getFirstName() {return firstName;}
  public String getLastName() {return lastName;}
  public Double getPrice() {return price;}
  public Date getPublishedOn() {return publishedOn;}
  
  public void setTitle(String s) {  title = s; }
  public void setFirstName(String s) {  firstName = s; }
  public void setLastName(String s) { lastName = s; }
  public void setPrice(Double i) { price = i; }
  public void setPublishedOn(Date d) { publishedOn = d; }
        
}