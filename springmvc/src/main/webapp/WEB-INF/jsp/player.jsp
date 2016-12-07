<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="100%" border=1>
		<tr>
			<td>姓名</td>
			<td>密码</td>
			<td>分数</td>
			<!-- <td>商品描述</td>
			<td>操作</td> -->
		</tr>

		<c:forEach items="${players }" var="player">
			<tr>
				<td><c:out value="${player.name }" /></td>
				<td>${player.password }</td>
				<td>${player.score }</td>
				<%-- <td><a
					href="${pageContext.request.contextPath }/item/editItem.action?id=${item.id}">修改</a></td> --%>
			</tr>
		</c:forEach>
	</table>
</body>
</html>