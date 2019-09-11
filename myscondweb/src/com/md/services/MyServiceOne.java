
package com.md.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.md.dao.UserDao;
import com.md.dao.UserDaoImp;
import com.md.entity.User;


public class MyServiceOne extends HttpServlet {
	private UserDao userDao;
	
   
    public MyServiceOne() {
    	userDao=new UserDaoImp();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("前端页面发来请求：");
		//指定request使用utf-8解析
		request.setCharacterEncoding("utf-8");
		//获取参数,如果请求参数没有传（没有带指定的参数名），那么获取到的value就是null。获取请求参数
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		//用于查看浏览器发送参数的值
		System.out.println(name +"==============>" +password);
		// 设置响应内容的类型和编码，必须在获取writer之前设置
		// 设置响应报文的编码为utf-8，告诉浏览器响应的内容类型是文本。
	   // 不加text/html，默认不会以文件来解释响应内容。默认以application来解释。
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter writer = response.getWriter();
		if("".equals(name) || "".equals(password)) {
			writer.print("用户名或密码不正确！");
			return;
		}
		try {
			User user = userDao.getUserByUserNameAndPassword(name,password);
			if (user==null) {
				writer.print("用户名和密码错误！");
			}else {
				writer.print("用户名和密码正确！");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
