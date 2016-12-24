package Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateSessionFactory;
import Model.*;

public class TbBuildingDao 
{
	//��ӽ�����Ϣ
	public void addTbBuilding(TbBuilding building)
	{
		try
		{
			Session s=HibernateSessionFactory.getSession();
			Transaction t=s.beginTransaction();
			
			TbBuilding tbBuilding=new TbBuilding();
			tbBuilding.setBuildName(building.getBuildName());
			tbBuilding.setDescription(building.getDescription());
			tbBuilding.setLocation(building.getLocation());
			tbBuilding.setImagePath(building.getImagePath());
					
			s.save(tbBuilding);
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
	//��ݽ�����Ʋ�ѯ�����Ϣ
	public TbBuilding SelectByName(String name)
	{
		TbBuilding tbBuilding=new TbBuilding();
		try
		{
			List<TbBuilding> list=new ArrayList();
			Session s=HibernateSessionFactory.getSession();
			String sql="from TbBuilding as building where building.buildName=?";
			Query query = s.createQuery(sql);
			query.setString(0,name);
			list=(List<TbBuilding>)query.list();
            for(TbBuilding building:list)
            {
            	tbBuilding=building;
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
		return tbBuilding;
	}
	//���Id��ѯ�����Ϣ
	public TbBuilding SelectById(int id)
	{
		TbBuilding tbBuilding=new TbBuilding();
		try
		{
			List<TbBuilding> list=new ArrayList();
			Session s=HibernateSessionFactory.getSession();
			String sql="from TbBuilding as building where building.id=?";
			Query query = s.createQuery(sql);
			query.setInteger(0,id);
			list=(List<TbBuilding>)query.list();
            for(TbBuilding building:list)
            {
            	tbBuilding=building;
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
		return tbBuilding;
	}
	
	public List<TbBuilding> SelectAll()
	{
		List<TbBuilding> list=new ArrayList();
		TbBuilding tbBuilding=new TbBuilding();
		try
		{

			Session s=HibernateSessionFactory.getSession();
			String sql="from TbBuilding";
			Query query = s.createQuery(sql);
			list=(List<TbBuilding>)query.list();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
		return list;
	}
}
