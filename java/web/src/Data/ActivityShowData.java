package Data;

public class ActivityShowData
{
	private int actId;
	private String actPlace;
	private String actName;
	private String createDate;
	private String activityDate;
	
	public int getActId() {
		return actId;
	}
	public void setActId(int actId) {
		this.actId = actId;
	}
	public String getActName() {
		return actName;
	}
	public void setActName(String actName) {
		this.actName = actName;
	}
	public String getActPlace() {
		return actPlace;
	}
	public void setActPlace(String actPlace) {
		this.actPlace = actPlace;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	public String getActivityDate() {
		return activityDate;
	}
	public void setActivityDate(String activityDate) {
		this.activityDate = activityDate;
	}
	public ActivityShowData()
	{
		
	}
	//后台查询
	public ActivityShowData(int actId,String actName,String activityDate,String createDate,String buildName,String buildDetail)
	{
		this.actId=actId;
		this.actName=actName;
		this.activityDate=activityDate;
		this.createDate=createDate.substring(0,createDate.indexOf(" "));
		if(buildDetail==null)
			this.actPlace=buildName;
		else
			this.actPlace=buildName+buildDetail;
	}
}
