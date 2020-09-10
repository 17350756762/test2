<%--
  Created by IntelliJ IDEA.
  User: wenjuan
  Date: 2020/9/8
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath }/css/index_work.css" />
</head>
<body>
<form:form action="${pageContext.servletContext.contextPath }/emp" method="post" modelAttribute="emp">
    <!-- modelAttribute="emp"：绑定map作用域中放入的emp实体，有了这个实体，下面可以直接用path（相当于name）写实体的属性名 -->
    <input type="hidden" name="_method" value="PUT" />
    <form:hidden path="eid"/>
    <table>
        <tr>
            <th colspan="2">UPDATE EMP INFO</th>
        </tr>
        <tr>
            <td>ENAME</td>
            <td>
                <form:input path="ename"/>
            </td>
        </tr>
        <tr>
            <td>AGE</td>
            <td>
                <form:input path="age"/>
            </td>
        </tr>
        <tr>
            <td>sex</td>
            <td>
                <form:radiobuttons path="sex" items="${sex }"/>
                <!--items="${sex }获取控制层放在map集合中的sex值  -->
            </td>
        </tr>
        <tr>
            <td>DEPARTMENT</td>
            <td>
                <form:select path="dept.did" items="${deptList }" itemLabel="dname" itemValue="did"></form:select>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="修改" />
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
