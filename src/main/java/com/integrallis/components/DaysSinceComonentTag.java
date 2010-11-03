package com.integrallis.components;

import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ComponentTagSupport;
import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.*;

public class DaysSinceComonentTag extends ComponentTagSupport {

  protected String key;

  public Component getBean(ValueStack stack,
                           HttpServletRequest req,
                           HttpServletResponse res) {
     return new DaysSinceComonent(stack, req, res);
  }


  protected void populateParams() {
    super.populateParams();
    DaysSinceComonent comp = (DaysSinceComonent)component;
    comp.setKey(key);    
  }

  public void setKey(String key) {
    this.key = key;
  }
}
