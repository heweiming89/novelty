<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context_root" value="${pageContext.request.contextPath }" />
<c:set var="plugins_root" value="${context_root}/resources/plugins" />
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Person</title>
	<link rel="stylesheet" href="${context_root}/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css">
    <link rel="stylesheet" href="${context_root}/resources/plugins/DataTables/1.10.13/media/css/dataTables.bootstrap.min.css">
    <link rel="stylesheet" href="${context_root}/resources/plugins/DataTables/1.10.13/extensions/Responsive/css/responsive.bootstrap.min.css">
    <link rel="stylesheet" href="${context_root}/resources/plugins/DataTables/1.10.13/extensions/Scroller/css/scroller.bootstrap.min.css">
    <link rel="stylesheet" href="${context_root}/resources/plugins/DataTables/1.10.13/extensions/Buttons/css/buttons.bootstrap.min.css">
    <link rel="stylesheet" href="${context_root}/resources/plugins/DataTables/1.10.13/extensions/Select/css/select.bootstrap.min.css">
    <link rel="stylesheet" href="${context_root}/resources/plugins/DataTables/1.10.13/extensions/FixedHeader/css/fixedHeader.bootstrap.min.css">
    <link rel="stylesheet" href="${context_root}/resources/plugins/DataTables/1.10.13/extensions/FixedColumns/css/fixedColumns.bootstrap.min.css">
    <link rel="stylesheet" href="${context_root}/resources/plugins/DataTables/Editor/1.6.1/css/editor.bootstrap.min.css">
</head>
<body>
	<div class="container">
		<!-- Add your site or application content here -->
		<button id="testBtn1" type="button" class="btn btn-primary" style="margin-bottom: 15px; margin-top: 15px;">测试按钮1</button>
		<div class="table-responsive">
			<!--            <table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%"> -->
			<table id="example" class="table table-striped table-bordered table-hover table-condensed dt-responsive nowrap"
				cellspacing="0" width="100%">
				<thead>
				</thead>
				<tbody>
				</tbody>
			</table>
		</div>
		<div id="json_div" style="height: 500px; width: 100%;"></div>
	</div>
</body>
<script src="${context_root}/webjars/jquery/2.2.4/jquery.min.js"></script>
<script src="${context_root}/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
<script src="${context_root}/resources/plugins/DataTables/1.10.13/media/js/jquery.dataTables.min.js"></script>
<script src="${context_root}/resources/plugins/DataTables/1.10.13/media/js/dataTables.bootstrap.min.js"></script>
<script src="${context_root}/resources/plugins/DataTables/1.10.13/extensions/Scroller/js/dataTables.scroller.min.js"></script>
<script src="${context_root}/resources/plugins/DataTables/1.10.13/extensions/Responsive/js/dataTables.responsive.min.js"></script>
<script src="${context_root}/resources/plugins/DataTables/1.10.13/extensions/Responsive/js/responsive.bootstrap.min.js"></script>
<script src="${context_root}/resources/plugins/DataTables/1.10.13/extensions/Select/js/dataTables.select.min.js"></script>
<script src="${context_root}/resources/plugins/DataTables/1.10.13/extensions/FixedHeader/js/dataTables.fixedHeader.min.js"></script>
<script src="${context_root}/resources/plugins/DataTables/1.10.13/extensions/FixedColumns/js/dataTables.fixedColumns.min.js"></script>

<script src="${context_root}/resources/plugins/DataTables/1.10.13/extensions/Buttons/js/dataTables.buttons.min.js"></script>
<script src="${context_root}/resources/plugins/DataTables/1.10.13/extensions/Buttons/js/buttons.bootstrap.min.js"></script>
<script src="${context_root}/resources/plugins/DataTables/1.10.13/extensions/Buttons/js/buttons.html5.min.js"></script>
<script src="${context_root}/resources/plugins/DataTables/1.10.13/extensions/Buttons/js/buttons.print.min.js"></script>
<script src="${context_root}/resources/plugins/DataTables/1.10.13/extensions/Buttons/js/buttons.colVis.min.js"></script>

<script src="${context_root}/resources/plugins/DataTables/Editor/1.6.1/js/dataTables.editor.min.js"></script>
<script src="${context_root}/resources/plugins/DataTables/Editor/1.6.1/js/editor.bootstrap.min.js"></script>

<script>
	var editor = null;
	var dataTableId = "#example";
	$(function() {
		var url = "${context_root}/person/";
		editor = new $.fn.dataTable.Editor({
			ajax : {
				create : {
					type : "POST",
					url : url
				},
				edit : {
					type : "PUT",
					url : url
				},
				remove : {
					type : "DELETE",
					url : url
				}
			},
			table : dataTableId,
			//             idSrc : 'name',
			fields : [ {
				label : "姓名1",
				name : 'DT_RowId'
			}, {
				label : "年龄",
				name : 'age'
			}, {
				label : "性别",
				name : 'gender'
			}, {
				label : "身高",
				name : 'height'
			}, {
				label : "体重",
				name : 'weight'
			}, {
				label : "生日",
				name : 'birthday',
				type : 'datetime'
			}, {
				label : "手机",
				name : 'mobilePhone'
			}, {
				label : "收入",
				name : "income"
			} ],
			i18n : {
				create : {
					button : "新建",
					title : "增加记录",
					submit : "新建"
				},
				edit : {
					button : "编辑",
					title : "更新记录",
					submit : "更新"
				},
				remove : {
					button : "删除",
					title : "删除记录",
					submit : "删除",
					confirm : {
						_ : "确定删除 %d 条记录?",
						1 : "确定删除 1 条记录?"
					}
				},
				error : {
					system : "这是一段错误提示"
				},
				datetime : {
					previous : 'Précédent',
					next : 'Premier',
					months : [ '一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月',
							'九月', '十月', '十一月', '十二月' ],
					weekdays : [ '日', '一', '二', '三', '四', '五', '六' ]
				}
			}
		});

		$.fn.dataTable.ext.errMode = 'none';

		var table = null;
		$(document).on(
				"click",
				"#testBtn1",
				function() {
					console.info(moment().format());
					$("#json_div").html(
							"<pre>"
									+ JSON
											.stringify(table.ajax.json(), null,
													4) + "</pre>");
				});

		// Edit record
		$(dataTableId).on('click', 'a.editor_edit', function(e) {
			e.preventDefault();

			editor.edit($(this).closest('tr'), {
				title : '编辑记录',
				buttons : '更新'
			});
		});

		// Delete a record
		$(dataTableId).on('click', 'a.editor_remove', function(e) {
			e.preventDefault();

			editor.remove($(this).closest('tr'), {
				title : '删除记录',
				message : '确定要删除这条记录吗?',
				buttons : '删除'
			});
		});

		table = $(dataTableId)
				.on('error.dt', function(e, settings, techNote, message) {
					console.log("错误提示" + message);
				})
				.DataTable(
						{
							dom : 'Brtip',
							fixedHeader : true,
							//                             responsive : {
							//                                 details : {
							//                                     type : 'column',
							//                                     display : $.fn.dataTable.Responsive.display.modal({
							//                                         header : function(row) {
							//                                             var data = row.data();
							//                                             return 'Details for ' + data[0] + ' ' + data[1];
							//                                         }
							//                                     }),
							//                                     renderer : $.fn.dataTable.Responsive.renderer.tableAll({
							//                                         tableClass : 'table'
							//                                     })

							//                                     renderer : function(api, rowIdx, columns) {
							//                                         var data = $.map(
							//                                                 columns,
							//                                                 function(col, i) {
							//                                                     return col.hidden ? '<tr data-dt-row="'+col.rowIndex+'" data-dt-column="'+col.columnIndex+'">' + '<td>'
							//                                                             + col.title + ':' + '</td> ' + '<td>' + col.data + '</td>' + '</tr>' : '';
							//                                                 }).join('');

							//                                         return data ? $('<table/>').append(data) : false;
							//                                     }
							//                                 }
							//                             },
							columnDefs : [ {
								className : 'control',
								//                                 orderable: false,
								targets : 0
							} ],
							lengthMenu : [
									[ 10, 25, 50, 100 ],
									[ '显示 10 行', '显示 25 行', '显示 50 行',
											'显示 100 行' ] ],
							//                             lengthMenu : [ [ 50, 100 ], [ '显示 50 行', '显示 100 行' ] ],
							buttons : [
									{
										extend : 'pageLength',
										text : function(dt) {
											return dt.i18n(
													'buttons.pageLength', {
														"-1" : '显示 所有 行',
														_ : '显示 %d 行'
													}, dt.page.len());
										}
									},
									{
										extend : 'copy',
										text : '<i class="fa fa-files-o" aria-hidden="true"></i>&nbsp;&nbsp;复制'
									},
									{
										extend : 'collection',
										text : '<i class="fa fa-file" aria-hidden="true"></i>&nbsp;&nbsp;导出',
										buttons : [
												{
													extend : 'csv',
													text : '<i class="fa fa-file-word-o" aria-hidden="true"></i>&nbsp;&nbsp;CSV',
													title : '测试csv文件名',
													exportOptions : {
														columns : ':visible'
													}
												},
												{
													extend : 'excel',
													text : '<i class="fa fa-file-excel-o" aria-hidden="true"></i>&nbsp;&nbsp;EXCEL',
													exportOptions : {
														columns : ':visible'
													}
												},
												{
													extend : 'pdf',
													text : '<i class="fa fa-file-pdf-o" aria-hidden="true"></i>&nbsp;&nbsp;PDF',
													exportOptions : {
														columns : ':visible'
													}
												} ]
									},
									{
										extend : 'print',
										text : '<i class="fa fa-print" aria-hidden="true"></i>&nbsp;&nbsp;打印',
										title : function() {
											console.info(arguments);
											return moment().format(
													'YYYY-MM-DD hh:mm:ss');
										},
										message : 'This print was produced using the Print button for DataTables',
										exportOptions : {
											columns : ':visible'
										},
										autoPrint : false,
										customize : function(win) {
											$(win.document.body)
													.css('font-size', '10pt')
													.prepend(
															'<img src="http://datatables.net/media/images/logo-fade.png" style="position:absolute; top:0; left:0;" />');

											$(win.document.body).find('table')
													.addClass('compact').css(
															'font-size',
															'inherit');
										}
									},
									{
										extend : 'colvis',
										text : '<i class="fa fa-columns" aria-hidden="true"></i>&nbsp;&nbsp;显示',
										//                 collectionLayout : 'fixed one-column',
										columns : ':not(:first-child)',
										postfixButtons : [ {
											extend : 'colvisRestore',
											text : "显示恢复"
										} ]
									},
									//             {
									//                 extend : 'collection',
									//                 text : "显示2",
									//                 buttons : ['columnsToggle']
									//             }, 
									{
										text : 'My button',
										className : 'btn-primary',
										action : function(e, dt, node, config) {
											console.info(e);
											console.info(dt);
											console.info(node);
											console.info(config);
										}
									}, {
										extend : "create",
										text : "新建",
										editor : editor
									}, {
										extend : "edit",
										text : "编辑",
										editor : editor
									}, {
										extend : "remove",
										text : "删除",
										editor : editor
									} ],
							language : {
								url : "${context_root}/resources/config/i18n/datatables_zh-cn.json"
							},

							ordering : false,
							serverSide : true,
							ajax : {
								url : "${context_root}/person/paging",
								type : "GET"
							},

							columns : [
									{
										data : null,
										defaultContent : ''
									},
									//                                     {
									//                                         data : null,
									//                                         title : "",
									//                                         defaultContent : '',
									//                                         className : 'select-checkbox'
									//                                     },
									{
										"title" : "姓名",
										data : 'DT_RowId'
									},
									{
										"title" : "年龄",
										data : 'age'
									},
									{
										"title" : "性别",
										data : 'gender'
									},
									{
										"title" : "身高",
										data : 'height'
									},
									{
										"title" : "体重",
										data : 'weight'
									},
									{
										"title" : "生日",
										data : 'birthday'
									},
									{
										"title" : "手机",
										data : 'mobilePhone'
									},
									{
										title : "收入",
										render : function(data, type, row, meta) {
											console.info(type);
											if (type === 'display') {
												var num = $.fn.dataTable.render
														.number(',', '.', 2)
														.display(data);
												return num;
											} else {
												return data;
											}
										},
										data : "income"
									},
									{
										title : "操作",
										data : null,
										className : "text-center",
										defaultContent : '<a href="" class="btn btn-primary btn-xs editor_edit"><i class="glyphicon glyphicon-pencil"></i></a>   <a href="" class="btn btn-danger btn-xs editor_remove"><i class="glyphicon glyphicon-trash"></i></a>'
									}, {
										title : "测试数据01",
										data : "test1"
									}, {
										title : "测试数据02",
										data : "test2"
									}, {
										title : "测试数据03",
										data : "test3"
									}, {
										title : "测试数据04",
										data : "test4"
									}, {
										title : "测试数据05",
										data : "test5"
									}, {
										title : "测试数据06",
										data : "test6"
									} ],
							select : {
								style : 'os',
								selector : 'td:first-child',
								blurable : true
							},

							lengthChange : false,

						});

		// 			table.buttons().container().appendTo('#example_wrapper .col-sm-6:eq(0)');
	});
</script>
</html>