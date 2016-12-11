package Action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class AddSpecialtyImageAction extends ActionSupport
{
	//封装多个文件域对应的文件内容
	private List<File> upload;
	//封装文件域对应的文件类型
	private List<String> uploadContentType;
	//封装多个文件域对应的文件名
	private List<String> uploadFileName;
	
	
    public List<File> getUpload() {
		return upload;
	}

	public void setUpload(List<File> upload) {
		this.upload = upload;
	}

	public List<String> getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(List<String> uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public List<String> getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String execute()throws Exception
	{
		//将路径保存至session
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		
	    String savePath=new String();
	    String path;
    	for(int i=0;i<getUpload().size();i++)
    	{
    		String newName=UUID.randomUUID()+uploadFileName.get(i).substring(uploadFileName.get(i).lastIndexOf("."));
    	    //指定路径
    		FileOutputStream fos=new FileOutputStream("E:\\Images\\"+newName);
    		//为每个要上传的图片建立文件输入流
    		FileInputStream fis=new FileInputStream(getUpload().get(i));
    		//将每个需要上传的文件写到指定路径中
    		byte[] buffer=new byte[1024];
    		int len=0;
    		while((len=fis.read(buffer))>0)
    		{
    			fos.write(buffer, 0, len);
    		}
    		fos.close();
    		getUploadFileName().set(i, newName);
    		path="E:\\Images\\"+newName+";";
    		savePath+=path;
    	}
		request.getSession().setAttribute("savePath",savePath);
    	return "success";
	}
}

