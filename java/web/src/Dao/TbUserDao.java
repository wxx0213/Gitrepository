package Dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Model.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateSessionFactory;  
public class TbUserDao 
{
	//添加新用户
	public void addTbUser(TbUser user)
	{
		try
		{
			Session s=HibernateSessionFactory.getSession();
			Transaction t=s.beginTransaction();
			
			TbUser tbUser=new TbUser();
			tbUser.setUserName(user.getUserName());
			tbUser.setPassword(user.getPassword());
			tbUser.setRealName(user.getRealName());
			tbUser.setSex(user.getSex());
			tbUser.setEmail(user.getEmail());
			tbUser.setMobile(user.getMobile());
			tbUser.setType(user.getType());
			
			
			s.save(tbUser);
			t.commit();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
		 
	}
	//修改用户信息
	public Boolean updateTbUser(TbUser user)
	{
		try
		{
			TbUserDao userDao=new TbUserDao();
			TbUser tbUser=new TbUser();
			
			tbUser=userDao.SelectById(user.getId());
			tbUser.setUserName(user.getUserName());
			tbUser.setRealName(user.getRealName());
			tbUser.setEmail(user.getEmail());
			tbUser.setMobile(user.getMobile());		
			tbUser.setPassword(user.getPassword());
			Session s=HibernateSessionFactory.getSession();
			
			Transaction t=s.beginTransaction();
			s.update(tbUser);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
		 
	}
	//按姓名查询信息
	public TbUser SelectByUserName(String name)
	{
		TbUser user=new TbUser();
		try
		{
			List<TbUser> list=new ArrayList();
			Session s=HibernateSessionFactory.getSession();
			String sql="from TbUser as user where user.userName=?";
			Query query = s.createQuery(sql);
			query.setString(0,name);
			list=(List<TbUser>)query.list();
            for(TbUser user2:list)
            {
            	user=user2;
            }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
		return user;
	}
	//根据姓名删除信息
	public void DeleteByUserName(String name)
	{
		TbUser user=new TbUser();
		try
		{
			
			Session s=HibernateSessionFactory.getSession();
			Transaction t = s.beginTransaction();
			String sql="delete from TbUser where userName=?";
			Query query = s.createQuery(sql);
			query.setString(0,name);
			query.executeUpdate();
			t.commit();
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
	}
	//根据id查找信息
	public TbUser SelectById(int id)
	{
		TbUser user=new TbUser();
		try
		{
			
			Session s=HibernateSessionFactory.getSession();
			Transaction t = s.beginTransaction();
			String sql="from TbUser where id=?";
			Query query = s.createQuery(sql);
			query.setInteger(0, id);
			//获得唯一的查询结果
			user=(TbUser)query.uniqueResult();
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
		return user;
	}
	//根据id删除信息
	public void DeleteById(int id)
	{
		TbUser user=new TbUser();
		try
		{
			
			Session s=HibernateSessionFactory.getSession();
			Transaction t = s.beginTransaction();
			String sql="delete from TbUser where id=?";
			Query query = s.createQuery(sql);
			query.setInteger(0, id);
			query.executeUpdate();
			t.commit();
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
	}
}
