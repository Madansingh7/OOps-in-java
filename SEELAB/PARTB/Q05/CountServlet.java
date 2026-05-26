package ooplab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CountServlet")

public class CountServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public CountServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.sendRedirect("index.html");
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String str = request.getParameter("text");

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z') {

                if(ch == 'a' || ch == 'e' ||
                   ch == 'i' || ch == 'o' ||
                   ch == 'u') {

                    vowels++;
                }

                else {

                    consonants++;
                }
            }
        }

        out.println("<html><body>");

        out.println("<h2>Vowels = " + vowels + "</h2>");

        out.println("<h2>Consonants = " + consonants + "</h2>");

        out.println("</body></html>");
    }
}
