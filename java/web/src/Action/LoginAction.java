package Action;

import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import Tool.Encode;
import Dao.TbUserDao;
import Model.*;

public class LoginAction extends HttpServlet
{
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void login()
	{
		//将用户名保存至session
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		
		String str=new String();
		
		try
	    {
		//对密码进行加密
		Encode encode=new Encode();
		TbUser user=new TbUser();
		TbUserDao userDao=new TbUserDao();
		String newstr=encode.EncoderByMD5(password);
		
		user=userDao.SelectByUserName(username);
		//字符串比较必须用equals
		if(username.equals(user.getUserName())&&newstr.equals(user.getPassword()))
		{
			str=user.getUserName()+"您已登录";	
		}
		else
		{
			str="用户名或密码错误";
				
		}
		request.getSession().setAttribute("information",str);
		//重定位
		response.sendRedirect("/web/index.jsp");
	    }
	    catch(Exception e)
	    {
		     
	    }   
		
	}
}
