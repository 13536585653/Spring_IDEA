<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/3/1
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="/struts-tags" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<center>
    <h1 style="color: red;">恭喜您！${sessionScope.userName}</h1>
    <h4>成功预约8月15日开放购买</h4>
    <span>您已具备${sessionScope.phone}手机购买资格<br>
        请于8月15号中午12点准时前往小米官网购买。</span><br><br>
    <a href="index.jsp"><input type="button" value="退出"></a>
</center>
</body>
</html>
