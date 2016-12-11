package Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateSessionFactory;
import Model.*;

public class TbSpecialityDao {
	//添加特色信息
	public void addTbSpecialty(TbSpeciality specialty)
	{
		try
		{
			Session s=HibernateSessionFactory.getSession();
			Transaction t=s.beginTransaction();
			
			TbSpeciality tbSpeciality=new TbSpeciality();
			tbSpeciality.setName(specialty.getName());
			tbSpeciality.setDescription(specialty.getDescription());
			tbSpeciality.setType(specialty.getType());
			tbSpeciality.setImagePath(specialty.getImagePath());
					
			s.save(specialty);
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
	//根据名称查询相关信息
	public TbSpeciality SelectByName(String name)
	{
		TbSpeciality tbSpeciality=new TbSpeciality();
		try
		{
			List<TbSpeciality> list=new ArrayList();
			Session s=HibernateSessionFactory.getSession();
			String sql="from TbSpeciality as speciality where speciality.name=?";
			Query query = s.createQuery(sql);
			query.setString(0,name);
			list=(List<TbSpeciality>)query.list();
            for(TbSpeciality speciality:list)
            {
            	tbSpeciality=speciality;
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
		return tbSpeciality;
	}
}
