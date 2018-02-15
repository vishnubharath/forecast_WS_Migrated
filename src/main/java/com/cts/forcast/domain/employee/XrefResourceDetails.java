package com.cts.forcast.domain.employee;

import java.math.BigInteger;
import java.util.Date;

public class XrefResourceDetails {
	private int RD_Asso_Id;
	private String RD_Asso_Name;	
	private String RD_Asso_City;
	private String RD_Location_Type;		
	private BigInteger RD_Project_Id;
	private String RD_Project_Name;
	private char RD_Billable;
	private Date RD_Alloc_Start_Date;
	private Date RD_Alloc_End_Date;
	private Date RD_Proj_Billability;
		
	public int getRD_Asso_Id() {
		return RD_Asso_Id;
	}
	public void setRD_Asso_Id(int rD_Asso_Id) {
		RD_Asso_Id = rD_Asso_Id;
	}
	public String getRD_Asso_Name() {
		return RD_Asso_Name;
	}
	public void setRD_Asso_Name(String rD_Asso_Name) {
		RD_Asso_Name = rD_Asso_Name;
	}
	public String getRD_Asso_City() {
		return RD_Asso_City;
	}
	public void setRD_Asso_City(String rD_Asso_City) {
		RD_Asso_City = rD_Asso_City;
	}
	public String getRD_Location_Type() {
		return RD_Location_Type;
	}
	public void setRD_Location_Type(String rD_Location_Type) {
		RD_Location_Type = rD_Location_Type;
	}
	public BigInteger getRD_Project_Id() {
		return RD_Project_Id;
	}
	public void setRD_Project_Id(BigInteger rD_Project_Id) {
		RD_Project_Id = rD_Project_Id;
	}
	public String getRD_Project_Name() {
		return RD_Project_Name;
	}
	public void setRD_Project_Name(String rD_Project_Name) {
		RD_Project_Name = rD_Project_Name;
	}
	public char getRD_Billable() {
		return RD_Billable;
	}
	public void setRD_Billable(char rD_Billable) {
		RD_Billable = rD_Billable;
	}
	public Date getRD_Alloc_Start_Date() {
		return RD_Alloc_Start_Date;
	}
	public void setRD_Alloc_Start_Date(Date rD_Alloc_Start_Date) {
		RD_Alloc_Start_Date = rD_Alloc_Start_Date;
	}
	public Date getRD_Alloc_End_Date() {
		return RD_Alloc_End_Date;
	}
	public void setRD_Alloc_End_Date(Date rD_Alloc_End_Date) {
		RD_Alloc_End_Date = rD_Alloc_End_Date;
	}
	public Date getRD_Proj_Billability() {
		return RD_Proj_Billability;
	}
	public void setRD_Proj_Billability(Date rD_Proj_Billability) {
		RD_Proj_Billability = rD_Proj_Billability;
	}
	

}
