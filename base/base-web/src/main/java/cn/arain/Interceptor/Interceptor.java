package cn.arain.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import cn.arain.pojo.SysUser;

public class Interceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		SysUser user = (SysUser) request.getSession().getAttribute("user");
		if(user == null) {
			response.sendRedirect("/admin/login.do");
			return false;
		}
		return super.preHandle(request, response, handler);
	}

}
