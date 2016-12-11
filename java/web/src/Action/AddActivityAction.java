package Action;
import java.util.Date;

import Dao.TbActivityDao;
import Model.*;
import Tool.Dateformat;


public class AddActivityAction 
{
  private String title;
  private String content;
  private String createDate;
  private String imageFile;

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
}
