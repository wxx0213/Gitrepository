package Action;

import java.util.ArrayList;
import java.util.List;

import Dao.FolkByPageDao;
import Model.TbConstant;

public class ShowFolkByPageAction {
	FolkByPageDao folkDao = new FolkByPageDao();  
	  
    List<TbConstant> folkList = new ArrayList();  
  
    private int rowsPerPage = 5;// 每页显示几条  
  
    private int page = 1; // 默认当前页  
  
    private int totalPage;// 总共多少页  
  
    private int userNum;// 总过多少条  
    //搜索条件
	private String constant=new String();


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
  
    
    public List<TbConstant> getFolkList() {
		return folkList;
	}

	public void setFolkList(List<TbConstant> folkList) {
		this.folkList = folkList;
	}

	public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}

	public String getConstant() {
		return constant;
	}

	public void setConstant(String constant) {
		this.constant = constant;
	}

	
	public String show() {  
		folkList = folkDao.findPlantByPage(page, rowsPerPage);  
        totalPage = folkDao.getPlanTotalPage(rowsPerPage);   
        userNum = folkDao.getPlanNum();  
  
        return "success";  
    }  
	
	public String showByCondition()
    {
    	folkList = folkDao.findPlantByPageCondition(page, rowsPerPage,constant); 
    	//将所获得列表中的数据格式进行转换
        totalPage = folkDao.getPlanTotalPage(rowsPerPage,constant);  
        userNum = folkDao.getPlanNum(constant);  
    	return "success"; 
    }
}
