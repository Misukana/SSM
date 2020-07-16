<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
<h2>Hello SSM!!!</h2>
<a href="/employ/find" >查询</a>
<form action="employ/save" method="post">
    姓名：<input type="text" name="name"/><br/>
    性别：<input type="text" name="sex"/><br/>
    地址：<input type="text" name="address"/><br/>
    <input type="submit" value="保存"/><br/>
</form>
<form:form action="employ/delete" method="post">
    <label>请输入删除的ID</label>
    <input name="id"/>
    <input type="submit" value="提交"/>
</form:form>
<form action="employ/update" method="post">
    ID：<input type="text" name="id"/><br/>
    姓名：<input type="text" name="name"/><br/>
    性别：<input type="text" name="sex"/><br/>
    地址：<input type="text" name="address"/><br/>
    <input type="submit" value="保存"/><br/>
</form>
</body>
</html>
