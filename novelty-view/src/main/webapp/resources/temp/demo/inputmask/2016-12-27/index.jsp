<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context_root" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>bootstrap</title>
<link rel="stylesheet" href="${context_root}/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css">
<script type="text/javascript" src="${context_root}/webjars/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript" src="${context_root}/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${context_root}/webjars/jquery.inputmask/3.3.1/min/jquery.inputmask.bundle.min.js"></script>
</head>
<body>
	<div class="container">
		01 <input type="text" id="ipt01" />
		<hr />
		02 <input type="text" id="ipt02" />
		<hr />
		03 <input type="text" id="ipt03" />
		<hr />
		04 <input type="text" id="ipt04" />
		<hr />
		05 <input type="text" id="ipt05" />
		<hr />
		06 <input type="text" id="ipt06" />
		<hr />
		07 <input type="text" id="ipt07" />
		<hr />
		08 <input type="text" id="ipt08" />
		<hr />
		09 <input type="text" id="ipt09" />
		<hr />
		10 <input type="text" id="ipt10" />
		<hr />
		11 <input type="text" id="ipt11" />
		<hr />
		12 <input type="text" id="ipt12" />
		<hr />
		13 <input type="text" id="ipt13" />
		<hr />
		14 <input type="text" id="ipt14" />
		<hr />
		15 <input type="text" id="ipt15" />
		<hr />



	</div>
</body>
<script>
	console.info("${pageContext.request.contextPath }");
	var ipt1 = $("#ipt1")[0];
	var ipt2 = $("#ipt2")[0];
	$("#ipt01").inputmask("99-999999");
	$("#ipt02").inputmask("9{*}.9{*}");
	$("#ipt03").inputmask("ip");
	$("#ipt04").inputmask("AAAAAA");
	$("#ipt05").inputmask("9{1,10}");
	$("#ipt06").inputmask("decimal");
	$("#ipt07").inputmask("decimal",{
		groupSeparator : ",",
		autoGroup : true,
		"repeat": 10,
	});

</script>
</html>