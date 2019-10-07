<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>编号</td>
			<td>名称</td>
			<td>父菜单名称</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="menu">
			<tr>
				<td>${menu.id }</td>
				<td>${menu.name }</td>
				<td>
					<c:if test="${menu.parent==null }">无</c:if>
					<c:if test="${menu.parent!=null }">${menu.parent.name }</c:if>
				</td>
				<td><a href="showMenu?id=${menu.id} ">修改</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>