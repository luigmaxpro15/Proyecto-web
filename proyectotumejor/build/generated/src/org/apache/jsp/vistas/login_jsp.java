package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\">\n");
      out.write("    <title>Login Page</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-image: url('../imagenes/mejor.jpeg');\n");
      out.write("            background-size: cover;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-attachment: fixed;\n");
      out.write("            color: white;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("        .fondo {\n");
      out.write("            height: 100vh;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            position: relative;\n");
      out.write("            background-color: rgba(0, 0, 0, 0.5);\n");
      out.write("        }\n");
      out.write("        .contenido {\n");
      out.write("            background-color: rgba(173, 171, 201, 0.1);\n");
      out.write("            padding: 3rem;\n");
      out.write("            border-radius: 1rem;\n");
      out.write("            max-width: 500px;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        .form-label {\n");
      out.write("            color: white;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .form-control {\n");
      out.write("            background-color: transparent;\n");
      out.write("            border: none;\n");
      out.write("            border-bottom: 2px solid white;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        .btn-outline-light {\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    ");
 
        String mensaje = "";
        if (request.getParameter("ingreso") != null) {
            int i = Integer.parseInt(request.getParameter("ingreso"));
            if (i == 0) {
                mensaje = "Error: Datos Incorrectos";
            }
        }
    
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <section class=\"fondo\">\n");
      out.write("        <div class=\"contenido\">\n");
      out.write("            <h1 class=\"mb-4 text-center\">TU MEJOR SONRISA</h1>\n");
      out.write("            <form class=\"form-sing\" method=\"post\" action=\"/proyectotumejor/CtrValidar\">\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label class=\"form-label\">Usuario:</label>\n");
      out.write("                    <input name=\"txtuser\" class=\"form-control\" placeholder=\"Ingrese su usuario\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"password\" class=\"form-label\">Contraseña:</label>\n");
      out.write("                    <input type=\"password\" name=\"txtpass\" class=\"form-control\" placeholder=\"Ingrese su contraseña\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"d-grid gap-2\">\n");
      out.write("                    <a href=\"../vistas/recontra.jsp\" class=\"btn btn-link\">¿Olvidó Su Contraseña?</a>\n");
      out.write("                    <center>\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"Iniciar sesión\" class=\"btn btn-primary btn-block\">\n");
      out.write("                        <p style=\"color: red;\">");
      out.print( mensaje );
      out.write("</p>\n");
      out.write("                    </center> \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
