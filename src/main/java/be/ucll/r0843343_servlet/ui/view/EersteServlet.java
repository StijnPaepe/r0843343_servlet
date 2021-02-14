package be.ucll.r0843343_servlet.ui.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DynamischePagina")
public class EersteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");


        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE>");
        out.println("<html><body>");
        out.println(" <a id=home href=\"index.html\">Terug naar de index pagina</a>");
        out.println("<h1>" +"<p id=dynamisch> De waarde van de worp bedraagt: " +Math.round(((Math.random())*5)+1)  + "</p>" + "</h1>");
        out.println("<h2>" +"<p> PRIJZENLIJST Dobbelde u een: </p>" + "</h2>");
        out.println("<h3>" +"<p id=dynamisch>1 dan wint u " + Math.round(((Math.random())*100)+1) +" Euro!" +"</p>" + "</h3>");
        out.println("<h3>" +"<p id=dynamisch>2 dan wint u " + Math.round(((Math.random())*100)+1) +" Euro!" +"</p>" + "</h3>");
        out.println("<h3>" +"<p id=dynamisch>3 dan wint u " + Math.round(((Math.random())*100)+1) +" Euro!" +"</p>" + "</h3>");
        out.println("<h3>" +"<p id=dynamisch>4 dan wint u " + Math.round(((Math.random())*100)+1) +" Euro!" +"</p>" + "</h3>");
        out.println("<h3>" +"<p id=dynamisch>5 dan wint u " + Math.round(((Math.random())*100)+1) +" Euro!" +"</p>" + "</h3>");
        out.println("<h3>" +"<p id=dynamisch>6 dan wint u " + Math.round(((Math.random())*100)+1) +" Euro!" +"</p>" + "</h3>");
        out.println("<h4>" +" <a href=\"DynamischePagina\">Nog eens dobbelen?</a>"+ "</h3>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
