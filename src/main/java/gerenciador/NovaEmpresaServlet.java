package gerenciador;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 124;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String companyName = req.getParameter("nome");
		System.out.println("Empresa cadastrada!");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Empresa "+ companyName + " cadastrada com sucesso!");
		out.println("</body>");
		out.println("</html>");
	}

}
