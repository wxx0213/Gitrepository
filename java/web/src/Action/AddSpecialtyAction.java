package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import Dao.*;
import Model.*;

public class AddSpecialtyAction {
	private String name;	
	private String description;
	private String type;
	private String imageFile;
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
	public void addSpecialty()
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
				specialityDao.addTbSpecialty(tbSpeciality);
				str="添加特色信息成功!";
				request.getSession().setAttribute("information",str);
				//重定位
				response.sendRedirect("/web/addSpecialty.jsp");
			}
			catch(Exception e)
			{
				str="添加特色信息失败！!";
			}
			finally
			{
				
			}
	}
}
	}