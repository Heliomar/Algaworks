
package Pessoal.Simples;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Helio
 */
@WebServlet("/Ola")
public class Ola extends HttpServlet {

    
    private static final long serialVersionUID = 1l;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        out.println("<htlm>");
        out.println("<body>");
        out.println("<h1>Olá Mundo</h1>");
        out.println("<br></br>");
        out.println("Testando o Servlet.");
        out.println("</body>");
        out.println("</htlm>");
    }

}
