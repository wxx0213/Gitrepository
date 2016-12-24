package Action;

import java.util.ArrayList;
import java.util.List;

import Dao.ActivityByPageDao;
import Model.TbActivity;
import Data.ActivityShowData;

public class ShowActivityByPageAction {
	ActivityByPageDao activityDao = new ActivityByPageDao();  
	  
    List<ActivityShowData> activityList = new ArrayList();  
  
    private int rowsPerPage = 5;// 每页显示几条  
  
    private int page = 1; // 默认当前页  
  
    private int totalPage;// 总共多少页  
  
    private int userNum;// 总过多少条  
    //搜索条件
	private String actName=new String();
	private String activityDate=new String();
	private String createDate=new String();

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
  
    public List<ActivityShowData> getactivityList() {
		return activityList;
	}

	public void setactivityList(List<ActivityShowData> activityList) {
		this.activityList = activityList;
	}

	public int getUserNum() {  
        return userNum;  
    }  
  
    public void setUserNum(int planNum) {  
        this.userNum = planNum;  
    } 
    public String getactName() {
		return actName;
	}

	public void setactName(String actName) {
		this.actName = actName;
	}

	public String getcreateDate() {
		return createDate;
	}

	public void setcreateDate(String createDate) {
		this.createDate = createDate;
	}
    
	public String getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(String activityDate) {
		this.activityDate = activityDate;
	}

	public String show() {  
		activityList = activityDao.findPlantByPage(page, rowsPerPage);  
        totalPage = activityDao.getPlanTotalPage(rowsPerPage);   
        userNum = activityDao.getPlanNum();  
  
        return "success";  
    }  
    
    public String showByCondition()
    {
    	activityList = activityDao.findPlantByPageCondition(page, rowsPerPage,actName,activityDate,createDate); 
    	//将所获得列表中的数据格式进行转换
        totalPage = activityDao.getPlanTotalPage(rowsPerPage,actName,activityDate,createDate);  
        userNum = activityDao.getPlanNum(actName,activityDate,createDate);  
    	return "success"; 
    }
}
