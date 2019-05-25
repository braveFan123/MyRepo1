<%--
  Created by IntelliJ IDEA.
  User: MR.Fan
  Date: 2019/5/15
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript">
    function checkName() {
        var name = userForm.name;
        var reg = /^[\u4E00-\u9FA5]{2,4}$/;
        var span = document.getElementById("nameSpan");
        if (name == null) {
            name.focus();
            span.innerText = "请输入姓名";
            return false;
        }
        if (!reg.test(name.value)) {
            name.focus();
            span.innerText = "姓名只能为汉字";
            return false;
        } else {
            return true;
        }
    }

    function checkCid() {
        document.getElementsByName("cid");
        var cid = userForm.cid;
        var reg = /^\d{1}$/;
        var span = document.getElementById("cidSpan");
        if (cid.value == '') {
            cid.focus();
            span.innerText = "请输入班级";
            return false;
        } else if (!reg.test(cid.value)) {
            cid.focus();
            span.innerText = "班级只能在1-8班以内";
            return false;
        } else {
            return true;
        }
    }

    function checkFrom() {
        return checkName() && checkCid();
    }
</script>
<body>
<form action="${pageContext.request.contextPath}/student/register" method="post" onsubmit="return checkFrom()" name="userForm">
    <table>
        <tr>
            <td><label>姓名: </label></td>
            <td><input type="text" name="name"><span id="nameSpan"></span></td>
        </tr>
        <tr>
            <td><label>班级: </label></td>
            <td><input type="cid" name="cid"><span id="cidSpan"></span></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input id="submit" type="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>
