<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style="color:blue;text-align:center">All ${listCountries} INFO</h1>
<c:choose>
	<c:when test="${listInfo ne null && !empty listInfo }">
	<table align="center" bgcolor="green">
	<c:forEach var="country" items="${listInfo}">
		<tr>
			<td style="color:blue">${country }</td>
		</tr>
	</c:forEach>
	</table>
	<b>Countries Count::${countriesCount}</b>
	</c:when>
	<c:otherwise>
		<h1 style="color:red;text-align:center">No Countries Found</h1>
	</c:otherwise>
</c:choose>
<br>
<br>
<a href="welcome">HOME</a>