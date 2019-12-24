/**
 * 
 */
package com.springboot.jpa.one2manyuni.response.models;

import java.io.Serializable;
import java.util.List;

/**
 * @author broutu
 *
 */
public class DepartmentO2MUniResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int deptNo;

	private String dname;

	private String location;

	private List<EmployeeO2MUniResponse> employeeO2MUniResponse;

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
	 * @return the employeeO2MUniResponse
	 */
	public List<EmployeeO2MUniResponse> getEmployeeO2MUniResponse() {
		return employeeO2MUniResponse;
	}

	/**
	 * @param employeeO2MUniResponse the employeeO2MUniResponse to set
	 */
	public void setEmployeeO2MUniResponse(List<EmployeeO2MUniResponse> employeeO2MUniResponse) {
		this.employeeO2MUniResponse = employeeO2MUniResponse;
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
		builder.append(", employeeO2MUniResponse=");
		builder.append(employeeO2MUniResponse);
		builder.append("]");
		return builder.toString();
	}

}
