<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Account</title>
</head>
<body>
	<h1>Add Your Account Details</h1>

	<spring:url value="/AddAccount" var="AddAccount" />
	<form:form class="form-horizontal" method="post"
		modelAttribute="addNewAccount" action="${AddAccount}">
		<table>
			<tr>
				<td>companyName* :</td>
				<td><form:input type="text" path="companyName"
						placeholder="companyName" id="companyName" /></td>
			</tr>
			<tr>
				<td>country* :</td>
				<td><form:input type="text" path="country" id="country"
						placeholder="country" class="form-control" /></td>
			</tr>
			<tr>
				<td>accountUserName* :</td>
				<td><form:input type="text" path="accountUserName"
						placeholder="accountUserName" id="accountUserName" /></td>
			</tr>
			<tr>
				<td><br> accountPassword* :</td>
				<td><form:input type="text" path="accountPassword"
						placeholder="accountPassword" id="accountPassword" /></td>
			</tr>
			<tr>
				<td><br> accountEmail* :</td>
				<td><form:input type="text" path="accountEmail"
						placeholder="accountEmail" id="accountEmail" /></td>
			</tr>
			<tr>
				<td>companyUrl* :</td>
				<td><form:input type="text" path="companyUrl" id="companyUrl"
						placeholder="companyUrl" /></td>
			</tr>
			<tr>
				<td>id :</td>
				<td><form:input type="number" path="id" id="id"
						placeholder="id" /></td>
			</tr>

		</table>
		<button type="submit">Add Account</button>
	</form:form>
</body>
</html>