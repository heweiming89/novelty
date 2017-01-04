<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context_root" value="${pageContext.request.contextPath }" />
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>currencyFormatter</title>
</head>
<body>
	<input type="text" class="curreny" value="123453414" />
	<br />
	<input type="text" class="curreny" value="123453414" />
	<br />
	<input type="text" class="curreny" value="123453414" />
	<br />
	<input type="text" class="curreny" value="123453414" />
	<br />
	<input type="text" class="curreny" value="123453414" />
	<br />
	<input type="text" class="curreny" value="123453414" />
	<br />




</body>
<script src="${context_root}/webjars/jquery/2.2.4/jquery.min.js"></script>
<script src="${context_root}/resources/plugins/CurrencyFormatter/1.0.4/currencyFormatter.min.js"></script>
<script>
	var money = 2534234;
	var val = OSREC.CurrencyFormatter.format(money, {
// 		currency : 'CNY'
	});
	console.info(val);
	$("input.curreny:eq(1)").val(val);
	
	
</script>




</html>