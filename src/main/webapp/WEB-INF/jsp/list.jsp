<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/7/16
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="employ">
    ${employ.id}
    ${employ.name}
    ${employ.sex}
    ${employ.address}
</c:forEach>

</body>
</html>
