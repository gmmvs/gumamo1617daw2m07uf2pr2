package cookie;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cookie extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        
        Cookie cookie = new Cookie("desenvolupador","gmmvs"); //soc el guillem martinez
        cookie.setMaxAge(60*60); // 1 Hora
        response.addCookie(cookie);
        
        pw.println("Cookie creada");
        
    }   
}
