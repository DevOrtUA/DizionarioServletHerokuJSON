package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "AppServlet",
        urlPatterns = {"/dizionario"}
)

public class App extends HttpServlet{

    private static final long serialVersionUID = -3967314453512919811L;
//    private static JSONObject jsonDizionario;
    private static File file;

    public static void main(String[] args)throws Exception {
        System.out.println("Start");

    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        // Setting up the content type of web page
        resp.setContentType("text/html");
        // Writing the message on the web page
        PrintWriter out = resp.getWriter();
        String termine = req.getParameter("parola");

        String risposta;

        out.println("<h1>Ricevuto " + termine+"</h1>");

        switch (termine) {
            case "abbattere":
                risposta="Significato: Far cadere un oggetto di grandi dimensioni, colpendolo: a. un albero";
                out.println("<p>"+risposta+"</p>");
                break;

            case "abbattimento":
                risposta="Significato: Taglio; demolizione: a. di un albero, di una casa; colpo che provoca la caduta e quindi la distruzione di qlco.: a. di un aereo || a. delle barriere doganali, abolizione di dazi e di altre restrizioni a favore del libero scambio";
                out.println("<p>"+risposta+"</p>");
                break;

            case "abbattuta":
                risposta="Significato:  Zona boschiva in cui sono stati tagliati gli alberi";
                out.println("<p>"+risposta+"</p>");
                break;

            default:
                risposta="Parola non trovata";
                out.println("<p>"+risposta+"</p>");
                break;
        }

        out.println("<a href='/'>Torna alla Home</a>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();

        resp.setContentType("text/html");

        String termine = req.getParameter("parola");


        out.println("<a href='/'>Torna alla Home</a>");
    }


}