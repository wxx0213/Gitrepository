package Action;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Dao.TbActivityDao;
import Dao.TbBuildingDao;
import Dao.TbUserDao;
import Model.*;
import Tool.Dateformat;


/**
 * @author Administrator
 *
 */
public class AddActivityAction 
{
  //接收id
  private int id;
  private TbActivity activity=new TbActivity();
  private String actPlace;
  private String[] ImagePath=new String[20];
  
  private String title;
  private String content;
  private String createDate;
  private String activityDate;
  private String imageFile;
  private String locationDetail;
  private int buildId;
  
private List<TbActivity> activityList=new ArrayList();
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
  public String getCreateDate() {
			return createDate;
		}
  public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}
  public int getId() {
			return id;
		}
  public void setId(int id) {
			this.id = id;
		}
  
  public TbActivity getActivity() {
	return activity;
}
public void setActivity(TbActivity activity) {
	this.activity = activity;
}

public String getActPlace() {
	return actPlace;
}
public void setActPlace(String actPlace) {
	this.actPlace = actPlace;
}

public String[] getImagePath() {
	return ImagePath;
}
public void setImagePath(String[] imagePath) {
	ImagePath = imagePath;
}

public String getActivityDate() {
	return activityDate;
}
public void setActivityDate(String activityDate) {
	this.activityDate = activityDate;
}

public List<TbActivity> getActivityList() {
	return activityList;
}
public void setActivityList(List<TbActivity> activityList) {
	this.activityList = activityList;
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
				tbActivity.setActivityDate(activityDate);
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
  
  public String selectById()
  {
	  TbActivityDao activityDao=new TbActivityDao();
	  TbBuildingDao buildingDao=new TbBuildingDao(); 
	  
	  String buildName;
  	if(id!=0)
  	{
  		activity=activityDao.SelectById(id);
  		buildName=buildingDao.SelectById(activity.getBuildId()).getBuildName();
  		if(activity.getAttr2()==null)
			actPlace=buildName;
		else
			actPlace=buildName+activity.getAttr2();
  		String[] path=activity.getImagePath().split(";");
		for(int i=0;i<path.length;i++)
		{
			int index=path[i].lastIndexOf("\\")+1;
			String filename=path[i].substring(index);
			ImagePath[i]="\\upload\\"+filename;;	
		}
  	}
  	return "success";
  }
  
  public String selectForupdate()
  {
	  TbActivityDao activityDao=new TbActivityDao();
	  TbBuildingDao buildingDao=new TbBuildingDao(); 
	  buildingList=buildingDao.SelectAll();
  	if(id!=0)
  	{
  		activity=activityDao.SelectById(id);
  		String[] path=activity.getImagePath().split(";");
		for(int i=0;i<path.length;i++)
		{
			int index=path[i].lastIndexOf("\\")+1;
			String filename=path[i].substring(index);
			ImagePath[i]="\\upload\\"+filename;;	
		}
  	}
	  
  	return "success";
  }
  public String updateActivityById()
  {
  	Boolean flag;
  	TbActivityDao activityDao=new TbActivityDao();
  	Dateformat format=new Dateformat();
  	createDate=format.printDateFormat();
  	activity.setActId(id);
  	activity.setActName(title);
  	activity.setContent(content);
  	activity.setActivityDate(activityDate);
  	activity.setAttr2(locationDetail);
  	activity.setBuildId(buildId);
  	activity.setImagePath(imageFile);
      if(id!=0)
       {
    	  //if(imageFile!=null&&!imageFile.equals(""))
    	  //{
    		  //activity.setImagePath(activity.getImagePath()+imageFile);
    	  //}
  	     flag=activityDao.updateTbActivity(activity);
       }
  	 return "success";
  }
  
  public String deleteActivityById()
  {
	  TbActivityDao activityDao=new TbActivityDao();
  	if(id!=0)
  	{
  		activityDao.deleteById(id);
  	}
  	return "success"; 
  }
  
  //活动导航
  public String selectForGuide()
  {
	  TbActivityDao activityDao=new TbActivityDao();
	  List<TbActivity> list=new ArrayList();
	  list=activityDao.SelectAll();
	  if(list.size()<5)
		  activityList=list;
	  else
	  {
		  for(int i=0;i<5;i++)
			  activityList.add(list.get(i));
	  }  
  	return "success";
  }
  
}

