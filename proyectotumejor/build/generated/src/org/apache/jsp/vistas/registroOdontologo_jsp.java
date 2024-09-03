package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registroOdontologo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
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
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Registro de Odontologo</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("    <style>\n");
      out.write("        .form-section { margin-bottom: 30px; }\n");
      out.write("        .form-section h2 { font-size: 24px; font-weight: bold; }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("        <h1 class=\"text-center\">Registro de Odontologo</h1>\n");
      out.write("        <form id=\"registroPaciente\" action=\"CtrPaciente\" method=\"POST\">\n");
      out.write("            <input type=\"hidden\" name=\"accion\" value=\"nuevo\">\n");
      out.write("            <div class=\"form-section\">\n");
      out.write("                <h2>Datos del Paciente</h2>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"nombre\">Nombre</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"nombre\" name=\"nombre\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"apellido\">Apellido</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"apellido\" name=\"apellido\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"fechaNacimiento\">Fecha de Nacimiento</label>\n");
      out.write("                    <input type=\"date\" class=\"form-control\" id=\"fechaNacimiento\" name=\"fechaNacimiento\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"tipoDocumento\">Tipo de Documento</label>\n");
      out.write("                    <select class=\"form-control\" id=\"tipoDocumento\" name=\"tipoId\" required>\n");
      out.write("                        <option value=\"\" disabled selected>Seleccione un tipo</option>\n");
      out.write("                        <option value=\"Cédula Ciudadanía\">Cédula Ciudadanía</option>\n");
      out.write("                        <option value=\"Tarjeta De Identidad\">Tarjeta De Identidad</option>\n");
      out.write("                        <option value=\"Cédula Extranjera\">Cédula Extranjera</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"numeroDocumento\">Número de Documento</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"numeroDocumento\" name=\"numeroDocumento\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"direccion\">Dirección</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"direccion\" name=\"direccion\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"ciudad\">Ciudad</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"ciudad\" name=\"ciudad\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"telefono\">Número de Teléfono</label>\n");
      out.write("                    <input type=\"tel\" class=\"form-control\" id=\"telefono\" name=\"telefono\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"estadoCivil\">Estado Civil</label>\n");
      out.write("                    <select class=\"form-control\" id=\"estadoCivil\" name=\"estadoCivil\" required>\n");
      out.write("                        <option value=\"\" disabled selected>Seleccione un estado</option>\n");
      out.write("                        <option value=\"Soltero/a\">Soltero/a</option>\n");
      out.write("                        <option value=\"Casado/a\">Casado/a</option>\n");
      out.write("                        <option value=\"Viudo/a\">Viudo/a</option>\n");
      out.write("                        <option value=\"Divorciado/a\">Divorciado/a</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"sexo\">Sexo</label>\n");
      out.write("                    <select class=\"form-control\" id=\"sexo\" name=\"sexo\" required>\n");
      out.write("                        <option value=\"\" disabled selected>Seleccione un sexo</option>\n");
      out.write("                        <option value=\"Masculino\">Masculino</option>\n");
      out.write("                        <option value=\"Femenino\">Femenino</option>\n");
      out.write("                        <option value=\"Prefiero no decirlo\">Prefiero no decirlo</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"raza\">Raza Étnica</label>\n");
      out.write("                    <select class=\"form-control\" id=\"raza\" name=\"raza\" required>\n");
      out.write("                        <option value=\"\" disabled selected>Seleccione una raza</option>\n");
      out.write("                        <option value=\"Mestizo\">Mestizo</option>\n");
      out.write("                        <option value=\"Blanco\">Blanco</option>\n");
      out.write("                        <option value=\"Afrodescendiente\">Afrodescendiente</option>\n");
      out.write("                        <option value=\"Indígena\">Indígena</option>\n");
      out.write("                        <option value=\"Mulato\">Mulato</option>\n");
      out.write("                        <option value=\"Asiático\">Asiático</option>\n");
      out.write("                        <option value=\"Otro\">Otro</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"tipoSangre\">Tipo de Sangre</label>\n");
      out.write("                    <select class=\"form-control\" id=\"tipoSangre\" name=\"tipoSangre\" required>\n");
      out.write("                        <option value=\"\" disabled selected>Seleccione un tipo</option>\n");
      out.write("                        <option value=\"A+\">A+</option>\n");
      out.write("                        <option value=\"A-\">A-</option>\n");
      out.write("                        <option value=\"B+\">B+</option>\n");
      out.write("                        <option value=\"B-\">B-</option>\n");
      out.write("                        <option value=\"AB+\">AB+</option>\n");
      out.write("                        <option value=\"AB-\">AB-</option>\n");
      out.write("                        <option value=\"O+\">O+</option>\n");
      out.write("                        <option value=\"O-\">O-</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"ocupacion\">Ocupación</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"ocupacion\" name=\"ocupacion\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"eps\">EPS</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"eps\" name=\"eps\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"alergias\">Alergias</label>\n");
      out.write("                    <textarea class=\"form-control\" id=\"alergias\" name=\"alergias\" rows=\"3\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"cirugias\">Cirugías</label>\n");
      out.write("                    <textarea class=\"form-control\" id=\"cirugias\" name=\"cirugias\" rows=\"3\"></textarea>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-section\">\n");
      out.write("                <h2>Contacto de Emergencia</h2>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"emergencyNombre\">Nombre y Apellido</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"emergencyNombre\" name=\"emergencyNombre\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"emergencyDireccion\">Dirección</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"emergencyDireccion\" name=\"emergencyDireccion\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"emergencyCiudad\">Ciudad</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"emergencyCiudad\" name=\"emergencyCiudad\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"emergencyTelefono\">Número de Teléfono</label>\n");
      out.write("                    <input type=\"tel\" class=\"form-control\" id=\"emergencyTelefono\" name=\"emergencyTelefono\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"emergencyRelacion\">Relación</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"emergencyRelacion\" name=\"emergencyRelacion\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Registrar</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
