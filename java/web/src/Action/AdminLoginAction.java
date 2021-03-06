package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import Dao.TbUserDao;
import Model.TbUser;
import Tool.Encode;

public class AdminLoginAction 
{
	private String username;
	private String password;
	private String type;
	
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
    
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void adminLogin()
	{
		//将路径保存至session
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		
		String s=new String();
		try
	    {
		Encode encode=new Encode();
		TbUser user=new TbUser();
		TbUserDao userDao=new TbUserDao();
		String newstr=encode.EncoderByMD5(password);
		
		user=userDao.SelectByUserName(username);
		//字符串比较必须用equals
		if(username.equals(user.getUserName())&&newstr.equals(user.getPassword())&&user.getType().equals(type))
		{
			if(user.getType().equals("1"))
				response.sendRedirect("/web/admin.jsp");
			else
				response.sendRedirect("/web/index.jsp");
		}
		else 
			{s="error";}
	    }
	    catch(Exception e)
	    {
		     
	    }   
		
		
	}
}
