package Action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import Dao.*;
import Data.SpecialtyShowData;
import Model.*;
import Tool.Dateformat;

public class AddSpecialtyAction {
	private List<TbConstant> constantList=new ArrayList(); 
	private String name;	
	private String description;
	private String type;
	private String imageFile;
	private int folkId;
	
	private SpecialtyShowData specialty=new SpecialtyShowData();
	private TbSpeciality tbspecialty=new TbSpeciality();
	private int id;
	private String[] ImagePath=new String[20];
	public String getImageFile() {
		return imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public List<TbConstant> getConstantList() {
		return constantList;
	}
	public void setConstantList(List<TbConstant> constantList) {
		this.constantList = constantList;
	}
	
	public int getFolkId() {
		return folkId;
	}

	public void setFolkId(int folkId) {
		this.folkId = folkId;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public SpecialtyShowData getSpecialty() {
		return specialty;
	}

	public void setSpecialty(SpecialtyShowData specialty) {
		this.specialty = specialty;
	}
	

	public String[] getImagePath() {
		return ImagePath;
	}

	public void setImagePath(String[] imagePath) {
		ImagePath = imagePath;
	}
    
	public TbSpeciality getTbspecialty() {
		return tbspecialty;
	}

	public void setTbspecialty(TbSpeciality tbspecialty) {
		this.tbspecialty = tbspecialty;
	}

	public String addSpecialty()
	{
		//将保存至session
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		
		String str;
		TbSpecialityDao specialityDao=new TbSpecialityDao();
		TbSpeciality existSpeciality;
		existSpeciality=specialityDao.SelectByName(name);
		if(existSpeciality.getName()==null)
		{
			try
			{		
				TbSpeciality tbSpeciality=new TbSpeciality();
				tbSpeciality.setName(name);
				tbSpeciality.setDescription(description);
				tbSpeciality.setType(type);
				tbSpeciality.setImagePath(imageFile);
				tbSpeciality.setFolkId(folkId);
				specialityDao.addTbSpecialty(tbSpeciality);
				
			}
			catch(Exception e)
			{
				
			}
			finally
			{
				
			}
	   }
		return"success";
    }
	
	  public String selectById()
	  {
		TbSpecialityDao specialtyDao=new TbSpecialityDao();
	  	if(id!=0)
	  	{
	  		specialty=specialtyDao.unionSelectByid(id);
	  		String[] path=specialty.getImagePath().split(";");
			for(int i=0;i<path.length;i++)
			{
				int index=path[i].lastIndexOf("\\")+1;
				String filename=path[i].substring(index);
				ImagePath[i]="\\upload\\"+filename;;	
			}
	  	}
	  	return "success";
	  }
	  
	  public String getAllFolk()
	  {
		  TbConstantDao constantDao=new TbConstantDao();
		  constantList=constantDao.SelectAll();
		  return "success";
	  }
	  
	  public String deleteSpecialtyById()
	  {
		  TbSpecialityDao specialtyDao=new TbSpecialityDao();
	  	if(id!=0)
	  	{
	  		specialtyDao.deleteById(id);
	  	}
	  	return "success"; 
	  }
	  
	  public String selectForupdate()
	  {
		  TbSpecialityDao activityDao=new TbSpecialityDao();
		  TbConstantDao constantDao=new TbConstantDao();
		  constantList=constantDao.SelectAll();
	  	  if(id!=0)
	  	  {
	  		tbspecialty=activityDao.SelectById(id);
	  		String[] path=tbspecialty.getImagePath().split(";");
			for(int i=0;i<path.length;i++)
			{
				int index=path[i].lastIndexOf("\\")+1;
				String filename=path[i].substring(index);
				ImagePath[i]="\\upload\\"+filename;;	
			}
	  	   }
		  
	  	return "success";
	  }
	  public String updateSpecialtyById()
	  {
	  	Boolean flag;
	  	TbSpecialityDao specialtyDao=new TbSpecialityDao();
	  	tbspecialty.setId(id);
	  	tbspecialty.setName(name);
	  	tbspecialty.setDescription(description);
	  	tbspecialty.setImagePath(imageFile);
	  	
	      if(id!=0)
	       {
	  	     flag=specialtyDao.updateTbSpeciality(tbspecialty);
	       }
	  	 return "success";
	  }
	}
