package Action;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import Dao.*;
import Model.*;
import Tool.Encode;
public class UserManageAction 
{
 private int userId;
 private TbUser user=new TbUser();

/*
  * 用来接收修改界面的信息(以下属性仅在修改信息时用到)
  */
 private String userName;
 private String realName;
 private String email;
 private String mobile;
 //修改密码
 private String newPassword;
 
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public TbUser getUser() {
	return user;
}
public void setUser(int userId,String userName,String realName,String email,String mobile) {
	this.user.setId(userId);
	this.user.setUserName(userName) ;
	this.user.setRealName(realName);
	this.user.setEmail(email);
	this.user.setMobile(mobile);
}
public void setUser(TbUser user) {
	this.user = user;
}


public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
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
public String getNewPassword() {
	return newPassword;
}
public void setNewPassword(String newPassword) {
	this.newPassword = newPassword;
}

public String deleteUserById()
{
	TbUserDao userDao=new TbUserDao();
	if(userId!=0)
	{
		userDao.DeleteById(userId);
	}
	return "success"; 
}
public String selectforUpdate()
{
	TbUserDao userDao=new TbUserDao();
	if(userId!=0)
	{
		user=userDao.SelectById(userId);
	}
	return "success";
}
public String selectById()
{
	TbUserDao userDao=new TbUserDao();
	if(userId!=0)
	{
		user=userDao.SelectById(userId);
	}
	return "success";
}
public String updateById()
{
	Boolean flag;
    TbUserDao userDao=new TbUserDao();
    if(userId!=0)
     {
	     this.setUser(userId,userName, realName, email, mobile);
	     flag=userDao.updateTbUser(user);
     }
	 return "success";
}
public String checkForResetPass()
{	
	TbUser existUser=new TbUser();
	TbUserDao userDao=new TbUserDao();
	existUser=userDao.SelectByUserName(userName);
	userId=existUser.getId();
	if(existUser.getEmail().equals(email))
		return "success";
	else
		return "error";	
}
public String updatePassword()
{
	Boolean flag;
	TbUser existUser=new TbUser();
	TbUserDao userDao=new TbUserDao();
	Encode encode=new Encode();	
	try
	{
	existUser=userDao.SelectById(userId);
	existUser.setPassword(encode.EncoderByMD5(newPassword));
	flag=userDao.updateTbUser(existUser);
	if(flag)
		return "success";
	else
		return "false";
	}
	catch(Exception e)
	{
		return "false";
	}
	finally
	{}		

}

}
