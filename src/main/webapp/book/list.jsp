<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="lab" uri="/lab" %>

<html>
<head>
    <title>Book List</title>
	<sx:head/>
</head>

<body>
<h1>List Books</h1>
  Page viewed : <s:property value="#session.timesPageViewed"/> times.  
  <s:property value="books"/>
  <hr/>
  
  <s:iterator value="books">
    <p>Title: <s:property value="title" />  </p>
    <p>Author: <s:property value="author" />  </p>    
    <p>Date: <s:property value="publishedOn" />  </p>        
    <p>Days Since Market <lab:daysSince key="publishedOn" />
    <hr/>
  </s:iterator>
</body>
</html>
