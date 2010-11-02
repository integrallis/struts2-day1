package com.integrallis.actions;

import java.util.Date;
import com.integrallis.services.TodoService;
import com.integrallis.domain.Todo;
import com.opensymphony.xwork2.ActionSupport;

public class TodoAction extends ActionSupport {
  
  String name;
  String description;  
  Date completeByDate;
  TodoService service = new TodoService();
  
  public String	execute() {
    System.out.println("-inside TodoAction.execute()-");
    Todo todo = new Todo(name,description,0,completeByDate);        
    try {
     service.addTodo(todo);
    } catch (Exception e)  {
      return "error";
    }
    System.out.println("Success");            
    return SUCCESS;
  }
  
  // Getters and setters necessary
  public String getName() {
    return name;
  }
  
  public void setName(String s) {
    name = s;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String s) {
    description = s;
  }  
  
  public Date getCompleteByDate() {
    return completeByDate;
  }
  
  public void setCompleteByDate(Date d) {
    completeByDate = d;
  }
}