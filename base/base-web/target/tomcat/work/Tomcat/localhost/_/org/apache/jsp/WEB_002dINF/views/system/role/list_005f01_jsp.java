/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-19 03:12:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.system.role;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_005f01_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/system/common.jsp", out, false);
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        #index {\r\n");
      out.write("            padding: 15px;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            flex-wrap: wrap;\r\n");
      out.write("            opacity: 0;\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("        }\r\n");
      out.write("        .index-l {\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            width: 48%;\r\n");
      out.write("            overflow: auto;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"index\">\r\n");
      out.write("    <!--表格-->\r\n");
      out.write("    <div class=\"index-l\">\r\n");
      out.write("        <div id=\"p\" class=\"easyui-panel\" title=\"角色管理\"\r\n");
      out.write("             data-options=\"iconCls:'fa fa-tags',closable:true,collapsible:true,minimizable:true,maximizable:true\">\r\n");
      out.write("          <div class=\"contentWrapper\">\r\n");
      out.write("    \r\n");
      out.write("\t\t     <div class=\"form-item\">\r\n");
      out.write("\t\t\t       <label for=\"\" style=\" padding-left: 250px;\" class=\"label-top\" >角色名称：</label>\r\n");
      out.write("\t\t\t       <input type=\"text\" class=\"easyui-textbox\" id=\"name\" data-options=\"min:0,precision:2\"/>\r\n");
      out.write("\t\t\t       \r\n");
      out.write("\t\t\t       <label for=\"\" class=\"label-top\" style=\"padding-left: 300px;\">是否可用：</label>\r\n");
      out.write("                        <select id=\"enable\" class=\"easyui-combobox\" data-options=\"editable:false,panelHeight:null\"\r\n");
      out.write("                                name=\"dept\">\r\n");
      out.write("                            <option value=\"YES\">YES</option>\r\n");
      out.write("                            <option value=\"NO\">NO</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("\r\n");
      out.write("\t\t      \t\t<a id=\"search\" href=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"plain:true\">搜索</a>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t      <div>\r\n");
      out.write("\t      \t <a href=\"javascript:void(0)\" data-options=\"iconCls:'fa fa-area-chart'\" id=\"add\" class=\"easyui-linkbutton primary\" style=\"height: 32px;border-left-width: 1px;margin-left: 29px;\">新增</a>\r\n");
      out.write("       \t\t  <a href=\"javascript:void(0)\" class=\"easyui-linkbutton error\" data-options=\"iconCls:'fa fa-gears'\">修改</a>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t   <div class=\"index-1\" style=\"opacity: 1;width:100%;min-height:720px;\">\r\n");
      out.write("\t        <table id=\"dg\"></table>\r\n");
      out.write("    \t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"myWin\" style=\"display: none;\"></div></div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("jQuery('#dg').datagrid({\r\n");
      out.write("    url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContent.request.contentPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/system/role/load_datagrid.do',\r\n");
      out.write("    pagination : true,//分页控件\r\n");
      out.write("    pageList: [10, 20, 30, 40, 50],\r\n");
      out.write("    fit: true,   //自适应大小\r\n");
      out.write("    border:false,\r\n");
      out.write("    nowrap: true,//数据长度超出列宽时将会自动截取。\r\n");
      out.write("    rownumbers:true,//行号\r\n");
      out.write("    fitColumns:true,//自动使列适应表格宽度以防止出现水平滚动。\r\n");
      out.write("    singleSelect:true,\r\n");
      out.write("    collapsible:true,\r\n");
      out.write("    columns: [\r\n");
      out.write("        [{\r\n");
      out.write("            field: 'ID_',\r\n");
      out.write("            title: 'id',\r\n");
      out.write("            width: 100,\r\n");
      out.write("            align: 'center',\r\n");
      out.write("            hidden:'true',\r\n");
      out.write("            sortable: true\r\n");
      out.write("        }, \r\n");
      out.write("        {\r\n");
      out.write("            field: 'NAME_',\r\n");
      out.write("            title: '名称',\r\n");
      out.write("            width: 100,\r\n");
      out.write("            align: 'center',\r\n");
      out.write("            sortable: true\r\n");
      out.write("        }, \r\n");
      out.write("        {\r\n");
      out.write("            field: 'SORT_',\r\n");
      out.write("            title: '排序',\r\n");
      out.write("            width: 100,\r\n");
      out.write("            align: 'center',\r\n");
      out.write("            sortable: true\r\n");
      out.write("        }, {\r\n");
      out.write("            field: 'OPERATOR_',\r\n");
      out.write("            title: '经办人',\r\n");
      out.write("            width: 100,\r\n");
      out.write("            align: 'center',\r\n");
      out.write("            sortable: true\r\n");
      out.write("        }, {\r\n");
      out.write("            field: 'OP_TIME_',\r\n");
      out.write("            title: '经办时间',\r\n");
      out.write("            width: 100,\r\n");
      out.write("            align: 'center',\r\n");
      out.write("            sortable: true\r\n");
      out.write("        }, {\r\n");
      out.write("            field: 'ENABLED_',\r\n");
      out.write("            title: '是否可用',\r\n");
      out.write("            width: 100,\r\n");
      out.write("            align: 'center',\r\n");
      out.write("            sortable: true\r\n");
      out.write("        }]\r\n");
      out.write("    ]\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\t$(\"#search\").click(function() {\r\n");
      out.write("\t\t  var name = $(\"#name\").val();\r\n");
      out.write("\t\t  var enable = $(\"#enable\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t  $('#dg').datagrid('load', {    \r\n");
      out.write("\t\t\t  name: name,    \r\n");
      out.write("\t\t\t  enable:enable,\r\n");
      out.write("\t\t\t});  \r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("    $(\"#add\").on('click', function () {\r\n");
      out.write("        $('#myWin').window({\r\n");
      out.write("            width: 800,\r\n");
      out.write("            height: 500,\r\n");
      out.write("            title:\"新增\",\r\n");
      out.write("            href:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContent.request.contentPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/system/role/add_01\",\r\n");
      out.write("            modal: true,\r\n");
      out.write("            constrain: true,\r\n");
      out.write("            \r\n");
      out.write("            buttons: [{\r\n");
      out.write("                text: '保存',\r\n");
      out.write("                handler: function () {\r\n");
      out.write("                }\r\n");
      out.write("            }, {\r\n");
      out.write("                text: '关闭',\r\n");
      out.write("                handler: function () {\r\n");
      out.write("                }\r\n");
      out.write("            }]\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("   </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
