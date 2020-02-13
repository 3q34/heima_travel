<%--
  Created by IntelliJ IDEA.
  User: cdx
  Date: 2019/12/24
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>黑马旅游网-登录</title>
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!--导入angularJS文件-->
    <script src="js/angular.min.js"></script>
    <!--导入jquery-->
    <script src="js/jquery-3.3.1.js"></script>
    <script>
        //校验用户名
        //单词字符，长度8到20位
        function checkUsername() {
            //1.获取用户名值
            var username = $("#username").val();
            //2.定义正则
            var reg_username = /^\w{2,20}$/;

            //3.判断，给出提示信息
            var flag = reg_username.test(username);
            if (flag) {
                //用户名合法
                $("#username").css("border", "");
            } else {
                //用户名非法,加一个红色边框
                $("#username").css("border", "1px solid red");
            }

            return flag;
        }

        //校验密码
        function checkPassword() {
            //1.获取密码值
            var password = $("#password").val();
            //2.定义正则
            var reg_password = /^\w{2,20}$/;

            //3.判断，给出提示信息
            var flag = reg_password.test(password);
            if (flag) {
                //密码合法
                $("#password").css("border", "");
            } else {
                //密码非法,加一个红色边框
                $("#password").css("border", "1px solid red");
            }

            return flag;
        }

        //校验验证码
        function checkCheck() {
            //1.获取密码值
            var password = $("#check").val();
            //2.定义正则
            var reg_password = /^\w{4,20}$/;


            //3.判断，给出提示信息

            // var flag = reg_password.test(password);
            var flag = password.length != 0;
            if (flag) {
                //密码合法
                $("#password").css("border", "");
            } else {
                //密码非法,加一个红色边框
                $("#password").css("border", "1px solid red");
            }

            return flag;
        }

        $(function () {
            $("#btn_login").click(function () {
                if (checkUsername() && checkPassword() && checkCheck()) {
                    $.post(
                        "user/login",
                        $("#loginForm").serialize(),
                        function (data) {
                            if (data.flag) {
                                location.href = "index.jsp";
                            } else {
                                $("#errorMsg").html(data.errorMsg);
                            }
                        })
                }
                return false;
            });
            //当某一个组件失去焦点是，调用对应的校验方法
            $("#username").blur(checkUsername);
            $("#password").blur(checkPassword);
            $("#check").blur(checkCheck);
        })
    </script>
</head>

<body>
<!--引入头部-->
<div id="header"></div>
<!-- 头部 end -->
<section id="login_wrap">
    <div class="fullscreen-bg" style="background: url(images/login_bg.png);height: 532px;">

    </div>
    <div class="login-box">
        <div class="title">
            <img src="images/login_logo.png" alt="">
            <span>欢迎登录黑马旅游账户</span>
        </div>
        <div class="login_inner">

            <!--登录错误提示消息-->
            <div id="errorMsg" class="alert alert-danger"></div>
            <form id="loginForm" action="" method="post" accept-charset="utf-8">
                <input type="hidden" name="action" value="login"/>
                <input name="username" id="username" type="text" placeholder="请输入账号" autocomplete="off">
                <input name="password" id="password" type="text" placeholder="请输入密码" autocomplete="off">
                <div class="verify">
                    <input name="check" id="check" type="text" placeholder="请输入验证码" autocomplete="off">
                    <span><img src="checkCodeServlet" alt="" onclick="changeCheckCode(this)"></span>
                    <script type="text/javascript">
                        //图片点击事件
                        function changeCheckCode(img) {
                            img.src = "checkCodeServlet?" + new Date().getTime();
                        }
                    </script>
                </div>
                <div class="submit_btn">
                    <button type="button" id="btn_login">登录</button>
                    <div class="auto_login">
                        <input type="checkbox" name="" class="checkbox">
                        <span>自动登录</span>
                    </div>
                </div>
            </form>
            <div class="reg">没有账户？<a href="javascript:location.href='register.jsp';">立即注册</a></div>
        </div>
    </div>
</section>
<!--引入尾部-->
<div id="footer"></div>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.0.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
<!--导入布局js，共享header和footer-->
<script type="text/javascript" src="js/include.js"></script>
</body>

</html>
