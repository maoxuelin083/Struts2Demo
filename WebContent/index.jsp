<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
     <form action="/Struts2Day01/demo/hello" method="post">
     <!-- 基本值注入 -->
           姓名:<input type="text" name="realName"><br/>
           
           <!-- 演示域模型注入 -->
           用户名:<input type="text" name="user.userName"/><br/>
           密码:<input type="password" name="user.password"/><br/>
           
           
           <input type="submit" value="提交"/>
     </form>
</body>
</html>