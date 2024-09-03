package Controlador;

import Modelo.OdontoloDAO;
import Modelo.Odontologo;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import org.mindrot.jbcrypt.BCrypt;

@WebServlet("/CtrValidar")
public class CtrValidar extends HttpServlet {

     OdontoloDAO odon = new OdontoloDAO();
    Odontologo odont = new Odontologo();

    public static boolean verificarcontrasena(String password, String contrasenaencriptada) {
        return BCrypt.checkpw(password, contrasenaencriptada);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if ("Ingresar".equalsIgnoreCase(accion)) {
            HttpSession sesion = request.getSession();
            String usu = request.getParameter("txtuser");
            String pas = request.getParameter("txtpass");
            odont = odon.validar(usu, pas);
            if (odont.getUsuario() != null) {
                System.out.println("usuario: " + odont.getUsuario());
                System.out.println("contrasena:"+ pas);
                  boolean verificarpassword = verificarcontrasena(pas, odont.getContrasena());
                    if(verificarpassword){
                  sesion.setAttribute("log", '1');
                    sesion.setAttribute("nombres", odont.getNombres());
                    sesion.setAttribute("apellidos", odont.getApellidos());
                    sesion.setAttribute("id", odont.getId());
                    sesion.setAttribute("usuario", odont);
                    
                        response.sendRedirect( "/vistas/acceso.jsp");
                    
                    }
            }
        }else {
                  response.sendRedirect("/proyectotumejor/vistas/login.jsp?ingreso=0");

            }
    }

    @Override
    public String getServletInfo() {
        return "Servlet para validar usuarios y manejar sesiones.";
    }
}
