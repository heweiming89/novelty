/*$("#index_iframe").find("html").on("load", function() {
    console.info(this);
});

var iframeDocument = $("#index_iframe")[0].contentWindow.document;
$(iframeDocument).ready(function() {
    console.info($(this).width());
    console.info($(this).height());
    $("#index_iframe").height($(this).height() + "px");
});*/

/*
 * $.get(context_root + "/ui/font_awesome", {}, function(data) { // var html =
 * $.parseHTML(data); // console.info(typeof html); // // console.info(html); //
 * console.info(data); var content = $(data).find("body").html();
 * console.info(content); console.info($(data));
 * console.info($(data).find("body")); }, "html");
 */
// 局部加载HTML
$("a.freedom-menu-a").on(
		"click",
		function(e) {
			e.preventDefault();
			$("#index_content_body").empty();
			// menu-dropdown classic-menu-dropdown active
			// nav-link active
			$('li.menu-dropdown.classic-menu-dropdown.active').find(
					'a.nav-link.active').removeClass("active");
			$('li.menu-dropdown.classic-menu-dropdown.active')
					.find('li.active').removeClass("active");
			$('li.menu-dropdown.classic-menu-dropdown.active').removeClass(
					"active");
			$(this).closest('li.menu-dropdown.classic-menu-dropdown').addClass(
					"active");
			$(this).closest('li').addClass("active");
			$(this).addClass("active");

			var loadUrl = this.href;
			$("#index_content_body").load(
					loadUrl,
					function(responseText, textStatus, jqXHR) {
						console.info(textStatus);
						if (textStatus == "success"
								|| textStatus == "notmodified") {
							var html = '<h1>'
									+ $(e.target).data("freedom-page-title")
									+ '&nbsp;&nbsp;<small>'
									+ moment().format('YYYY-MM-DD HH:mm:ss')
									+ '</small></h1>';
							$("#index-page-title").html(html);
						} else {

						}
					}, "html");
		});

// 金额格式化
function formatCurrency(num) {
	if (num == undefined) {
		return "";
	}
	num = num.toString().replace(/\$|\,/g, '');
	if (isNaN(num))
		num = "0.00";
	sign = (num == (num = Math.abs(num)));
	num = Math.floor(num * 100 + 0.50000000001);
	cents = num % 100;
	num = Math.floor(num / 100).toString();
	if (cents < 10)
		cents = "0" + cents;
	for (var i = 0; i < Math.floor((num.length - (1 + i)) / 3); i++)
		num = num.substring(0, num.length - (4 * i + 3)) + ','
				+ num.substring(num.length - (4 * i + 3));
	return (((sign) ? '' : '-') + num + '.' + cents);
}

// $(function() {
// $("#logOutUser").click(function() {
// console.info("test");
// var form = $('<form action="${ctxPath}/logout" method="post"></form>');
// form.appendTo(document.body);
// form.submit();
// });
// })

(function() {
	console.info(111);
	$("a#logout").on("click", function() {
		var url = context_root + "/logout";
//		$.ajax({
//			url : url,
//			method : "post"
//		});
		
		
		$("<form />", {
			action : url,
			method : "post"
		})
		.append($("<input />", {
			name : "_method",
			value : "delete"
		}))
		.appendTo(document.body)[0].submit();
	});
}());

console.info(formatCurrency(10000.8));
