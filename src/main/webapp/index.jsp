<%@ page pageEncoding="UTF-8" language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
</body>
<form action="${pageContext.request.contextPath}/login1new" method="post">
    <table>
        <tr>
            <td><label>登录名: </label></td>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td><label>密码: </label></td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</html>
