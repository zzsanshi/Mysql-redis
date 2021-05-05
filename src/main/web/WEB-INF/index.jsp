<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2021/5/5
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<body>
<table border=1 cellpadding="10" cellspacing="0">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <th>addrs</th>
    </tr>

    <c:forEach items="${list }" var="user">//这里使用的是jstl标签以及el表达式显示用户信息
        <tr>
            <th>${user.id }</th>
            <th>${user.name }</th>
            <th>${user.age }</th>
            <th>${user.addrs }</th>
        </tr>
    </c:forEach>

</table>
</body>
</body>
</html>
