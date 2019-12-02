/**
 * 
 */
package com.springboot.jpa.one2many.response.models;

import java.io.Serializable;
import java.util.List;

/**
 * @author broutu
 *
 */
public class DepartmentO2MResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int deptNo;

	private String dname;

	private String location;

	private List<EmployeeO2MResponse> employeeO2MResponse;

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
	 * @return the employeeO2MResponse
	 */
	public List<EmployeeO2MResponse> getEmployeeO2MResponse() {
		return employeeO2MResponse;
	}

	/**
	 * @param employeeO2MResponse the employeeO2MResponse to set
	 */
	public void setEmployeeO2MResponse(List<EmployeeO2MResponse> employeeO2MResponse) {
		this.employeeO2MResponse = employeeO2MResponse;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DepartmentO2MResponse [deptNo=");
		builder.append(deptNo);
		builder.append(", dname=");
		builder.append(dname);
		builder.append(", location=");
		builder.append(location);
		builder.append(", employeeO2MResponse=");
		builder.append(employeeO2MResponse);
		builder.append("]");
		return builder.toString();
	}

}
