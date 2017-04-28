/*
 * Carlos Steven Portilla Botero
 * 1015473300
 * Ing. Sistemas y telecomunicaciones 
 *   * 
 */
package Controlador;

import Modelo.Base_Datos_Grupo;
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
public class Grupo extends HttpServlet {

    Base_Datos_Grupo bd = new Base_Datos_Grupo();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        int s = 2;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String boton = request.getParameter("Boton");

            if (boton.equals("Ok")) {

                //Guardando los valores en variables  
                String idGrupo = request.getParameter("idgrupo");
                String idHotel = request.getParameter("idhotel");
                String idAlquiler = request.getParameter("idalquiler");
                String NumPer = request.getParameter("numeropersonas");

                //asegurando que los datos sea rellenados
                if (idGrupo != null && !idGrupo.equalsIgnoreCase("")
                        && idHotel != null && !idHotel.equalsIgnoreCase("")
                        && idAlquiler != null && !idAlquiler.equalsIgnoreCase("")) {

//                bd.conectar();
//                s = bd.agregar(Integer.valueOf(idGrupo), Integer.valueOf(idHotel), Integer.valueOf(idAlquiler), Integer.valueOf(NumPer));
//                bd.desconectar();
                } else {
                    response.sendRedirect("Grupo.html");
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
                            + "<link rel='stylesheet' href='estilos.css'>\n"
                            + "  \n"
                            + "</head>\n"
                            + "<body>\n"
                            + " <form class='contacto'  method=\"post\" action=\"Grupo\" name=\"Grupo\">\n"
                            + "\n"
                            + "<tbody>\n"
                            + "\n"
                            + "<div><label>Id Grupo:</label><input type=\"text\" name=\"idgrupo\"></div>\n"
                            + "            <div><label>Id Hotel:</label><input type=\"text\" name=\"idhotel\"></div>\n"
                            + "            <div><label>Id Alquiler:</label><input type=\"password\" name=\"idalquiler\"></div>\n"
                            + "            <div><label>Numero Personas:</label><input type=\"password\" name=\"numeropersonas\"></div>\n"
                            + "            \n"
                            + "            \n"
                            + "            <div><input type=\"submit\" name= \"Boton\" value=\"Ok\"></div>\n"
                            + "</tbody>\n"
                            + "\n"
                            + "<br>\n"
                            + "</form>\n"
                            + "</body></html>\n"
                            + "");

                }
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
