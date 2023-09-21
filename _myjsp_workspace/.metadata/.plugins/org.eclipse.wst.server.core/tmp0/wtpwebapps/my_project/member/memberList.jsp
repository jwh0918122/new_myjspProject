<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member List Page</title>
</head>
<body>
	<h1>Member List Page</h1>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>AGE</th>
			<th>GENDER</th>
		</tr>
		<c:forEach items="${list}" var="tmp">
			<tr>
				<td>
				<a href="/mem/memDetail?id=${tmp.id }">${tmp.id }</a>
				</td>
				<td>
				<a href="/mem/memDetail?id=${tmp.id }">${tmp.name }</a>
				</td>
				<td>
				<a href="/mem/memDetail?id=${tmp.id }">${tmp.age }</a>
				</td>
				<td>
				<a href="/mem/memDetail?id=${tmp.id }">${tmp.gender }</a>
				</td>
				</tr>
		</c:forEach>
		</table>


		<!-- 페이지네이션 구역 -->
		<!-- prev -->
		<c:if test="${ph.prev }">
			<a href="/mem/memList?paginaionNo=${ph.startPagination-1 }&qty=${ph.pgv.qty}">◁ | </a>
		</c:if>
		<!-- 페이지네이션 번호 -->
		<c:forEach begin="${ph.startPagination }" end="${ph.endPagination } "
			var="i">
			<a href="/mem/memList?paginaionNo=${i }&qty=${ph.pgv.qty}">${i }</a>
		</c:forEach>
		<!-- next -->
		<c:if test="${ph.next }">
			<a href="/mem/memList?paginaionNo=${ph.endPagination+1 }&qty=${ph.pgv.qty}"> | ▷  </a>
		</c:if>
		<!-- 페이지네이션 끝 -->
		<a href="/index.jsp"><button>index로 이동</button></a>
</body>
</html>