<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>登录</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link  href="bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="bootstrap-3.3.7/js/bootstrap.min.js"></script>
	<style type="text/css">
		body{
			background-image:url('img/background.jpg');
			background-size: cover;
			background-position:center;
		}
	</style>
  </head> 

<body>
223
            <div class="loginbox-bd loginbox-reg hide" data-type="reg">
                <form  method="post" action="RegServlet">
                    <p class="loginbox-p">
                        <span class="ipt-span ipt1"></span>
                        <input class="ipt" type="text" name="username" placeholder="输入用户名（5-30位字符）">
                        </p><p class="myuser-tip login-cheak-name"></p>
                    <p></p>
                    <p class="loginbox-p">
                        <span class="ipt-span ipt2"></span>
                        <input class="ipt" type="password" name="password" placeholder="输入密码">
                        
                        <span class="pw-span pw-hide pw-hide1"></span>
                        </p><p class="myuser-tip login-cheak-pw"></p>
                    <p></p>
                    <p class="loginbox-p">
                        <span class="ipt-span ipt2"></span>
                        <input class="ipt" type="password" name="password2" placeholder="确认密码">
                       
                        <span class="pw-span pw-hide pw-hide2"></span>
                        </p><p class="myuser-tip login-cheak-pw2"></p>
                    <p></p>
                    <p class="loginbox-p">
                        <span class="ipt-span ipt2"></span>
                        <input class="ipt" type="text" name="name" placeholder="输入真实姓名">
                        </p><p class="myuser-tip login-cheak-uname"></p>
                    <p></p>
                    <p class="loginbox-p">
                        <span class="ipt-span ipt2"></span>
                        <input class="ipt" type="text" name="idnum" placeholder="输入身份证号">
                        </p><p class="myuser-tip login-cheak-id"></p>
                    <p></p>
                        <p class="loginbox-protocol">
                        <input type="checkbox" name="protocol" checked="checked">
                        <label for="protocol">同意 <a href="https://www.baidu.com" target="_blank">《用户注册协议》</a></label>
                    </p>

                    <div class="login-sbt-con">
                        <input class="" style="background:#2fcb53" type="submit" value="立即注册">
                    </div>

                </form>

                <p class="loginbox-hasact login-box-toptxt">已有代码账号？
                    <a href="#" title="马上登录" class="anchor_line js-switch-login">马上登录&gt;</a>
                </p>                

            </div>   
</body>
</html>