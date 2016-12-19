package Action;
import java.util.ArrayList;  
import java.util.List;  

import Dao.UserByPageDao;
import Model.*;  
import javax.servlet.http.HttpServletRequest;  

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import util.HibernateSessionFactory;
   
public class ShowUserByPageAction {
	UserByPageDao uerDao = new UserByPageDao();  
	  
    List<TbUser> userList = new ArrayList();  
  
    private int rowsPerPage = 5;// 每页显示几条  
  
    private int page = 1; // 默认当前页  
  
    private int totalPage;// 总共多少页  
  
    private int userNum;// 总过多少条  
    
	private String userName;
	
	private String userType;

    public int getPage() {  
        return page;  
    }  
  
    public void setPage(int page) {  
        this.page = page;  
    }  
  
    public int getRowsPerPage() {  
        return rowsPerPage;  
    }  
  
    public void setRowsPerPage(int rowsPerPage) {  
        this.rowsPerPage = rowsPerPage;  
    }  
  
    public int getTotalPage() {  
        return totalPage;  
    }  
  
    public void setTotalPage(int totalPage) {  
        this.totalPage = totalPage;  
    }
  
    public List<TbUser> getUserList() {
		return userList;
	}

	public void setUserList(List<TbUser> userList) {
		this.userList = userList;
	}

	public int getUserNum() {  
        return userNum;  
    }  
  
    public void setUserNum(int planNum) {  
        this.userNum = planNum;  
    } 
    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
    public String show() {  
        userList = uerDao.findPlantByPage(page, rowsPerPage);  
        totalPage = uerDao.getPlanTotalPage(rowsPerPage);   
        userNum = uerDao.getPlanNum();  
  
        return "success";  
    }  
    
    public String showByCondition()
    {
    	userList = uerDao.findPlantByPageCondition(page, rowsPerPage,userType,userName);  
        totalPage = uerDao.getPlanTotalPage(rowsPerPage,userType,userName);  
        userNum = uerDao.getPlanNum(userType, userName);  
    	return "success"; 
    }

}
