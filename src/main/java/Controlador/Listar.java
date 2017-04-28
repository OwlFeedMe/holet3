/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
//import Modelo.Datos_Basicos_Estudiantes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author David
 */
public class Listar extends HttpServlet {

//    Base_Datos_Estudiantes bd = new Base_Datos_Estudiantes();
//    Base_Datos_Proveedor bd2 = new Base_Datos_Proveedor();
//
//    Base_Datos_Residencia bd3 = new Base_Datos_Residencia();
//    Base_Datos_Habitacion bd4 = new Base_Datos_Habitacion();
//
//    Base_Datos_Aseo bd5 = new Base_Datos_Aseo();
//    Base_Datos_AsigE bd6 = new Base_Datos_AsigE();
//    ArrayList<Datos_Basico_Estudiante> at = new ArrayList<>();
//
//    ArrayList<Datos_Basico_Proveedor> at2 = new ArrayList<>();
//    ArrayList<Datos_Basico_Residencia> at3 = new ArrayList<>();
//    ArrayList<Datos_Basico_Habitacion> at4 = new ArrayList<>();
//    ArrayList<Datos_Basico_Aseo> at5 = new ArrayList<>();
////    ArrayList<Datos_Basicos_AsigE> at6 = new ArrayList<>();
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//
//            String boton = request.getParameter("Boton");
//            String combo = request.getParameter("selCombo");
//
//            if (boton.equals("Cargar")) {
//                switch (combo) {
//                    case "1.Proveedores":
//                        at2.removeAll(at2);
//                        bd2.conectar();
//                        at2 = bd2.cargar();
//                        bd2.desconectar();
//                        String a = "";
//
//                        for (int i = 0; i < at2.size(); i++) {
//                            a = a + "            <tr>\n"
//                                    + "              <td style=width: 130px;>" + "Id: " + at2.get(i).getId() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Nombre: " + at2.get(i).getNombre() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Edad: " + at2.get(i).getTipo() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Telefono: " + at2.get(i).getTel() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "            </tr>\n";
//                        }
//                        response.setContentType("text/html");
//                        PrintWriter outs1 = response.getWriter();
//                        String docType1
//                                = "<!DOCTYPE html PUBLIC -//W3C//DTD HTML 4.01//EN http://www.w3.org/TR/html4/strict.dtd>\n";
//                        out.println(docType1
//                                + "<html>\n"
//                                + "<head>\n"
//                                + " <meta content=text/html; charset=ISO-8859-1\n"
//                                + " http-equiv=content-type>\n"
//                                + " <title></title>\n"
//                                + "</head>\n"
//                                + "<body>\n"
//                                + "<form action=Listar name=Listar method=post>\n"
//                                + "  <table style=text-align: left; width: 100px; border=1\n"
//                                + "cellpadding=2 cellspacing=2>\n"
//                                + "    <tbody>\n"
//                                + "      <tr>\n"
//                                + "        <td><img style=width: 546px; height: 279px;\n"
//                                + "src=./Imagenes/Img_Listar.jpg\n"
//                                + " alt=></td>\n"
//                                + "      </tr>\n"
//                                + "      <tr>\n"
//                                + "        <td>Categoria de la lista:\n"
//                                + "        <select name=selCombo size=1>\n"
//                                + "        <option value=1.Proveedores>1.Proveedores </option>\n"
//                                + "        <option value=2.Residencia>2.Residencia</option>\n"
//                                + "        <option value=3.Estudiantes>3.Estudiantes</option>\n"
//                                + "        <option value=4.Aseo>4.Aseo</option>\n"
//                                + "<option value=\"5.Estudiante y su Habitacion\">5.Estudiante\n"
//                                + "y su Habitacion</option>\n"
//                                + "        <option value=\"6.Residencia y sus Habitaciones\">6.Residencia\n"
//                                + "y sus Habitaciones</option>"
//                                + "        </select>\n"
//                                + "        </td>\n"
//                                + "      </tr>\n"
//                                + "      <tr>\n"
//                                + "        <td style=text-align: center;><input\n"
//                                + " name=Boton value=Cargar type=submit></td>\n"
//                                + "      </tr>\n"
//                                + "      <tr>\n"
//                                + "        <td>\n"
//                                + "        <table style=text-align: left; width: 545px; height: 32px;\n"
//                                + "border=1 cellpadding=2 cellspacing=2>\n"
//                                + "          <tbody>\n"
//                                + a + "         </tbody>\n"
//                                + "       </table>\n"
//                                + "       </td>\n"
//                                + "     </tr>\n"
//                                + "   </tbody>\n"
//                                + " </table>\n"
//                                + " <br>\n"
//                                + "</form>\n"
//                                + "</body>\n"
//                                + "</html>");
//
//                        a = "";
//                        break;
//                    case "2.Residencia":
//                        at3.removeAll(at3);
//                        bd3.conectar();
//                        at3 = bd3.cargar();
//                        bd3.desconectar();
//                        String b = "";
//
//                        for (int i = 0; i < at3.size(); i++) {
//                            b = b + "            <tr>\n"
//                                    + "              <td style=width: 130px;>" + "Id residencia: " + at3.get(i).getId_Residencia() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Propietario: " + at3.get(i).getPropietario() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Direccion: " + at3.get(i).getDireccion() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Fecha de inicio: " + at3.get(i).getFecha_Inicio_Contrato() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Fecha de finalizacion: " + at3.get(i).getFecha_Final_Contrato() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Numero de habitaciones: " + at3.get(i).getNumero_Habitacion() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "            </tr>\n";
//                        }
//                        response.setContentType("text/html");
//                        PrintWriter outs2 = response.getWriter();
//                        String docType2
//                                = "<!DOCTYPE html PUBLIC -//W3C//DTD HTML 4.01//EN http://www.w3.org/TR/html4/strict.dtd>\n";
//                        out.println(docType2
//                                + "<html>\n"
//                                + "<head>\n"
//                                + " <meta content=text/html; charset=ISO-8859-1\n"
//                                + " http-equiv=content-type>\n"
//                                + " <title></title>\n"
//                                + "</head>\n"
//                                + "<body>\n"
//                                + "<form action=Listar name=Listar method=post>\n"
//                                + "  <table style=text-align: left; width: 100px; border=1\n"
//                                + "cellpadding=2 cellspacing=2>\n"
//                                + "    <tbody>\n"
//                                + "      <tr>\n"
//                                + "        <td><img style=width: 546px; height: 279px;\n"
//                                + "src=./Imagenes/Img_Listar.jpg\n"
//                                + " alt=></td>\n"
//                                + "      </tr>\n"
//                                + "      <tr>\n"
//                                + "        <td>Categoria de la lista:\n"
//                                + "        <select name=selCombo size=1>\n"
//                                + "        <option value=1.Proveedores>1.Proveedores </option>\n"
//                                + "        <option value=2.Residencia>2.Residencia</option>\n"
//                                + "        <option value=3.Estudiantes>3.Estudiantes</option>\n"
//                                + "        <option value=4.Aseo>4.Aseo</option>\n"
//                                + "<option value=\"5.Estudiante y su Habitacion\">5.Estudiante\n"
//                                + "y su Habitacion</option>\n"
//                                + "        <option value=\"6.Residencia y sus Habitaciones\">6.Residencia\n"
//                                + "y sus Habitaciones</option>"
//                                + "        </select>\n"
//                                + "        </td>\n"
//                                + "      </tr>\n"
//                                + "      <tr>\n"
//                                + "        <td style=text-align: center;><input\n"
//                                + " name=Boton value=Cargar type=submit></td>\n"
//                                + "      </tr>\n"
//                                + "      <tr>\n"
//                                + "        <td>\n"
//                                + "        <table style=text-align: left; width: 545px; height: 32px;\n"
//                                + "border=1 cellpadding=2 cellspacing=2>\n"
//                                + "          <tbody>\n"
//                                + b + "         </tbody>\n"
//                                + "       </table>\n"
//                                + "       </td>\n"
//                                + "     </tr>\n"
//                                + "   </tbody>\n"
//                                + " </table>\n"
//                                + " <br>\n"
//                                + "</form>\n"
//                                + "</body>\n"
//                                + "</html>");
//
//                        b = "";
//                        break;
//                    case "3.Estudiantes":
//                        at.removeAll(at);
//                        bd.conectar();
//                        at = bd.cargar();
//                        bd.desconectar();
//                        String c = "";
//
//                        for (int i = 0; i < at.size(); i++) {
//                            c = c + "            <tr>\n"
//                                    + "              <td style=width: 130px;>" + "Id: " + at.get(i).getId_Estudiante() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Id Habitacion: " + at.get(i).getId_Asignar_Habitacion() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Nombre: " + at.get(i).getNombre() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Edad: " + at.get(i).getEdad() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Telefono: " + at.get(i).getTelefono() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Carrera: " + at.get(i).getCarrera() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Universidad: " + at.get(i).getUniversidad() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "            </tr>\n";
//                        }
//                        response.setContentType("text/html");
//                        PrintWriter outs3 = response.getWriter();
//                        String docType3
//                                = "<!DOCTYPE html PUBLIC -//W3C//DTD HTML 4.01//EN http://www.w3.org/TR/html4/strict.dtd>\n";
//                        out.println(docType3
//                                + "<html>\n"
//                                + "<head>\n"
//                                + " <meta content=text/html; charset=ISO-8859-1\n"
//                                + " http-equiv=content-type>\n"
//                                + " <title></title>\n"
//                                + "</head>\n"
//                                + "<body>\n"
//                                + "<form action=Listar name=Listar method=post>\n"
//                                + "  <table style=text-align: left; width: 100px; border=1\n"
//                                + "cellpadding=2 cellspacing=2>\n"
//                                + "    <tbody>\n"
//                                + "      <tr>\n"
//                                + "        <td><img style=width: 546px; height: 279px;\n"
//                                + "src=./Imagenes/Img_Listar.jpg\n"
//                                + " alt=></td>\n"
//                                + "      </tr>\n"
//                                + "      <tr>\n"
//                                + "        <td>Categoria de la lista:\n"
//                                + "        <select name=selCombo size=1>\n"
//                                + "        <option value=1.Proveedores>1.Proveedores </option>\n"
//                                + "        <option value=2.Residencia>2.Residencia</option>\n"
//                                + "        <option value=3.Estudiantes>3.Estudiantes</option>\n"
//                                + "        <option value=4.Aseo>4.Aseo</option>\n"
//                                + "<option value=\"5.Estudiante y su Habitacion\">5.Estudiante\n"
//                                + "y su Habitacion</option>\n"
//                                + "        <option value=\"6.Residencia y sus Habitaciones\">6.Residencia\n"
//                                + "y sus Habitaciones</option>"
//                                + "        </select>\n"
//                                + "        </td>\n"
//                                + "      </tr>\n"
//                                + "      <tr>\n"
//                                + "        <td style=text-align: center;><input\n"
//                                + " name=Boton value=Cargar type=submit></td>\n"
//                                + "      </tr>\n"
//                                + "      <tr>\n"
//                                + "        <td>\n"
//                                + "        <table style=text-align: left; width: 545px; height: 32px;\n"
//                                + "border=1 cellpadding=2 cellspacing=2>\n"
//                                + "          <tbody>\n"
//                                + c + "         </tbody>\n"
//                                + "       </table>\n"
//                                + "       </td>\n"
//                                + "     </tr>\n"
//                                + "   </tbody>\n"
//                                + " </table>\n"
//                                + " <br>\n"
//                                + "</form>\n"
//                                + "</body>\n"
//                                + "</html>");
//
//                        c = "";
//                        break;
//                    case "4.Aseo":
//                        at5.removeAll(at5);
//                        bd5.conectar();
//                        at5 = bd5.cargar();
//                        bd5.desconectar();
//                        String d = "";
//                        for (int i = 0; i < at5.size(); i++) {
//
//                        }
//                        for (int i = 0; i < at5.size(); i++) {
//                            d = d + "            <tr>\n"
//                                    + "              <td style=width: 130px;>" + "Id: " + at5.get(i).getId() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "IdResidencia: " + at5.get(i).getId_re() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Compañia: " + at5.get(i).getCompañia_Aseo() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Fecha de inicio: " + at5.get(i).getFI() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Fecha de finalizacion: " + at5.get(i).getFF() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Valor: $" + at5.get(i).getPre() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "            </tr>\n";
//                        }
//                        response.setContentType("text/html");
//                        PrintWriter outs5 = response.getWriter();
//                        String docType5
//                                = "<!DOCTYPE html PUBLIC -//W3C//DTD HTML 4.01//EN http://www.w3.org/TR/html4/strict.dtd>\n";
//                        out.println(docType5
//                                + "<html>\n"
//                                + "<head>\n"
//                                + " <meta content=text/html; charset=ISO-8859-1\n"
//                                + " http-equiv=content-type>\n"
//                                + " <title></title>\n"
//                                + "</head>\n"
//                                + "<body>\n"
//                                + "<form action=Listar name=Listar method=post>\n"
//                                + "  <table style=text-align: left; width: 100px; border=1\n"
//                                + "cellpadding=2 cellspacing=2>\n"
//                                + "    <tbody>\n"
//                                + "      <tr>\n"
//                                + "        <td><img style=width: 546px; height: 279px;\n"
//                                + "src=./Imagenes/Img_Listar.jpg\n"
//                                + " alt=></td>\n"
//                                + "      </tr>\n"
//                                + "      <tr>\n"
//                                + "        <td>Categoria de la lista:\n"
//                                + "        <select name=selCombo size=1>\n"
//                                + "        <option value=1.Proveedores>1.Proveedores </option>\n"
//                                + "        <option value=2.Residencia>2.Residencia</option>\n"
//                                + "        <option value=3.Estudiantes>3.Estudiantes</option>\n"
//                                + "        <option value=4.Aseo>4.Aseo</option>\n"
//                                + "<option value=\"5.Estudiante y su Habitacion\">5.Estudiante\n"
//                                + "y su Habitacion</option>\n"
//                                + "        <option value=\"6.Residencia y sus Habitaciones\">6.Residencia\n"
//                                + "y sus Habitaciones</option>"
//                                + "        </select>\n"
//                                + "        </td>\n"
//                                + "      </tr>\n"
//                                + "      <tr>\n"
//                                + "        <td style=text-align: center;><input\n"
//                                + " name=Boton value=Cargar type=submit></td>\n"
//                                + "      </tr>\n"
//                                + "      <tr>\n"
//                                + "        <td>\n"
//                                + "        <table style=text-align: left; width: 545px; height: 32px;\n"
//                                + "border=1 cellpadding=2 cellspacing=2>\n"
//                                + "          <tbody>\n"
//                                + d + "         </tbody>\n"
//                                + "       </table>\n"
//                                + "       </td>\n"
//                                + "     </tr>\n"
//                                + "   </tbody>\n"
//                                + " </table>\n"
//                                + " <br>\n"
//                                + "</form>\n"
//                                + "</body>\n"
//                                + "</html>");
//
//                        d = "";
//                        break;
//                    case "5.Estudiante y su Habitacion":
//// at6.removeAll(at6);
////                        at6= bd6.cargar();
////                        String z = "";
////                        for (int i = 0; i < at6.size(); i++) {
////                         
////                        }
////                        for (int i = 0; i < at6.size(); i++) {
////                            z = z + "            <tr>\n"
////                                    + "              <td style=width: 130px;>" + "Id: " + at6.get(i).getIdEstudiante() + "<br>\n"
////                                    + "              </td>\n"
////                                    + "              <td style=width: 130px;>" + "IdResidencia: " + at6.get(i).getIdResidencia() + "<br>\n"
////                                    + "              </td>\n"
////                                      + "              <td style=width: 130px;>" + "IdHabitacion: " + at6.get(i).getIdHabitacion() + "<br>\n"
////                                    + "              </td>\n"
////                                    + "              <td style=width: 130px;>" + "Fecha de inicio: " + at6.get(i).getFechaInS() + "<br>\n"
////                                    + "              </td>\n"
////                                    + "              <td style=width: 130px;>" + "Fecha de finalizacion: " + at6.get(i).getFechaFinS() + "<br>\n"
////                                    + "              </td>\n"
////                                    
////                                    + "            </tr>\n";
////                        }
////                        response.setContentType("text/html");
////                        PrintWriter outs6 = response.getWriter();
////                        String docType6
////                                = "<!DOCTYPE html PUBLIC -//W3C//DTD HTML 4.01//EN http://www.w3.org/TR/html4/strict.dtd>\n";
////                        out.println(docType6
////                                + "<html>\n"
////                                + "<head>\n"
////                                + " <meta content=text/html; charset=ISO-8859-1\n"
////                                + " http-equiv=content-type>\n"
////                                + " <title></title>\n"
////                                + "</head>\n"
////                                + "<body>\n"
////                                + "<form action=Listar name=Listar method=post>\n"
////                                + "  <table style=text-align: left; width: 100px; border=1\n"
////                                + "cellpadding=2 cellspacing=2>\n"
////                                + "    <tbody>\n"
////                                + "      <tr>\n"
////                                + "        <td><img style=width: 546px; height: 279px;\n"
////                                + "src=./Imagenes/Img_Listar.jpg\n"
////                                + " alt=></td>\n"
////                                + "      </tr>\n"
////                                + "      <tr>\n"
////                                + "        <td>Categoria de la lista:\n"
////                                + "        <select name=selCombo size=1>\n"
////                                + "        <option value=1.Proveedores>1.Proveedores </option>\n"
////                                + "        <option value=2.Residencia>2.Residencia</option>\n"
////                                + "        <option value=3.Estudiantes>3.Estudiantes</option>\n"
////                                + "        <option value=4.Aseo>4.Aseo</option>\n"
////                                + "<option value=\"5.Estudiante y su Habitacion\">5.Estudiante\n"
////                                + "y su Habitacion</option>\n"
////                                + "        <option value=\"6.Residencia y sus Habitaciones\">6.Residencia\n"
////                                + "y sus Habitaciones</option>"
////                                + "        </select>\n"
////                                + "        </td>\n"
////                                + "      </tr>\n"
////                                + "      <tr>\n"
////                                + "        <td style=text-align: center;><input\n"
////                                + " name=Boton value=Cargar type=submit></td>\n"
////                                + "      </tr>\n"
////                                + "      <tr>\n"
////                                + "        <td>\n"
////                                + "        <table style=text-align: left; width: 545px; height: 32px;\n"
////                                + "border=1 cellpadding=2 cellspacing=2>\n"
////                                + "          <tbody>\n"
////                                + z + "         </tbody>\n"
////                                + "       </table>\n"
////                                + "       </td>\n"
////                                + "     </tr>\n"
////                                + "   </tbody>\n"
////                                + " </table>\n"
////                                + " <br>\n"
////                                + "</form>\n"
////                                + "</body>\n"
////                                + "</html>");
////
////                        z = "";
//                        break;
//                    case "6.Residencia y sus Habitaciones":
////                     
//                        at4.removeAll(at4);
//                        bd4.conectar();
//
//                        at4 = bd4.cargar();
//                        bd4.desconectar();
//                        String e = "";
//
//                        for (int i = 0; i < at4.size(); i++) {
//                            e = e + "            <tr>\n" 
//                                    + "              <td style=width: 130px;>" + "IdHabitacion: " + at4.get(i).getId_Habitacion() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "IdResidencia: " + at4.get(i).getId_Residencia() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "# Camas: " + at4.get(i).getNumero_Camas() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "              <td style=width: 130px;>" + "Valor: $" + at4.get(i).getValor_Habitacion() + "<br>\n"
//                                    + "              </td>\n"
//                                    + "            </tr>\n";
//                        }
//                        response.setContentType("text/html");
//                        PrintWriter outs4 = response.getWriter();
//                        String docType4
//                                = "<!DOCTYPE html PUBLIC -//W3C//DTD HTML 4.01//EN http://www.w3.org/TR/html4/strict.dtd>\n";
//                        out.println(docType4
//                                + "<html>\n"
//                                + "<head>\n"
//                                + " <meta content=text/html; charset=ISO-8859-1\n"
//                                + " http-equiv=content-type>\n"
//                                + " <title></title>\n"
//                                + "</head>\n"
//                                + "<body>\n"
//                                + "<form action=Listar name=Listar method=post>\n"
//                                + "  <table style=text-align: left; width: 100px; border=1\n"
//                                + "cellpadding=2 cellspacing=2>\n"
//                                + "    <tbody>\n"
//                                + "      <tr>\n"
//                                + "        <td><img style=width: 546px; height: 279px;\n"
//                                + "src=./Imagenes/Img_Listar.jpg\n"
//                                + " alt=></td>\n"
//                                + "      </tr>\n"
//                                + "      <tr>\n"
//                                + "        <td>Categoria de la lista:\n"
//                                + "        <select name=selCombo size=1>\n"
//                                + "        <option value=1.Proveedores>1.Proveedores </option>\n"
//                                + "        <option value=2.Residencia>2.Residencia</option>\n"
//                                + "        <option value=3.Estudiantes>3.Estudiantes</option>\n"
//                                + "        <option value=4.Aseo>4.Aseo</option>\n"
//                                + "<option value=\"5.Estudiante y su Habitacion\">5.Estudiante\n"
//                                + "y su Habitacion</option>\n"
//                                + "        <option value=\"6.Residencia y sus Habitaciones\">6.Residencia\n"
//                                + "y sus Habitaciones</option>"
//                                + "        </select>\n"
//                                + "        </td>\n"
//                                + "      </tr>\n"
//                                + "      <tr>\n"
//                                + "        <td style=text-align: center;><input\n"
//                                + " name=Boton value=Cargar type=submit></td>\n"
//                                + "      </tr>\n"
//                                + "      <tr>\n"
//                                + "        <td>\n"
//                                + "        <table style=text-align: left; width: 545px; height: 32px;\n"
//                                + "border=1 cellpadding=2 cellspacing=2>\n"
//                                + "          <tbody>\n"
//                                + e + "         </tbody>\n"
//                                + "       </table>\n"
//                                + "       </td>\n"
//                                + "     </tr>\n"
//                                + "   </tbody>\n"
//                                + " </table>\n"
//                                + " <br>\n"
//                                + "</form>\n"
//                                + "</body>\n"
//                                + "</html>");
//
//                        e = "";
//                        break;
//                    case "7.Disponibilidad Habitaciones":
//
//                        break;
//                }
//            }
//        }
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
    @Override
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
