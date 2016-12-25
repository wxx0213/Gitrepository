package Action;

import java.util.ArrayList;
import java.util.List;

import Dao.TbConstantDao;
import Model.TbConstant;


public class ConstantAction {
	private TbConstant tbconstant=new TbConstant();
	
	private Integer id;
	private String constant;
	private String meaning;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getConstant() {
		return constant;
	}
	public void setConstant(String constant) {
		this.constant = constant;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	public TbConstant getTbconstant() {
		return tbconstant;
	}
	public void setTbconstant(TbConstant tbconstant) {
		this.tbconstant = tbconstant;
	}
	

	public String addConstant()
	 {
				try
				{
					TbConstantDao constantDao=new TbConstantDao();
					TbConstant tbConstant=new TbConstant();
					
					tbConstant.setConstant(constant);
					tbConstant.setMeaning(meaning);
					
					constantDao.addTbConstant(tbConstant);
				}
				catch(Exception e)
				{}
				finally
				{}
				return "success";
	 }	
	
	public String selectById()
	  {
		  TbConstantDao constantDao=new TbConstantDao();
		  tbconstant=constantDao.SelectById(id);
	  	  return "success";
	  }	  
		  
	public String updateFolkById()
	  {
	  	Boolean flag;
	  	TbConstantDao constantDao=new TbConstantDao();
	  	tbconstant.setId(id);
	  	tbconstant.setConstant(constant);
	  	tbconstant.setMeaning(meaning);
	    if(id!=0)
	    { 
	    	flag=constantDao.updateTbConstant(tbconstant);
	    }
	  	return "success";
	  }
	  
	public String deleteById()
	  {
		  boolean flag;
		  TbConstantDao constantDao=new TbConstantDao();
		  flag=constantDao.deleteById(id);
		  if(flag)
			  return "success"; 
		  else 
			  return "error";
	  }
	

}
