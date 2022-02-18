package br.com.m1s09ex2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/empresa")
public class Empresa extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter p = resp.getWriter();
		p.println("<html>");
		p.println("<body>");
		p.println("Aprendendo Servlets!");
		p.println("</body>");
		p.println("</html>");
		System.out.println("Saida para o console. ");
	}

}
