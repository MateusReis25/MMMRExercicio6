package br.com.rd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MMRProjetoCalculadora
 */
@WebServlet("/MMRProjetoCalculadora")
public class MMRProjetoCalculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MMRProjetoCalculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
//		int valor1, valor2, resultado;
//		
//		valor1 = Integer.parseInt(request.getParameter("valor1"));
//		valor2 = Integer.parseInt(request.getParameter("valor2"));
//		resultado = valor1 + valor2; 
//		
//		
//		// response.getWriter().println("Resultado de: \n" + valor1 + " + " + valor2 + " = " + resultado);
//		
//		request.setAttribute("resultado", resultado); 
//		request.setAttribute("valor1", valor1); 
//		request.setAttribute("valor2", valor2); 
//		request.getRequestDispatcher("/").forward(request, response);
		
	if ((request.getParameter("valor1") != null) && (request.getParameter("valor2") != null)) {
				
				String opcao = request.getParameter("opcao");
				int valor1 = Integer.parseInt(request.getParameter("valor1"));
				int valor2 = Integer.parseInt(request.getParameter("valor2"));
				
				
				if ("adicao".equals(opcao)) {
					Calculo c = new Calculo(valor1,valor2);
					int resultado = c.somar();
					
					request.setAttribute("resultado", resultado);
					request.setAttribute("valor1", valor1); 
					request.setAttribute("valor2", valor2); 
					
				}else if ("subtracao".equals(opcao)) {
					Calculo c = new Calculo(valor1, valor2);
					int resultado = c.subtrair();
					
					request.setAttribute("resultado", resultado);
					request.setAttribute("valor1", valor1); 
					request.setAttribute("valor2", valor2); 
				
				}else if ("multiplicacao".equals(opcao)) {
					Calculo c = new Calculo(valor1, valor2);
					int resultado = c.multiplicar();
					
					request.setAttribute("resultado", resultado);
					request.setAttribute("valor1", valor1); 
					request.setAttribute("valor2", valor2); 
				
				}else if ("divisao".equals(opcao)) {
					Calculo c = new Calculo(valor1, valor2);
					int resultado = c.dividir();
					
					request.setAttribute("resultado", resultado);
					request.setAttribute("valor1", valor1); 
					request.setAttribute("valor2", valor2); 
				}
				

			}
		
			request.getRequestDispatcher("/").forward(request, response);
		
}

}
	


