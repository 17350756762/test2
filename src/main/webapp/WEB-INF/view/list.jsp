<%--
  Created by IntelliJ IDEA.
  User: wenjuan
  Date: 2020/9/5
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath }/css/index_work.css" />
    <script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/jquery-1.8.2.min.js"></script>
</head>
<body>
    <table>
        <tr>
            <th>EID</th>
            <th>ENAME</th>
            <th>AGE</th>
            <th>SEX</th>
            <th>DEPARTMENTNAME</th>
            <th>OPTIONS</th>

        </tr>
        <c:forEach items="${empList }" var="emp">
            <tr>
                <td>${emp.eid }</td>
                <td>${emp.ename }</td>
                <td>${emp.age }</td>
                <td>${emp.sex=='0'?'女':'男'}</td>
                <td>${emp.dept.dname }</td>
                <td>
                    <%--<a href="emp">删除</a>--%>
                    <a href="${pageContext.servletContext.contextPath }/emp/${emp.eid }">修改</a>
                    <!-- ${pageContext.servletContext.contextPath }绝对路径，相当于是/SSM_sgg -->
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="10">
                ${page }
            </td>
        </tr>
    </table>
</body>
</html>
