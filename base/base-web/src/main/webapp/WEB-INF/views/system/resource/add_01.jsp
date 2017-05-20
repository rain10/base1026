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
	        <div id="tt" class="easyui-tabs" data-options="tabHeight:31" style="width:100%;">
	            <div title="基础配置" style="padding:20px;display:none;">
	            <div class="contentWrapper">
	                 <div class="form-item">
                        <label for="" class="label-top">资源名称：</label>
                        <input id="name" class="easyui-validatebox easyui-textbox" 
                               data-options="required:true,validType:'length[3,10]'" style="width: 90%;">
                    
                    </div>
                    <div class="form-item">
                        <label for="" class="label-top">资源地址：</label>
                        <input id="target" class="easyui-validatebox easyui-textbox" 
                               data-options="required:false,validType:'length[3,10]'" style="width: 90%;">
                    
                    </div>
                    <div class="form-item">
                        <label for="" class="label-top">所属资源：</label>
                        <select id="pid" class="easyui-combotree" style="width: 90%;height: 30px;"  url="${pageContext.request.contextPath }/system/resource/load_tree.do" data-options="editable:false,panelHeight:null"
                                name="pid">
                        </select>
                    </div>
                    <div class="form-item">
                        <label for="" class="label-top">资源排序：</label>
                        <input id="sort" class="easyui-validatebox easyui-textbox" 
                               data-options="required:false,validType:'length[3,10]'" style="width: 90%;">
                    
                    </div>
                     <div class="form-item">
                        <label for="" class="label-top">是否可用：</label>
                        <select id="enable" class="easyui-combobox" data-options="editable:false,panelHeight:null"
                                name="enabled" style="width: 90%;">
                            <option value="1">是</option>
                            <option value="0">否</option>
                        </select>
                    </div>
                     <div class="form-item">
                        <label for="" class="label-top">资源描述：</label>
                        <input id="author" class="easyui-validatebox easyui-textbox" 
                               data-options="required:false" style="width: 90%;">
                    
                    </div>
	            </div>
	            </div>
	            <div title="功能配置" style="overflow:auto;padding:20px;display:none;">
	               
	            </div>
	        </div>
	    </div>      
   	 </div>
   	 		<div>
   	 			 <a id="save" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'fa fa-gears'" style="height: 30px;border-left-width: 1px;margin-left: 320px;">保存</a>
   	 			 <a id="close" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'fa fa-tags'" style="height: 30px;border-left-width: 1px;">取消</a>
   	 		</div>
  		
</div>

<script type="text/javascript">
$("#close").click(function(){
	$("#myWinr").dialog('close')
	});
	
$("#save").click(function(){
	var name = $("#name").val();
	var sort = $("#sort").val();
	var enable = $("#enable").val();
	var author = $("#author").val();
	var pid = $("#pid").combotree("getValue"); 
	var target = $("#target").val();
	console.log(name+sort+enable+author+pid+target);
	$.ajax({
		url:'${pageContent.request.contentPath}/system/resource/save.do',
		data:{
			name:name,
			sort:sort,
			enabled:enable,
			author:author,
			pid:pid,
			target:target
		},
		type: 'POST',
		dataType:'json',
		success: function(data){
				if (data.status ==200) {
					alert("xxx")
					$.messager.alert('警告','警告消息');
				}
			},
			error:function(data) {
				
				console.log(data.data);	
			}
		})
	});
   </script>
</body>

</html>