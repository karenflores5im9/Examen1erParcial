
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author EQUIPO
 */
@WebServlet(urlPatterns = {"/Convertidor"})
public class Convertidor extends HttpServlet {

    double pesos;
    double numDos;
    double resultado;
    
    String convertir;
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        pesos =Integer.parseInt(request.getParameter("cantidad"));
        convertir = request.getParameter("convertir");

        if(convertir.equals("Dolares")){
            resultado = pesos / 20;
        }else
        if(convertir.equals("Yenes")){
            resultado = pesos * 20;
        }
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CONVERTIDOR</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El resultado es:" +resultado+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
