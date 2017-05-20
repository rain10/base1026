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
    <div class="contentWrapper">
                	<!--tab-->
		    <div class="index-l">
		        <div id="tt" class="easyui-tabs" data-options="tabHeight:31" style="width:100%;height:100px;">
		            <div title="Tab1" style="padding:20px;display:none;">
		                tab1
		            </div>
		            <div title="Tab2" style="overflow:auto;padding:20px;display:none;">
		                tab2
		            </div>
		            <div title="Tab3" data-options="iconCls:'fa fa-user',closable:true" style="padding:20px;display:none;">
		                tab3
		            </div>
		        </div>
	    </div>      
        </div>
</div>

<script type="text/javascript">
  

   </script>
</body>

</html>