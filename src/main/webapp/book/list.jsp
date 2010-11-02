<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<html>
<head>
    <title>Book List</title>
	<sx:head/>
</head>

<body>
<h1>List Books</h1>
  Page viewed : <s:property value="timesPageViewed"/> times.
  <s:property value="books"/>
</body>
</html>
