package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.log.InferenciaII;

/**
 * Servlet implementation class sCuestionario
 */
@WebServlet("/sCuestionario")
public class sCuestionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public sCuestionario() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		try{
		String [] cond = new String [6];
		InferenciaII obj = new InferenciaII();
				
		String dmuscular, dcabeza, darticular, vomito, fiebre, nauseas;
		
		dmuscular= request.getParameter("opcion1DM");
		dcabeza = request.getParameter("opcion2DC");
		darticular = request.getParameter("opcion3DA");
		vomito = request.getParameter("opcion4V");
		fiebre = request.getParameter("opcion5F");
		nauseas = request.getParameter("opcion6N");
			
		
		if(request.getParameter("btnDiagnosticar")!=null){
			
		cond[0] = dmuscular; //D_muscular
		cond[1] = dcabeza;//D_cabeza
		cond[2] = darticular;//D_articular
		cond[3] = vomito;//Vomito
		cond[4] = fiebre;//Fiebre
		cond[5] = nauseas;//Nauseas
		
		float prob = obj.ProbabilidadI(cond);
		float probb = obj.ProbabilidadII(cond);
		float probabilidad = obj.inferTeoremaBayes(prob, probb);

		out.print("<script type=\"text/javascript\">alert("	+probabilidad+  ");void 0;window.location='frmCuestionario.jsp'</script>");
		
		}	
		}catch(Exception e){
			out.print("<script>alert('"+e.getMessage()+"')</script>");
			
			 
		}
	}
	

}
