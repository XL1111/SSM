<%--
  Created by IntelliJ IDEA.
  User: X
  Date: 2020/10/30
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="/tologin">跳转</a>

    <form action="/tologin" method="post">

        <br/>
        <button>aaaaaaa</button>
    </form>

    <form action="/login" method="post">
        <input id="name" type="text" placeholder="请输入用户名！"/>
        <br/>
        <input id="password" type="password" placeholder="请输入密码！"/>
        <br/>
        <button id="loginBtn">登录</button>
    </form>

</body>
</html>
