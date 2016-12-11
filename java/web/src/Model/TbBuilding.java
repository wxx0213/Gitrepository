package Model;

import java.util.HashSet;
import java.util.Set;

/**
 * TbBuilding entity. @author MyEclipse Persistence Tools
 */

public class TbBuilding implements java.io.Serializable {

	// Fields

	private Integer buildId;
	private String buildName;
	private String location;
	private String description;
	private String imagePath;
	private Set tbActivities = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbBuilding() {
	}

	/** minimal constructor */
	public TbBuilding(String buildName) {
		this.buildName = buildName;
	}

	/** full constructor */
	public TbBuilding(String buildName, String location, String description,
			String imagePath, Set tbActivities) {
		this.buildName = buildName;
		this.location = location;
		this.description = description;
		this.imagePath = imagePath;
		this.tbActivities = tbActivities;
	}

	// Property accessors

	public Integer getBuildId() {
		return this.buildId;
	}

	public void setBuildId(Integer buildId) {
		this.buildId = buildId;
	}

	public String getBuildName() {
		return this.buildName;
	}

	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImagePath() {
		return this.imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Set getTbActivities() {
		return this.tbActivities;
	}

	public void setTbActivities(Set tbActivities) {
		this.tbActivities = tbActivities;
	}

}