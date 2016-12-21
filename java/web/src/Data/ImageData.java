package Data;

public class ImageData
{
	private String buildName;
	private String buildDesc;
	public String getBuildName() {
		return buildName;
	}
	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}
	public String getBuildDesc() {
		return buildDesc;
	}
	public void setBuildDesc(String buildDesc) {
		this.buildDesc = buildDesc;
	}
	//��ŵ�һ��ͼ���·����
	private String firstImagePath;
	//���ͼ���Ӧ��Id
	private int imageId;
	public String getFirstImagePath() {
		return firstImagePath;
	}
	public void setFirstImagePath(String firstImagePath) {
		this.firstImagePath = firstImagePath;
	}
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	
}
