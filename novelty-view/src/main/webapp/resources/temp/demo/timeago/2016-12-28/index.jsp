<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="context_root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>bootstrap</title>
    <link rel="stylesheet" href="${context_root}/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css">
    <script type="text/javascript" src="${context_root}/webjars/jquery/2.2.4/jquery.min.js"></script>
    <script type="text/javascript" src="${context_root}/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>

    <script type="text/javascript" src="${context_root}/webjars/timeago.js/1.1.0/dist/timeago.min.js"></script>
    <%--<script type="text/javascript" src="${context_root}/webjars/timeago.js/1.1.0/locales/zh_CN.js"></script>--%>
</head>
<body>
<div class="container">


</div>
</body>
<script>
    var timeage = timeago();
    timeage.format("2016-12-27");
    console.info(timeage.format("2016-12-27", 'zh_CN'));

</script>
</html>