package servlet;

import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import bean.EmpBean;
import pojo.EmpPojo;

import com.google.gson.Gson;

@WebServlet("/AddEmpServlet")
public class AddEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
//			throws IOException, ServletException {
//
//		HttpServletRequest request = (HttpServletRequest) req;
//		HttpServletResponse response = (HttpServletResponse) res;
//		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
//		response.setHeader("Access-Control-Allow-Credentials", "true");
//		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
//		response.setHeader("Access-Control-Max-Age", "3600");
//		response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");
//		chain.doFilter(req, res);
//	}

//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		response.addHeader("Access-Control-Allow-Origin", "*");
//        response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
//        response.addHeader("Access-Control-Allow-Headers", "X-PINGOTHER, Origin, X-Requested-With, Content-Type, Accept");
//        response.addHeader("Access-Control-Max-Age", "1728000");
//		
//        
//		String name = request.getParameter("name");
//		String designation = request.getParameter("designation");
//
//		int age;
//		if (request.getParameter("age").equals("")) {
//			age = 0;
//		} else {
//			age = Integer.parseInt(request.getParameter("age"));
//		}
//
//		int salary;
//		if (request.getParameter("salary").equals("")) {
//			salary = 0;
//		} else {
//			salary = Integer.parseInt(request.getParameter("salary"));
//		}
//
//		String[] beansXMLFiles = new String[] {
//				"C:/Users/725723/eclipse-workspace/EmpProject/WebContent/WEB-INF/classes/beans-aspect.xml",
//				"C:/Users/725723/eclipse-workspace/EmpProject/WebContent/WEB-INF/classes/beans.xml" };
//		ApplicationContext context = new FileSystemXmlApplicationContext(beansXMLFiles);
//		EmpBean EmpBean = (EmpBean) context.getBean("add");
//
//		EmpPojo ep = new EmpPojo(name, designation, age, salary);
//
//		String msg = null;
//		msg = EmpBean.addEmp(ep);
//		if (msg != null) {
//			request.setAttribute("msg", msg);
//			RequestDispatcher rd = request.getRequestDispatcher("http://localhost:3010/Main.html");
//			rd.forward(request, response);
//		} else {
//			request.setAttribute("Empdata", ep);
//			RequestDispatcher rd = request.getRequestDispatcher("http://localhost:3010/Main.html");
//			rd.forward(request, response);
//		}
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws NumberFormatException, ServletException, IOException {

		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
		response.addHeader("Access-Control-Allow-Headers",
				"X-PINGOTHER, Origin, X-Requested-With, Content-Type, Accept");
		response.addHeader("Access-Control-Max-Age", "1728000");

		String x = request.getReader().lines().collect(Collectors.joining());

		Gson g = new Gson();
		EmpPojo emp = g.fromJson(x, EmpPojo.class);
		String msg = null;

		if (emp.getName().equals("") || emp.getDesignation().equals("") || (emp.getAge()) == 0
				|| (emp.getSalary()) == 0)
			msg = "{"
					+ "\"msg\": \"Message cannot be null\""
					+ "}";
		else {
			EmpBean.addEmp(emp);
		}
		
		if (msg != null) {
			String json = new Gson().toJson(msg);
			response.setContentType("application/json");
		    response.setCharacterEncoding("UTF-8");
		    response.getWriter().write(json);
		}
		else {
			String json = new Gson().toJson(emp);
			response.setContentType("application/json");
		    response.setCharacterEncoding("UTF-8");
		    response.getWriter().write(json);
		}
//		String name = request.getParameter("name");
//		String designation = request.getParameter("designation");
//
//		int age;
//		if (request.getParameter("age").equals("")) {
//			age = 0;
//		} else {
//			age = Integer.parseInt(request.getParameter("age"));
//		}
//
//		int salary;
//		if (request.getParameter("salary").equals("")) {
//			salary = 0;
//		} else {
//			salary = Integer.parseInt(request.getParameter("salary"));
//		}
//
//		String[] beansXMLFiles = new String[] {
//				"C:/Users/725723/eclipse-workspace/EmpProject/WebContent/WEB-INF/classes/beans-aspect.xml",
//				"C:/Users/725723/eclipse-workspace/EmpProject/WebContent/WEB-INF/classes/beans.xml" };
//		ApplicationContext context = new FileSystemXmlApplicationContext(beansXMLFiles);
//		EmpBean EmpBean = (EmpBean) context.getBean("add");
//
//		EmpPojo ep = new EmpPojo(name, designation, age, salary);
//
//		String msg = null;
//		msg = EmpBean.addEmp(ep);
//		if (msg != null) {
//			request.setAttribute("msg", msg);
//			RequestDispatcher rd = request.getRequestDispatcher("AddEmp.jsp");
//			rd.forward(request, response);
//		} else {
//			request.setAttribute("Empdata", ep);
//			RequestDispatcher rd = request.getRequestDispatcher("AddEmpResult.jsp");
//			rd.forward(request, response);
//		}
	}
}
