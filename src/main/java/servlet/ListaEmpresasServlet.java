package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Empresa;
import util.Banco;


@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Banco db = new Banco();
		List<Empresa> empresaLista = db.getAllEmpresa();
		
		req.setAttribute("empresas", empresaLista);
		
		RequestDispatcher reqDispatcher = req.getRequestDispatcher("/listaEmpresas.jsp");
		
		reqDispatcher.forward(req, res);
	}
		
}
