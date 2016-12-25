package Action;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import Dao.TbBuildingDao;
import Dao.TbSpecialityDao;
import Data.ImageData;
import Model.TbSpeciality;


public class ShowSpecialtyAction {
	//接收和反馈界控件的信息
	private List<TbSpeciality> specialtyList=new ArrayList();
	//将第一张图片和对应的id返回界面
	private List<ImageData> imageList=new ArrayList();
	//接收界面的imageId
	private String ImageId;
	
	public String getImageId() {
		return ImageId;
	}

	public void setImageId(String ImageId) {
		this.ImageId = ImageId ;
	}

	public List<ImageData> getImageList() {
		return imageList;
	}

	public void setImageList(List<ImageData> imageList) {
		this.imageList = imageList;
	}

	private String[] firstImagePath=new String[4];
	public List<TbSpeciality> getspecialtyList() {
		return specialtyList;
	}

	public void setspecialtyList(List<TbSpeciality> specialtyList) {
		this.specialtyList = specialtyList;
	}

	public String getSpecialty()
	{
		try
		{
			//将用户名保存至session
			HttpServletRequest request=ServletActionContext.getRequest();
			//数据控制
			TbSpecialityDao TbSpecialityDao=new TbSpecialityDao();
			//存放根据ID获得的建筑信息
			TbSpeciality tbspecialty=new TbSpeciality();
			
			
			//存放随机ID
			int[] a=new int[4];
			
			//产生随机Id
			for(int i=0;i<4;)
			{
				//产生1-6的随机数
				int num=new Random().nextInt(6)+1;
				if(i==0)
				{
					a[i]=num;
					i++;
				}
				else
				{
					int j;
					for(j=0;j<i;j++)
					{
						if(num==a[j])break;
					}
					//num没有出现过
					if(j==i)
					{
						a[i]=num;
						i++;
					}
				}
			}
			int i=0;
			for(int element:a)
			{				
				tbspecialty=TbSpecialityDao.SelectById(element);
				//将每张图片的路径存至数组中
				String[] realPath=tbspecialty.getImagePath().split(";");
				int index=realPath[0].lastIndexOf("\\")+1;
				//把每个建筑的第一张图片的路径提取出来存放至数组中
				String fileName=realPath[0].substring(index);
			    firstImagePath[i]="\\upload\\"+fileName;			    
			    //将第一张建筑的路径和Id封装至类对象中
			    ImageData imageData=new ImageData();
				imageData.setFirstImagePath(firstImagePath[i]);
				imageData.setImageId(element);
			    imageList.add(imageData);
			    i++;

				specialtyList.add(tbspecialty);
			}
			for(String str:firstImagePath)System.out.println(str);
			//把第一张图片的路径存在session中
			request.getSession().setAttribute("firstImagePath",firstImagePath);
			//把图片对应的Id存在session中
			request.getSession().setAttribute("imageID",a);	
			
			return "success";
		}
		catch(Exception e)
		{
			System.out.println(e);
			return "error";
		}
}
	}
