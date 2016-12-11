package Dao;

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
			tbActivity.setImagePath(activity.getImagePath());
			tbActivity.setBuildId(activity.getBuildId());
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

}
