package Action;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Dao.TbActivityDao;
import Dao.TbBuildingDao;
import Model.*;
import Tool.Dateformat;


public class AddActivityAction 
{
  private String title;
  private String content;
  private String createDate;
  private String imageFile;
  private String locationDetail;
  private int buildId;
  

private List<TbBuilding> buildingList=new ArrayList();

  public String getTitle() {
	return title;
  }
  public void setTitle(String title) {
	this.title = title;
  }
  public String getContent() {
	return content;
  }
  public void setContent(String content) {
	this.content = content;
  }
  public String getImageFile() {
	return imageFile;
  }

  public void setImageFile(String imageFile) {
	this.imageFile = imageFile;
  }
  public String getLocationDetail() {
		return locationDetail;
	}
	public void setLocationDetail(String locationDetail) {
		this.locationDetail = locationDetail;
	}
	  public List<TbBuilding> getBuildingList() {
			return buildingList;
		}
		public void setBuildingList(List<TbBuilding> buildingList) {
			this.buildingList = buildingList;
		}
	
  public int getBuildId() {
			return buildId;
		}
		public void setBuildId(int buildId) {
			this.buildId = buildId;
		}
public String addActivity()
 {
		    Dateformat format=new Dateformat();
		    createDate=format.printDateFormat();
			try
			{
				TbActivityDao activityDAO=new TbActivityDao();
				TbActivity tbActivity=new TbActivity();
				
				tbActivity.setActName(getTitle());
				tbActivity.setContent(getContent());
				tbActivity.setCreateDate(createDate);
				tbActivity.setBuildId(buildId);
				tbActivity.setAttr2(locationDetail);
				tbActivity.setImagePath(imageFile);
				
				activityDAO.addTbActivity(tbActivity);
				System.out.println("lls");
				System.out.println(imageFile);
			}
			catch(Exception e)
			{}
			finally
			{}
			return "success";
 }	
  public String getAllBuliding()
  {
	  TbBuildingDao buildingDao=new TbBuildingDao();
	  buildingList=buildingDao.SelectAll();
	  return "success";
  }
}

