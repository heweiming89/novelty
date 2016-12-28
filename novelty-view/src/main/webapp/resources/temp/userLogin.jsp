<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context_root" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8" />
<title>用户登录</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta
  content="#1 selling multi-purpose bootstrap admin theme sold in themeforest marketplace packed with angularjs, material design, rtl support with over thausands of templates and ui elements and plugins to power any type of web applications including saas and admin dashboards. Preview page of Theme #3 for "
  name="description" />
<meta content="" name="author" />
<%@ include file="/resources/config/global/css.jspf"%>
<!-- BEGIN PAGE LEVEL PLUGINS -->
<link href="${context_root }/static/plug-ins/select2/4.0.3/dist/css/select2.min.css" rel="stylesheet" type="text/css" />
<link href="${context_root }/static/plug-ins/select2/4.0.3/dist/css/select2-bootstrap.min.css" rel="stylesheet" type="text/css" />
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link href="${context_root }/static/framework/metronic/v4.7/theme/assets/pages/css/login.min.css" rel="stylesheet" type="text/css" />
<!-- END PAGE LEVEL STYLES -->
<!-- BEGIN THEME LAYOUT STYLES -->
<!-- END THEME LAYOUT STYLES -->
<link rel="shortcut icon" href="favicon.ico" />
</head>
<!-- END HEAD -->

<body class=" login">
  <!-- BEGIN LOGO -->
  <div class="logo">
<!--     <a href="index.html">  -->
<%--     <img src="${context_root }/static/img/wow.png" alt="" /> --%>
<!--     </a> -->
  </div>
  <!-- END LOGO -->
  <!-- BEGIN LOGIN -->
  <div class="content">
    <!-- BEGIN LOGIN FORM -->
    <form class="login-form" action="index.html" method="post">
      <h3 class="form-title font-green">Sign In</h3>
      <div class="alert alert-danger display-hide">
        <button class="close" data-close="alert"></button>
        <span> Enter any username and password. </span>
      </div>
      <div class="form-group">
        <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
        <label class="control-label visible-ie8 visible-ie9">Username</label> <input class="form-control form-control-solid placeholder-no-fix" type="text" autocomplete="off"
          placeholder="Username" name="username" />
      </div>
      <div class="form-group">
        <label class="control-label visible-ie8 visible-ie9">Password</label> <input class="form-control form-control-solid placeholder-no-fix" type="password" autocomplete="off"
          placeholder="Password" name="password" />
      </div>
      <div class="form-actions">
        <button type="submit" class="btn green uppercase">Login</button>
        <label class="rememberme check mt-checkbox mt-checkbox-outline"> <input type="checkbox" name="remember" value="1" />Remember <span></span>
        </label> <a href="javascript:;" id="forget-password" class="forget-password">Forgot Password?</a>
      </div>
      <div class="login-options">
        <h4>Or login with</h4>
        <ul class="social-icons">
          <li><a class="social-icon-color facebook" data-original-title="facebook" href="javascript:;"></a></li>
          <li><a class="social-icon-color twitter" data-original-title="Twitter" href="javascript:;"></a></li>
          <li><a class="social-icon-color googleplus" data-original-title="Goole Plus" href="javascript:;"></a></li>
          <li><a class="social-icon-color linkedin" data-original-title="Linkedin" href="javascript:;"></a></li>
        </ul>
      </div>
      <div class="create-account">
        <p>
          <a href="javascript:;" id="register-btn" class="uppercase">Create an account</a>
        </p>
      </div>
    </form>
    <!-- END LOGIN FORM -->
    <!-- BEGIN FORGOT PASSWORD FORM -->
    <form class="forget-form" action="index.html" method="post">
      <h3 class="font-green">Forget Password ?</h3>
      <p>Enter your e-mail address below to reset your password.</p>
      <div class="form-group">
        <input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="Email" name="email" />
      </div>
      <div class="form-actions">
        <button type="button" id="back-btn" class="btn green btn-outline">Back</button>
        <button type="submit" class="btn btn-success uppercase pull-right">Submit</button>
      </div>
    </form>
    <!-- END FORGOT PASSWORD FORM -->
    <!-- BEGIN REGISTRATION FORM -->
    <form class="register-form" action="index.html" method="post">
      <h3 class="font-green">Sign Up</h3>
      <p class="hint">Enter your personal details below:</p>
      <div class="form-group">
        <label class="control-label visible-ie8 visible-ie9">Full Name</label> <input class="form-control placeholder-no-fix" type="text" placeholder="Full Name" name="fullname" />
      </div>
      <div class="form-group">
        <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
        <label class="control-label visible-ie8 visible-ie9">Email</label> <input class="form-control placeholder-no-fix" type="text" placeholder="Email" name="email" />
      </div>
      <div class="form-group">
        <label class="control-label visible-ie8 visible-ie9">Address</label> <input class="form-control placeholder-no-fix" type="text" placeholder="Address" name="address" />
      </div>
      <div class="form-group">
        <label class="control-label visible-ie8 visible-ie9">City/Town</label> <input class="form-control placeholder-no-fix" type="text" placeholder="City/Town" name="city" />
      </div>
      <div class="form-group">
        <label class="control-label visible-ie8 visible-ie9">Country</label> <select name="country" class="form-control">
          <option value="">Country</option>
        </select>
      </div>
      <p class="hint">Enter your account details below:</p>
      <div class="form-group">
        <label class="control-label visible-ie8 visible-ie9">Username</label> <input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="Username"
          name="username" />
      </div>
      <div class="form-group">
        <label class="control-label visible-ie8 visible-ie9">Password</label> <input class="form-control placeholder-no-fix" type="password" autocomplete="off"
          id="register_password" placeholder="Password" name="password" />
      </div>
      <div class="form-group">
        <label class="control-label visible-ie8 visible-ie9">Re-type Your Password</label> <input class="form-control placeholder-no-fix" type="password" autocomplete="off"
          placeholder="Re-type Your Password" name="rpassword" />
      </div>
      <div class="form-group margin-top-20 margin-bottom-20">
        <label class="mt-checkbox mt-checkbox-outline"> <input type="checkbox" name="tnc" /> I agree to the <a href="javascript:;">Terms of Service </a> & <a
          href="javascript:;">Privacy Policy </a> <span></span>
        </label>
        <div id="register_tnc_error"></div>
      </div>
      <div class="form-actions">
        <button type="button" id="register-back-btn" class="btn green btn-outline">Back</button>
        <button type="submit" id="register-submit-btn" class="btn btn-success uppercase pull-right">Submit</button>
      </div>
    </form>
    <!-- END REGISTRATION FORM -->
  </div>
  <div class="copyright">2014 Â© Metronic. Admin Dashboard Template.</div>

  <%@ include file="/resources/config/global/js.jspf"%>
  <!-- BEGIN PAGE LEVEL PLUGINS -->
  <script src="${context_root }/resources/static/plug-ins/jquery-validation/1.15.1/dist/jquery.validate.min.js" type="text/javascript"></script>
  <script src="${context_root }/resources/static/plug-ins/jquery-validation/1.15.1/dist/additional-methods.min.js" type="text/javascript"></script>
  <script src="${context_root }/resources/static/plug-ins/select2/4.0.3/dist/js/select2.full.min.js" type="text/javascript"></script>
  <!-- END PAGE LEVEL PLUGINS -->
  <!-- BEGIN THEME GLOBAL SCRIPTS -->
  <script src="${context_root }/resources/static/framework/metronic/v4.7/theme/assets/global/scripts/app.min.js" type="text/javascript"></script>
  <!-- END THEME GLOBAL SCRIPTS -->
  <!-- BEGIN PAGE LEVEL SCRIPTS -->
  <script src="${context_root }/resources/static/framework/metronic/v4.7/theme/assets/pages/scripts/login.min.js" type="text/javascript"></script>
  <!-- END PAGE LEVEL SCRIPTS -->
  <!-- BEGIN THEME LAYOUT SCRIPTS -->
  <!-- END THEME LAYOUT SCRIPTS -->
</body>

</html>