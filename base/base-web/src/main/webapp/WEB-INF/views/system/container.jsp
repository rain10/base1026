<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title></title>
		<!--easyui-->
		<script src="/admin/easyui/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="/admin/easyui/jquery.easyui.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="/admin/easyui/locale/easyui-lang-zh_CN.js" type="text/javascript" charset="utf-8"></script>
		<!--字体图标-->
		<link rel="stylesheet" type="text/css" href="/admin/easyui/themes/icons/css/font-awesome.min.css" />
		<!--皮肤-->
		<link rel="stylesheet" type="text/css" href="/admin/easyui/themes/gray/easyui.css" />
		<link rel="stylesheet" type="text/css" href="/admin/css/superBlue.css" />

		<script src="/admin/js/super.js" type="text/javascript" charset="utf-8"></script>
	</head>

	<body id="main" class="easyui-layout">
		<div data-options="region:'north',border:false" class="super-north" style="height: 50px;">
			<!--顶部-->
			<div class="super-navigation">
				<div class="super-navigation-title">SUPER THEME</div>
				<div class="super-navigation-main">
					<div class="super-setting-left">
						<ul>
							<li><i class="fa fa-commenting-o"></i></li>
							<li><i class="fa fa-envelope-o"></i></li>
							<li><i class="fa fa-bell-o"></i></li>
							<!--<div id="mm2" class="easyui-menu">
								<div>有情况</div>
								<div>你瞅啥</div>
								<div class="menu-sep"></div>
								<div>瞅你咋滴</div>
							</div>-->
						</ul>
					</div>
					<div class="super-setting-right">
						<ul>
							<li class="user">
								<span class="user-icon"><img src="/admin/img/favicon.png"/></span>
								<span>管理员</span>
							</li>
							<li>
								<div class="super-setting-icon">
									<i class="fa fa-gears"></i>
								</div>
								<div id="mm" class="easyui-menu">
									<div>个人中心</div>
									<div id="themeSetting">主题</div>
									<div class="menu-sep"></div>
									<div id="logout">退出</div>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div id="easyui-layout-west" data-options="region:'west',title:'MAIN NAVIGATION',border:false">
			<!--左侧导航-->
			<div class="easyui-accordion" data-options="border:false,fit:true,selected:true">
<!-- 				<div title="系统管理" data-options="iconCls:'fa fa-navicon'"> -->
<!-- 					<ul> -->
<!-- 						<li data-url='example/pagination.html'>菜单管理</li> -->
<%-- 						<li data-url='${pageContent.request.contentPath }/system/role/list_01'>角色管理</li> --%>
<!-- 						<li data-url="example/progressBar.html">人员管理</li> -->
<!-- 					</ul> -->
<!-- 				</div> -->
				<c:forEach items="${menu }" var="menu">
				<div title="${menu.name }" data-options="iconCls:'fa fa-navicon'">
					<ul id="ul">
						<c:forEach items="${menu.children }" var="child">
							<li data-url='${child.target }'>${child.name }</li>
						</c:forEach>
					</ul>
				</div>
				</c:forEach>
			</div>
		</div>
		<div data-options="region:'center'" style="padding-top: 2px;">
			<!--主要内容-->
			<div id="tt" class="easyui-tabs" data-options="border:false,fit:true">
				<div title="首页" data-options="iconCls:'fa fa-home'">
					<iframe src="${pageContent.request.contentPath }/demo" width="100%" height="99%" frameborder="no">
					</iframe>
				</div>
			</div>
		</div>
		<div data-options="region:'south'" class="super-south">
			<!--页脚-->
			<div class="super-footer-info">
				<span><i class="fa fa-info-circle"></i> 作者：Arain&nbsp;&nbsp;</span>
				<span><i class="fa fa-copyright"></i> CopyRight 2017版权所有 <i class="fa fa-caret-right"></i></span>
			</div>
		</div>

		<!--主题设置弹窗-->
		<div id="win">
			<div class="themeItem">
				<ul>
					<li>
						<div class="TURQUOISE">TURQUOISE</div>
					</li>
					<li>
						<div class="EMERALD">EMERALD</div>
					</li>
					<li>
						<div class="PETER-RIVER">PETER RIVER</div>
					</li>
					<li>
						<div class="AMETHYST">AMETHYST</div>
					</li>
					<li>
						<div class="WET-ASPHALT">WET ASPHALT</div>
					</li>
					<li>
						<div class="SUN-FLOWER">SUN FLOWER</div>
					</li>
					<li>
						<div class="CARROT">CARROT</div>
					</li>
					<li class="themeActive">
						<div class="ALIZARIN">ALIZARIN</div>
					</li>
				</ul>
			</div>
		</div>

	</body>
	<script type="text/javascript">
//    	 $(function () {
   	
//    			$.ajax({
//    				type: 'POST',
//    				url: '${pageContent.request.contentPath }/sys/menu/load_child',
//    				dataType: 'json',
//    				success: function(data){
   					
//    				}
   			
//    		});
//    	 })
	</script>

</html>
