package com.minhtrung.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.minhtrung.service.ICategoryService;
import com.minhtrung.service.INewService;

@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet{

	@Inject
	private ICategoryService categoryService;
	
	@Inject
	private INewService newService;
	private static final long serialVersionUID = 3058720372161666423L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("categories", categoryService.findAll());
		RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
