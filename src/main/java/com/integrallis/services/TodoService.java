package com.integrallis.services;

import java.util.*;
import com.integrallis.domain.Todo;
import java.lang.RuntimeException;
import static org.apache.commons.lang.StringUtils.isBlank;

public class TodoService {
  
  static List<Todo> todos = new ArrayList<Todo>();
  
  public void delete(Todo todo) {
    todos.remove(todo);
  }
  
  public void addTodo(Todo todo) {
    if (isBlank(todo.getName())) {
      throw new RuntimeException("forgot the name");
    }
    
    todos.add(todo);
  }
  
  public List<Todo> getAll() {
    return todos;
  }
  
  public Todo findByName(String name) {
    if (name == null) {
      throw new RuntimeException("Need a name!");
    }
    for (Todo todo : todos) {
      if (todo.getName().equals(name)) {
        return todo;
      }
    }
    return null;
  }
}