 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>

<head>
    <meta charset="UTF-8">
    
    <jsp:include page="/WEB-INF/views/system/common.jsp"></jsp:include>
    <style type="text/css">
        #index {
            padding: 15px;
            display: flex;
            justify-content: space-between;
            flex-wrap: wrap;
            opacity: 0;
            font-size: 12px;
        }
        .index-l {
            padding: 10px;
            width: 48%;
            overflow: auto;
        }
    </style>
</head>

<body>
<div id="index">
    <!--表格-->
    <div class="index-l">
        <div id="p" class="easyui-panel" title="菜单管理"
             data-options="iconCls:'fa fa-tags',closable:true,collapsible:true,minimizable:true,maximizable:true">
          <div class="contentWrapper">
	      <div>
	      	 <a href="javascript:void(0)" data-options="iconCls:'fa fa-area-chart'" id="addr" class="easyui-linkbutton primary" style="height: 32px;border-left-width: 1px;margin-left: 29px;">新增</a>
       		  <a href="javascript:void(0)" class="easyui-linkbutton error" data-options="iconCls:'fa fa-gears'">修改</a>
	      </div>
	      </div>
	  <div class="index-l" style="opacity: 1;width:100%;min-height:720px;">
        <table id="redg" style="hight:780px;"></table>
    </div>
</div>

<div id="myWinr" style="display: none;"></div></div>
<script type="text/javascript">
  

jQuery('#redg').treegrid({
    url: '${pageContent.request.contentPath}/system/resource/load_datagrid.do',
    idField: 'id',
    treeField: 'name',
    
    columns: [
        [
        {
            field: 'name',
            title: '名称',
            width: 333,
            align: 'center',
        }, 
        {
            field: 'sort',
            title: '排序',
            width: 333,
            align: 'center',
        }, {
            field: 'target',
            title: '路径',
            width: 333,
            align: 'center',
        }, {
            field: 'type',
            title: '类型',
            width: 333,
            align: 'center',
        }, {
            field: 'enabled',
            title: '是否可用',
            width: 333,
            align: 'center',
        }]
    ]
});

$("#addr").on('click', function () {
    $('#myWinr').window({
        width: 800,
        height: 500,
        title:"新增",
        href:"${pageContent.request.contentPath}/system/resource/add_01",
        modal: true,
        constrain: true,
        
        buttons: [{
            text: '保存',
            handler: function () {
            }
        }, {
            text: '关闭',
            handler: function () {
            }
        }]
    });
});
   </script>
</body>

</html>