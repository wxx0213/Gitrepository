package Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateSessionFactory;
import Model.*;


public class TbActivityDao 
{
	public void addTbActivity(TbActivity activity)
	{
		try
		{
			Session s=HibernateSessionFactory.getSession();
			Transaction t=s.beginTransaction();
			
			TbActivity tbActivity=new TbActivity();
			tbActivity.setActName(activity.getActName());
			tbActivity.setContent(activity.getContent());
			tbActivity.setCreateDate(activity.getCreateDate());
			tbActivity.setActivityDate(activity.getActivityDate());
			tbActivity.setImagePath(activity.getImagePath());
			tbActivity.setBuildId(activity.getBuildId());
			tbActivity.setAttr2(activity.getAttr2());
			s.save(tbActivity);
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
	//查询全部信息
	public List<TbActivity> SelectAll()
	{
		List<TbActivity> list=new ArrayList();
		try
		{
			
			Session s=HibernateSessionFactory.getSession();
			Transaction t = s.beginTransaction();
			String sql="from TbActivity order by activityDate desc";
			Query query = s.createQuery(sql);
			list=query.list();
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
		return list;
	}
	//根据id查找信息
	public TbActivity SelectById(int id)
	{
		TbActivity tbActivity=new TbActivity();
		try
		{
			
			Session s=HibernateSessionFactory.getSession();
			Transaction t = s.beginTransaction();
			String sql="from TbActivity where actId=?";
			Query query = s.createQuery(sql);
			query.setInteger(0, id);
			//获得唯一的查询结果
			tbActivity=(TbActivity)query.uniqueResult();
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
		return tbActivity;
	}
	//修改信息
	public Boolean updateTbActivity(TbActivity activity)
	{
		try
		{
			TbActivityDao activityDao=new TbActivityDao();
			TbActivity TbActivity=new TbActivity();
			
			TbActivity=activityDao.SelectById(activity.getActId());
			TbActivity.setActName(activity.getActName());
			TbActivity.setContent(activity.getContent());
			TbActivity.setBuildId(activity.getActId());
			TbActivity.setActivityDate(activity.getActivityDate());
			TbActivity.setAttr2(activity.getAttr2());
			TbActivity.setImagePath(activity.getImagePath());
			Session s=HibernateSessionFactory.getSession();
			
			Transaction t=s.beginTransaction();
			s.update(TbActivity);
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
	
	//根据id删除信息
	public void deleteById(int id)
	{
		TbUser user=new TbUser();
		try
		{
			
			Session s=HibernateSessionFactory.getSession();
			Transaction t = s.beginTransaction();
			String sql="delete from TbActivity where actId=?";
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
