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
<s:form action="save">
    <s:textfield key="title" label="Title"/>
    <s:textfield key="firstName" label="First Name"/>
    <s:textfield key="lastName" label="Last Name"/>
    <s:textfield key="price" label="Price"/>
	  <sx:datetimepicker key="completeByDate" label="Order Date" />	
    <s:submit/>
</s:form>
</body>
</html>
