<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<html>
<head>
    <title>Book Add</title>
	<sx:head/>
</head>

<body>
<h1>Add a Book</h1>
<s:actionerror/>
<p>
  <s:property value="%{exception.message}"/>
  <s:property value="%{exceptionStack}"/>  
</p>
<s:form action="book-add" theme="xhtml">
<s:text name="title.text"/>
    <s:textfield key="title" label="%{getText('title.text')}"/>
    <s:textfield key="author.firstName" label="%{getText('firstName.text')}"/>
    <s:textfield key="author.lastName" label="Last Name"/>
    <s:textfield key="price" label="Price"/>
	  <sx:datetimepicker key="publishedOn" label="Published Date" />	
    <s:submit/>
</s:form>
</body>
</html>
