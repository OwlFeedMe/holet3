/*
 * Carlos Steven Portilla Botero
 * 1015473300
 * Ing. Sistemas y telecomunicaciones 
 *   * 
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class Habitacion extends HttpServlet  {
       protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String boton = request.getParameter("Boton");
            
            if (boton.equals("Proveedores")) {
                response.sendRedirect("Peticion_Proveedores.html");
            }
            if (boton.equals("Residencia")) {
                response.sendRedirect("Peticion_Residencia.html");
            }
            if (boton.equals("Asignar Habitacion")) {
                response.sendRedirect("Peticion_Habitacion.html");
            }
            if (boton.equals("Aseo")) {
                response.sendRedirect("Peticion_Aseo.html");
            }
            if (boton.equals("Estudiante")) {
                response.sendRedirect("Peticion_Estudiante.html");
            }
            if (boton.equals("Asignar Estudiante")) {
                response.sendRedirect("Peticion_AsignarEstudiante.html");
            } 
            if (boton.equals("Listar")) {
                response.sendRedirect("Listar.html");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
