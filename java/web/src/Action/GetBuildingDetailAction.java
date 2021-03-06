package Action;

import Dao.TbBuildingDao;
import Model.TbBuilding;

public class GetBuildingDetailAction 
{
	private int id;
	private String buildName;
	private String location;
	private String description;
	private String[] ImagePath=new String[20];
	private String information=null;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBuildName() {
		return buildName;
	}

	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getImagePath() {
		return ImagePath;
	}

	public void setImagePath(String[] imagePath) {
		ImagePath = imagePath;
	}

	public String getBuidingDetail()
	{
		if(id==0)return "error";
		TbBuildingDao tbBuildingDao=new TbBuildingDao();
		//存放根据ID获得的建筑信息
		TbBuilding tbBuilding=new TbBuilding();
		tbBuilding=tbBuildingDao.SelectById(id);
		if(tbBuilding!=null)
		{
			int index;
			String  filename;
			buildName=tbBuilding.getBuildName();
			location=tbBuilding.getLocation();
			description=tbBuilding.getDescription();
			String[] path=tbBuilding.getImagePath().split(";");
			for(int i=0;i<path.length;i++)
			{
				index=path[i].lastIndexOf("\\")+1;
				filename=path[i].substring(index);
				ImagePath[i]="\\upload\\"+filename;;	
			}
			return "success";
		}
		
		else 
		{
			information="没有查到你需要的信息";
			return "error";
		}
	}
}
