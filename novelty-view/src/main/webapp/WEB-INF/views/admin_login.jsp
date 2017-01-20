<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="context_root" value="${pageContext.request.contextPath }"/>
<!-- 资源根路径 -->
<c:set var="resources_root" value="${context_root }/resources" scope="application"/>
<!-- 插件根路径 -->
<c:set var="plugins_root" value="${resources_root }/plug-ins" scope="application"/>
<!-- metronic根路径 -->
<c:set var="metronic_root" value="${resources_root }/framework/metronic" scope="application"/>
<!-- global根路径 -->
<c:set var="global_root" value="${resources_root }/global" scope="application"/>
<!-- global图片根路径 -->
<c:set var="global_img_root" value="${global_root }/img" scope="application"/>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
    <meta charset="utf-8"/>
    <title>管理员登录</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1" name="viewport"/>
    <meta
            content="#1 selling multi-purpose bootstrap admin theme sold in themeforest marketplace packed with angularjs, material design, rtl support with over thausands of templates and ui elements and plugins to power any type of web applications including saas and admin dashboards. Preview page of Theme #3 for "
            name="description"/>
    <meta content="" name="author"/>
    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&amp;subset=all" rel="stylesheet"
          type="text/css"/>
    <link href="${context_root }/webjars/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <link href="${context_root }/webjars/simple-line-icons/2.2.2/css/simple-line-icons.css" rel="stylesheet"
          type="text/css"/>
    <link href="${context_root }/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${context_root }/webjars/bootstrap-switch/3.3.2/css/bootstrap3/bootstrap-switch.min.css"
          rel="stylesheet"
          type="text/css"/>
    <!-- END GLOBAL MANDATORY STYLES -->
    <!-- BEGIN PAGE LEVEL PLUGINS -->
    <link href="${context_root }/webjars/bootstrap-daterangepicker/2.1.24/css/bootstrap-daterangepicker.css"
          rel="stylesheet" type="text/css"/>
    <link href="${context_root }/webjars/morrisjs/0.5.1/morris.css" rel="stylesheet" type="text/css"/>
    <link href="${context_root }/webjars/fullcalendar/3.1.0/dist/fullcalendar.min.css" rel="stylesheet"
          type="text/css"/>
    <%--<link href="${global_plugins_root }/jqvmap/1.5.1/dist/jqvmap.min.css" rel="stylesheet" type="text/css" />--%>
    <!-- END PAGE LEVEL PLUGINS -->
    <!-- BEGIN THEME GLOBAL STYLES -->
    <link href="${metronic_root }/v4.7/theme/assets/global/css/components.min.css" rel="stylesheet"
          id="style_components"
          type="text/css"/>
    <link href="${metronic_root }/v4.7/theme/assets/global/css/plugins.min.css" rel="stylesheet" type="text/css"/>
    <!-- END THEME GLOBAL STYLES -->
    <!-- BEGIN PAGE LEVEL PLUGINS -->

    <!-- END PAGE LEVEL PLUGINS -->
    <!-- BEGIN PAGE LEVEL STYLES -->
    <link href="${metronic_root }/v4.7/theme/assets/pages/css/login-5.min.css" rel="stylesheet" type="text/css"/>
    <!-- END PAGE LEVEL STYLES -->
    <!-- BEGIN THEME LAYOUT STYLES -->
    <!-- END THEME LAYOUT STYLES -->
    <link rel="shortcut icon" href="${global_img_root }/favicon.png"/>
</head>
<!-- END HEAD -->

<body class=" login">
<!-- BEGIN : LOGIN PAGE 5-1 -->
<div class="user-login-5">
    <div class="row bs-reset">
        <div class="col-md-6 bs-reset mt-login-5-bsfix">
            <div class="login-bg"
                 style="background-image: url(${metronic_root }/v4.7/theme/assets/pages/img/login/bg1.jpg)">
                <img class="login-logo" src="${global_img_root }/wow.png"/>
            </div>
        </div>
        <div class="col-md-6 login-container bs-reset mt-login-5-bsfix">
            <div class="login-content">
                <h1>Freedom 管理员登录</h1>
                <p>Lorem ipsum dolor sit amet, coectetuer adipiscing elit sed diam nonummy et nibh euismod aliquam erat
                    volutpat. Lorem ipsum dolor sit amet, coectetuer adipiscing.</p>
                <form id="admin_login_form" action="${context_root }/admin/login" class="login-form" method="post">
                    <div class="alert alert-danger display-hide">
                        <button class="close" data-close="alert"></button>
                        <span>请输入用户名和密码。</span>
                    </div>
                    <div class="row">
                        <div class="col-xs-6">
                            <input class="form-control form-control-solid placeholder-no-fix form-group" type="text"
                                   autocomplete="off"
                                   placeholder="用户名" name="username" required/>
                        </div>
                        <div class="col-xs-6">
                            <input class="form-control form-control-solid placeholder-no-fix form-group" type="password"
                                   autocomplete="off"
                                   placeholder="密码" name="password" required/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-4">
                            <div class="rem-password">
                                <label class="rememberme mt-checkbox mt-checkbox-outline"> <input type="checkbox"
                                                                                                  name="remember"
                                                                                                  value="1"/> 记住我
                                    <span></span>
                                </label>
                            </div>
                        </div>
                        <div class="col-sm-8 text-right">
                            <div class="forgot-password">
                                <a href="javascript:;" id="forget-password" class="forget-password">忘记密码?</a>
                            </div>
                            <button class="btn green" type="submit">登录</button>
                        </div>
                    </div>
                </form>
                <!-- BEGIN FORGOT PASSWORD FORM -->
                <form class="forget-form" action="javascript:;" method="post">
                    <h3 class="font-green">Forgot Password ?</h3>
                    <p>Enter your e-mail address below to reset your password.</p>
                    <div class="form-group">
                        <input class="form-control placeholder-no-fix form-group" type="text" autocomplete="off"
                               placeholder="Email"
                               name="email"/>
                    </div>
                    <div class="form-actions">
                        <button type="button" id="back-btn" class="btn green btn-outline">Back</button>
                        <button type="submit" class="btn btn-success uppercase pull-right">Submit</button>
                    </div>
                </form>
                <!-- END FORGOT PASSWORD FORM -->
            </div>
            <div class="login-footer">
                <div class="row bs-reset">
                    <div class="col-xs-5 bs-reset">
                        <ul class="login-social">
                            <li><a href="javascript:;"> <i class="icon-social-facebook"></i>
                            </a></li>
                            <li><a href="javascript:;"> <i class="icon-social-twitter"></i>
                            </a></li>
                            <li><a href="javascript:;"> <i class="icon-social-dribbble"></i>
                            </a></li>
                        </ul>
                    </div>
                    <div class="col-xs-7 bs-reset">
                        <div class="login-copyright text-right">
                            <p>Copyright &copy; Keenthemes 2015</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- END : LOGIN PAGE 5-1 -->

<script>
    var context_root = "${context_root}";
</script>
<!--[if lt IE 9]>
<script src="../assets/global/plugins/respond.min.js"></script>
<script src="../assets/global/plugins/excanvas.min.js"></script>
<script src="../assets/global/plugins/ie8.fix.min.js"></script>
<![endif]-->
<script src="${context_root }/webjars/jquery/2.2.4/jquery.min.js"></script>
<script src="${context_root }/webjars/jquery-form/3.51/jquery.form.js"></script>

<script src="${context_root }/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>

<script src="${context_root }/webjars/js-cookie/2.1.3/js.cookie.js" type="text/javascript"></script>
<script src="${context_root }/webjars/jQuery-slimScroll/1.3.8/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="${context_root }/webjars/jquery-blockui/2.65/jquery.blockUI.js" type="text/javascript"></script>
<script src="${context_root }/webjars/bootstrap-switch/3.3.2/js/bootstrap-switch.min.js"
        type="text/javascript"></script>

<script src="${context_root }/webjars/moment/2.17.1/min/moment-with-locales.min.js"></script>
<script src="${context_root }/webjars/moment/2.17.1/locale/zh-cn.js"></script>

<script src="${context_root }/webjars/bootstrap-daterangepicker/2.1.24/js/bootstrap-daterangepicker.js"
        type="text/javascript"></script>
<script src="${context_root }/webjars/morrisjs/0.5.1/morris.min.js" type="text/javascript"></script>
<script src="${context_root }/webjars/raphaeljs/2.1.2/raphael-min.js" type="text/javascript"></script>
<script src="${context_root }/webjars/waypoints/4.0.1/lib/jquery.waypoints.min.js" type="text/javascript"></script>
<script src="${context_root }/webjars/countUp.js/1.7.0/dist/countUp.min.js" type="text/javascript"></script>

<script src="${context_root }/webjars/jszip/3.1.0/jszip.min.js"></script>
<script src="${context_root }/webjars/pdfmake-dist/0.1.31/build/pdfmake.min.js"></script>
<script src="${context_root }/webjars/pdfmake-dist/0.1.31/build/vfs_fonts.js"></script>
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="${context_root }/webjars/jquery-validation/1.15.1/jquery.validate.min.js" type="text/javascript"></script>
<script src="${context_root }/webjars/jquery-validation/1.15.1/additional-methods.min.js"
        type="text/javascript"></script>
<script src="${context_root }/webjars/select2/4.0.3/dist/js/select2.full.min.js" type="text/javascript"></script>
<script src="${context_root }/webjars/jquery-backstretch/2.0.4/jquery.backstretch.min.js"
        type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<script src="${metronic_root }/v4.7/theme/assets/global/scripts/app.min.js" type="text/javascript"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="${context_root }/resources/pages/login/script/admin_login.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<!-- END THEME LAYOUT SCRIPTS -->
</body>

</html>