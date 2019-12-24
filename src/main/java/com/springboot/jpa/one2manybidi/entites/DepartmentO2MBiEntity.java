/**
 * 
 */
package com.springboot.jpa.one2manybidi.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author broutu
 *
 */
@Entity
@Table(name = "DEPT")
public class DepartmentO2MBiEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "DEPTNO")
	private Integer deptNo;

	@Column(name = "DNAME")
	private String dname;

	@Column(name = "LOC")
	private String location;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departmentO2MBiEntity", cascade = CascadeType.ALL)
	private List<EmployeeO2MBiEntity> employeeO2MBiEntites;

	/**
	 * @return the deptNo
	 */
	public Integer getDeptNo() {
		return deptNo;
	}

	/**
	 * @param deptNo the deptNo to set
	 */
	public void setDeptNo(Integer deptNo) {
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
	 * @return the employeeO2MBiEntites
	 */
	public List<EmployeeO2MBiEntity> getEmployeeO2MBiEntites() {
		return employeeO2MBiEntites;
	}

	/**
	 * @param employeeO2MBiEntites the employeeO2MBiEntites to set
	 */
	public void setEmployeeO2MBiEntites(List<EmployeeO2MBiEntity> employeeO2MBiEntites) {
		this.employeeO2MBiEntites = employeeO2MBiEntites;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DepartmentO2MBiEntity [deptNo=");
		builder.append(deptNo);
		builder.append(", dname=");
		builder.append(dname);
		builder.append(", location=");
		builder.append(location);
		builder.append(", employeeO2MBiEntites=");
		builder.append(employeeO2MBiEntites);
		builder.append("]");
		return builder.toString();
	}

}
