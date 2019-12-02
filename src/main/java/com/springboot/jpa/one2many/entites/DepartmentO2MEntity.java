/**
 * 
 */
package com.springboot.jpa.one2many.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author broutu
 *
 */
@Entity
@Table(name = "DEPT")
public class DepartmentO2MEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "DEPTNO")
	private int deptNo;

	@Column(name = "DNAME")
	private String dname;

	@Column(name = "LOC")
	private String location;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departmentO2MEntity", cascade = CascadeType.ALL)
	private List<EmployeeO2MEntity> employeeO2MEntites;

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
	 * @return the employeeO2MEntites
	 */
	public List<EmployeeO2MEntity> getEmployeeO2MEntites() {
		return employeeO2MEntites;
	}

	/**
	 * @param employeeO2MEntites the employeeO2MEntites to set
	 */
	public void setEmployeeO2MEntites(List<EmployeeO2MEntity> employeeO2MEntites) {
		this.employeeO2MEntites = employeeO2MEntites;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DepartmenO2MtEntity [deptNo=");
		builder.append(deptNo);
		builder.append(", dname=");
		builder.append(dname);
		builder.append(", location=");
		builder.append(location);
		builder.append(", employeeO2MEntites=");
		builder.append(employeeO2MEntites);
		builder.append("]");
		return builder.toString();
	}

}
