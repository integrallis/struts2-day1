package com.integrallis.components;

import org.apache.struts2.components.Component;
import com.opensymphony.xwork2.util.ValueStack;
import java.io.Writer;
import java.io.IOException;
import java.util.Date;
import org.apache.struts2.components.UIBean;
import javax.servlet.http.*;

public class DaysSinceComonent extends UIBean { // extends Component {
  protected String key;
  final public static String TEMPLATE = "displaySince";  
  
  final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000;
  
  public DaysSinceComonent(ValueStack stack,HttpServletRequest req,HttpServletResponse res) {
    super(stack,req,res);
  }
  
  protected String getDefaultTemplate() {
      return TEMPLATE;
  }
    
  public String getKey() {
    return key;
  }
  
  public void setKey(String key) {
    this.key = key;
  }
  
  // Not needed if using a template
  /*
  public boolean start(Writer writer) {
    try {
      Date currentDate = new Date();
      long deltaDays = (currentDate.getTime() - ((Date)findValue(key)).getTime() )/ MILLSECS_PER_DAY;
      writer.write(deltaDays + " days");
    } catch (IOException e) {
      e.printStackTrace();
    }
    return true;
  }  */
  
  public void evaluateExtraParams() {
      super.evaluateExtraParams();
      Date currentDate = new Date();
      long deltaDays = (currentDate.getTime() - ((Date)findValue(key)).getTime() )/ MILLSECS_PER_DAY;
      
      addParameter("deltaDays", deltaDays);
  }
}