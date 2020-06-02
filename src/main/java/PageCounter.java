import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "PageCounter", urlPatterns = "/count")
public class PageCounter extends HttpServlet {

    private int hitCount;

    public void init() {
        hitCount = 0;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            if(request.getParameter("reset").equals("1")){
                hitCount = 0;
            }
        }catch(NullPointerException exc){
            exc.printStackTrace();
        }
        response.setContentType("text/html");
        hitCount++;
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, visitor number: " + hitCount +" </h1>");
    }
}