package Action;

import java.util.ArrayList;
import java.util.List;

import Dao.SpecialtyByPageDao;
import Dao.TbConstantDao;
import Data.SpecialtyShowData;
import Model.TbConstant;

public class ShowSpecialtyByPageAction {
	SpecialtyByPageDao specialtyDao = new SpecialtyByPageDao();  
	List<TbConstant> folkList=new ArrayList();
    List<SpecialtyShowData> specialtyList = new ArrayList();  
  
    private int rowsPerPage = 5;// 每页显示几条  
  
    private int page = 1; // 默认当前页  
  
    private int totalPage;// 总共多少页  
  
    private int userNum;// 总过多少条  
    //搜索条件
	private String name=new String();
	private String type=new String();
	private int folkId;

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
  
    public List<SpecialtyShowData> getspecialtyList() {
		return specialtyList;
	}

	public List<SpecialtyShowData> getSpecialtyList() {
		return specialtyList;
	}

	public int getUserNum() {  
        return userNum;  
    }  
  
    public void setUserNum(int planNum) {  
        this.userNum = planNum;  
    } 
   
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFolkId() {
		return folkId;
	}

	public void setFolkId(int folkId) {
		this.folkId = folkId;
	}

	
	public List<TbConstant> getFolkList() {
		return folkList;
	}

	public void setFolkList(List<TbConstant> folkList) {
		this.folkList = folkList;
	}

	public String show() {  
		TbConstantDao tbConstantDao=new TbConstantDao();
    	folkList=tbConstantDao.SelectAll();
		specialtyList = specialtyDao.findPlantByPage(page, rowsPerPage);  
        totalPage = specialtyDao.getPlanTotslPage(rowsPerPage);   
        userNum = specialtyDao.getPlanNum();  
  
        return "success";  
    }  
    
    public String showByCondition()
    {
    	TbConstantDao tbConstantDao=new TbConstantDao();
    	folkList=tbConstantDao.SelectAll();
    	specialtyList = specialtyDao.findPlantByPageCondition(page, rowsPerPage,name,type,folkId); 
    	//将所获得列表中的数据格式进行转换
        totalPage = specialtyDao.getPlanTotslPage(rowsPerPage,name,type,folkId);  
        userNum = specialtyDao.getPlanNum(name,type,folkId);  
    	return "success"; 
    }
}
