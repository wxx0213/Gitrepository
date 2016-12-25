package Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import util.HibernateSessionFactory;
import Model.TbConstant;

public class FolkByPageDao {
	/** 
     * 查找并返回所有用户信息 
     */  
    public List<TbConstant> findPlantByPage(int page, int rowsPerPage) {  
    	Session session=HibernateSessionFactory.getSession();
        Query query = session.createQuery("from TbConstant order by id asc");  
        query.setMaxResults(rowsPerPage); // 每页最多显示几条  
        query.setFirstResult((page - 1) * rowsPerPage); // 每页从第几条记录开始  
        List<TbConstant> list = query.list();  
  
        session.close();  
  
        return list;  
    }  
  
    /** 
     * 共多少页
     */  
    public int getPlanTotalPage(int rowsPerPage) {  
    	int rows;
    	Session session=HibernateSessionFactory.getSession();
        Query query = session.createQuery("from TbConstant order by id asc");  
        List<TbConstant> list = query.list();     
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
        Query query = session.createQuery("from TbConstant order by id asc");  
        List<TbConstant> list = query.list();     
        rows =list.size(); 
  
        session.close();  
        return rows;  
    }  
    
    public List<TbConstant> findPlantByPageCondition(int page, int rowsPerPage,String constant) {  
    	Session session=HibernateSessionFactory.getSession();
        //String hql = "select * from TbConstant u where u." + type  
        //+ "=?";  
    	Criteria c=session.createCriteria(TbConstant.class);
    	if(!constant.equals("")&&constant!=null)
    		c.add(Restrictions.like("constant", "%"+constant+"%"));
        c.setMaxResults(rowsPerPage); // 每页最多显示几条  
        c.setFirstResult((page - 1) * rowsPerPage); // 每页从第几条记录开始  
        List<TbConstant> list = c.list();  
 
        session.close();  
  
        return list;  
    }  
  
    /** 
     * 条件查询后返回的计划总页数 
     */  
    public int getPlanTotalPage(int rowsPerPage, String constant) {  
        int rows = 0;  
        Session session=HibernateSessionFactory.getSession();  
        //String hql="select * from TbConstant u where u." + type  
        //+ "=?";   
        //Query query = session.createQuery(hql);  
        //query.setString(0,search);   
        //rows = query.list().size(); 
    	Criteria c=session.createCriteria(TbConstant.class);
    	if(!constant.equals("")&&constant!=null)
    		c.add(Restrictions.like("constant", "%"+constant+"%"));
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
    public int getPlanNum(String constant) {  
        int rows = 0;  
        Session session=HibernateSessionFactory.getSession();
        //String hql =  "select * from TbConstant u where u." + type  
        //+ "=?";  
        //Query query = session.createQuery(hql);  
        //query.setString(0,search);   
  
    	Criteria c=session.createCriteria(TbConstant.class);
    	if(!constant.equals("")&&constant!=null)
    		c.add(Restrictions.like("constant", "%"+constant+"%"));
    	rows=c.list().size(); 
        // System.out.println("rows:" + rows);  
        session.close();  
        return rows;  
    }  
}
