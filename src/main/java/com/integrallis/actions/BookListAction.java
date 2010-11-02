package com.integrallis.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.integrallis.services.BookService;
import java.util.*;
import com.integrallis.domain.Book;
import org.apache.struts2.interceptor.SessionAware;

public class BookListAction extends ActionSupport implements SessionAware {
  private BookService service = new BookService();
  List<Book> books = new ArrayList<Book>();
  int timesPageViewed = 0;
  
  public String execute() {
    books = service.getAllBooks();    
    if (sessionData.get("timesPageViewed") != null) {
      timesPageViewed = (Integer) sessionData.get("timesPageViewed");
      timesPageViewed++;
      sessionData.put("timesPageViewed",timesPageViewed);
    }
    else {
      timesPageViewed++;
      sessionData.put("timesPageViewed",timesPageViewed);
    }
    return SUCCESS;
  }
  
  public List<Book> getBooks() { return books; }
  public void setBooks(List<Book> b) { books = b; }
  public int getTimesPageViewed() {return timesPageViewed;}
  public void setTimesPageViewed(int i) { timesPageViewed = i;}
  
  Map<String,Object> sessionData;
  public void setSession(Map<String, Object> sess) {
    sessionData = sess;
  }  
}