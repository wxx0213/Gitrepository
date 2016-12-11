package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import Dao.*;
import Model.*;
import Tool.Encode;

public class AddArchitectureAction 
{
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
	
}
