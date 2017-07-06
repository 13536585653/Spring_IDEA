<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/3/3
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>shopping phone</title>
</head>
<script src="js/jquery-1.9.1.min.js"></script>
<style>
    ul{
        list-style: none;
    }
    li{
        align-content: center;
    }
    #InfoDiv{
        border: solid 1px red;
        width: 48%;
    }
    hr{
        width:50%;
    }
</style>


<body>
<center>
    <div id="InfoDiv">
        <h1 style="color: red;">填写预约信息</h1>
        <hr>
        <b>请务必填写您的真实信息，购买时使用此信息验证您的身份</b>
        <s:fielderror cssStyle="color: red"/>
        <form action="jsp_save.action" method="post">
            收货人：<input type="text" name="scheduleEntity.consignee" value="轩旺"><br>
            电子邮箱：<input type="text" name="scheduleEntity.email" value="786091203@qq.com"><br>
            手机号：<input type="text" name="scheduleEntity.mobile" value="13536585653"><br>
            <hr>
            <p>为防黄牛，请填写你的详细信息，提交后将作为订单地址且不能修改</p>
            <br>
            收获地址：<input type="text" name="scheduleEntity.address" value="江西赣州"><br>
            <hr>
            <input type="submit" value="下一步">
        </form>
    </div>
</center>
</body>
</html>
