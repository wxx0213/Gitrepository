package Model;

/**
 * TbConstant entity. @author MyEclipse Persistence Tools
 */

public class TbConstant implements java.io.Serializable {

	// Fields

	private Integer id;
	private String constant;
	private String meaning;

	// Constructors

	/** default constructor */
	public TbConstant() {
	}

	/** full constructor */
	public TbConstant(String constant, String meaning) {
		this.constant = constant;
		this.meaning = meaning;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConstant() {
		return this.constant;
	}

	public void setConstant(String constant) {
		this.constant = constant;
	}

	public String getMeaning() {
		return this.meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

}