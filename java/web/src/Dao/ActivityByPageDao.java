package Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import util.HibernateSessionFactory;
import Data.ActivityShowData;
import Model.TbActivity;;

public class ActivityByPageDao {
	 /** 
     * 查找并返回所有用户信息 
     */  
    public List<ActivityShowData> findPlantByPage(int page, int rowsPerPage) {  
    	Session session=HibernateSessionFactory.getSession();
    	String hql="select new Data.ActivityShowData(ta.actId,ta.actName,ta.activityDate,ta.createDate,tb.buildName,ta.attr2) from TbActivity  ta, TbBuilding tb where ta.buildId=tb.buildId order by createDate desc";
        Query query = session.createQuery(hql);  
        query.setMaxResults(rowsPerPage); // 每页最多显示几条  
        query.setFirstResult((page - 1) * rowsPerPage); // 每页从第几条记录开始  
        List<ActivityShowData> list = query.list();    
  
        session.close();  
  
        return list;  
    }  
  
    /** 
     * 共多少页
     */  
    public int getPlanTotalPage(int rowsPerPage) {  
    	int rows;
    	Session session=HibernateSessionFactory.getSession();
    	String hql="select new Data.ActivityShowData(ta.actId,ta.actName,ta.activityDate,ta.createDate,tb.buildName,ta.attr2) from TbActivity  ta, TbBuilding tb where ta.buildId=tb.buildId order by createDate desc";
        Query query = session.createQuery(hql);  
        List<ActivityShowData> list = query.list();     
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
        String hql="select new Data.ActivityShowData(ta.actId,ta.actName,ta.activityDate,ta.createDate,tb.buildName,ta.attr2) from TbActivity  ta, TbBuilding tb where ta.buildId=tb.buildId order by createDate desc";
        Query query = session.createQuery(hql);  
        List<ActivityShowData> list = query.list();     
        rows =list.size(); 
  
        session.close();  
        return rows;  
    }  
    
    public List<ActivityShowData> findPlantByPageCondition(int page, int rowsPerPage,String actName,String activityDate,String createDate) {  
    	Session session=HibernateSessionFactory.getSession();
        //String hql = "select * from TbActivity u where u." + type  
        //+ "=?";  
    	String hql="select new Data.ActivityShowData(ta.actId,ta.actName,ta.activityDate,ta.createDate,tb.buildName,ta.attr2) from TbActivity  ta, TbBuilding tb where ta.buildId=tb.buildId";
    	
    	if(actName!=null&&!actName.equals(""))
    		hql+=(" and ta.actName like "+"'%"+actName+"%'");
    	if(activityDate!=null&&!activityDate.equals(""))
    		hql+=(" and ta.activityDate like "+"'%"+activityDate+"%'");
    	if(createDate!=null&&!createDate.equals(""))
    		hql+=(" and ta.createDate like "+"'%"+createDate+"%'");
    	hql+=" order by ta.createDate desc";
        Query query = session.createQuery(hql);  
        query.setMaxResults(rowsPerPage); // 每页最多显示几条  
        query.setFirstResult((page - 1) * rowsPerPage); // 每页从第几条记录开始  
        List<ActivityShowData> list = query.list();  
 
        session.close();  
  
        return list;  
    }  
  
    /** 
     * 条件查询后返回的计划总页数 
     */  
    public int getPlanTotalPage(int rowsPerPage, String actName,String activityDate, String createDate) {  
        int rows = 0;  
        Session session=HibernateSessionFactory.getSession();  
        //String hql="select * from TbActivity u where u." + type  
        //+ "=?";   
        //Query query = session.createQuery(hql);  
        //query.setString(0,search);   
        //rows = query.list().size(); 
        String hql="select new Data.ActivityShowData(ta.actId,ta.actName,ta.activityDate,ta.createDate,tb.buildName,ta.attr2) from TbActivity  ta, TbBuilding tb where ta.buildId=tb.buildId";
    	
    	if(actName!=null&&!actName.equals(""))
    		hql+=(" and ta.actName like "+"'%"+actName+"%'");
    	if(activityDate!=null&&!activityDate.equals(""))
    		hql+=(" and ta.activityDate like "+"'%"+activityDate+"%'");
    	if(createDate!=null&&!createDate.equals(""))
    		hql+=(" and ta.createDate like "+"'%"+createDate+"%'");
    	hql+=" order by ta.createDate desc";
        Query query = session.createQuery(hql);  
    	rows=query.list().size(); 
         
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
    public int getPlanNum(String actName,String activityDate, String createDate) {  
        int rows = 0;  
        Session session=HibernateSessionFactory.getSession();
        //String hql =  "select * from TbActivity u where u." + type  
        //+ "=?";  
        //Query query = session.createQuery(hql);  
        //query.setString(0,search);   
  
    	Criteria c=session.createCriteria(TbActivity.class);
        String hql="select new Data.ActivityShowData(ta.actId,ta.actName,ta.activityDate,ta.createDate,tb.buildName,ta.attr2) from TbActivity  ta, TbBuilding tb where ta.buildId=tb.buildId";
    	
    	if(actName!=null&&!actName.equals(""))
    		hql+=(" and ta.actName like "+"'%"+actName+"%'");
    	if(activityDate!=null&&!activityDate.equals(""))
    		hql+=(" and ta.activityDate like "+"'%"+activityDate+"%'");
    	if(createDate!=null&&!createDate.equals(""))
    		hql+=(" and ta.createDate like "+"'%"+createDate+"%'");
    	hql+=" order by ta.createDate desc";
    	Query query = session.createQuery(hql); 
    	rows=query.list().size(); 
        // System.out.println("rows:" + rows);  
        session.close();  
        return rows;  
    }  
}
