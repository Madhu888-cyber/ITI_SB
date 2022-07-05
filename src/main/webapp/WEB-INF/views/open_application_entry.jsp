<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Step 1</title>

<style type="text/css">
#form {
	border: black 2px solid;
	margin: 0 auto;
}
</style>
<script type="text/javascript">
// function validate(){
// 	//ssc_board
// 	var ssc_board = document.getElementById("ssc_board").value;
// 	alert(ssc_board);
// 	if(ssc_board === "" || ssc_board === null){alert("SSC/8th Board is required!"); return false;}
// 	//ssc_regno
// 	var ssc_regno = document.getElementById("ssc_regno").value;
// 	if(ssc_regno === "" || ssc_regno === null){alert("SSC/8th Hall Ticket No is required!"); return false;}
// 	//passyear
// 	var passyear = document.getElementById("passyear").value;
// 	if(passyear === "" || passyear === null){alert("Year of Passing is required!"); return false;}
// 	//ssctype
// 	var ssctype = document.getElementById("ssctype").value;
// 	if(ssctype === "" || ssctype === null){alert("Result Type is required!"); return false;}
	
// 	return false;
// }
</script>
</head>
<body>
	<img alt="banner" src="images/banner.jpg">
	<h2>Registration Form for Admission into the Industrial Training
		Institute for the session - (Phase - )</h2>
	<div id="form">
		<pre>
<form:form action="open_application-step1" modelAttribute="open_application" method="POST" onsubmit="return validate()">
<h5>Registration Form Step - 1</h5>

SSC/8th Board: 
<form:select path="ssc_board" id="ssc_board">
	<form:option value="">-select-</form:option>
	 <c:forEach items="${listboards}" var="boards">
	 	<form:option value="${boards.board_code}">${boards.board_name}</form:option>
	 </c:forEach>
</form:select> 
<form:errors path="ssc_board" cssClass="error" />
SSC/8th Hall Ticket No:
<form:input path="ssc_regno" id="ssc_regno"/>
<form:errors path="ssc_regno" cssClass="error" />
Year of Passing:
<form:input path="passyear" id="passyear"/>
<form:errors path="passyear" cssClass="error" />
Result Type:
<form:select path="ssctype" id="ssctype">
	<form:option value="">-select-</form:option>
	<form:option value="G">GPA</form:option>
	<form:option value="M">Marks</form:option>
</form:select>
<form:errors path="ssctype" cssClass="error" />

<a href="login"><input type="button" value="Home"></a>
<input type="submit" value="Proceed">
<a href="#"><input type="reset" value="Refresh"></a>
</form:form>
</pre>
	</div>
</body>
</html>