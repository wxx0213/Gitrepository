package Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateSessionFactory;
import Data.SpecialtyShowData;
import Model.*;

public class TbSpecialityDao {
	//�����ɫ��Ϣ
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
			tbSpeciality.setFolkId(specialty.getFolkId());
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
	//�����Ʋ�ѯ�����Ϣ
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
	//根据民族id查询数量
	public int SelectByFolkId(int id)
	{
		int count=0;
		try
		{
			List<TbSpeciality> list=new ArrayList();
			Session s=HibernateSessionFactory.getSession();
			String sql="from TbSpeciality where folkId=?";
			Query query = s.createQuery(sql);
			query.setInteger(0,id);
			list=(List<TbSpeciality>)query.list();
			count=list.size();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
		return count;
	}
	
	
	//根据民族id查询信息
	public SpecialtyShowData unionSelectByid(int id)
	{
		SpecialtyShowData specialty=new SpecialtyShowData();
		try
		{
			
			Session s=HibernateSessionFactory.getSession();
			String sql="select new Data.SpecialtyShowData(ts.id,ts.name,ts.type,ts.description,ts.imagePath,tc.constant) from TbSpeciality  ts, TbConstant tc where ts.id=tc.id and ts.id=?";
			Query query = s.createQuery(sql);
			query.setInteger(0,id);
			specialty=(SpecialtyShowData)query.uniqueResult();
		}
		catch(Exception e)
		{
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
		return specialty;
	}
	//根据id删除信息
	public void deleteById(int id)
	{
		try
		{
			
			Session s=HibernateSessionFactory.getSession();
			Transaction t = s.beginTransaction();
			String sql="delete from TbSpeciality where id=?";
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
	
	public TbSpeciality SelectById(int id)
	{
		TbSpeciality tbSpecialty=new TbSpeciality();
		try
		{
			List<TbSpeciality> list=new ArrayList();
			Session s=HibernateSessionFactory.getSession();
			String sql="from TbSpeciality where id=?";
			Query query = s.createQuery(sql);
			query.setInteger(0,id);
			tbSpecialty=(TbSpeciality)query.uniqueResult();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
		return tbSpecialty;
	}
	
	//修改信息
	public Boolean updateTbSpeciality(TbSpeciality specialty)
	{
		try
		{
			TbSpecialityDao specialtyDao=new TbSpecialityDao();
			TbSpeciality tbSpeciality=new TbSpeciality();
			
			tbSpeciality=specialtyDao.SelectById(specialty.getId());
			tbSpeciality.setName(specialty.getName());
			tbSpeciality.setDescription(specialty.getDescription());
			Session s=HibernateSessionFactory.getSession();
			
			Transaction t=s.beginTransaction();
			s.update(tbSpeciality);
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
}
