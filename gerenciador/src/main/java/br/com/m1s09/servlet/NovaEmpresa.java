package br.com.m1s09.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresa
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresa extends HttpServlet {
//	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Cadastrando nova Empresa");
		
		ArrayList<Empresa> empresa = new ArrayList<>();
		
		
				
		
		
//		recebe os parametro da requisição
		String nomeEmpresa = req.getParameter("nome");
		String cnpjEmpresa = req.getParameter("cnpj");
		
		empresa.add(nomeEmpresa);
		PrintWriter saida = resp.getWriter();
		saida.println("<html><body>Empresa: "+ nomeEmpresa+ "<br>"+"CNPJ: "+ cnpjEmpresa +"<br><br>"+"Cadastrada com sucesso"+"<body><html>");
		System.out.println("Saida de nova empresa para o console.");
		
		
		
	}

}
