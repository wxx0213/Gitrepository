package Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import util.HibernateSessionFactory;
import Model.TbBuilding;

public class BuildingByPageDao {
		 /** 
	     * 查找并返回所有用户信息 
	     */  
	    public List<TbBuilding> findPlantByPage(int page, int rowsPerPage) {  
	    	Session session=HibernateSessionFactory.getSession();
	        Query query = session.createQuery("from TbBuilding order by buildId asc");  
	        query.setMaxResults(rowsPerPage); // 每页最多显示几条  
	        query.setFirstResult((page - 1) * rowsPerPage); // 每页从第几条记录开始  
	        List<TbBuilding> list = query.list();  
	  
	        session.close();  
	  
	        return list;  
	    }  
	  
	    /** 
	     * 共多少页
	     */  
	    public int getPlanTotalPage(int rowsPerPage) {  
	    	int rows;
	    	Session session=HibernateSessionFactory.getSession();
	        Query query = session.createQuery("from TbBuilding order by buildId asc");  
	        List<TbBuilding> list = query.list();     
	        rows =list.size(); 
	        // System.out.println("rows:" + rows);  
	        session.close();  
	        if (rows % rowsPerPage == 0) {  
	            return rows / rowsPerPage;  
	        } else {  
	            return rows / rowsPerPage + 1;  
	        }  
	    }  
	    /** 
	     * 返回总数
	     */  
	    public int getPlanNum() {  
	        int rows = 0;  
	        Session session=HibernateSessionFactory.getSession();
	        Query query = session.createQuery("from TbBuilding order by buildId asc");  
	        List<TbBuilding> list = query.list();     
	        rows =list.size(); 
	  
	        session.close();  
	        return rows;  
	    }  
	    
	    public List<TbBuilding> findPlantByPageCondition(int page, int rowsPerPage,String buildName) {  
	    	Session session=HibernateSessionFactory.getSession();
	        //String hql = "select * from TbBuilding u where u." + type  
	        //+ "=?";  
	    	Criteria c=session.createCriteria(TbBuilding.class);
	    	if(!buildName.equals("")&&buildName!=null)
	    		c.add(Restrictions.like("buildName", "%"+buildName+"%"));
	        c.setMaxResults(rowsPerPage); // 每页最多显示几条  
	        c.setFirstResult((page - 1) * rowsPerPage); // 每页从第几条记录开始  
	        List<TbBuilding> list = c.list();  
	 
	        session.close();  
	  
	        return list;  
	    }  
	  
	    /** 
	     * 条件查询后返回的计划总页数 
	     */  
	    public int getPlanTotalPage(int rowsPerPage, String buildName) {  
	        int rows = 0;  
	        Session session=HibernateSessionFactory.getSession();  
	        //String hql="select * from TbBuilding u where u." + type  
	        //+ "=?";   
	        //Query query = session.createQuery(hql);  
	        //query.setString(0,search);   
	        //rows = query.list().size(); 
	    	Criteria c=session.createCriteria(TbBuilding.class);
	    	if(!buildName.equals("")&&buildName!=null)
	    		c.add(Restrictions.like("buildName", "%"+buildName+"%"));
	    	rows=c.list().size(); 
	         
	        // System.out.println("rows:" + rows);  
	        session.close();  
	        if (rows % rowsPerPage == 0) {  
	            return rows / rowsPerPage;  
	        } else {  
	            return rows / rowsPerPage + 1;  
	        }  
	    }  
	  
	    /** 
	     * 条件查询后返回总数 
	     */  
	    public int getPlanNum(String buildName) {  
	        int rows = 0;  
	        Session session=HibernateSessionFactory.getSession();
	        //String hql =  "select * from TbBuilding u where u." + type  
	        //+ "=?";  
	        //Query query = session.createQuery(hql);  
	        //query.setString(0,search);   
	  
	    	Criteria c=session.createCriteria(TbBuilding.class);
	    	if(!buildName.equals("")&&buildName!=null)
	    		c.add(Restrictions.like("buildName", "%"+buildName+"%"));
	    	rows=c.list().size(); 
	        // System.out.println("rows:" + rows);  
	        session.close();  
	        return rows;  
	    }  

}
