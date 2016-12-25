package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import Dao.*;
import Model.*;
import Tool.Dateformat;
import Tool.Encode;

public class AddArchitectureAction 
{
	//修改时会用到
	private TbBuilding building=new TbBuilding();
	private int id;
	private String[] ImagePath=new String[20];
	
	private String buildingName;
	private String buildingLocation;
	private String buildingDescription;
	private String imageFile;
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getBuildingLocation() {
		return buildingLocation;
	}
	public void setBuildingLocation(String buildingLocation) {
		this.buildingLocation = buildingLocation;
	}
	public String getBuildingDescription() {
		return buildingDescription;
	}
	public void setBuildingDescription(String buildingDescription) {
		this.buildingDescription = buildingDescription;
	}
	public String getImageFile() {
		return imageFile;
	}
	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}
	
	public TbBuilding getBuilding() {
		return building;
	}
	public void setBuilding(TbBuilding building) {
		this.building = building;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String[] getImagePath() {
		return ImagePath;
	}
	public void setImagePath(String[] imagePath) {
		ImagePath = imagePath;
	}
	public void AddBuilding()
	{
		//将保存至session
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		
		String str;
		TbBuildingDao buildingDao=new TbBuildingDao();
		TbBuilding existBuilding;
		existBuilding=buildingDao.SelectByName(getBuildingName());
		if(existBuilding.getBuildName()==null)
		{
			try
			{		
				TbBuilding tbBuilding=new TbBuilding();
				tbBuilding.setBuildName(getBuildingName());
				tbBuilding.setLocation(getBuildingLocation());
				tbBuilding.setDescription(getBuildingDescription());
				tbBuilding.setImagePath(getImageFile());
				buildingDao.addTbBuilding(tbBuilding);
				str="添加建筑信息成功!";
				request.getSession().setAttribute("information",str);
				//重定位
				response.sendRedirect("/web/addArchitecture.jsp");
			}
			catch(Exception e)
			{
				str="添加建筑信息失败！!";
			}
			finally
			{
				
			}

		}
	}
	
	public String selectForupdate()
	  {
		  TbBuildingDao buildingDao=new TbBuildingDao(); 
	  	if(id!=0)
	  	{
	  		building=buildingDao.SelectById(id);
	  		String[] path=building.getImagePath().split(";");
			for(int i=0;i<path.length;i++)
			{
				int index=path[i].lastIndexOf("\\")+1;
				String filename=path[i].substring(index);
				ImagePath[i]="\\upload\\"+filename;;	
			}
	  	}
		  
	  	return "success";
	  }
	
	public String updateBuildingById()
	  {
	  	Boolean flag;
	  	TbBuildingDao buildingDao=new TbBuildingDao();
	  	building.setBuildId(id);
	  	building.setBuildName(buildingName);
	  	building.setDescription(buildingDescription);
	  	building.setLocation(buildingLocation);
	  	building.setImagePath(imageFile);
	      if(id!=0)
	       {
	  	     flag=buildingDao.updateTbBuilding(building);
	       }
	  	 return "success";
	  }
	
	  public String deleteBuildingById()
	  {
		  TbBuildingDao buildingDao=new TbBuildingDao();
	  	if(id!=0)
	  	{
	  		buildingDao.deleteById(id);
	  	}
	  	return "success"; 
	  }
}
