package Tool;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public class Alert {
	public static void alert(String valueString) throws IOException 
	{
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("textml;charset=UTF-8"); 
		response.setCharacterEncoding("UTF-8");//防止弹出的信息出现乱码 
		PrintWriter out = response.getWriter();
		out.println("<script language='JavaScript'>" +"alert('" + valueString + "');</script>");
		out.flush(); 
		out.close(); 
		}
}
