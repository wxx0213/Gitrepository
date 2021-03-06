package Action;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import Model.*;
import Dao.*;
import Tool.*;
public class RegisterAction 
{
	private String userName;
	private String password;
	private String repassword;
	private String realName;
	private String sex;
	private String email;
	private String mobile;
	private String type="0";
	/*
	 * get and set方法
	 */
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName.trim();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		    this.type = type;

	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void register() throws IOException
	{
		//将提示信息保存至session
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		String result=new String();
		TbUserDao userDao=new TbUserDao();
		TbUser existUser;
		existUser=userDao.SelectByUserName(getUserName());
		if(existUser.getUserName()==null)
		{
			try
			{
				Encode encode=new Encode();				
				
				TbUser tbUser=new TbUser();
				tbUser.setUserName(getUserName());
				tbUser.setPassword(encode.EncoderByMD5(getPassword()));
				tbUser.setRealName(getRealName());
				tbUser.setSex(getSex());
				tbUser.setEmail(getEmail());
				tbUser.setMobile(getMobile());
				tbUser.setType(getType());
				userDao.addTbUser(tbUser);
				result="注册成功！";
				request.getSession().setAttribute("information",result);
				//重定位
				response.sendRedirect("/web/register.jsp");
			}
			catch(Exception e)
			{
			}
			finally
			{}			
		}
		else
			{
			result="用户名已注册，请重新输入！";
			request.getSession().setAttribute("information",result);
			//重定位
			response.sendRedirect("/web/register.jsp");
			}

	}

}
