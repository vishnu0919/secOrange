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
<title>Your Search Results</title>
</head>
<body>
<h2>your search results</h2>
<table>
		<c:forEach items="${searchResults}" var="account">
			<tr>
				<td><c:out value="${account.getCompanyName()}"></c:out></td>
				<td><c:out value="${account.getAccountUserName()}"></c:out></td>
				<td><c:out value="${account.getAccountPassword()}"></c:out></td>
				<td><c:out value="${account.getAccountEmail()}"></c:out></td>
				<td><c:out value="${account.getCompanyUrl()}"></c:out></td>
				<td><c:out value="${account.getCustomerUserName()}"></c:out></td>
				<td><c:out value="${account.getId()}"></c:out></td>
				<td><c:out value="${account.getCountry()}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>