<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<html>
<head>
    <title>Todo Add</title>
	<sx:head/>
</head>

<body>
<h1>Add</h1>
<s:form action="save">
    <s:textfield key="name" label="Name"/>
    <s:textfield key="description" label="Description"/>
	  <sx:datetimepicker key="completeByDate" label="Order Date" />	
    <s:submit/>
</s:form>
</body>
</html>
