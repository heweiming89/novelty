<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context_root" value="${pageContext.request.contextPath }" scope="application" />
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
<meta charset="UTF-8" />
<title>websocket</title>
</head>
<body>
	Welcome
	<br />
	<input id="content" type="text" />
	<button id="sendMsgBtn">发送消息</button>
	<hr />
	<button id="closeSocketBtn">关闭WebSocket连接</button>
	<hr />
	<div id="message"></div>
</body>

<script src="webjars/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
	var websocket = null;
	// 判断当前浏览器是否支持WebSocket
	if ('WebSocket' in window) {
		websocket = new WebSocket(
				"ws://localhost:8080${context_root}/websocket");
	} else {
		alert("当前浏览器 not support websocket");
	}

	// 连接发生错误的回调方法
	websocket.onerror = function() {
		setMessageInnerHTML("WebSocket连接发生错误");
	}

	// 连接成功建立的回调方法
	websocket.onopen = function() {
		setMessageInnerHTML("WebSocket连接成功");
	}

	// 接受到消息的回调方法
	websocket.onmessage = function(event) {
		setMessageInnerHTML(event.data);
	}

	// 连接关闭的回调方法
	websocket.onclose = function() {
		setMessageInnerHTML("WebSocket连接关闭");
	}

	// 监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
	window.onbeforeunload = function() {
		closeWebSocket();
	}

	// 将消息显示在网页上
	function setMessageInnerHTML(innerHTML) {
		var html = $("#message").html();
		$("#message").html(html += innerHTML + "<br />");
	}

	// 关闭WebSocket连接
	function colseWebSocket() {
		websocket.close();
	}

	// 发送消息
	function send() {
		var message = $("#content").val();
		websocket.send(message);
	}

	$("#sendMsgBtn").on("click", function() {
		send();
	});

	$("#closeSocketBtn").on("click", function() {
		colseWebSocket();
	});
</script>


</html>