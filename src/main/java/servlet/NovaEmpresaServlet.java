package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Empresa;
import util.Banco;


@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 124;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String companyName = req.getParameter("nome");
		
		Empresa empresa = new Empresa();
		empresa.setNome(companyName);
		
		Banco db = new Banco();
		db.adiciona(empresa);
		
		System.out.println("Empresa cadastrada!");
		
		RequestDispatcher reqDispatcher = req.getRequestDispatcher("/novaEmpresaCriada.jsp");
		req.setAttribute("empresa", empresa.getNome());
		reqDispatcher.forward(req, res);
	}

}
