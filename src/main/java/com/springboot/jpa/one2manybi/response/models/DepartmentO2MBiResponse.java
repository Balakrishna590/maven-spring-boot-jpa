/**
 * 
 */
package com.springboot.jpa.one2manybi.response.models;

import java.io.Serializable;
import java.util.List;

/**
 * @author broutu
 *
 */
public class DepartmentO2MBiResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int deptNo;

	private String dname;

	private String location;

	private List<EmployeeO2MBiResponse> employeeO2MBiResponse;

	/**
	 * @return the deptNo
	 */
	public int getDeptNo() {
		return deptNo;
	}

	/**
	 * @param deptNo the deptNo to set
	 */
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}

	/**
	 * @param dname the dname to set
	 */
	public void setDname(String dname) {
		this.dname = dname;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the employeeO2MBiResponse
	 */
	public List<EmployeeO2MBiResponse> getEmployeeO2MBiResponse() {
		return employeeO2MBiResponse;
	}

	/**
	 * @param employeeO2MBiResponse the employeeO2MBiResponse to set
	 */
	public void setEmployeeO2MBiResponse(List<EmployeeO2MBiResponse> employeeO2MBiResponse) {
		this.employeeO2MBiResponse = employeeO2MBiResponse;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DepartmentO2MBiResponse [deptNo=");
		builder.append(deptNo);
		builder.append(", dname=");
		builder.append(dname);
		builder.append(", location=");
		builder.append(location);
		builder.append(", employeeO2MBiResponse=");
		builder.append(employeeO2MBiResponse);
		builder.append("]");
		return builder.toString();
	}

}
