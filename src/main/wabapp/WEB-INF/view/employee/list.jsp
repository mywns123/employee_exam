<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 목록</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/list.css">
	<script src="https://code.jquery.com/jquery-3.5.1.js"  ></script>
	<script type="text/javascript">
		$(function() {
			var contextPath = "${contextPath}";
			$.get(contextPath + "/api/employees",
				function(json) {
				var dataLength = json.length;
				if (dataLength >= 1) {
					var sCont = "";
					for (i = 0; i < dataLength; i++) {
						sCont += "<tr>";
						sCont += "<td>" + json[i].empNo + "</td>";
						sCont += "<td><a href='read?empNo=" + json[i].empNo + "'>" + json[i].empName + "</a></td>";
						sCont += "<td>" + json[i].title.titleName + "</td>";
						if(json[i].manager != null){
							sCont += "<td>" + json[i].manager.empNo + "</td>";	
						}else{
							sCont += "<td>" + " " + "</td>";
						}
						sCont += "<td>" + json[i].salary.toLocaleString('en') + "</td>";
						sCont += "<td>" + json[i].dept.deptNo + "</td>";
						sCont += "</tr>";
					}
					$("#load:last-child").append(sCont);
				}
			});
		});
	</script>
</head>
<body>
	<div id="employee">
	<h2><spring:message code="employee" /><spring:message code="list" /></h2>
	<table border="1">
		<thead>
			<tr>
				<th><spring:message code="eno" /></th>
				<th><spring:message code="ename" /></th>
				<th><spring:message code="title" /></th>
				<th><spring:message code="manager" /></th>
				<th><spring:message code="salary" /></th>
				<th><spring:message code="dept" /></th>				
			</tr>
		</thead>
		<tbody id="load">
		</tbody>
	</table>
	</div>
</body>
</html>