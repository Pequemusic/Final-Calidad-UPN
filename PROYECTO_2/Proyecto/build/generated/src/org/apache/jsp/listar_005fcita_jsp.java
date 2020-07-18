package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controlador.Controlador_cita;
import modelo.cita;
import Controlador.Controlador_aspirante;
import modelo.aspirante;
import java.util.ArrayList;

public final class listar_005fcita_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/templates/header_interno.jsp");
    _jspx_dependants.add("/templates/barra_interno.jsp");
    _jspx_dependants.add("/templates/footer_interno.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"CSS/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/c0ecea9977.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans&family=Oswald&family=PT+Sans&display=swap\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"fondo-oscuro\">\n");
      out.write("            <section class=\"contenedor clearfix\">\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"logo espacio_arriba\">\n");
      out.write("                        <img src=\"img/logo.jpg\" alt=\"logo PITS\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"float-right\">\n");
      out.write("                        <h1>Pagina de <span class=\"amarill\">personal</span></h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            ");
  
                String variable = String.valueOf(session.getAttribute("Smensaje"));
            
      out.write("\n");
      out.write("        </div>");
      out.write('\n');
      out.write("<div class=\"barra\">\n");
      out.write("    <div class=\"contenedor clearfix\"> \n");
      out.write("        <p class=\"navegacion_titulo\">Usuario: ");
      out.print(String.valueOf(session.getAttribute("usuario")));
      out.write("</p>\n");
      out.write("        <nav class=\"navegacion-principal\">\n");
      out.write("            <a href=\"principal.jsp\">Pagina principal</a>\n");
      out.write("            <a href=\"ingreso.jsp?valor=cerrar\">Salir</a>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("document.title = 'Lista de citas';    \n");
      out.write("</script>\n");
      out.write("<h2>CITAS</h2>\n");
      out.write("<section class=\"container_peque clearfix\">\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <th>ID</th><th>DNI</th><th>TIPO</th><th>FECHA</th><th>HORARIO</th><th>ESTADO</th><th colspan=\"2\">OPCION</th>\n");
      out.write("        </tr>            \n");
      out.write("\n");
      out.write("        ");

            ArrayList<cita> lista = new Controlador_cita().listar();
            for (int i = 0; i < lista.size(); i++) {
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(lista.get(i).getId());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(lista.get(i).getDni());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(lista.get(i).getTipo());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(lista.get(i).getFecha());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(lista.get(i).getHora());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(lista.get(i).getEstado());
      out.write("</td>\n");
      out.write("\n");
      out.write("            <td> <a href=\"Modificar_cita.jsp?id=");
      out.print(lista.get(i).getId());
      out.write("&&estado=");
      out.print(lista.get(i).getEstado());
      out.write("\">Actualizar Estado</a> </th>\n");
      out.write("                ");

                    if ("ACEPTADO".equals(lista.get(i).getEstado())) {
      out.write("\n");
      out.write("            <td> <a href=\"ingresar_contrato.jsp?dni=");
      out.print(lista.get(i).getDni());
      out.write("\">Generar Contrato</a> </td> \n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        ");
}
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("</section>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<footer class=\"site-footer clearfix\">\n");
      out.write("    <div class=\"contenedor clearfix\"> \n");
      out.write("        <div class=\"footer-informacion\">\n");
      out.write("            <div>\n");
      out.write("                <img src=\"img/logo.jpg\" alt=\"logo PITS\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <h3>Redes <span>sociales</span></h3>\n");
      out.write("            <nav class=\"redes-sociales\">\n");
      out.write("                <a href=\"https://www.facebook.com/pitslogisticaintegral\"><i class=\"fab fa-facebook-square\"></i></a>\n");
      out.write("                <a href=\"https://twitter.com/pitslogistica\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                <a href=\"https://www.pinterest.com.mx/pin/501025527273636245/?autologin=true&amp_client_id=CLIENT_ID(_)&mweb_unauth_id=&from_amp_pin_page=true\"><i class=\"fab fa-pinterest\"></i></a>\n");
      out.write("                <a href=\"https://www.youtube.com/user/PitsLogisticaInteg\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                <a href=\"https://www.instagram.com/pitsboxperu/\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"ultimos-tweets\">\n");
      out.write("            <h3>Contacto <span>Servicio tecnico</span></h3>\n");
      out.write("            <ul>\n");
      out.write("                <li><i class=\"fas fa-mobile-alt\"></i> 955339395</li>\n");
      out.write("                <li><i class=\"fas fa-phone\"></i> 6480632</li>\n");
      out.write("                <li><i class=\"far fa-envelope\"></i> servicio_tecnico@pits.com</li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <p class=\"copyright\">\n");
      out.write("        Todos los derechos reservados PITS Logistica Integral 2020.\n");
      out.write("    </p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
