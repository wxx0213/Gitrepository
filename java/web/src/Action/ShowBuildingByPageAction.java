package Action;

import java.util.ArrayList;
import java.util.List;

import Dao.BuildingByPageDao;
import Data.ActivityShowData;
import Model.TbBuilding;

public class ShowBuildingByPageAction {
	BuildingByPageDao buildingDao = new BuildingByPageDao();  
	  
    List<TbBuilding> buildingList = new ArrayList();  
  
    private int rowsPerPage = 5;// 每页显示几条  
  
    private int page = 1; // 默认当前页  
  
    private int totalPage;// 总共多少页  
  
    private int userNum;// 总过多少条  
    //搜索条件
	private String buildingName=new String();


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
  
    public List<TbBuilding> getbuildingList() {
		return buildingList;
	}

	public void setbuildingList(List<TbBuilding> buildingList) {
		this.buildingList = buildingList;
	}

	public int getUserNum() {  
        return userNum;  
    }  
  
    public void setUserNum(int planNum) {  
        this.userNum = planNum;  
    } 
    
	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String show() {  
		buildingList = buildingDao.findPlantByPage(page, rowsPerPage);  
        totalPage = buildingDao.getPlanTotalPage(rowsPerPage);   
        userNum = buildingDao.getPlanNum();  
  
        return "success";  
    }  
    
    public String showByCondition()
    {
    	buildingList = buildingDao.findPlantByPageCondition(page, rowsPerPage,buildingName); 
    	//将所获得列表中的数据格式进行转换
        totalPage = buildingDao.getPlanTotalPage(rowsPerPage,buildingName);  
        userNum = buildingDao.getPlanNum(buildingName);  
    	return "success"; 
    }
}
