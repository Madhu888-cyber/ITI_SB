<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Interface</title>
<style type="text/css">
#form{
border: black 2px solid;
margin: 0 auto;
}
</style>
</head>
<body>
<img alt="banner" src="images/banner.jpg">
<h2>Registration Form for Admission into the industrial training Institute for the session - (Phase-)</h2>
<h4>Attention: Enter data carefully, If any information found wrong in Marks/GPA, Caste, etc. the authority has right to disqualify for admissions</h4>

<div id = "form">
<form:form action="open_applicationid_student" modelAttribute="Open_Application_form" method="POST">
<pre>
Hall Ticket Number:	<form:input path="ssc_regno" readonly="readonly" />	
Board: <form:input path="ssc_board" readonly="readonly" />
Year of Pass: <form:input path="ssc_year" readonly="readonly" />		
Month of Pass: <form:select path="ssc_month">
						<form:option value="">-select-</form:option>
						<form:option value="03">March</form:option>
						<form:option value="04">Supplementary</form:option>
					</form:select>
Applicant's Name: <form:input path="name" type="text" />	
Mobile Number: <form:input path="phno" />
Date of Birth: <input type="date" name="dob" />		
Aadhaar Card Number: <form:input path="adarno" />
Gender: Male<form:radiobutton path="gen" value="male" /> Female<form:radiobutton path="gen" value="female" />	
Category: <form:select path="caste">
						<form:option value="">-select-</form:option>
					</form:select>
Father's Name: <form:input path="fname"/>
Mother's Name: <form:input path="mname" />
Ex-Servicemen: Yes<form:radiobutton path="exs" value="yes"/> No<form:radiobutton path="exs" value="no" />
Address: <form:textarea path="addr" />
Pincode: <form:input path="pincode" />
Economic Weaker Section: Yes<form:radiobutton path="ews" value="yes" /> No<form:radiobutton path="ews" value="yes" />
Physically Challenged: Yes<form:radiobutton path="phc" value="yes" /> No<form:radiobutton path="phc" value="yes" />
PWD Category: <form:select path="pwd_category">
				<form:option value="">-select-</form:option>
				<form:option value="1">Blind</form:option>
				<form:option value="2">Deaf</form:option>
				<form:option value="3">Motor Disability</form:option>
				<form:option value="4">Mental Disability</form:option>
			  </form:select>
Qualification: <form:select path="ssc">
					<form:option value="">-select-</form:option>
					<form:option value="yes">SSC Passed</form:option>
					<form:option value="no">8th Passed</form:option>
				</form:select>
Local/NonLocal: <form:select path="locnoc">
					<form:option value="">-select-</form:option>
					<form:option value="Local">Local</form:option>
					<form:option value="NonLocal">Non Local</form:option>
				</form:select>
Email: <form:input path="email" />

Number of Languages* Two<form:radiobutton path="subjects" value="subjects-2" />Three<form:radiobutton path="subjects" value="subjects-3" />

SNO	Marks
1	First language: <form:input path="first_lang_marks"/>
2	Second Language: <form:input path="second_lang_marks"/>
3	Third Language- English: <form:input path="eng_marks"/>
4	Mathematics : <form:input path="maths_marks"/>
5	General Science: <form:input path="science_marks"/>
6	Social Studies: <form:input path="social_marks"/>
Total : <form:input path="tot_marks"/>

<!-- Upload Photo : <input type="file" name="photo" /> -->
<form:checkbox path="aadhar" value="aadhar"/> Above information is correct to the best of my knowledge and I hereby give my consent to the use of Aadhaar Number provided in the application to carryout identity verification 
for admission process. If any information found wrong, the authority may cancel my admission at any time without any prior notice.
<input type="submit" value="Submit">
</pre>
</form:form>
</div>

</body>
</html>