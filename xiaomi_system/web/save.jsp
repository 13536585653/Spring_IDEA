<%--
  Created by IntelliJ IDEA.
  User: langye
  Date: 2017/3/3
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>shopping phone</title>
</head>
<script src="js/jquery-1.9.1.min.js"></script>
<script>
   $(function () {
       var o;
       $(":button").on("click",function(){
           var button = this.id;
           if (button =="button1"){
               o = "#order";
           }else if(button == "button2"){
               o = "#order2";
           }else if(button == "button3"){
               o = "#order3";
           }
           var params = $(o).serialize();
           if(button=="button1" || button=="button2" ||button=="button3")
           {
               $.post("add",params,function (result) {
                   if(result.toString()=="开始预约手机"){
                       location.href = "index.jsp";
                   }
                   alert(result);
               });
           }
       });
   });
</script>


  <style>
    ul{
        list-style: none;
    }
    li{
        align-content: center;
    }
    #orderDiv{
        border:solid 1px red;
        width: 55%;
        margin-top: 10%;
    }
    .order{
        float: left;
        height: 50%;
    }
    hr{
        width:50%;
    }
</style>


<body>
    <center>
        <div id="orderDiv">
            <h1>8月15日中午12点开放购买</h1>
            <form class="order" id="order">
                <ul>
                    <li><input readonly style="border: none;" name="phone" value="小米手机3"></li>
                    <li><input readonly style="border: none;" value="迄今为止最快的小米手机"></li>
                    <li><input disabled style="border: none;" value="￥1999元"></li>
                    <li><input type="button" id="button1" value="预约"></li>
                </ul>
            </form>

            <form class="order" id="order2">
                <ul>
                    <li><input readonly style="border: none;" name="phone" value="红米Note"></li>
                    <li><input readonly style="border: none;" value="5.5英寸超大屏"></li>
                    <li><input disabled style="border: none;" value="￥799元"></li>
                    <li><input type="button" id="button2" value="预约"></li>
                </ul>
            </form>

            <form class="order" id="order3">
                <ul>
                    <li><input readonly style="border: none;" name="phone" value="红米手机"></li>
                    <li><input readonly style="border: none;" value="双卡双待神器 真八核"></li>
                    <li><input disabled style="border: none;" value="￥699元"></li>
                    <li><input type="button" id="button3" value="预约"></li>
                </ul>
            </form>
        </div>
</center>
</body>
</html>
