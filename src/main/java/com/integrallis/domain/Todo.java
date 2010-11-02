package com.integrallis.domain;

import java.util.*;
import java.io.Serializable;

public class Todo implements Serializable {
  private String name;
  private String description;
  private int priority = 0;
  private Date completeByDate;
  
  public Todo() {}
  public Todo(String n, String d, int p, Date c) {
    name = n;
    description = d;
    priority = p;
    completeByDate = c;
  }
  
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
  
  public int getPriority() {
    return priority;
  }
  
  public void setPriority(int i) {
    priority = i;
  }
  
  public Date getCompleteByDate() {
    return completeByDate;
  }
  
  public void setCompleteByDate(Date d) {
    completeByDate = d;
  }
  
}