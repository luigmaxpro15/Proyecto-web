package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class acceso_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">\n");
      out.write("\n");
      out.write("        <title>Tu Mejor Sonrisa</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #f0f0f0;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header {\n");
      out.write("                background-color: #00aaff;\n");
      out.write("                color: white;\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header .title {\n");
      out.write("                font-size: 24px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header .sign-out {\n");
      out.write("                font-size: 18px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button-row {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button-row button {\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .search-bar {\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .appointment-list {\n");
      out.write("                background-color: white;\n");
      out.write("                padding: 10px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n");
      out.write("                overflow-x: auto; /* Permite scroll horizontal si la tabla es muy ancha */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .appointment-list table {\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .appointment-list th, .appointment-list td {\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                font-size: 14px; /* Tamaño de letra ajustado */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .appointment-list th {\n");
      out.write("                background-color: #f7f7f7;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .appointment-list .text-center {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-buttons {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-buttons button {\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-inline {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-inline .form-group {\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-inline .btn {\n");
      out.write("                white-space: nowrap;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"title\">Tu Mejor Sonrisa</div>\n");
      out.write("            <div class=\"sign-out\">Cerrar sección</div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"button-row\">\n");
      out.write("                <button>Programar cita</button>\n");
      out.write("                <button>Programar Retratamiento</button>\n");
      out.write("                <button>Generar reportes</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <form class=\"form-inline mt-3 d-flex justify-content-end\" action=\"\">\n");
      out.write("                        <div class=\"form-group mx-sm-3 mb-2\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"txtbuscar\" placeholder=\"Digite nombre\">\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success mb-2\" name=\"accion\" value=\"buscar\">\n");
      out.write("                            <i class=\"bi bi-search\"></i> Buscar\n");
      out.write("                        </button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"appointment-list\">\n");
      out.write("                <table>\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th colspan=\"7\">CITAS</th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Tipo ID</th>\n");
      out.write("                            <th>Identificación</th>\n");
      out.write("                            <th>Nombre Paciente</th>\n");
      out.write("                            <th>Odontólogo</th>\n");
      out.write("                            <th>Fecha</th>\n");
      out.write("                    \n");
      out.write("                            <th>Hora</th>\n");
      out.write("                            <th>Descripción de cita</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                    <c:forEach var=\"cit\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${citas}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cit.getTipoId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cit.getIdentificacion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cit.getNombrePaciente()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cit.getOdontologo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cit.getFecha()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cit.getHora()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cit.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </c:forEach>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"footer-buttons\">\n");
      out.write("                <button>Lista de Pacientes</button>\n");
      out.write("                <button>Registrar Paciente</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
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
