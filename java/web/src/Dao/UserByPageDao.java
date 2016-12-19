package Dao;
import java.util.List;  
import javax.servlet.http.HttpServletRequest;  
  
import org.hibernate.Criteria;
import org.hibernate.Query;  
import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.criterion.Restrictions;

import util.HibernateSessionFactory;
import Model.*;
public class UserByPageDao 
{
	 /** 
     * 查找并返回所有用户信息 
     */  
    public List<TbUser> findPlantByPage(int page, int rowsPerPage) {  
    	Session session=HibernateSessionFactory.getSession();
        Query query = session.createQuery("from TbUser order by type desc");  
        query.setMaxResults(rowsPerPage); // 每页最多显示几条  
        query.setFirstResult((page - 1) * rowsPerPage); // 每页从第几条记录开始  
        List<TbUser> list = query.list();  
        for (int i = 0; i < list.size(); i++) {  
            System.out.println("findPlantByPage:"  
                    + list.get(i).getUserName());  
        }  
  
        session.close();  
  
        return list;  
    }  
  
    /** 
     * 共多少页
     */  
    public int getPlanTotalPage(int rowsPerPage) {  
    	int rows;
    	Session session=HibernateSessionFactory.getSession();
        Query query = session.createQuery("from TbUser order by type desc");  
        List<TbUser> list = query.list();     
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
        Query query = session.createQuery("from TbUser order by id desc");  
        List<TbUser> list = query.list();     
        rows =list.size(); 
  
        session.close();  
        return rows;  
    }  
    
    public List<TbUser> findPlantByPageCondition(int page, int rowsPerPage,String userType, String userName) {  
    	Session session=HibernateSessionFactory.getSession();
        //String hql = "select * from TbUser u where u." + type  
        //+ "=?";  
    	Criteria c=session.createCriteria(TbUser.class);
    	if(!userType.equals("")&&userType!=null)
    		c.add(Restrictions.eq("type", userType));
    	if(!userName.equals("")&&userName!=null)
    		c.add(Restrictions.like("userName", "%"+userName+"%"));
        c.setMaxResults(rowsPerPage); // 每页最多显示几条  
        c.setFirstResult((page - 1) * rowsPerPage); // 每页从第几条记录开始  
        List<TbUser> list = c.list();  
 
        session.close();  
  
        return list;  
    }  
  
    /** 
     * 条件查询后返回的计划总页数 
     */  
    public int getPlanTotalPage(int rowsPerPage, String userType, String userName) {  
        int rows = 0;  
        Session session=HibernateSessionFactory.getSession();  
        //String hql="select * from TbUser u where u." + type  
        //+ "=?";   
        //Query query = session.createQuery(hql);  
        //query.setString(0,search);   
        //rows = query.list().size(); 
    	Criteria c=session.createCriteria(TbUser.class);
    	if(!userType.equals("")&&userType!=null)
    		c.add(Restrictions.eq("type", userType));
    	if(!userName.equals("")&&userName!=null)
    		c.add(Restrictions.like("userName", "%"+userName+"%"));
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
    public int getPlanNum(String userType, String userName) {  
        int rows = 0;  
        Session session=HibernateSessionFactory.getSession();
        //String hql =  "select * from TbUser u where u." + type  
        //+ "=?";  
        //Query query = session.createQuery(hql);  
        //query.setString(0,search);   
  
    	Criteria c=session.createCriteria(TbUser.class);
    	if(!userType.equals("")&&userType!=null)
    		c.add(Restrictions.eq("type", userType));
    	if(!userName.equals("")&&userName!=null)
    		c.add(Restrictions.like("userName", "%"+userName+"%"));
    	rows=c.list().size(); 
        // System.out.println("rows:" + rows);  
        session.close();  
        return rows;  
    }  
}
