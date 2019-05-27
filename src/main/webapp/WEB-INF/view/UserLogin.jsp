<%--
  Created by IntelliJ IDEA.
  User: MR.Fan
  Date: 2019/5/27
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>用户登录</title>
    <script type="text/javascript">
        function toRegister() {
            window.location.href = "${pageContext.request.contextPath}/user/toRegister";
        }
    </script>
</head>
<body>
<h2>用户登录</h2>
<form action="${pageContext.request.contextPath}/user/queryById" method="post">
    <table>
        <tr>
            <td>账号：</td>
            <td><input type="text" name="id" placeholder="请输入账号..."></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password" placeholder="请输入密码..."></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录">&nbsp;&nbsp;<input type="button" value="注册" onsubmit="javascript:toRegister()"></td>
        </tr>
    </table>
</form>
</body>
</html>
