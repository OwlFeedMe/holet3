/*
 * Carlos Steven Portilla Botero
 * 1015473300
 * Ing. Sistemas y telecomunicaciones 
 *   * 
 */
package Controlador;

import Modelo.Base_Datos_hotel;
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
public class Hotel extends HttpServlet {

    Base_Datos_hotel bd = new Base_Datos_hotel();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int s = 2;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            //Guardando los valores en variables  
            String idhotel = request.getParameter("idhotel");
            String nombre = request.getParameter("nombre");
            String pisos = request.getParameter("pisos");

            //asegurando que los datos sea rellenados
            if (idhotel != null && !idhotel.equalsIgnoreCase("")
                    && nombre != null && !nombre.equalsIgnoreCase("")
                    && pisos != null && !pisos.equalsIgnoreCase("")) {

                bd.conectar();
                s = bd.agregar(Integer.valueOf(idhotel), nombre, Integer.valueOf(pisos));
                bd.desconectar();

            } else {
                response.sendRedirect("Hotel.html");
            }
            if (s == 1) {
                response.sendRedirect("Home.html");
            } else if (s == 0) {

                response.setContentType("text/html");
                PrintWriter outs4 = response.getWriter();
                String docType4
                        = "<!DOCTYPE html PUBLIC -//W3C//DTD HTML 4.01//EN http://www.w3.org/TR/html4/strict.dtd>\n";
                out.println(docType4
                        + "<html><head>\n"
                        + "<meta content=\"text/html; charset=ISO-8859-1\" http-equiv=\"content-type\"><title>Hotel</title>\n"
                        + "\n"
                        + "</head><body>\n"
                        + "<form method=\"post\" action=\"Proveedores\" name=\"Proveedores\">\n"
                        + "<table style=\"text-align: left; width: 100px;\" border=\"1\" cellpadding=\"2\" cellspacing=\"2\">\n"
                        + "<tbody>\n"
                        + "\n"
                        + "<tr>\n"
                        + "<td>Id Hotel:<input name=\"idhotel\"></td>\n"
                        + "</tr>\n"
                        + "<tr>\n"
                        + "<td>Nombre:<input name=\"nombre\"></td>\n"
                        + "</tr>\n"
                        + "<tr>\n"
                        + "<td>Pisos:<input name=\"pisos\"></td>\n"
                        + "</tr>\n"
                        + "\n"
                        + "<tr align=\"center\">\n"
                        + "<td><input name=\"Boton\" value=\"Ok\" type=\"submit\"></td>\n"
                        + "</tr>\n"
                        + "</tbody>\n"
                        + "</table>\n"
                        + "<br>\n"
                        + "</form>\n"
                        + "</body></html>");

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
