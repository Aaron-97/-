<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet"
	href="${basePath }/admin/bower_components/bootstrap/dist/css/bootstrap.min.css">
</head>
<style>
body {
	text-align: center;
	margin-top:200px
	
}
.emain{
	margin-bottom:20px
}
.pwd{
	margin-bottom:20px
}
.btn{
	text-align: center;
	margin-right:30px
}
</style>

<body>
    <form class="text-align: center" action="${basePath }/loginUser" method="post">
        邮箱：<input class="emain" type="text" id="email" name="email"/><br>
        密码：<input class="pwd" type="password" id="password" name="password"/><br>
    <input class="btn" type="submit" value="登录">
	<a href="${basePath }/toregisterUser" type="submit"> 注册</a>
</form>

</body>
</html>