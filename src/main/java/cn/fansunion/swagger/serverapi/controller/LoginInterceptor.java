package cn.fansunion.swagger.serverapi.controller;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 小雷FansUnion-一个有创业和投资经验的资深程序员-全球最大中文IT社区CSDN知名博主-排名第119
 * 博客：http://blog.csdn.net/fansunion
 *
 */
//测试用的
public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		if (!(handler instanceof HandlerMethod)) {
			return true;
		}
		// String str=charReader(request);
		// System.out.println(str);
		String token = request.getParameter("token");
		System.out.println("request.getParameter(\"token\")=" + token);
		return super.preHandle(request, response, handler);
	}

	String charReader(HttpServletRequest request) throws IOException {

		BufferedReader br = request.getReader();

		String str, wholeStr = "";
		while ((str = br.readLine()) != null) {
			wholeStr += str;
		}
		return wholeStr;

	}
}
