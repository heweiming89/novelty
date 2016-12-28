<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>2016-12-03 02:03:02</title>
<%@ include file="/resources/config/global/global.jspf"%>
</head>
<body>
    <div class="container">
        <!-- Add your site or application content here -->
        <button id="testBtn1" type="button" class="btn btn-primary" style="margin-bottom: 15px; margin-top: 15px;">测试按钮1</button>
        <div class="table-responsive">
            <!--            <table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%"> -->
            <table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                </thead>
                <tbody>
                </tbody>
            </table>
        </div>
        <div id="json_div" style="height: 500px; width: 100%;"></div>
    </div>
</body>
<script>
	var editor = null;

    $(function() {

        editor = new $.fn.dataTable.Editor({
            ajax : "../php/staff.php",
            table : "#example",
            fields : [ {
                label : "First name:",
                name : "first_name"
            }, {
                label : "Last name:",
                name : "last_name"
            }, {
                label : "Position:",
                name : "position"
            }, {
                label : "Office:",
                name : "office"
            }, {
                label : "Extension:",
                name : "extn"
            }, {
                label : "Start date:",
                name : "start_date",
                type : 'datetime'
            }, {
                label : "Salary:",
                name : "salary"
            } ]
        });

        var dataTableId = "#example";

        $.fn.dataTable.ext.errMode = 'none';

        var table = null;
        $(document).on("click", "#testBtn1", function() {
            console.info(moment().format());
            $("#json_div").html("<pre>" + JSON.stringify(table.ajax.json(), null, 4) + "</pre>");
        });

        table = $(dataTableId).on('error.dt', function(e, settings, techNote, message) {
            console.log("错误提示" + message);
        }).DataTable(
                {
                    dom : 'Brtip',
                    lengthMenu : [ [ 10, 25, 50, 100 ], [ '显示 10 行', '显示 25 行', '显示 50 行', '显示 100 行' ] ],
                    buttons : [
                            {
                                extend : 'pageLength',
                                text : function(dt) {
                                    return dt.i18n('buttons.pageLength', {
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
                                buttons : [ {
                                    extend : 'csv',
                                    text : '<i class="fa fa-file-word-o" aria-hidden="true"></i>&nbsp;&nbsp;CSV',
                                    title : '测试csv文件名',
                                    exportOptions : {
                                        columns : ':visible'
                                    }
                                }, {
                                    extend : 'excel',
                                    text : '<i class="fa fa-file-excel-o" aria-hidden="true"></i>&nbsp;&nbsp;EXCEL',
                                    exportOptions : {
                                        columns : ':visible'
                                    }
                                }, {
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
                                    return moment().format('YYYY-MM-DD hh:mm:ss');
                                },
                                message : 'This print was produced using the Print button for DataTables',
                                exportOptions : {
                                    columns : ':visible'
                                },
                                autoPrint : false,
                                customize : function(win) {
                                    $(win.document.body).css('font-size', '10pt').prepend(
                                            '<img src="http://datatables.net/media/images/logo-fade.png" style="position:absolute; top:0; left:0;" />');

                                    $(win.document.body).find('table').addClass('compact').css('font-size', 'inherit');
                                }
                            }, {
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
                            } ],
                    language : {
                        url : "${ctx_path}/demo/includes/i18n/datatables_zh-cn.json"
                    },

                    ordering : false,
                    serverSide : true,
                    ajax : {
                        url : "${ctx_path}/datatables/server/object",
                        type : "POST"
                    },

                    columns : [ {
                        "title" : "姓名",
                        data : 'name'
                    }, {
                        "title" : "年龄",
                        data : 'age'
                    }, {
                        "title" : "性别",
                        data : 'gender'
                    }, {
                        "title" : "身高",
                        data : 'height'
                    }, {
                        "title" : "体重",
                        data : 'weight'
                    }, {
                        "title" : "生日",
                        data : 'birthday'
                    }, {
                        "title" : "手机",
                        data : 'mobilePhone'
                    } ]
                // 				lengthChange : false,

                });

        // 			table.buttons().container().appendTo('#example_wrapper .col-sm-6:eq(0)');
    });
</script>
</html>