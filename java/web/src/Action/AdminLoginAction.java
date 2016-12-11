package Action;

import Dao.TbUserDao;
import Model.TbUser;
import Tool.Encode;

public class AdminLoginAction 
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

	public String login()
	{
		String s=new String();
		try
	    {
		Encode encode=new Encode();
		TbUser user=new TbUser();
		TbUserDao userDao=new TbUserDao();
		String newstr=encode.EncoderByMD5(password);
		
		user=userDao.SelectByUserName(username);
		//字符串比较必须用equals
		if(username.equals(user.getUserName())&&newstr.equals(user.getPassword())&&user.getType()=="1")
		{
			s="success";
			System.out.println("ssssssssssssss");
		}
		else 
			{s="error";}
	    }
	    catch(Exception e)
	    {
		     
	    }   
		return s;
		
	}
}
