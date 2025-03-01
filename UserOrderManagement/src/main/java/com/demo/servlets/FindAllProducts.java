package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

@WebServlet("/getProducts")
public class FindAllProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		ProductService productService = new ProductServiceImpl();
		int cid = Integer.parseInt(request.getParameter("cid"));
		List<Product> plist = productService.getProductByCid(cid);
		if (plist != null) {
			request.setAttribute("plist", plist);
			RequestDispatcher rd = request.getRequestDispatcher("showProduct.jsp");
			rd.forward(request, response);
		} else {
			out.println("Please select new Category!! No product Found");
			RequestDispatcher rd = request.getRequestDispatcher("catagories");
			rd.include(request, response);
		}

	}

}
